package processor;

import java.util.concurrent.BlockingQueue;
import model.VehicleData;

public class DiagnosticProcessor implements Runnable {

    private BlockingQueue<VehicleData> queue;

    // The processor gets access to the exact same conveyor belt
    public DiagnosticProcessor(BlockingQueue<VehicleData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Take the next available data packet off the belt.
                // If the belt is empty, this thread will safely wait here!
                VehicleData data = queue.take();

                // Print out the telemetry readings nicely
                System.out.println("Speed       : " + data.getSpeed() + " km/h");
                System.out.println("Temperature : " + data.getTemperature() + "°C");
                System.out.println("---------------------------------");

            } catch (InterruptedException e) {
                System.out.println("Processor was interrupted.");
                break;
            }
        }
    }
}
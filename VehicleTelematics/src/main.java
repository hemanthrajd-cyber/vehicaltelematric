import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import model.VehicleData;
import sensor.SpeedSensor;
import processor.DiagnosticProcessor;

public class main {
    public static void main(String[] args) {
        System.out.println("Vehicle Telematics Emulator initialized...");

        // 1. Create the shared queue
        BlockingQueue<VehicleData> queue = new LinkedBlockingQueue<>();

        // 2. Create the independent workers (Runnables)
        SpeedSensor sensorWorker = new SpeedSensor(queue);
        DiagnosticProcessor processorWorker = new DiagnosticProcessor(queue);

        // 3. Put them into distinct execution threads
        Thread sensorThread = new Thread(sensorWorker);
        Thread processorThread = new Thread(processorWorker);

        // 4. Fire them up!
        sensorThread.start();
        processorThread.start();
    }
}
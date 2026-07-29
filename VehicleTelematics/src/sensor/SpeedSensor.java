package sensor;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import model.VehicleData;

public class SpeedSensor implements Runnable {

    private BlockingQueue<VehicleData> queue;

    // The constructor takes the shared conveyor belt from Main
    public SpeedSensor(BlockingQueue<VehicleData> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Random random = new Random();

        while (true) {
            // Generate a random speed between 0 and 150 km/h
            int speed = random.nextInt(150);
            
            // Generate a random temperature between 70°C and 120°C
            int temp = 70 + random.nextInt(50);

            // Package the numbers into our data box object
            VehicleData data = new VehicleData(speed, temp);

            try {
                // Drop the data box onto the conveyor belt
                queue.put(data);
                
                // Wait 1 second (1000 milliseconds) before doing it again
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Sensor was interrupted.");
                break; 
            }
        }
    }
}
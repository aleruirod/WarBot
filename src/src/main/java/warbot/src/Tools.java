package warbot.src;

import java.util.concurrent.TimeUnit;

public class Tools {
  public static void delay(Integer numSecs) {
    try {
        TimeUnit.SECONDS.sleep(numSecs);
    } catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
    }
  }
}
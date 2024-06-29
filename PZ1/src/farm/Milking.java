package farm;

public abstract class Milking extends Animal implements Milky{
    private double quantity;
    private double maxQuantity;
    private Thread milkingThread;
    private boolean isMilking;

    public double getMaxQuantity() {
        return maxQuantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setMaxQuantity(double maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public boolean start(){
        if (quantity <= 0 || isMilking) {
            return false;
        }

        milkingThread = new Thread(() -> {
            while (isMilking && quantity > 0) {
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                quantity *= 0.93; // Reduce quantity by 7%
                if (quantity <= 0) {
                    quantity = 0;
                    isMilking = false;
                }
            }
        });
        milkingThread.start();
        return true;
    }

    public boolean progress(){
        return isMilking;
    }

    public boolean stop(){
        if (!isMilking) {
            return false; // Cannot stop if not currently milking
        }
        isMilking = false;
        if (milkingThread != null) {
            milkingThread.interrupt();
        }
        return true;
    }

    public Milking(double width, double length, double height, double maxPower, double maxQuantity) {
        super(width, length, height, maxPower);
        this.maxQuantity = maxQuantity;
    }
}

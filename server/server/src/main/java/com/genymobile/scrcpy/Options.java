package com.genymobile.scrcpy;

public class Options {
//    private int maxSize;
    private int bitRate;
    private boolean tunnelForward;
//    private Rect crop;
    private boolean sendFrameMeta; // send PTS so that the client may record properly
//    private Point correctedValue;

//    public int getMaxSize() {
//        return maxSize;
//    }

//    public void setMaxSize(int maxSize) {
//        this.maxSize = maxSize;
//    }

    public int getBitRate() {
        return bitRate;
    }

    public void setBitRate(int bitRate) {
        this.bitRate = bitRate;
    }

    public boolean isTunnelForward() {
        return tunnelForward;
    }

    public void setTunnelForward(boolean tunnelForward) {
        this.tunnelForward = tunnelForward;
    }

//    public Rect getCrop() {
//        return crop;
//    }

//    public void setCrop(Rect crop) {
//        this.crop = crop;
//    }

    public boolean getSendFrameMeta() {
        return sendFrameMeta;
    }

    public void setSendFrameMeta(boolean sendFrameMeta) {
        this.sendFrameMeta = sendFrameMeta;
    }

//    public Point getCorrectedValue() {
//        return correctedValue;
//    }

//    public void setCorrectedValue(Point correctedValue) {
//        this.correctedValue = correctedValue;
//    }
}

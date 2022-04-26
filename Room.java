package com.learn;
public class Room {
    int roomNumber;
    String roomType;
    float roomArea;
    String acMachine;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public float getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(float roomArea) {
        this.roomArea = roomArea;
    }

    public String getAcMachine() {
        return acMachine;
    }

    public void setAcMachine(String acMachine) {
        this.acMachine = acMachine;
    }

    public String toString()
    {
        String room_data = "RoomNumber:" + getRoomNumber() + "RoomType" + getRoomType() + "RoomArea" + getRoomArea() + "AC machine " + getAcMachine() ;
        return room_data;
    }

    public static void main(String[] args)
    {
        final Room r1 = new Room();
        r1.setRoomNumber(107);
        r1.getRoomType("single");
        r1.setRoomArea(345.6F);
        r1.getAcMachine("Elite");

        System.out.println(r1.toString());
    }
}

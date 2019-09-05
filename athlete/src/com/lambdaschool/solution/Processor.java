package com.lambdaschool.solution;

public interface Processor
{
    void sendMessage(String msg, String address);
    String readMessage();
}

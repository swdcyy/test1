package com.google.protobuf.ByteOutput;
import java.lang.Object;
import java.nio.ByteBuffer;

public abstract class ByteOutput	// class@0003c9
{

    public void ByteOutput(){
       super();
    }
    public abstract void write(byte p0);
    public abstract void write(ByteBuffer p0);
    public abstract void write(byte[] p0,int p1,int p2);
    public abstract void writeLazy(ByteBuffer p0);
    public abstract void writeLazy(byte[] p0,int p1,int p2);
}

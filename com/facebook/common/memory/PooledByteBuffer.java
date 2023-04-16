package com.facebook.common.memory.PooledByteBuffer;
import java.io.Closeable;
import java.nio.ByteBuffer;

public interface abstract PooledByteBuffer implements Closeable	// class@001061
{

    long B();
    int D(int p0,byte[] p1,int p2,int p3);
    byte F(int p0);
    void close();
    boolean isClosed();
    ByteBuffer n();
    int size();
}

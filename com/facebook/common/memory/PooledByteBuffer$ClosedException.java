package com.facebook.common.memory.PooledByteBuffer$ClosedException;
import java.lang.RuntimeException;
import java.lang.String;

public class PooledByteBuffer$ClosedException extends RuntimeException	// class@001060
{

    public void PooledByteBuffer$ClosedException(){
       super("Invalid bytebuf. Already closed");
    }
}

package com.tkruntime.v8.Releasable;
import java.io.Closeable;

public interface abstract Releasable implements Closeable	// class@000fa4
{

    void close();
    void release();
}

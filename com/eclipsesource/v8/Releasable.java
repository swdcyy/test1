package com.eclipsesource.v8.Releasable;
import java.io.Closeable;

public interface abstract Releasable implements Closeable	// class@000fd6
{

    void close();
    void release();
}
package com.facebook.imagepipeline.memory.b;
import java.nio.ByteBuffer;

public interface abstract b	// class@001104
{

    long B();
    int D(int p0,byte[] p1,int p2,int p3);
    byte F(int p0);
    int a(int p0,byte[] p1,int p2,int p3);
    void b(int p0,b p1,int p2,int p3);
    void close();
    int getSize();
    long getUniqueId();
    boolean isClosed();
    ByteBuffer n();
}

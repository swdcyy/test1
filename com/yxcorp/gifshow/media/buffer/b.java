package com.yxcorp.gifshow.media.buffer.b;
import java.io.Closeable;
import java.io.File;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.media.buffer.b$a;
import java.lang.Object;

public interface abstract b implements Closeable	// class@001cf5
{

    File B2();
    int M2();
    boolean T0(int p0,Bitmap p1);
    boolean U0(Bitmap p0,int p1,boolean p2);
    b U2(b$a p0);
    void close();
    boolean g1(int p0);
    int getCount();
    int getHeight();
    long getId();
    int getWidth();
    boolean j2(byte[] p0,int p1,int p2,int p3,int p4,int p5,boolean p6,int p7,Object p8);
    void release();
}

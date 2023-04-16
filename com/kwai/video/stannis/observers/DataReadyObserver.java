package com.kwai.video.stannis.observers.DataReadyObserver;
import java.nio.ByteBuffer;

public interface abstract DataReadyObserver	// class@000c59
{

    void onDataReady(int p0,ByteBuffer p1,int p2,int p3,int p4,long p5,short p6,int p7);
}

package com.kwai.video.stannis.observers.DataProviderObserver;
import java.lang.Object;
import java.nio.ByteBuffer;

public abstract class DataProviderObserver	// class@000c58
{

    public void DataProviderObserver(){
       super();
    }
    public abstract void onFetchPcm(int p0,ByteBuffer p1,int p2,int p3,int p4);
    public abstract void onFetchPcmWithCustomData(int p0,ByteBuffer p1,int p2,int p3,int p4,long p5,int p6,int p7);
}

package com.kwai.video.krtc.observers.FileStreamingObserver;
import java.lang.Object;
import java.nio.ByteBuffer;

public abstract class FileStreamingObserver	// class@0007cd
{

    public void FileStreamingObserver(){
       super();
    }
    public abstract void onFileStreamFinished(int p0);
    public abstract void onFileStreamPositionUpdate(long p0,long p1);
    public abstract void onVideoDecoded(ByteBuffer p0,int p1,int p2,long p3,int p4,int p5);
}

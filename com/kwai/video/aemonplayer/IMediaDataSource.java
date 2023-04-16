package com.kwai.video.aemonplayer.IMediaDataSource;

public interface abstract IMediaDataSource	// class@0019ca
{

    void close();
    long getSize();
    int readAt(long p0,byte[] p1,int p2,int p3);
}

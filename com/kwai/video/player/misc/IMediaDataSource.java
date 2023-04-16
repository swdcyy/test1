package com.kwai.video.player.misc.IMediaDataSource;

public interface abstract IMediaDataSource	// class@000b86
{

    void close();
    long getSize();
    int readAt(long p0,byte[] p1,int p2,int p3);
}

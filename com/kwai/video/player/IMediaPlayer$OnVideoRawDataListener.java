package com.kwai.video.player.IMediaPlayer$OnVideoRawDataListener;
import com.kwai.video.player.IMediaPlayer;

public interface abstract IMediaPlayer$OnVideoRawDataListener	// class@000aca
{

    void onVideoRawDataAvailable(IMediaPlayer p0,byte[] p1,int p2,int p3,int p4,int p5);
    void onVideoRawDataSize(IMediaPlayer p0,int p1,int p2,int p3,int p4);
}

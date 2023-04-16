package com.frog.engine.record.IFrogInternalRecordListener;
import java.lang.String;
import java.nio.ByteBuffer;

public interface abstract IFrogInternalRecordListener	// class@001569
{

    void AudioCallBack(byte[] p0,int p1,int p2,int p3,int p4,long p5);
    void RecordScreenError(String p0);
    void VideoCallBack(ByteBuffer p0,int p1,int p2,int p3,long p4);
    void recordAddAudioTrack(int p0);
    void recordRemoveAudioTrack(int p0);
}

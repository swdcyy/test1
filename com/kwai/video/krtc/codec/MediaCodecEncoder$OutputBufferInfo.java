package com.kwai.video.krtc.codec.MediaCodecEncoder$OutputBufferInfo;
import java.nio.ByteBuffer;
import java.lang.Object;
import java.util.concurrent.TimeUnit;

public class MediaCodecEncoder$OutputBufferInfo	// class@00077a
{
    public final ByteBuffer buffer;
    public final int index;
    public final boolean isKeyFrame;
    public final long timestamp;

    public void MediaCodecEncoder$OutputBufferInfo(int p0,ByteBuffer p1,boolean p2,long p3){
       super();
       this.index = p0;
       this.buffer = p1;
       this.isKeyFrame = p2;
       this.timestamp = TimeUnit.MICROSECONDS.toMillis(p3);
    }
}

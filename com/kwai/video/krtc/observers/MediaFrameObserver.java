package com.kwai.video.krtc.observers.MediaFrameObserver;
import java.lang.Object;
import java.lang.String;
import java.nio.ByteBuffer;
import com.kwai.video.krtc.GL.TextureBuffer;

public abstract class MediaFrameObserver	// class@0007d1
{

    public void MediaFrameObserver(){
       super();
    }
    public abstract void onAudioDecoded(String p0,String p1,int p2,ByteBuffer p3,int p4,int p5);
    public abstract void onAudioEncoded(String p0,ByteBuffer p1);
    public abstract void onAudioPreDecode(String p0,String p1,int p2,ByteBuffer p3);
    public abstract void onAudioPreEncode(String p0,ByteBuffer p1,int p2,int p3);
    public abstract void onCustomVideoData(String p0,String p1,byte[] p2);
    public abstract void onVideoDecoded(String p0,String p1,int p2,ByteBuffer p3,int p4,int p5,int p6,int p7,int p8);
    public abstract void onVideoEncoded(String p0,ByteBuffer p1);
    public abstract void onVideoPreDecode(String p0,String p1,int p2,ByteBuffer p3);
    public abstract void onVideoPreEncodeByteBuffer(String p0,ByteBuffer p1,int p2,int p3,int p4);
    public abstract void onVideoPreEncodeTexture(String p0,TextureBuffer p1);
}

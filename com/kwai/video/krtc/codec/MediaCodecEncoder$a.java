package com.kwai.video.krtc.codec.MediaCodecEncoder$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MediaCodecEncoder$a extends Enum	// class@00077b
{
    public final int c;
    public final String d;
    public static final MediaCodecEncoder$a a;
    public static final MediaCodecEncoder$a b;
    public static final MediaCodecEncoder$a[] e;

    static {
       MediaCodecEncoder$a uoa = new MediaCodecEncoder$a("CODEC_H264", 0, 0, "video/avc");
       MediaCodecEncoder$a.a = uoa;
       MediaCodecEncoder$a uoa1 = new MediaCodecEncoder$a("CODEC_H265", 1, 1, "video/hevc");
       MediaCodecEncoder$a.b = uoa1;
       MediaCodecEncoder$a[] uoaArray = new MediaCodecEncoder$a[]{uoa,uoa1};
       MediaCodecEncoder$a.e = uoaArray;
    }
    public void MediaCodecEncoder$a(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.c = p2;
       this.d = p3;
    }
    public static MediaCodecEncoder$a valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MediaCodecEncoder$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MediaCodecEncoder$a.class, p0);
    }
    public static MediaCodecEncoder$a[] values(){
       Object obj = PatchProxy.apply(null, null, MediaCodecEncoder$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MediaCodecEncoder$a.e.clone();
    }
    public int a(){
       return this.c;
    }
    public String b(){
       return this.d;
    }
}

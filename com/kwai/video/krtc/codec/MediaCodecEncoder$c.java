package com.kwai.video.krtc.codec.MediaCodecEncoder$c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MediaCodecEncoder$c extends Enum	// class@00077d
{
    public final int d;
    public static final MediaCodecEncoder$c a;
    public static final MediaCodecEncoder$c b;
    public static final MediaCodecEncoder$c c;
    public static final MediaCodecEncoder$c[] e;

    static {
       MediaCodecEncoder$c uoc = new MediaCodecEncoder$c("BASELINE", 0, 0);
       MediaCodecEncoder$c.a = uoc;
       MediaCodecEncoder$c uoc1 = new MediaCodecEncoder$c("MAIN", 1, 1);
       MediaCodecEncoder$c.b = uoc1;
       MediaCodecEncoder$c uoc2 = new MediaCodecEncoder$c("HIGH", 2, 2);
       MediaCodecEncoder$c.c = uoc2;
       MediaCodecEncoder$c[] uocArray = new MediaCodecEncoder$c[]{uoc,uoc1,uoc2};
       MediaCodecEncoder$c.e = uocArray;
    }
    public void MediaCodecEncoder$c(String p0,int p1,int p2){
       super(p0, p1);
       this.d = p2;
    }
    public static MediaCodecEncoder$c valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MediaCodecEncoder$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MediaCodecEncoder$c.class, p0);
    }
    public static MediaCodecEncoder$c[] values(){
       Object obj = PatchProxy.apply(null, null, MediaCodecEncoder$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MediaCodecEncoder$c.e.clone();
    }
    public int a(){
       return this.d;
    }
}

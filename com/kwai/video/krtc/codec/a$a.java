package com.kwai.video.krtc.codec.a$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class a$a extends Enum	// class@00077f
{
    public final int c;
    public final String d;
    public static final a$a a;
    public static final a$a b;
    public static final a$a[] e;

    static {
       a$a uoa = new a$a("CODEC_H264", 0, 0, "video/avc");
       a$a.a = uoa;
       a$a uoa1 = new a$a("CODEC_H265", 1, 1, "video/hevc");
       a$a.b = uoa1;
       a$a[] uoaArray = new a$a[]{uoa,uoa1};
       a$a.e = uoaArray;
    }
    public void a$a(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.c = p2;
       this.d = p3;
    }
    public static a$a valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(a$a.class, p0);
    }
    public static a$a[] values(){
       Object obj = PatchProxy.apply(null, null, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a$a.e.clone();
    }
    public String a(){
       return this.d;
    }
}

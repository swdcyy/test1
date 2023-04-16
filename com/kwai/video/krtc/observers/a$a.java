package com.kwai.video.krtc.observers.a$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class a$a extends Enum	// class@0007d3
{
    public static final a$a a;
    public static final a$a b;
    public static final a$a c;
    public static final a$a d;
    public static final a$a e;
    public static final a$a[] f;

    static {
       a$a uoa = new a$a("AudioEffectNoError", 0);
       a$a.a = uoa;
       a$a uoa1 = new a$a("AudioEffectErrorUnknown", 1);
       a$a.b = uoa1;
       a$a uoa2 = new a$a("AudioEffectErrorNotSupported", 2);
       a$a.c = uoa2;
       a$a uoa3 = new a$a("AudioEffectErrorIo", 3);
       a$a.d = uoa3;
       a$a uoa4 = new a$a("AudioEffectErrorMalformed", 4);
       a$a.e = uoa4;
       a$a[] uoaArray = new a$a[]{uoa,uoa1,uoa2,uoa3,uoa4};
       a$a.f = uoaArray;
    }
    public void a$a(String p0,int p1){
       super(p0, p1);
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
       return a$a.f.clone();
    }
}

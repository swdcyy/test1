package com.kwai.video.krtc.observers.a$b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class a$b extends Enum	// class@0007d4
{
    public static final a$b a;
    public static final a$b b;
    public static final a$b c;
    public static final a$b[] d;

    static {
       a$b uob = new a$b("AudioEffectStarted", 0);
       a$b.a = uob;
       a$b uob1 = new a$b("AudioEffectFinished", 1);
       a$b.b = uob1;
       a$b uob2 = new a$b("AudioEffectError", 2);
       a$b.c = uob2;
       a$b[] uobArray = new a$b[]{uob,uob1,uob2};
       a$b.d = uobArray;
    }
    public void a$b(String p0,int p1){
       super(p0, p1);
    }
    public static a$b valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(a$b.class, p0);
    }
    public static a$b[] values(){
       Object obj = PatchProxy.apply(null, null, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a$b.d.clone();
    }
}

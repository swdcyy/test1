package com.kwai.live.gzone.common.keyswitch.b;
import java.lang.Object;
import com.kwai.live.gzone.common.keyswitch.b$a;
import com.kwai.live.gzone.common.keyswitch.b$b;
import com.kwai.live.gzone.common.keyswitch.LiveGzoneKeys;
import com.kwai.live.gzone.common.keyswitch.b$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import com.kwai.live.gzone.common.keyswitch.b$c;
import com.kwai.live.gzone.common.keyswitch.b$e;
import com.kwai.live.gzone.common.keyswitch.LiveGzoneKeys$From;
import xf6.l;

public class b	// class@000cb6
{

    public void b(){
       super();
    }
    public void b(b$a p0){
       super();
    }
    public static b b(){
       return b$b.a;
    }
    public b$d a(LiveGzoneKeys p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.defaultValue() instanceof Boolean || p0.defaultValue() instanceof Integer) {
          return new b$d(this, p0);
       }
       throw new IllegalStateException(" expect "+p0.key()+"get a "+p0.defaultValue().getClass()+" value, but get Boolean");
    }
    public void c(LiveGzoneKeys p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "3")) {
          return;
       }
       if (!p0.defaultValue() instanceof Boolean) {
          throw new IllegalStateException(" expect "+p0.key()+"set a "+p0.defaultValue().getClass()+" value, not Boolean");
       }
       b$c uoc = new b$c(this, p0);
       b$c uoc1 = b$c.class;
       if (PatchProxy.isSupport(uoc1) && (!PatchProxy.applyVoidOneRefs(Boolean.valueOf(p1), uoc, uoc1, "1") && (uoc.a.from() == LiveGzoneKeys$From.DEV && uoc.a.defaultValue() instanceof Boolean))) {
          l.h(uoc.a.key(), p1);
       }
    label_0054 :
       return;
    }
}

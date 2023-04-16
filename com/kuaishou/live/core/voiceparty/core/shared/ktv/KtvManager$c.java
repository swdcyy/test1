package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$c;
import java.lang.Object;
import com.yxcorp.gifshow.model.Lyrics;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import jp2.w;

public class KtvManager$c	// class@001427
{
    public KtvMusicOrderInfo a;
    public w b;
    public Lyrics c;
    public boolean d;
    public int e;
    public long f;

    public void KtvManager$c(){
       super();
       this.e = 1;
    }
    public final Lyrics a(){
       return this.c;
    }
    public final KtvMusicOrderInfo b(){
       KtvManager$c obj = PatchProxy.apply(null, this, KtvManager$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("music");
       }
       return obj;
    }
    public final w c(){
       return this.b;
    }
    public final int d(){
       return this.e;
    }
    public final String e(){
       KtvManager$c obj = PatchProxy.apply(null, this, KtvManager$c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("music");
       }
       return String.valueOf(obj.userId);
    }
    public final long f(){
       return this.f;
    }
    public final void g(Lyrics p0){
       this.c = p0;
    }
    public final void h(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager$c.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.a = p0;
       return;
    }
    public final void i(w p0){
       this.b = p0;
    }
    public final void j(int p0){
       this.e = p0;
    }
    public final void k(boolean p0){
       this.d = p0;
    }
    public final void l(long p0){
       this.f = p0;
    }
}

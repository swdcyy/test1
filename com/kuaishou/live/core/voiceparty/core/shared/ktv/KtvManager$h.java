package com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$h;
import jp2.v;
import java.lang.Object;
import java.util.LinkedHashSet;
import hp2.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Set;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import kotlin.jvm.internal.a;
import java.lang.Long;

public final class KtvManager$h implements v	// class@001431
{
    public long a;
    public long b;
    public int c;
    public c d;
    public int e;
    public final Set f;

    public void KtvManager$h(){
       super();
       this.f = new LinkedHashSet();
    }
    public c a(){
       return this.d;
    }
    public int b(){
       return this.e;
    }
    public long c(){
       return this.a;
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, KtvManager$h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.size();
    }
    public int e(){
       return this.c;
    }
    public long f(){
       return this.b;
    }
    public final void g(KtvMusicOrderInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KtvManager$h.class, "2")) {
          return;
       }
       a.p(p0, "music");
       this.e = this.b() + 1;
       this.f.add(Long.valueOf(p0.userId));
       return;
    }
    public void h(long p0){
       this.a = p0;
    }
    public void i(long p0){
       this.b = p0;
    }
    public void j(int p0){
       this.c = p0;
    }
}

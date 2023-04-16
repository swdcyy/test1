package com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterManager$a;
import op2.e;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import op2.f;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import msd.a;
import hp2.n;

public class TheaterManager$a implements e	// class@001468
{
    public a a;
    public n b;
    public String c;
    public f d;
    public TheaterDisplayMode e;
    public boolean f;
    public long g;
    public long h;

    public void TheaterManager$a(){
       super();
       this.c = "";
       this.e = TheaterDisplayMode.HALF_SCREEN;
    }
    public f a(){
       return this.d;
    }
    public TheaterDisplayMode b(){
       return this.e;
    }
    public long c(){
       return this.g;
    }
    public final String d(){
       TheaterManager$a obj = PatchProxy.apply(null, this, TheaterManager$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj == null) {
          a.S("liveStreamIdFetcher");
       }
       return obj.invoke();
    }
    public final String e(){
       return this.c;
    }
    public void f(long p0){
       this.h = p0;
    }
    public void g(f p0){
       this.d = p0;
    }
    public long getDurationMs(){
       return this.h;
    }
    public void h(boolean p0){
       this.f = p0;
    }
    public void i(long p0){
       this.g = p0;
    }
    public boolean isPlaying(){
       return this.f;
    }
    public String k0(){
       TheaterManager$a obj = PatchProxy.apply(null, this, TheaterManager$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj == null) {
          a.S("param");
       }
       return obj.a();
    }
}

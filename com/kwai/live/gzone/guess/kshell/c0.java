package com.kwai.live.gzone.guess.kshell.c0;
import io.reactivex.g;
import com.kwai.live.gzone.guess.kshell.x;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p57.g;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import com.kwai.live.gzone.guess.bean.KShellGuessConfig;
import java.lang.reflect.Type;
import brd.g;
import u37.b;
import u37.e;
import fq5.b;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import com.kwai.live.gzone.guess.kshell.b0;
import com.kwai.live.gzone.guess.kshell.a0;
import com.kwai.live.gzone.guess.kshell.c0$a;
import erd.g;
import crd.b;

public class c0 implements g	// class@000d2b
{
    public final x b;

    public void c0(x p0){
       this.b = p0;
       super();
    }
    public void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "1")) {
          return;
       }
       KShellGuessConfig kShellGuessC = PatchProxy.apply(null, null, g.class, "3");
       if (kShellGuessC == PatchProxyResult.class) {
          kShellGuessC = b.a(0x5f2ddeb4).g("cache_guess", KShellGuessConfig.class);
       }
       if (kShellGuessC != null) {
          p0.onNext(kShellGuessC);
       }else {
          p0.setDisposable(e.a().b(this.b.G.getLiveStreamId()).map(new e()).observeOn(d.c).flatMap(b0.b).onErrorReturn(a0.b).subscribe(new c0$a(this, p0)));
       }
       return;
    }
}

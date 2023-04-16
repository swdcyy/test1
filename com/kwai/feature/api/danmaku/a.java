package com.kwai.feature.api.danmaku.a;
import ok.h;
import com.kwai.feature.api.danmaku.c;
import android.content.Context;
import java.lang.Object;
import java.lang.Void;
import java.util.Objects;
import java.lang.StringBuilder;
import java.lang.String;
import im5.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import im5.f$a;
import t45.d;
import brd.z;
import im5.a;
import com.kwai.feature.api.danmaku.b;
import erd.g;
import crd.b;

public final class a implements h	// class@000e72
{
    public final c b;
    public final boolean c;
    public final Context d;

    public void a(c p0,boolean p1,Context p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       Objects.requireNonNull(tb);
       tb.f("createDanmakuKit", "createDanmakuKit by BarrageKitWrapper isOpenManually = "+tc);
       if (tc != null) {
          p0 = PatchProxy.applyOneRefs(td, null, f.class, "5");
          if (p0 != PatchProxyResult.class) {
          }else {
             p0 = f.a.c(td);
          }
       }else {
          p0 = f.a();
       }
       return p0.observeOn(d.c).subscribe(new a(tb), b.b);
    }
}

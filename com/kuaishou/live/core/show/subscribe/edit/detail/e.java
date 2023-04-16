package com.kuaishou.live.core.show.subscribe.edit.detail.e;
import ok.x;
import java.lang.Object;
import crd.a;
import java.lang.String;
import com.kuaishou.live.core.show.subscribe.edit.detail.e$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import pk2.c;
import pk2.b;
import com.kwai.framework.model.user.QCurrentUser;
import brd.t;
import java.util.Objects;
import o31.l;
import erd.g;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.subscribe.edit.detail.b;
import sfc.a;
import crd.b;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.subscribe.model.LiveSubscribePreDeleteResponse$PreDeleteInfo;
import java.lang.Integer;
import com.kuaishou.live.core.show.subscribe.edit.detail.c;
import com.kuaishou.live.core.show.subscribe.edit.detail.a;

public class e	// class@00110a
{
    public final a a;
    public final x b;
    public final x c;
    public final x d;
    public final x e;

    public void e(x p0,x p1,x p2,x p3){
       super();
       this.a = new a();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void a(String p0,e$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "5")) {
          return;
       }
       if (TextUtils.x(p0)) {
          return;
       }
       e ta = this.a;
       Objects.requireNonNull(ta);
       b.b().z0(QCurrentUser.me().getId(), p0).doOnSubscribe(new l(ta)).map(new e()).subscribe(new b(this, p0, p1), new a());
       return;
    }
    public final Activity b(){
       Object obj = PatchProxy.apply(null, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.get();
    }
    public final void c(String p0,e$a p1,int p2,LiveSubscribePreDeleteResponse$PreDeleteInfo p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, e.class, "3")) {
          return;
       }
       this.a.d();
       e ta = this.a;
       Objects.requireNonNull(ta);
       a uoa = new a(this, p3, p0, p1, p2);
       b.b().w0(QCurrentUser.me().getId(), p0).doOnSubscribe(new l(ta)).map(new e()).map(c.b).subscribe(v7, new a());
       return;
    }
    public void d(String p0,e$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       this.c(p0, p1, 1, null);
       return;
    }
}

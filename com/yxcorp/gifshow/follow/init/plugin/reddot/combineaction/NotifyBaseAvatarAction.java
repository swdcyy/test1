package com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction;
import qha.c;
import pr6.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction$b;
import brd.t;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction$a;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction$mAvatarScaleAnimator$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import lnc.b9;
import android.animation.ValueAnimator;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import android.graphics.drawable.Drawable;
import lnc.a1;
import java.util.Objects;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import java.lang.Math;
import android.graphics.Bitmap$Config;
import com.yxcorp.gifshow.util.BitmapUtil;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import ro5.c0;
import com.yxcorp.gifshow.model.FollowTabNotify;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction$c;
import gha.p;
import gha.d;
import io.reactivex.g;
import t45.d;
import brd.z;
import gha.l;
import erd.r;
import gha.k;
import erd.o;
import gha.j;
import gha.g;
import gha.p$a;
import gha.i;

public abstract class NotifyBaseAvatarAction implements c	// class@0010f0
{
    public final NotifyBaseAvatarAction$b a;
    public final int b;
    public final long c;
    public b d;
    public final p e;
    public final d f;

    public void NotifyBaseAvatarAction(d p0){
       a.p(p0, "tabHostFragment");
       super();
       this.f = p0;
       this.a = new NotifyBaseAvatarAction$b(this);
       this.c = 2000;
       p0.m().subscribe(new NotifyBaseAvatarAction$a(this));
       this.e = s.c(new NotifyBaseAvatarAction$mAvatarScaleAnimator$2(this));
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, NotifyBaseAvatarAction.class, "3")) {
          return;
       }
       this.a.removeMessages(this.b);
       b9.a(this.d);
       return;
    }
    public final ValueAnimator c(){
       Object obj = PatchProxy.apply(null, this, NotifyBaseAvatarAction.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public final NotifyBaseAvatarAction$b d(){
       return this.a;
    }
    public final int e(){
       return this.b;
    }
    public void f(){
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, NotifyBaseAvatarAction.class, "5")) {
          return;
       }
       if (this.f.g() != null) {
          Drawable uDrawable = a1.f(R.drawable.detail_avatar_secret);
          Objects.requireNonNull(uDrawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
          Bitmap bitmap = uDrawable.getBitmap();
          int i = a1.e(24.00f);
          String str = "bitmap";
          if (i) {
             a.o(bitmap, str);
             if (bitmap.getHeight()) {
                i = Math.min(i, bitmap.getHeight());
             }
          }
          a.o(bitmap, str);
          c0.E(this.f, b.c, BitmapUtil.U(bitmap, i, i, bitmap.getConfig(), false));
       }
       return;
    }
    public final void h(FollowTabNotify p0){
       String str = "4";
       if (PatchProxy.applyVoidOneRefs(p0, this, NotifyBaseAvatarAction.class, str)) {
          return;
       }
       a.p(p0, "followTabNotify");
       this.g();
       NotifyBaseAvatarAction$c uoc = new NotifyBaseAvatarAction$c(this);
       b uob = PatchProxy.applyTwoRefs(p0, uoc, null, p.class, str);
       if (uob != PatchProxyResult.class) {
       }else {
          uob = t.create(new d(p0)).observeOn(d.c).filter(l.b).map(k.b).filter(l.b).map(j.b).filter(l.b).observeOn(d.a).subscribe(new g(uoc), new i(uoc));
       }
       this.d = uob;
       return;
    }
}

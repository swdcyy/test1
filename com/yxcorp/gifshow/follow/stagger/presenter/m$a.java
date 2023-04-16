package com.yxcorp.gifshow.follow.stagger.presenter.m$a;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.gifshow.follow.stagger.presenter.m;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import com.kuaishou.android.model.mix.AggregateTemplateMeta;
import brd.t;
import com.yxcorp.gifshow.follow.stagger.presenter.l;
import erd.o;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.follow.stagger.presenter.k;
import erd.g;
import eja.b0;
import com.yxcorp.gifshow.follow.stagger.presenter.j;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import m0d.l;

public class m$a implements ImageCallback	// class@001218
{
    public User b;
    public final m c;

    public void m$a(m p0,User p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void onCompleted(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       if (p0 instanceof BitmapDrawable) {
          this.onCompletedBitmap(p0.getBitmap());
       }
       return;
    }
    public void onCompletedBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "2")) {
          return;
       }
       if (p0 != null && !p0.isRecycled()) {
          m$a tc = this.c;
          if (this.b == tc.v.mRecommendUser) {
             tc.X7(t.just(p0).map(l.b).observeOn(d.c).doOnNext(k.b).observeOn(d.a).subscribe(new b0(this), j.b));
          }
       }
       return;
    }
    public void onProgress(float p0){
       l.c(this, p0);
    }
}

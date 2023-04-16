package com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendContactPresenter$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendContactPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.permission.ContactPermissionHolder;
import android.widget.TextView;
import android.view.View;
import n7c.e;
import tkd.b;
import tkd.d;
import wu5.a;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.profile.presenter.profile.header.recommend.PymkRecommendContactPresenter$a$a;
import n3d.a;

public final class PymkRecommendContactPresenter$a implements Runnable	// class@001519
{
    public final GifshowActivity b;
    public final PymkRecommendContactPresenter c;

    public void PymkRecommendContactPresenter$a(GifshowActivity p0,PymkRecommendContactPresenter p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, PymkRecommendContactPresenter$a.class, "1")) {
          return;
       }
       if (this.c.V8().d()) {
          PymkRecommendContactPresenter$a tc = this.c;
          if (tc.z != null) {
             e.c(tc.V8().d(), PymkRecommendContactPresenter.P8(this.c), PymkRecommendContactPresenter.R8(this.c));
             Intent intent = d.a(0x6de3c81e).V7(this.b, this.c.B);
             a.o(intent, "PluginManager\n          ¡­iendActIntent\(it, portal\)");
             this.b.t1(intent, 2049, new PymkRecommendContactPresenter$a$a(this));
          }else {
             tc.W8();
          }
       }
       PatchProxy.onMethodExit(PymkRecommendContactPresenter$a.class, "1");
       return;
    }
}

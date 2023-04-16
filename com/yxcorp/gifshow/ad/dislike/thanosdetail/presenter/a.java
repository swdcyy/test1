package com.yxcorp.gifshow.ad.dislike.thanosdetail.presenter.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j19.f;
import android.view.View;
import n29.b;
import com.kwai.robust.PatchProxyResult;
import j19.b;
import z1.a;
import android.view.View$OnClickListener;
import ekd.m1;
import j19.c;
import j19.d;
import j19.e;

public final class a extends PresenterV2	// class@001755
{
    public View p;
    public final DislikeViewModel q;

    public void a(DislikeViewModel p0){
       a.p(p0, "mDislikeViewModel");
       super();
       this.q = p0;
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          a tp = this.p;
          if (tp == null) {
             a.S("mDislikeContainer");
          }
          f uof = new f(tp);
          b uob = new b(this);
          if (PatchProxy.applyOneRefs(uob, uof, f.class, "1") != PatchProxyResult.class) {
          }else {
             m1.a(uof.a, new b(uob), R.id.slide_play_dislike_style_btn);
             m1.a(uof.a, new c(uob), R.id.slide_play_dislike_author_btn);
             m1.a(uof.a, new d(uob), R.id.slide_play_dislike_repeat_btn);
             m1.a(uof.a, new e(uob), R.id.slide_play_dislike_content_btn);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.m(p0);
       this.p = p0;
       return;
    }
}

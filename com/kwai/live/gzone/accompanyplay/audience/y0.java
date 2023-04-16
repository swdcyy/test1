package com.kwai.live.gzone.accompanyplay.audience.y0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.kwai.live.gzone.accompanyplay.audience.k0$g;
import k37.n1;
import erd.g;
import crd.b;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.request.ImageRequest;
import boc.d0;
import kb.c;
import k37.o1;
import android.os.AsyncTask;
import kb.e;
import java.util.concurrent.Executor;
import k37.l1;
import android.view.View$OnClickListener;
import android.view.View;
import k37.m1;
import android.text.SpannableString;
import lnc.a1;
import java.lang.CharSequence;
import android.text.style.UnderlineSpan;
import android.widget.TextView;
import com.kwai.live.gzone.accompanyplay.audience.x0;
import java.lang.Integer;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;

public class y0 extends PresenterV2	// class@000bc7
{
    public TextView A;
    public k0$g p;
    public KwaiImageView[] q;
    public String[] r;
    public int s;
    public View t;
    public KwaiImageView u;
    public KwaiImageView v;
    public KwaiImageView w;
    public KwaiImageView x;
    public KwaiImageView y;
    public TextView z;

    public void y0(){
       super();
    }
    public void E8(){
       y0 oy0 = y0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oy0, "3")) {
          return;
       }
       String[] stringArray = new String[]{"https://static.yximgs.com/udata/pkg/kwai-client-image/gzone_accompany_rating_icon_1.png","https://static.yximgs.com/udata/pkg/kwai-client-image/gzone_accompany_rating_icon_2.png","https://static.yximgs.com/udata/pkg/kwai-client-image/gzone_accompany_rating_icon_3.png","https://static.yximgs.com/udata/pkg/kwai-client-image/gzone_accompany_rating_icon_4.png","https://static.yximgs.com/udata/pkg/kwai-client-image/gzone_accompany_rating_icon_5.png"};
       this.r = stringArray;
       this.X7(this.p.n().subscribe(new n1(this)));
       int i = this.r.length - 1;
       boolean b = false;
       while (i >= 0) {
          object oobject = this.r[i];
          if (!PatchProxy.applyVoidOneRefs(oobject, this, oy0, "8")) {
             Fresco.getImagePipeline().fetchDecodedImage(d0.f(oobject, b)[b], objArray).f(new o1(this), AsyncTask.THREAD_POOL_EXECUTOR);
          }
          i = i - 1;
       }
       y0 tq = this.q;
       int len = tq.length;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          tq[i1].setOnClickListener(new l1(this));
       }
       this.t.setOnClickListener(new m1(this));
       this.t.setEnabled(b);
       this.t.setAlpha(0x3f000000);
       if (!PatchProxy.applyVoid(objArray, this, oy0, "4")) {
          SpannableString spannableStr = new SpannableString(a1.p(0x7f102390));
          spannableStr.setSpan(new UnderlineSpan(), b, spannableStr.length(), 33);
          this.z.setText(spannableStr);
          this.z.setOnClickListener(new x0(this));
       }
       return;
    }
    public final void P8(int p0){
       y0 oy0 = y0.class;
       if (PatchProxy.isSupport(oy0) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oy0, "7")) {
          return;
       }
       if (!this.t.isEnabled()) {
          this.t.setAlpha(0x3f800000);
          this.t.setEnabled(true);
       }
       this.s = p0;
       int i = 0;
       y0 tq = this.q;
       while (i < tq.length) {
          object oobject = tq[i];
          if (i < p0) {
             int i1 = p0 - 1;
             d0.c(oobject, this.r[i1], false);
          }else {
             oobject.L(null);
          }
          i = i + 1;
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y0.class, "2")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a11c0);
       this.A = m1.f(p0, 0x7f0a1dbd);
       this.t = m1.f(p0, 0x7f0a11dc);
       this.u = m1.f(p0, 0x7f0a11d7);
       this.v = m1.f(p0, 0x7f0a11d8);
       this.w = m1.f(p0, 0x7f0a11d9);
       this.x = m1.f(p0, 0x7f0a11da);
       KwaiImageView kwaiImageVie = m1.f(p0, R.id.gzone_accompany_rating_5);
       this.y = kwaiImageVie;
       KwaiImageView[] kwaiImageVie1 = new KwaiImageView[]{this.u,this.v,this.w,this.x,kwaiImageVie};
       this.q = kwaiImageVie1;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, y0.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_GZONE_AUDIENCE_ACCOMPANY_INNER_SERVICE");
       return;
    }
}

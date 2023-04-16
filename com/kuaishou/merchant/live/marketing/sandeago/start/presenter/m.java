package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.String;
import com.kuaishou.merchant.live.basic.model.UploadImageResponse;
import brd.w;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import y04.d;
import y04.c;
import java.lang.System;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import j80.c;
import java.io.File;
import qkd.b;
import brd.a0;
import ks3.h;
import t45.d;
import brd.z;
import q64.n;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.l;
import erd.g;
import crd.b;
import okhttp3.MultipartBody$Part;
import ojd.e;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import cjd.e;
import erd.o;
import q64.o;
import q64.m;
import q64.l;
import android.view.View;
import ekd.m1;
import android.widget.ImageView;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.n$b;
import io.reactivex.subjects.PublishSubject;

public class m extends PresenterV2	// class@001a80
{
    public h p;
    public SandeagoPublish q;
    public n$b r;
    public PublishSubject s;
    public PublishSubject t;
    public ImageView u;

    public void m(){
       super();
    }
    public static w P8(m p0,String p1,UploadImageResponse p2){
       return p0.R8(p1, p2);
    }
    private w R8(String p0,UploadImageResponse p1){
       m tq = this.q;
       tq.mImageUrl = p1.mImageUrl;
       tq.mImageId = p1.mImageId;
       return c.a().o(p0, System.currentTimeMillis(), p1.mImageUrl);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       File uFile = b.Z(b.a(-1504323719).o());
       this.q.mImageFile = uFile;
       n on = new n(this, uFile);
       this.X7(this.p.g(320, 320).G(d.a).R(on, l.b));
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, m.class, "4")) {
          return;
       }
       String liveStreamId = this.p.a().getLiveStreamId();
       this.X7(c.a().a(liveStreamId, e.d("image", this.q.mImageFile)).map(new e()).flatMap(new o(this, liveStreamId)).map(new e()).subscribe(new m(this), new l(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a1589);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_MERCHANT_ANCHOR_SANDEABIZ_SERVICE");
       this.q = this.r8("SANDEABIZ_PUBLISH");
       this.r = this.r8("SANDEAGO_PRE_AUDIT_SERVICE");
       this.s = this.r8("SANDEAGO_CATEGORY_SUGGEST_SUBJECT");
       this.t = this.r8("SANDEAGO_TITLE_SUBJECT");
       return;
    }
}

package com.feature.post.bridge.i;
import java.lang.Runnable;
import android.app.Activity;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumParams;
import f55.g;
import java.lang.Object;
import og.l;
import java.lang.String;
import q87.c;
import w69.b$a;
import w69.b;
import w69.f$a;
import o79.a;
import w69.f;
import com.yxcorp.gifshow.album.AlbumLimitOption$Builder;
import com.yxcorp.gifshow.album.AlbumLimitOption;
import w69.k$a;
import w69.k;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kwai.feature.post.api.feature.bridge.JsUploadVideoFromAlbumParams$LimitParamsBean;
import java.lang.Long;
import w69.i$a;
import w69.i;
import com.yxcorp.gifshow.activity.GifshowActivity;
import r16.f;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import com.trello.rxlifecycle3.android.ActivityEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.f0;
import t45.d;
import brd.z;
import com.feature.post.bridge.h;
import mg.v0;
import erd.g;
import crd.b;

public final class i implements Runnable	// class@00147e
{
    public final Activity b;
    public final JsUploadVideoFromAlbumParams c;
    public final g d;

    public void i(Activity p0,JsUploadVideoFromAlbumParams p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       float f;
       f uof1;
       i oi = this;
       i b = oi.b;
       i c = oi.c;
       i d = oi.d;
       int i = 0;
       Object[] objArray = new Object[i];
       l.D().w("JsPublishFun", "uploadVideoFromAlbumReal: ", objArray);
       b$a uoa = new b$a();
       boolean b1 = true;
       uoa.c(b1);
       b uob = uoa.a();
       f$a uoa1 = new f$a();
       uoa1.g(a.d);
       f uof = uoa1.a();
       AlbumLimitOption$Builder uBuilder = new AlbumLimitOption$Builder();
       uBuilder.g(b1);
       AlbumLimitOption uAlbumLimitO = uBuilder.d();
       k ok = new k$a().b();
       JsUploadVideoFromAlbumParams mLimitParams = c.mLimitParams;
       if (!q.f(mLimitParams)) {
          Iterator iterator = mLimitParams.iterator();
          while (iterator.hasNext()) {
             JsUploadVideoFromAlbumParams$LimitParamsBean limitParamsB = iterator.next();
             JsUploadVideoFromAlbumParams$LimitParamsBean mRange = limitParamsB.mRange;
             if (("duration").equals(limitParamsB.mType)) {
                f = 1000.00f;
                float f1 = (float)mRange.get(b1).longValue() * f;
                uof1 = uof;
                uAlbumLimitO.H((long)f1);
                float f2 = (float)mRange.get(i).longValue() * f;
                uAlbumLimitO.J((int)f2);
                uAlbumLimitO.E(limitParamsB.mErrmsg);
                uAlbumLimitO.I(limitParamsB.mErrmsg);
                uAlbumLimitO.K(limitParamsB.mErrmsg);
                b1 = 1;
                ok.A(b1);
             }else {
                uof1 = uof;
                if (("size").equals(limitParamsB.mType)) {
                   uAlbumLimitO.L(mRange.get(i).longValue());
                   uAlbumLimitO.F(mRange.get(b1).longValue());
                   uAlbumLimitO.G(limitParamsB.mErrmsg);
                }
             }
             uof = uof1;
          }
       }
       i oi1 = new i$a().a(uob).d(uof).f(uAlbumLimitO).m(ok).b();
       if (b instanceof GifshowActivity) {
          y6.s(f.class, LoadPolicy.DIALOG).g(b.E2(ActivityEvent.DESTROY)).G(d.a).R(new h(b, oi1, c, d), new v0(d));
       }
       return;
    }
}

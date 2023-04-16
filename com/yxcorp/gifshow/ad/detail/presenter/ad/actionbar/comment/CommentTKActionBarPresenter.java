package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.CommentTKActionBarPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.CommentTKActionBarPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.tachikoma.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.CommentTKActionBarPresenter$mActionBarCloseCallback$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.model.ads.PhotoAdvertisement$AdData;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentActionBarInfo;
import x49.l;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import x49.l$a;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateData;
import n49.o;
import a59.f;
import android.app.Activity;
import mxb.u;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import yy6.c;
import msd.l;
import a59.j;
import a59.k;
import msd.r;
import java.lang.Integer;
import java.util.Map;
import msd.a;
import gr.c;
import com.kwai.framework.player.core.b;
import io.reactivex.subjects.PublishSubject;
import oz8.a;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import mz8.g;
import x49.q;
import android.view.View;
import ekd.m1;

public final class CommentTKActionBarPresenter extends PresenterV2	// class@00155c
{
    public final l A;
    public QPhoto p;
    public o q;
    public PhotoDetailParam r;
    public PublishSubject s;
    public PublishSubject t;
    public a u;
    public final a v;
    public PhotoAdvertisement$TkTemplateData w;
    public PhotoAdvertisement$TkTemplateInfo x;
    public boolean y;
    public ViewGroup z;
    public static final CommentTKActionBarPresenter$a B;

    static {
       CommentTKActionBarPresenter.B = new CommentTKActionBarPresenter$a(null);
    }
    public void CommentTKActionBarPresenter(){
       super();
       this.v = new a();
       this.A = new CommentTKActionBarPresenter$mActionBarCloseCallback$1(this);
    }
    public void E8(){
       CommentTKActionBarPresenter p1;
       PhotoAdvertisement$CommentActionBarInfo mTemplateId;
       l$a a;
       PhotoAdvertisement$TkTemplateInfo tkTemplateIn = this;
       CommentTKActionBarPresenter uCommentTKAc = CommentTKActionBarPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tkTemplateIn, uCommentTKAc, "11")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, tkTemplateIn, uCommentTKAc, "12")) {
          p1 = tkTemplateIn.z;
          if (p1 != null) {
             p1.removeAllViews();
          }
       }
       String str = "mPhoto";
       if (!PatchProxy.applyVoid(objArray, tkTemplateIn, uCommentTKAc, "13")) {
          p1 = tkTemplateIn.p;
          if (p1 == null) {
             a.S(str);
          }
          PhotoAdvertisement photoAdverti = k.B(p1);
          if (photoAdverti != null) {
             PhotoAdvertisement$AdData adData = photoAdverti.getAdData();
             if (adData != null) {
                adData = adData.mCommentActionBarInfo;
                if (adData != null) {
                   mTemplateId = adData.mTemplateId;
                   if (mTemplateId != null) {
                   label_0047 :
                      a = l.a;
                      CommentTKActionBarPresenter p2 = tkTemplateIn.p;
                      if (p2 == null) {
                         a.S(str);
                      }
                      PhotoAdvertisement photoAdverti1 = k.B(p2);
                      a.m(photoAdverti1);
                      String str1 = "CommercialFeedExt.getPhotoAd\(mPhoto\)!!";
                      a.o(photoAdverti1, str1);
                      tkTemplateIn.x = a.a(mTemplateId, photoAdverti1);
                      p2 = tkTemplateIn.p;
                      if (p2 == null) {
                         a.S(str);
                      }
                      photoAdverti1 = k.B(p2);
                      a.m(photoAdverti1);
                      a.o(photoAdverti1, str1);
                      tkTemplateIn.w = a.b(mTemplateId, photoAdverti1);
                   }
                }
             }
          }
          mTemplateId = "";
          goto label_0047 ;
       }
       if (!PatchProxy.applyVoid(objArray, tkTemplateIn, uCommentTKAc, "14")) {
          if (tkTemplateIn.q == null) {
             tkTemplateIn.q = new o();
          }
          Activity activity = this.getActivity();
          CommentTKActionBarPresenter p = tkTemplateIn.p;
          if (p == null) {
             a.S(str);
          }
          CommentTKActionBarPresenter w = tkTemplateIn.w;
          CommentTKActionBarPresenter q = tkTemplateIn.q;
          CommentTKActionBarPresenter x = tkTemplateIn.x;
          CommentTKActionBarPresenter r = tkTemplateIn.r;
          if (r == null) {
             a.S("mDetailParam");
          }
          f uof = new f(activity, p, x, q, w, r, null, null, null, null, null, tkTemplateIn.A, null, null, null, null, null, null, null, 0x7f7c0, null);
          a uoa = new a(v3);
          tkTemplateIn.u = uoa;
          uoa.h();
       }
       if (!PatchProxy.applyVoid(objArray, tkTemplateIn, uCommentTKAc, "15")) {
          CommentTKActionBarPresenter u = tkTemplateIn.u;
          a.m(u);
          tkTemplateIn.v.a(tkTemplateIn.z, u, true);
       }
       if (!PatchProxy.applyVoid(objArray, tkTemplateIn, uCommentTKAc, "16")) {
          uCommentTKAc = tkTemplateIn.x;
          if (uCommentTKAc != null) {
             tkTemplateIn.v.b(uCommentTKAc, new g(tkTemplateIn));
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, CommentTKActionBarPresenter.class, "18")) {
          return;
       }
       this.v.destroy();
       CommentTKActionBarPresenter tu = this.u;
       if (tu != null) {
          tu.g();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentTKActionBarPresenter.class, "10")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a0115);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, CommentTKActionBarPresenter.class, "9")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       this.q = this.s8(o.class);
       obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.r = obj;
       obj = this.r8("COMMENT_TK_ACTION_BAR_RENDER_SUCCESS");
       a.o(obj, "inject\(AccessIds.COMMENT¡­CTION_BAR_RENDER_SUCCESS\)");
       this.s = obj;
       obj = this.r8("COMMENT_TK_ACTION_BAR_CLOSE_BY_USER");
       a.o(obj, "inject\(AccessIds.COMMENT_ACTION_BAR_CLOSE_BY_USER\)");
       this.t = obj;
       return;
    }
}

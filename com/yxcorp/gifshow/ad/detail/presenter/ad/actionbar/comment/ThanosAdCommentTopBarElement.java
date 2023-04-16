package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.ThanosAdCommentTopBarElement;
import s85.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.ThanosAdCommentTopBarElement$mCommentTopBarInfo$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.ads.PhotoAdvertisement$CommentTopBarInfo;
import java.lang.CharSequence;
import com.kwai.component.commenttopbar.model.BaseElementModel$Style;
import com.kwai.component.commenttopbar.model.BaseElementModel;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Context;
import com.kwai.component.commenttopbar.model.a;
import android.view.View;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import n49.e;
import wkd.b;
import my.a;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.ThanosAdCommentTopBarElement$b;
import erd.g;
import java.util.Map;

public final class ThanosAdCommentTopBarElement extends b	// class@001566
{
    public final p c;
    public final QPhoto d;

    public void ThanosAdCommentTopBarElement(QPhoto p0){
       super();
       this.d = p0;
       this.c = s.c(new ThanosAdCommentTopBarElement$mCommentTopBarInfo$2(this));
    }
    public boolean a(){
       Object[] objArray = null;
       PhotoAdvertisement$CommentTopBarInfo obj = PatchProxy.apply(objArray, this, ThanosAdCommentTopBarElement.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.l() != null) {
          obj = this.l();
          if (obj != null) {
             objArray = obj.mMainTitle;
          }
          obj = (objArray == null || !objArray.length())? 1: 0;
          if (!obj) {
          label_0034 :
             return b;
          }
       }
       b = false;
       goto label_0034 ;
    }
    public BaseElementModel$Style c(){
       return BaseElementModel$Style.DOUBLE;
    }
    public boolean e(){
       return false;
    }
    public void f(BaseElementModel p0,GifshowActivity p1,Context p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, ThanosAdCommentTopBarElement.class, "3")) {
       }else if(p0 != null){
          PhotoAdvertisement$CommentTopBarInfo uCommentTopB = this.l();
          if (uCommentTopB != null) {
             p0.k(uCommentTopB.mIconUrl);
             p0.m(uCommentTopB.mMainTitle);
             p0.p(uCommentTopB.mSubTitle);
             p0.l(uCommentTopB.mMainDesc);
             p0.o(uCommentTopB.mSubDesc);
             p0.q(uCommentTopB.mTag);
             p0.n(uCommentTopB.mShowArrow);
          }
          PatchProxy.onMethodExit(ThanosAdCommentTopBarElement.class, "3");
       }else {
          PatchProxy.onMethodExit(ThanosAdCommentTopBarElement.class, "3");
       }
       return;
    }
    public void g(View p0,GifshowActivity p1){
       Map map;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ThanosAdCommentTopBarElement.class, "5")) {
          return;
       }
       if (p1 != null) {
          ThanosAdCommentTopBarElement td = this.d;
          if (td != null) {
             PhotoAdDataWrapper photoAdDataW = new PhotoAdDataWrapper(td.mEntity);
             photoAdDataW.setItemClickType(33);
             e uoe = new e(33);
             PhotoAdvertisement$CommentTopBarInfo uCommentTopB = this.l();
             uCommentTopB = (uCommentTopB != null)? uCommentTopB.mClientExtData: null;
             uoe.d = uCommentTopB;
             b.a(0x1f7421d5).c(p1, photoAdDataW, uoe);
          }
       }
       return;
    }
    public void i(boolean p0){
       Map map;
       ThanosAdCommentTopBarElement thanosAdComm = ThanosAdCommentTopBarElement.class;
       if (PatchProxy.isSupport(thanosAdComm) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, thanosAdComm, "4")) {
          return;
       }
       if (this.d != null && p0) {
          j0 oj0 = i0.a().e(932, this.d.mEntity).d(ThanosAdCommentTopBarElement$b.b);
          PhotoAdvertisement$CommentTopBarInfo uCommentTopB = this.l();
          uCommentTopB = (uCommentTopB != null)? uCommentTopB.mClientExtData: null;
          oj0.o(uCommentTopB).a();
       }
       return;
    }
    public final PhotoAdvertisement$CommentTopBarInfo l(){
       Object obj = PatchProxy.apply(null, this, ThanosAdCommentTopBarElement.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
}

package com.yxcorp.gifshow.commoninsertcard.fragment.CommonCardFragment;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import android.os.Bundle;
import dw6.b;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import hx6.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import android.view.View;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeed;
import um9.e;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.soc.arch.rubas.base.Rubas;
import k2b.u1;
import le5.f;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import lnc.a1;

public abstract class CommonCardFragment extends DetailSlidePlayFragment	// class@0011ab
{
    public NasaBizParam F;

    public void CommonCardFragment(){
       super();
    }
    public void H2(){
       if (PatchProxy.applyVoid(null, this, CommonCardFragment.class, "4")) {
          return;
       }
       this.mh();
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoid(null, this, CommonCardFragment.class, "6")) {
          return;
       }
       this.ph();
       return;
    }
    public void Q0(){
       if (PatchProxy.applyVoid(null, this, CommonCardFragment.class, "5")) {
          return;
       }
       this.oh();
       return;
    }
    public void Q1(){
       if (PatchProxy.applyVoid(null, this, CommonCardFragment.class, "3")) {
          return;
       }
       this.nh();
       return;
    }
    public SlidePlayLogger d1(){
       return null;
    }
    public int getPage(){
       return 0x7d42;
    }
    public String getUrl(){
       return "ks://photo";
    }
    public String o(){
       return "FEATURED_PAGE";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommonCardFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.F = a.a(this.ch());
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommonCardFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       DetailSlidePlayFragment tx = this.x;
       if (tx != null) {
          PhotoDetailParam mPhoto = tx.mPhoto;
          if (mPhoto != null) {
             QPhoto mEntity = mPhoto.mEntity;
             if (mEntity != null) {
                CommonInsertCardFeed mCommonInser = mEntity.mCommonInsertCardFeedMeta;
                if (mCommonInser != null && !PatchProxy.applyVoidOneRefs(mCommonInser, null, e.class, "8")) {
                   int i = 1;
                   if (mCommonInser.mMetaStyle == i) {
                      i3 oi3 = i3.f();
                      oi3.c("metaStyle", Integer.valueOf(i));
                      oi3.c("cardType", Integer.valueOf(mCommonInser.mCardType));
                      String str = oi3.e();
                      Rubas.d("common_card_page_show", str);
                      u1.R("common_card_page_show", str, 14);
                   }
                }
             }
          }
       }
       return;
    }
    public void xh(){
       if (PatchProxy.applyVoid(null, this, CommonCardFragment.class, "7")) {
          return;
       }
       if (!f.b() || (!this.F.getNasaSlideParam().isHomePage() && !this.F.getNasaSlideParam().isTrendingPage())) {
          int i = a1.d(R.dimen.arg_RES_7f070bf1);
          GrootBaseFragment tj = this.j;
          if (tj != null) {
             tj.setPadding(0, 0, 0, i);
          }
       }
       return;
    }
}

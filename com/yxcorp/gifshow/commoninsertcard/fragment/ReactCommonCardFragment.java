package com.yxcorp.gifshow.commoninsertcard.fragment.ReactCommonCardFragment;
import lnc.g2$a;
import com.yxcorp.gifshow.commoninsertcard.fragment.CommonCardFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeed;
import um9.e;
import com.yxcorp.gifshow.commoninsertcard.entity.CommonInsertCardFeedMeta;
import lnc.i3;
import com.kwai.soc.arch.rubas.base.Rubas;
import k2b.u1;
import xm9.k;
import xm9.b;
import android.os.Bundle;
import java.util.LinkedList;
import im8.c;
import java.util.List;
import lnc.g2;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import ag6.a;

public abstract class ReactCommonCardFragment extends CommonCardFragment implements g2$a	// class@0011ad
{
    public CommonInsertCardFeed G;
    public g2 H;

    public void ReactCommonCardFragment(){
       super();
    }
    public PresenterV2 B2(){
       Object[] objArray = null;
       PhotoDetailParam obj = PatchProxy.applyWithListener(objArray, this, ReactCommonCardFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.rh();
       if (obj != null) {
          this.G = obj.mPhoto.mEntity;
       }
       ReactCommonCardFragment tG = this.G;
       if (tG != null) {
          CommonInsertCardFeed mCommonInser = tG.mCommonInsertCardFeedMeta;
          if (mCommonInser != null && !PatchProxy.applyVoidOneRefs(mCommonInser, objArray, e.class, "2")) {
             String str = e.a(mCommonInser).e();
             Rubas.g("metaStyle", String.valueOf(mCommonInser.mMetaStyle));
             Rubas.g("cardType", String.valueOf(mCommonInser.mCardType));
             String str1 = "common_card_data_ready";
             Rubas.d(str1, str);
             u1.R(str1, str, 14);
          }
       }
       PresenterV2 presenterV2 = new PresenterV2();
       presenterV2.U7(new k());
       presenterV2.U7(new b());
       PatchProxy.onMethodExit(ReactCommonCardFragment.class, "4");
       return presenterV2;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactCommonCardFragment.class, "3")) {
          return;
       }
       super.onActivityCreated(p0);
       LinkedList linkedList = new LinkedList();
       PhotoDetailParam photoDetailP = this.rh();
       if (photoDetailP == null) {
          return;
       }
       linkedList.add(photoDetailP);
       linkedList.add(new c("FRAGMENT", this));
       this.yh(linkedList);
       this.H.b(linkedList);
       this.qh();
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactCommonCardFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (this.H == null) {
          this.H = new g2(this, this);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ReactCommonCardFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       if (this.j == null) {
          this.j = a.c(p0, 0x7f0d01f8, p1, false);
       }
       this.xh();
       return this.j;
    }
    public void yh(List p0){
    }
}

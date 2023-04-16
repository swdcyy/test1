package com.yxcorp.gifshow.detail.common.information.interestadjust.a;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import jh5.a;
import xq7.d;
import rp7.a;
import qp7.a;
import v6a.m0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.util.Objects;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.android.model.mix.InterestAdjustSnackBarInfo;
import k2b.u1;
import rq7.a;
import com.kwai.robust.PatchProxyResult;
import hy9.m;
import hy9.l;
import java.lang.Boolean;
import qp7.x0;
import qp7.b;
import java.util.List;
import java.lang.Math;
import java.lang.Integer;
import pp7.b;
import com.kuaishou.android.model.mix.OptionItem;
import qp7.c;
import hy9.c;
import crd.b;
import erd.g;
import brd.t;
import hy9.b;
import hy9.a;
import qp7.d;
import com.yxcorp.gifshow.detail.common.information.interestadjust.d;

public class a extends DispatchBaseElement	// class@001425
{
    public int A;
    public QPhoto t;
    public PhotoMeta u;
    public String v;
    public String w;
    public String x;
    public String y;
    public int z;

    public void a(a p0){
       super(d.x, p0);
    }
    public void P(a p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
       }else {
          PhotoDetailParam mPhoto = p0.c.mPhoto;
          this.t = mPhoto;
          if (mPhoto != null) {
             this.u = mPhoto.getPhotoMeta();
          }
          PatchProxy.onMethodExit(a.class, "1");
       }
       return;
    }
    public void S(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "10")) {
          ShowMetaData showMetaData = new ShowMetaData();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          a tt = this.t;
          Objects.requireNonNull(tt);
          if (tt.mEntity != null) {
             uContentPack.photoPackage = w1.f(this.t.mEntity);
             showMetaData.setContentPackage(uContentPack);
          }
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 0x7d42;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "QUICK_INTERACTION_SMALL_CARD";
          if (this.u.mInterestAdjustSnackBarInfo != null) {
             i3 oi3 = i3.f();
             oi3.d("card_content", this.u.mInterestAdjustSnackBarInfo.mContent);
             oi3.d("card_id", this.u.mInterestAdjustSnackBarInfo.mInterestId);
             uElementPack.params = oi3.e();
          }
          u1.y0(urlPackage, 3, uElementPack, uContentPack);
       }
       return;
    }
    public a f0(a p0){
       m om = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (om != PatchProxyResult.class) {
       }else {
          om = new m(p0);
       }
       return om;
    }
    public void j0(boolean p0){
       m om1;
       l ol = l.class;
       a uoa = a.class;
       m om = m.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "2")) {
          return;
       }
       a tu = this.u;
       if (tu != null) {
          PhotoMeta mInterestAdj = tu.mInterestAdjustSnackBarInfo;
          if (mInterestAdj != null && mInterestAdj.mHasClick == null) {
             if (!PatchProxy.applyVoid(null, this, uoa, "8")) {
                tu = this.u;
                if (tu != null) {
                   mInterestAdj = tu.mInterestAdjustSnackBarInfo;
                   if (mInterestAdj != null && mInterestAdj.mOptionItems != null) {
                      om1 = this.E();
                      int i = Math.min(this.u.mInterestAdjustSnackBarInfo.mOptionItems.size(), 2);
                      Objects.requireNonNull(om1);
                      if (!PatchProxy.isSupport(om) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), om1, om, "11")) {
                         om1.j.f(Integer.valueOf(i));
                      }
                      int i1 = 0;
                      while (i1 < this.u.mInterestAdjustSnackBarInfo.mOptionItems.size()) {
                         OptionItem optionItem = this.u.mInterestAdjustSnackBarInfo.mOptionItems.get(i1);
                         if (!i1) {
                            this.v = optionItem.mText;
                            this.x = optionItem.mToast;
                            this.z = optionItem.mWeight;
                         }else if(i1 == 1){
                            this.w = optionItem.mText;
                            this.y = optionItem.mToast;
                            this.A = optionItem.mWeight;
                         }
                         i1++;
                      }
                   }
                }
             }
             om1 = this.E();
             InterestAdjustSnackBarInfo mContent = this.u.mInterestAdjustSnackBarInfo.mContent;
             Objects.requireNonNull(om1);
             if (!PatchProxy.applyVoidOneRefs(mContent, om1, om, "2")) {
                om1.e.f(mContent);
             }
             om1 = this.E();
             uoa = this.v;
             Objects.requireNonNull(om1);
             if (!PatchProxy.applyVoidOneRefs(uoa, om1, om, "4")) {
                om1.f.f(uoa);
             }
             om1 = this.E();
             uoa = this.w;
             Objects.requireNonNull(om1);
             if (!PatchProxy.applyVoidOneRefs(uoa, om1, om, "6")) {
                om1.g.f(uoa);
             }
             l ol1 = this.A();
             c uoc = new c(this);
             Objects.requireNonNull(ol1);
             b uob = PatchProxy.applyOneRefs(uoc, ol1, ol, "2");
             if (uob != PatchProxyResult.class) {
             }else {
                uob = ol1.a.subscribe(uoc);
             }
             this.j(uob);
             ol1 = this.A();
             b uob1 = new b(this);
             Objects.requireNonNull(ol1);
             uob = PatchProxy.applyOneRefs(uob1, ol1, ol, "4");
             if (uob != PatchProxyResult.class) {
             }else {
                uob = ol1.b.subscribe(uob1);
             }
             this.j(uob);
             ol1 = this.A();
             uoa = new a(this);
             Objects.requireNonNull(ol1);
             b uob2 = PatchProxy.applyOneRefs(uoa, ol1, ol, "6");
             if (uob2 != PatchProxyResult.class) {
             }else {
                uob2 = ol1.c.subscribe(uoa);
             }
             this.j(uob2);
          label_015d :
             return;
          }
       }
       this.b0();
       goto label_015d ;
    }
    public void m0(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       m om = this.E();
       Objects.requireNonNull(om);
       m om1 = m.class;
       if (!PatchProxy.isSupport(om1) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, om, om1, "9")) {
          om.i.f(Boolean.TRUE);
       }
       this.b0();
       return;
    }
    public final void n0(Boolean p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       a tt = this.t;
       Objects.requireNonNull(tt);
       if (tt.mEntity != null) {
          uContentPack.photoPackage = w1.f(this.t.mEntity);
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "QUICK_INTERACTION_SMALL_CARD";
       PhotoMeta mInterestAdj = this.u.mInterestAdjustSnackBarInfo;
       if (mInterestAdj != null && mInterestAdj.mOptionItems != null) {
          i3 oi3 = i3.f();
          a tv = (p0.booleanValue())? this.v: this.w;
          oi3.d("btn_name", tv);
          oi3.d("card_content", this.u.mInterestAdjustSnackBarInfo.mContent);
          oi3.d("card_id", this.u.mInterestAdjustSnackBarInfo.mInterestId);
          uElementPack.params = oi3.e();
       }
       ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
       urlPackage.page = 0x7d42;
       u1.A(urlPackage, "", 1, uElementPack, uContentPack);
       return;
    }
    public d q(){
       d uod = PatchProxy.apply(null, this, a.class, "7");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = new d();
       }
       return uod;
    }
    public c r(){
       l ol = PatchProxy.apply(null, this, a.class, "6");
       if (ol != PatchProxyResult.class) {
       }else {
          ol = new l();
       }
       return ol;
    }
}

package dz9.d;
import mf5.w0;
import v6a.m0;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import le5.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.lang.Boolean;
import kf5.g;
import java.util.ArrayList;
import lnc.a1;
import e17.i$b;
import java.lang.CharSequence;
import android.app.Activity;
import psb.c;
import psb.a;
import brd.t;
import dz9.d$a;
import dz9.d$b;
import erd.g;
import crd.b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public final class d extends w0	// class@00200f
{
    public final BaseFragment C;
    public QPhoto D;
    public final GifshowActivity E;
    public Integer F;
    public final int G;
    public final int H;
    public final m0 I;
    public final SlidePageConfig J;

    public void d(m0 p0,SlidePageConfig p1){
       a a;
       a.p(p0, "callerContext");
       a.p(p1, "pageConfig");
       super("private_works_setting");
       this.I = p0;
       this.J = p1;
       this.C = p0.b;
       PhotoDetailParam mPhoto = p0.c.mPhoto;
       a.o(mPhoto, "callerContext.mPhotoDetailParam.mPhoto");
       this.D = mPhoto;
       a = p0.a;
       Objects.requireNonNull(a, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       this.E = a;
       PhotoMeta photoMeta = mPhoto.getPhotoMeta();
       Object[] objArray = null;
       Integer integer = (photoMeta != null)? Integer.valueOf(photoMeta.mAtMePhotoPrivacyStatus): objArray;
       this.F = integer;
       int i = 1;
       this.H = i;
       d obj = PatchProxy.apply(objArray, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          obj = this.F;
          d tG = this.G;
          if (obj != null && obj.intValue() == tG) {
             i = 0x7f080545;
          }else if(obj != null && obj.intValue() == i){
             i = 0x7f080a53;
          }else {
             i = 0x7f08229e;
          }
       }
       this.L(i);
       i = PatchProxy.apply(objArray, this, d.class, "6");
       if (i != PatchProxyResult.class) {
          i = i.intValue();
       }else if(this.D.getAtMePhotoPrivacyStatus() == this.G){
          i = 0x7f1046fa;
       }else {
          i = 0x7f10508b;
       }
       this.T(i);
       return;
    }
    public boolean E(){
       PhotoMeta obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.D.getPhotoMeta();
       boolean b = (obj == null || obj.mAtMePhotoPrivacyStatus != -1)? true: false;
       return b;
    }
    public final String W(int p0){
       String str = (p0 == this.G)? "TO_ALL": "TO_ONESELF";
       return str;
    }
    public void d(w0 p0,g p1){
       String str;
       d uod = d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "1")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       p1.a();
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       d tF = this.F;
       d tG = this.G;
       if (tF != null && tF.intValue() == tG) {
          uArrayList1.add(this.D.getPhotoId());
          str = a1.p(R.string.arg_RES_7f104cbc);
          a.o(str, "CommonUtil.string\(R.stri¡­his_feed_will_be_private\)");
       }else {
          uArrayList.add(this.D.getPhotoId());
          str = a1.p(R.string.arg_RES_7f104cbd);
          a.o(str, "CommonUtil.string\(R.stri¡­this_feed_will_be_public\)");
       }
       i$b uob = new i$b();
       uob.y(str);
       uob.l(true);
       uob.v(false);
       uob.o(2000);
       uob.k(this.E);
       a.a().x(this.D.getUserId(), uArrayList1.toString(), uArrayList.toString()).subscribe(new d$a(this, uob), new d$b(uob));
       d tF1 = this.F;
       if (tF1 != null) {
          int i = tF1.intValue();
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, uod, "7")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PLAYER_PANEL_ENTRANCE_BUTTON";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("button_type", this.W(i));
             uElementPack.params = jsonObject.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(this.D.getEntity());
             u1.M("", this.C, 6, uElementPack, uContentPack, null);
          }
       }
       return;
    }
    public void onShow(){
       d uod = d.class;
       if (PatchProxy.applyVoid(null, this, uod, "4")) {
          return;
       }
       d tF = this.F;
       if (tF != null) {
          int i = tF.intValue();
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, uod, "8")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PLAYER_PANEL_ENTRANCE_BUTTON";
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("button_type", this.W(i));
             uElementPack.params = jsonObject.toString();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(this.D.getEntity());
             u1.C0("", this.C, 6, uElementPack, uContentPack);
          }
       }
       return;
    }
}

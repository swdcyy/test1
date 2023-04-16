package com.kwai.component.photo.reduce.d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import org.json.JSONObject;
import org.json.JSONException;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import lnc.i3;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.component.photo.reduce.d$a;
import cg5.c;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.kwai.framework.logger.a;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.e0;
import brd.x;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import q21.b0;
import yf5.j;
import com.kwai.component.photo.reduce.d$b;
import erd.g;
import crd.b;
import yf5.c;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.gifshow.model.config.FeedNegativeFeedback$NegativeReason;
import com.kuaishou.android.model.mix.QRecoTag;
import yf5.k;
import sfc.a;
import wkd.b;
import l66.a;
import dda.i;
import m66.a;
import org.greenrobot.eventbus.a;
import cda.e;
import com.yxcorp.gifshow.events.realaction.RealAction$ExtParams;
import gda.a;
import com.yxcorp.gifshow.action.c;

public final class d	// class@000adf
{
    public final QPhoto a;
    public final GifshowActivity b;

    public void d(QPhoto p0,GifshowActivity p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static void h(String p0,QPhoto p1){
       JSONObject jSONObject;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, d.class, "14")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "NOT_INTERESTED";
       try{
          jSONObject = new JSONObject();
          jSONObject.put("source", p0);
       }catch(org.json.JSONException e3){
          e3.printStackTrace();
       }
       uElementPack.params = jSONObject.toString();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(p1.mEntity);
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public final void a(int p0,String p1,String p2,int p3,boolean p4,i3 p5,String p6){
       Object[] objArray;
       object oobject;
       t uoc1;
       Object obj = this;
       int i = 7;
       if (PatchProxy.isSupport(d.class)) {
          objArray = new Object[i];
          objArray[0] = Integer.valueOf(p0);
          objArray[1] = p1;
          objArray[2] = p2;
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Boolean.valueOf(p4);
          objArray[5] = p5;
          objArray[6] = p6;
          if (PatchProxy.applyVoid(objArray, obj, d.class, "9")) {
             return;
          }
       }
       d$a uoa = v7;
       d$a uoa1 = v7;
       uoa = new d$a(this, p1, p3, p4, p2, p0, p6);
       String url = obj.b.getUrl();
       if (PatchProxy.isSupport(d.class)) {
          objArray = new Object[]{Integer.valueOf(p0),url,p1,p2,uoa1,p5};
          if (PatchProxy.applyVoid(objArray, obj, d.class, "13")) {
          label_00f1 :
             return;
          }
       }
       uoa1.a();
       uoa1.b();
       d a = obj.a;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray1 = new Object[]{a,Integer.valueOf(p0),url,p1,oobject,p2,p5};
          oobject = null;
          uoc1 = PatchProxy.apply(objArray1, oobject, uoc, "4");
          if (uoc1 != PatchProxyResult.class) {
          label_00b7 :
             a uoa2 = new a("PHOTO_REDUCE_RESULT", this.f(), this.e(), 0, obj.a.getFeedLogCtx());
             uoc1.compose(a).compose(obj.b.ge()).subscribe(b0.b, new j(obj, uoa1));
             goto label_00f1 ;
          }
       }
       uoc1 = c.a(a, p0, url, p1, null, -1, p2, p5);
       goto label_00b7 ;
    }
    public void b(int p0,String p1,String p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, d.class, "1")) {
          return;
       }
       this.a(p0, p1, p2, 0, false, null, null);
       this.g();
       return;
    }
    public void c(int p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), null, p2, Integer.valueOf(p3), this, d.class, "3")) {
          return;
       }
       this.a(p0, null, p2, p3, false, null, null);
       this.g();
       return;
    }
    public void d(int p0,String p1,String p2,int p3,String p4){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),null,p2,Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uod, "4")) {
             return;
          }
       }
       this.a(p0, null, p2, p3, false, null, p4);
       this.g();
       return;
    }
    public final ClientContent$ContentPackage e(){
       ClientContent$ContentPackage obj = PatchProxy.apply(null, this, d.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       ClientContent$PhotoPackage photoPackage = w1.f(this.a.getEntity());
       obj.photoPackage = photoPackage;
       photoPackage.landscapeScreenDisplay = false;
       return obj;
    }
    public final ClientEvent$ElementPackage f(){
       ClientEvent$ElementPackage obj = PatchProxy.apply(null, this, d.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       ClientContent$PhotoPackage photoPackage = w1.f(this.a.getEntity());
       new ClientContent$ContentPackage().photoPackage = photoPackage;
       photoPackage.landscapeScreenDisplay = false;
       obj.action2 = "PHOTO_REDUCE_RESULT";
       c c = c.c;
       Objects.requireNonNull(c);
       if (c.a) {
          Objects.requireNonNull(c);
          String str = (c.b)? "from_auto_play=1": "from_auto_play=0";
          if (TextUtils.x(obj.params)) {
             obj.params = str;
          }else {
             obj.params = obj.params+"&"+str;
          }
       }
       return obj;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, d.class, "11")) {
          return;
       }
       d ta = this.a;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(ta.mEntity);
       if (!TextUtils.x(ta.getUserId())) {
          ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
          uContentPack.userPackage = userPackage;
          userPackage.identity = ta.getUserId();
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 1;
       uElementPack.action = 800;
       uElementPack.name = "reduce";
       u1.u(1, uElementPack, uContentPack);
       return;
    }
    public void i(int p0,String p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "5")) {
          return;
       }
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "8")) {
          FeedNegativeFeedback$NegativeReason negativeReas = new FeedNegativeFeedback$NegativeReason();
          negativeReas.mId = "1";
          c.h(this.a, p0, 0, negativeReas, null, null, this.b.getUrl(), p1).compose(new a("PHOTO_REDUCE_RESULT", this.f(), this.e())).subscribe(new k(this, negativeReas), new a());
          b.a(0x6d2a4fdd).b(new i(this.a.mEntity, TextUtils.I(negativeReas.mId)));
          a.d().k(new e(this.a.getPhotoId(), false, negativeReas, null));
          RealAction$ExtParams uExtParams = RealAction$ExtParams.newInstance();
          uExtParams.mNegativeType = a.b(negativeReas.mId, this.a.mEntity);
          c.b(9, this.a.mEntity, uExtParams);
       }
       this.g();
       return;
    }
}

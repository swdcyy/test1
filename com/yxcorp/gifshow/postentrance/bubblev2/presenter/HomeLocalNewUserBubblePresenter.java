package com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter;
import ozb.r;
import ozb.q;
import ozb.a;
import pr6.d;
import an6.k;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import an6.l;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$a;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.postentrance.bubblev2.presenter.HomeLocalNewUserBubblePresenter$onBind$1;
import ozb.b;
import msd.l;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import com.yxcorp.gifshow.postentrance.util.CameraEntranceUtils;
import java.lang.Integer;
import xf6.d;
import com.yxcorp.gifshow.postentrance.util.d;
import ezb.k;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import pm6.m;
import rq.a;
import java.util.List;
import com.kwai.sdk.switchconfig.a;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.ArrayList;
import com.yxcorp.gifshow.postentrance.util.HomePostEntranceExpUtil;
import com.google.gson.JsonElement;
import an6.o;

public final class HomeLocalNewUserBubblePresenter extends a implements r, q	// class@001019
{
    public boolean u;
    public l v;
    public final d w;
    public final int x;

    public void HomeLocalNewUserBubblePresenter(d p0,k p1,int p2,int p3){
       a.p(p0, "fragment");
       a.p(p1, "pageStateDelegate");
       super(p1, p2);
       this.w = p0;
       this.x = p3;
       HomeLocalNewUserBubblePresenter$a uoa = PatchProxy.apply(null, this, HomeLocalNewUserBubblePresenter.class, "7");
       if (uoa != PatchProxyResult.class) {
       }else {
          HomeLocalNewUserBubblePresenter$a uoa1 = new HomeLocalNewUserBubblePresenter$a(this, this.W8(), p0, this.X8(), p3, 1);
       }
       this.v = uoa;
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, HomeLocalNewUserBubblePresenter.class, "2")) {
          return;
       }
       this.X7(RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new b(new HomeLocalNewUserBubblePresenter$onBind$1(this))));
       return;
    }
    public boolean P8(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HomeLocalNewUserBubblePresenter homeLocalNew = HomeLocalNewUserBubblePresenter.class;
       Object obj = PatchProxy.apply(null, this, homeLocalNew, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (super.P8()) {
          Object obj1 = PatchProxy.apply(null, this, homeLocalNew, "9");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(!CameraEntranceUtils.h.b(Integer.valueOf(3)) && !d.U()){
             obj1 = PatchProxy.apply(null, null, d.class, "14");
             boolean b2 = (obj1 != patchProxyRe)? obj1.booleanValue(): k.a.getBoolean(b.d("user")+"has_post_entrance_new_user_bubble_shown", false);
             if (b2) {
                obj1 = PatchProxy.apply(null, null, m.class, "8");
                if (obj1 != patchProxyRe) {
                   b1 = obj1.booleanValue();
                }else if(a.J() > 0){
                   b1 = true;
                }else {
                   b1 = false;
                }
                if (b1) {
                   b1 = false;
                }
             }
          }
       label_0091 :
          b1 = true;
          if (b1 && (!this.W8().k(null) && this.W8().h(this.V8().i()))) {
          label_00b2 :
             return b;
          }
       }
    label_00b1 :
       b = false;
       goto label_00b2 ;
    }
    public l R8(){
       Object obj = PatchProxy.apply(null, this, HomeLocalNewUserBubblePresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       HomeLocalNewUserBubblePresenter$a uoa = new HomeLocalNewUserBubblePresenter$a(this, this.W8(), this.w, this.X8(), this.x, 1);
       return obj;
    }
    public l V8(){
       return this.v;
    }
    public void X0(){
       if (PatchProxy.applyVoid(null, this, HomeLocalNewUserBubblePresenter.class, "4")) {
          return;
       }
       if (this.u != null) {
          this.a9();
       }
       return;
    }
    public final List b9(){
       Object[] objArray = null;
       JsonObject obj = PatchProxy.apply(objArray, this, HomeLocalNewUserBubblePresenter.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().getValue("postEntranceNewUserBubbleResource", JsonObject.class, objArray);
       ArrayList uArrayList = new ArrayList();
       if (obj != null) {
          JsonElement jsonElement = obj.e0(String.valueOf(HomePostEntranceExpUtil.f()));
          if (jsonElement != null) {
             String str = jsonElement.w();
             if (str != null) {
                uArrayList.add(str);
             }
          }
       }
       return uArrayList;
    }
    public void p1(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HomeLocalNewUserBubblePresenter.class, "5")) {
          return;
       }
       a.p(p0, "tabId");
       a.p(p1, "parentTabId");
       if (this.V8().h() == 3 && !this.W8().h(this.V8().i())) {
          this.V8().j(true);
       }
       return;
    }
}

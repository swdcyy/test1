package com.kwai.tokenshare.presenter.h;
import fu7.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.plugin.kwaitoken.model.BaseDialogInfo;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import ekd.k0;
import fg6.a;
import eu7.b;
import com.google.gson.Gson;
import java.lang.NullPointerException;
import java.lang.Exception;
import lc5.b;
import com.kwai.tokenshare.KwaiTokenCustomPopUpDialog;
import jga.f$a;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import bu7.n;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$AreaPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import fu7.m;
import android.view.View$OnClickListener;
import com.kwai.tokenshare.presenter.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.kwaitoken.model.CustomDialogInfo;

public class h extends c	// class@001944
{
    public KwaiTokenCustomPopUpDialog p;
    public CustomDialogInfo q;
    public KwaiImageView r;
    public TextView s;
    public TextView t;
    public Button u;
    public b v;

    public void h(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       BaseDialogInfo mExtParams = this.q.mExtParams;
       if (mExtParams != null) {
          try{
             JsonElement jsonElement = k0.e(mExtParams, "followDialogData");
             if (jsonElement != null) {
                this.v = a.a.c(jsonElement, b.class);
                this.X8();
             }else {
                throw new NullPointerException("followDialogData is null");
             }
          }catch(java.lang.Exception e0){
             String[] stringArray = new String[]{"KwaiTokenDialogFollowPresenter"};
             b.f(e0.getMessage(), stringArray);
             this.p.c();
          }
       }
    }
    public void P8(f$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "8")) {
          return;
       }
       JsonObject jsonObject = new JsonObject();
       JsonObject jsonObject1 = new JsonObject();
       jsonObject1.c0("subbiz", this.q.mOriginSubBiz);
       jsonObject.G("dialogFollow", jsonObject1);
       p0.a("bizCustomParams", jsonObject.toString());
       return;
    }
    public String S8(){
       return this.v.mUserId;
    }
    public boolean V8(){
       return this.v.mFollowed;
    }
    public t W8(){
       Object obj = PatchProxy.apply(null, this, h.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.v.mFollowed = true;
       return t.just(Boolean.TRUE);
    }
    public final void X8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "4")) {
          return;
       }
       h tv = this.v;
       if (tv == null) {
          this.p.c();
          String[] stringArray = new String[]{"KwaiTokenDialogFollowPresenter"};
          b.f("mTokenDialogModel is null", stringArray);
          return;
       }else {
          b mUserId = tv.mUserId;
          BaseDialogInfo mOriginSubBi = this.q.mOriginSubBiz;
          b mFollowed = tv.mFollowed;
          if (!PatchProxy.isSupport(n.class) || !PatchProxy.applyVoidThreeRefs(mUserId, mOriginSubBi, Boolean.valueOf(mFollowed), null, n.class, "1")) {
             ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.type = 18;
             uElementPack.action2 = "FOLLOW_PASSWORD_CARD";
             JsonObject jsonObject = new JsonObject();
             jsonObject.H("is_followed", Boolean.valueOf(mFollowed));
             jsonObject.c0("subbiz", mOriginSubBi);
             uElementPack.params = jsonObject.toString();
             ClientEvent$AreaPackage uAreaPackage = new ClientEvent$AreaPackage();
             uAreaPackage.name = "FOLLOW_LEAD_POPUP";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
             userPackage.identity = TextUtils.I(mUserId);
             uContentPack.userPackage = userPackage;
             showEvent.elementPackage = uElementPack;
             showEvent.contentPackage = uContentPack;
             showEvent.areaPackage = uAreaPackage;
             u1.z0(objArray, showEvent);
          }
          this.r.L(this.v.mIconUrl);
          tv = null;
          if (QCurrentUser.ME.isLogined()) {
             if (this.v.mFollowed == null) {
                if (TextUtils.n(QCurrentUser.ME.getId(), this.v.mUserId)) {
                   this.v.mFollowed = true;
                }
             }
             tv = 1;
          }
          if (tv != null) {
             this.s.setText(this.v.mFollowedTitle);
             this.t.setText(this.v.mFollowedSubtitle);
             this.u.setText(this.v.mFollowedButtonText);
          }else {
             this.s.setText(this.v.mTitle);
             this.t.setText(this.v.mSubtitle);
             this.u.setText(this.v.mButtonText);
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a0fa4);
       this.s = m1.f(p0, 0x7f0a0fa7);
       this.t = m1.f(p0, 0x7f0a0fa6);
       this.u = m1.f(p0, 0x7f0a0fa3);
       m1.a(p0, new m(this), R.id.follow_token_dialog_close);
       m1.a(p0, new f(this), R.id.follow_token_dialog_action);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.p = this.q8(KwaiTokenCustomPopUpDialog.class);
       this.q = this.q8(CustomDialogInfo.class);
       return;
    }
}

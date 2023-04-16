package com.yxcorp.gifshow.relation.shake.ShakeFriendsConfPanel;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.yxcorp.gifshow.relation.shake.ShakeFriendsConfPanel$a;
import java.lang.Runnable;
import com.facebook.react.bridge.ReactContext;
import com.yxcorp.gifshow.relation.shake.ShakeFriendsConfPanel$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.TextView;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.yxcorp.gifshow.relation.shake.ShakeFriendsConfPanel$c;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.HashMap;
import java.lang.Integer;
import java.util.Map;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;
import xbc.e;
import k2b.e0;
import lj0.c;
import lj0.d;
import bi5.a;
import android.app.Activity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import kzc.d;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import com.yxcorp.gifshow.relation.shake.ShakeFriendsConfPanel$e;
import com.kwai.library.widget.popup.common.PopupInterface$d;
import com.kwai.library.widget.popup.common.c$b;
import u07.b;
import com.yxcorp.gifshow.relation.shake.ShakeFriendsConfPanel$d;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c;

public final class ShakeFriendsConfPanel extends KrnBridge	// class@0019d4
{
    public final ReactApplicationContext context;

    public void ShakeFriendsConfPanel(ReactApplicationContext p0){
       a.p(p0, "context");
       super(p0);
       this.context = p0;
    }
    public final void changeUserSetting(ReadableMap p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShakeFriendsConfPanel.class, "2")) {
          return;
       }
       a.p(p0, "map");
       a.p(p1, "callback");
       this.reportAndCheck(this.getName(), "changeUserSetting", this.getReactApplicationContext());
       this.getReactApplicationContext().runOnUiQueueThread(new ShakeFriendsConfPanel$a(this, p1));
       return;
    }
    public String getName(){
       return "KSRCTNotifySettingPageSwitchBridge";
    }
    public final void getUserSetting(ReadableMap p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShakeFriendsConfPanel.class, "1")) {
          return;
       }
       a.p(p0, "map");
       a.p(p1, "callback");
       this.reportAndCheck(this.getName(), "getUserSetting", this.getReactApplicationContext());
       this.getReactApplicationContext().runOnUiQueueThread(new ShakeFriendsConfPanel$b(p1));
       return;
    }
    public final View initialShakeFriendPanel(GifshowActivity p0,View p1,boolean p2){
       Object obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(ShakeFriendsConfPanel.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, ShakeFriendsConfPanel.class, "5");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       View view = p1.findViewById(R.id.switch_btn);
       a.o(view, "view.findViewById\(R.id.switch_btn\)");
       p1.findViewById(R.id.switch_name_tv).setText(R.string.arg_RES_7f103afb);
       view.setSwitch(p2);
       ShakeFriendsConfPanel$c uoc = new ShakeFriendsConfPanel$c(p0);
       obj = PatchProxy.applyOneRefs(p0, uoc, ShakeFriendsConfPanel$c.class, "2");
       if (obj != patchProxyRe) {
          uoc = obj;
       }else {
          a.p(p0, "context");
       }
       view.setOnSwitchChangeListener(uoc);
       return p1;
    }
    public final void notifyKrnWhenDismiss(GifshowActivity p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ShakeFriendsConfPanel.class, "3")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       HashMap hashMap = new HashMap();
       hashMap.put("enable_shake", Boolean.valueOf(mE.isShakeFriendEnabled()));
       HashMap hashMap1 = new HashMap();
       hashMap1.put("result", hashMap);
       Object[] objArray = new Object[]{Integer.valueOf(0),Arguments.makeNativeMap(hashMap1)};
       p1.invoke(objArray);
       if (!PatchProxy.applyVoidOneRefs(p0, null, e.class, "3")) {
          a.p(p0, "page");
          e.a(p0, 2);
       }
       return;
    }
    public final void reportAndCheck(String p0,String p1,ReactApplicationContext p2){
       String str1;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, ShakeFriendsConfPanel.class, "6")) {
          return;
       }
       c uoc = d.a(p2);
       String str = "";
       if (uoc != null) {
          str = uoc.b();
          str1 = uoc.f();
       }else {
          str1 = str;
       }
       a.a(p0, p1, str, str1);
       return;
    }
    public final void showSwithcPanel(Callback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ShakeFriendsConfPanel.class, "4")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       boolean b = mE.isShakeFriendEnabled();
       Activity currentActiv = this.context.getCurrentActivity();
       Object obj = null;
       if (!currentActiv instanceof GifshowActivity) {
          currentActiv = obj;
       }
       if (currentActiv != null) {
          e uoe = e.class;
          if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(currentActiv, Boolean.valueOf(b), obj, uoe, "2")) {
             a.p(currentActiv, "page");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             new ClientEvent$ShowEvent().elementPackage = uElementPack;
             uElementPack.action2 = "SETTINGS_INFORMATION_POPUP";
             i3 oi3 = i3.f();
             int i = (b)? 1: 2;
             oi3.c("default_status", Integer.valueOf(i));
             oi3.d("button_name", "SOCIAL_SHAKE");
             uElementPack.params = oi3.e();
             u1.C0("3390347", currentActiv, 4, uElementPack, obj);
          }
          d uod = new d(currentActiv);
          uod.b1(KwaiDialogOption.d);
          uod.V0(true);
          uod.W0(R.string.arg_RES_7f104dd8);
          uod.y0(R.string.box);
          uod.w0(true);
          uod.J(new ShakeFriendsConfPanel$e(this, currentActiv, p0));
          uod.B0(R.drawable.arg_RES_7f082348);
          a.o(uod, "KwaiDialogBuilder\(activi¡­ial_pymk_shake_authority\)");
          d uod1 = b.c(uod);
          uod1.L(new ShakeFriendsConfPanel$d(this, currentActiv, b, R.layout.arg_RES_7f0d14d4));
          uod1.X();
       }
       return;
    }
}

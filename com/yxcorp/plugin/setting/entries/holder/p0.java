package com.yxcorp.plugin.setting.entries.holder.p0;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.SwitchItem;
import java.util.Map;
import java.lang.Object;
import xgc.e;
import xgc.b;
import com.yxcorp.gifshow.model.SelectOption;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wgc.b;
import wgc.a;
import wgc.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.p0$a;
import android.view.View;
import android.app.Activity;
import com.yxcorp.gifshow.helper.h;
import qra.r;
import com.yxcorp.gifshow.helper.PushNotifyAuthoritySource;
import k2b.e0;
import nc5.i;
import kgd.u1;
import n3d.a;
import com.yxcorp.plugin.setting.activity.PushSilenceSettingActivity;
import com.google.gson.internal.LinkedTreeMap;
import kgd.v1;
import com.yxcorp.plugin.setting.activity.PushDetailSettingsActivity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import java.lang.Integer;
import k2b.u1;

public class p0 implements c	// class@000883
{
    public e a;
    public SwitchItem b;
    public c c;
    public d d;
    public GifshowActivity e;
    public Map f;

    public void p0(GifshowActivity p0,SwitchItem p1,Map p2){
       super();
       this.e = p0;
       this.b = p1;
       this.f = p2;
       e uoe = new e();
       this.a = uoe;
       uoe.c = p1.mName;
       uoe.j = p1.mId;
       SwitchItem mSelectedOpt = p1.mSelectedOption;
       uoe.d = mSelectedOpt.mName;
       p1 = p1.mDescription;
       uoe.e = p1;
       uoe.k = mSelectedOpt;
       if (TextUtils.x(p1)) {
          uoe.f = 0x7f081084;
       }
       return;
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.a;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, p0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new d();
       }
       return this.d;
    }
    public boolean isAvailable(){
       return true;
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, p0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          obj = new PresenterV2();
          this.c = obj;
          obj.add(new p0$a(this));
       }
       return this.c;
    }
    public void r(View p0){
       p0 op0 = p0.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, op0, "3")) {
          return;
       }
       p0 te = this.e;
       if (te != null && te.isFinishing()) {
          return;
       }
       if (!h.a()) {
          h.e(this.e, new r(PushNotifyAuthoritySource.Settings));
          return;
       }else {
          Object[] objArray = null;
          if (!this.a.j - 15) {
             i.b(1006, this.e);
             if (!PatchProxy.applyVoid(objArray, this, op0, "4")) {
                PushSilenceSettingActivity.x3(this.e, this.b, new u1(this));
             }
          }else if(PatchProxy.applyVoid(objArray, this, op0, "5")){
             PushDetailSettingsActivity.u3(this.e, this.f, this.b, new v1(this));
          }
          te = this.a;
          if (!PatchProxy.applyVoidOneRefs(te, this, op0, "6") && !te.j - 27) {
             ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "OLD_NOTIFICATION_SETTING_BUTTON";
             i3 oi3 = i3.f();
             oi3.d("button_name", te.c);
             oi3.c("id", Long.valueOf(te.j));
             oi3.c("status", Integer.valueOf(te.k.mValue));
             uElementPack.params = oi3.e();
             uClickEvent.elementPackage = uElementPack;
             u1.a0(uClickEvent);
          }
       label_00ba :
          return;
       }
    }
    public int y0(){
       return 0x7f0d14ca;
    }
}

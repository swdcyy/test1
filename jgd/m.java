package jgd.m;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import oe6.e;
import android.content.SharedPreferences;
import java.lang.System;
import com.yxcorp.gifshow.util.DateUtils;
import qra.r;
import com.yxcorp.gifshow.helper.PushNotifyAuthoritySource;
import com.yxcorp.gifshow.helper.h;
import kzc.d;
import android.app.Activity;
import lnc.a1;
import java.lang.CharSequence;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import qra.n;
import u07.u;
import qra.p;
import com.yxcorp.gifshow.helper.g;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import qra.q;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import android.content.SharedPreferences$Editor;
import oe6.g;
import android.content.Context;
import lnc.m5;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import k2b.u1;

public class m implements SlipSwitchButton$b	// class@0016e9
{
    public int a;
    public j b;
    public GifshowActivity c;
    public final GifshowActivity d;

    public void m(GifshowActivity p0){
       this.d = p0;
       super();
       this.a = 0;
    }
    public void a(SlipSwitchButton p0,boolean p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, om, "1")) {
          return;
       }
       int i = this.a + 1;
       this.a = i;
       m om1 = 2;
       int i1 = 0;
       if (i == om1) {
          this.a = i1;
          return;
       }else {
          SharedPreferences a = e.a;
          int intx = a.getInt("ShowPushNotificationCount", i1);
          if (!p1) {
             long l = System.currentTimeMillis();
             if (!DateUtils.H(a.getLong("ShowPushNotificationTime", 0)) && intx <= om1) {
                om1 = this.d;
                r or = new r(PushNotifyAuthoritySource.Settings);
                if (!PatchProxy.applyVoidTwoRefs(om1, or, null, h.class, "4")) {
                   d uod = new d(om1);
                   uod.Z0(107);
                   uod.X0(a1.p(R.string.arg_RES_7f104077));
                   uod.z0(a1.p(R.string.arg_RES_7f104078));
                   uod.T0(a1.p(R.string.arg_RES_7f1003f0));
                   uod.R0(a1.p(R.string.arg_RES_7f1004c4));
                   uod.w0(i1);
                   uod.A(i1);
                   uod.u0(new n(om1, or));
                   uod.t0(new p(or));
                   uod.L(g.b);
                   uod.Y(new q(or));
                }
                SharedPreferences$Editor uEditor = a.edit();
                uEditor.putInt("ShowPushNotificationCount", (intx + 1));
                g.a(uEditor);
                SharedPreferences$Editor uEditor1 = a.edit();
                uEditor1.putLong("ShowPushNotificationTime", l);
                g.a(uEditor1);
             }else {
                h.c(this.d);
             }
             this.b("OFF");
          }else if(!m5.b(this.d)){
             h.c(this.d);
             this.b("ON");
          }
          p0.setSwitch((p1 ^ 0x01));
          return;
       }
    }
    public final void b(String p0){
       ClientEvent$UrlPackage urlPackage;
       ClientEvent$ElementPackage uElementPack;
       String str;
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, om, "3")) {
          return;
       }
       try{
          urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page2 = "NOTIFICATION_SETTING";
          uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "RECEIVE_MESSAGE_SET_BUTTON";
          str = PatchProxy.applyOneRefs(p0, this, om, "2");
          if (str != PatchProxyResult.class) {
          }else {
             JSONObject jSONObject = new JSONObject();
             jSONObject.put("click_type", p0);
             str = e0.toString();
          }
       }catch(org.json.JSONException e0){
       }
       uElementPack.params = str;
       ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
       uClickEvent.type = 1;
       uClickEvent.elementPackage = uElementPack;
       uClickEvent.urlPackage = urlPackage;
       u1.z(null, uClickEvent);
       return;
    }
}

package com.yxcorp.plugin.setting.entries.holder.b;
import com.yxcorp.plugin.setting.entries.holder.r0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.SwitchItem;
import com.yxcorp.plugin.setting.entries.holder.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Long;
import java.lang.Number;
import java.lang.Integer;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import xgc.b;
import wgc.a;
import wgc.d;
import com.kwai.robust.PatchProxyResult;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.b;
import com.kwai.library.widget.button.SlipSwitchButton$b;

public class b extends r0	// class@000847
{
    public final SlipSwitchButton$b i;

    public void b(GifshowActivity p0,SwitchItem p1){
       super(p0, p1);
       this.i = new a(this);
    }
    public static void c(SwitchItem p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uob, "3")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "CALENDAR_REMIND_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("calendar_name", p0.mName);
       oi3.c("calendar_id", Long.valueOf(p0.mId));
       oi3.c("button_state", Integer.valueOf(p1));
       uElementPack.params = oi3.e();
       ClickMetaData uClickMetaDa = new ClickMetaData();
       uClickMetaDa.setType(1).setElementPackage(uElementPack);
       u1.B(uClickMetaDa);
       return;
    }
    public b b(){
       return this.b;
    }
    public a getModel(){
       return this.b();
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e == null) {
          this.e = new d();
       }
       return this.e;
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          obj = new PresenterV2();
          this.d = obj;
          obj.add(new b(this.i, this.f, null, Boolean.TRUE));
       }
       return this.d;
    }
    public int y0(){
       return 0x7f0d14c9;
    }
}

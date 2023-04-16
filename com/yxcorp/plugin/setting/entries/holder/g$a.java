package com.yxcorp.plugin.setting.entries.holder.g$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.setting.entries.holder.g;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.plugin.setting.entries.holder.g$a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import com.yxcorp.plugin.setting.helper.j;
import android.view.View;
import android.view.View$OnClickListener;
import erd.g;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.yxcorp.plugin.setting.entries.holder.g$a$d;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kzc.d;
import android.app.Activity;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import u07.t$a;
import kgd.p;
import u07.u;
import u07.b;
import com.yxcorp.plugin.setting.entries.holder.g$a$c;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.kwai.library.widget.popup.common.c$b;
import com.yxcorp.plugin.setting.entries.holder.g$a$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import ekd.m1;

public class g$a extends PresenterV2	// class@000857
{
    public boolean p;
    public View$OnClickListener q;
    public final g r;

    public void g$a(g p0){
       this.r = p0;
       super();
       this.p = (QCurrentUser.ME.isNotRecommendToContacts() ^ 0x01) ^ QCurrentUser.ME.isRecommendToOthers();
       this.q = new g$a$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g$a.class, "7")) {
          return;
       }
       this.r.e.setVisibility(0);
       if (this.r.b()) {
          j.d(this.r.e, QCurrentUser.ME.isRecommendToOthers());
       }else {
          j.d(this.r.e, (QCurrentUser.ME.isNotRecommendToContacts() ^ 0x01));
       }
       this.m8().setOnClickListener(this.q);
       return;
    }
    public final void P8(View p0,g p1,boolean p2,int p3,String p4){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "6")) {
             return;
          }
       }
       SlipSwitchButton slipSwitchBu = p0.findViewById(R.id.switch_btn);
       p0.findViewById(R.id.switch_name_tv).setText(p3);
       slipSwitchBu.setSwitch(p2);
       g$a$d uoa$d = new g$a$d(this, p4, p1);
       p1 = this.r.a;
       Object obj = PatchProxy.applyOneRefs(p1, uoa$d, g$a$d.class, "2");
       uoa$d = (obj != PatchProxyResult.class)? obj: new j(p1);
       slipSwitchBu.setOnSwitchChangeListener(uoa$d);
       return;
    }
    public void R8(GifshowActivity p0,boolean p1){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "4")) {
          return;
       }
       d uod = new d(p0);
       uod.b1(KwaiDialogOption.d);
       uod.V0(true);
       uod.W0(R.string.arg_RES_7f1049a7);
       uod.y0(R.string.arg_RES_7f1049a8);
       uod.s0(new p(this));
       uod.B0(R.drawable.arg_RES_7f0805f6);
       d uod1 = b.c(uod);
       uod1.L(new g$a$c(this, R.layout.arg_RES_7f0d11ac, p1));
       uod1.Y(new g$a$b(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "1")) {
          return;
       }
       this.r.e = m1.f(p0, 0x7f0a0d6a);
       return;
    }
}

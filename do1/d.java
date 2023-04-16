package do1.d;
import k51.c;
import android.view.Window;
import p91.m;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import lnc.a1;
import d61.j0;
import java.lang.Integer;
import android.graphics.LinearGradient;
import android.text.TextPaint;
import android.widget.TextView;
import java.lang.CharSequence;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Number;
import k2b.e0;
import k2b.u1;
import com.kwai.feature.api.live.service.show.share.event.LiveShareStatusEvent;
import do1.c;
import erd.g;
import crd.b;
import eoc.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lp3.e;
import xp5.g;
import lp3.c;
import pj2.c0;
import sx1.b;
import com.kwai.robust.PatchProxyResult;
import ekd.m1;
import do1.b;
import android.view.View$OnClickListener;
import do1.a;

public abstract class d extends c	// class@001fdb
{
    public a$b A;
    public View p;
    public View q;
    public View r;
    public TextView s;
    public TextView t;
    public View u;
    public View v;
    public List w;
    public boolean x;
    public Window y;
    public final m z;
    public static String sLivePresenterClassName = "LiveAnchorBaseInviteBarPresenter";

    public void d(Window p0,m p1){
       super();
       this.w = new ArrayList();
       this.x = false;
       this.y = p0;
       this.z = p1;
    }
    public void E8(){
       int i3;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "4")) {
          d tu = this.u;
          Integer integer = 8;
          int i = 0;
          int i1 = (this.Z8())? 8: 0;
          tu.setVisibility(i1);
          tu = this.v;
          i1 = (this.Z8())? 8: 0;
          tu.setVisibility(i1);
          this.p.setVisibility(i);
          tu = this.t;
          if (!PatchProxy.applyVoidOneRefs(tu, this, uod, "8")) {
             i1 = a1.a(R.color.arg_RES_7f0620aa);
             i3 = a1.a(R.color.arg_RES_7f0620a9);
             if (!PatchProxy.isSupport(j0.class) || !PatchProxy.applyVoidThreeRefs(tu, Integer.valueOf(i1), Integer.valueOf(i3), null, j0.class, "5")) {
                LinearGradient linearGradie = new LinearGradient(0, 0, ((float)tu.getText().length() * tu.getPaint().getTextSize()), 0, i1, i3, Shader$TileMode.CLAMP);
                tu.getPaint().setShader(v14);
                tu.invalidate();
             }
          }
          List list = this.W8();
          if (q.f(list)) {
             if (!PatchProxy.applyVoid(objArray, this, uod, "5")) {
                this.x = i;
                this.q.setVisibility(integer);
                this.r.setVisibility(i);
                this.u.setVisibility(integer);
                this.s.setText(a1.p(R.string.arg_RES_7f100515));
             }
          }else if(PatchProxy.applyVoidOneRefs(list, this, uod, "6")){
             this.x = true;
             this.q.setVisibility(i);
             this.r.setVisibility(integer);
             d tu1 = this.u;
             i1 = (this.Z8())? 8: 0;
             tu1.setVisibility(i1);
             tu1 = this.v;
             i1 = (this.Z8())? 8: 0;
             tu1.setVisibility(i1);
             this.s.setText(a1.p(R.string.arg_RES_7f100514));
             int i2 = 0;
             while (i2 < this.w.size()) {
                if (list.size() > i2) {
                   this.w.get(i2).setVisibility(i);
                   this.w.get(i2).L(list.get(i2));
                }else {
                   this.w.get(i2).setVisibility(integer);
                }
                i2 = i2 + 1;
             }
          }
          BaseFragment uBaseFragmen = this.z.b();
          ClientContent$LiveStreamPackage liveStreamPa = this.z.a();
          ClientContent$LiveVoicePartyPackageV2 liveVoicePar = this.z.y();
          d tx = this.x;
          if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidFourRefs(uBaseFragmen, liveStreamPa, liveVoicePar, Boolean.valueOf(tx), this, d.class, "14")) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveVoicePartyPackage = liveVoicePar;
             uContentPack.liveStreamPackage = liveStreamPa;
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "VOICE_PARTY_FRIEND_INVITE_CARD";
             i3 oi3 = i3.f();
             oi3.c("have_friend", Integer.valueOf(tx));
             uElementPack.params = oi3.e();
             u1.C0("", uBaseFragmen, 9, uElementPack, uContentPack);
          }
       }
       this.X7(f.a(LiveShareStatusEvent.class, new c(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.x = false;
       this.w.clear();
       return;
    }
    public abstract Object P8(boolean p0);
    public abstract void R8();
    public abstract void S8();
    public final void V8(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "12")) {
          return;
       }
       if (!this.z.t5().a(g.class).e()) {
          return;
       }
       c0 uoc0 = new c0();
       uoc0.q(this.P8(p0));
       this.z.t5().a(b.class).w1(uoc0);
       return;
    }
    public abstract List W8();
    public abstract void X8(LiveShareStatusEvent p0);
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, d.class, "13")) {
          return;
       }
       d ty = this.y;
       if (ty != null) {
          ty.setSoftInputMode(32);
       }
       return;
    }
    public final boolean Z8(){
       Object obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.z.t5().a(g.class).e() ^ 0x01);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a18cd);
       this.q = m1.f(p0, 0x7f0a18ca);
       this.w.add(m1.f(p0, R.id.live_anchor_shar_bar_avator_first_image_view));
       this.w.add(m1.f(p0, R.id.live_anchor_shar_bar_avator_second_image_view));
       this.w.add(m1.f(p0, R.id.live_anchor_shar_bar_avator_third_image_view));
       this.r = m1.f(p0, 0x7f0a18ce);
       this.s = m1.f(p0, 0x7f0a18cb);
       this.u = m1.f(p0, 0x7f0a18cf);
       this.t = m1.f(p0, 0x7f0a18c9);
       this.v = m1.f(p0, 0x7f0a18cc);
       m1.a(p0, new b(this), R.id.live_anchor_shar_bar_invite_friend_layout);
       m1.a(p0, new a(this), R.id.live_anchor_shar_bar_invite_share_layout);
       return;
    }
}

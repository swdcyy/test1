package com.yxcorp.gifshow.activity.share.presenter.v0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jq.a;
import android.view.View;
import android.app.Activity;
import k2b.e0;
import com.yxcorp.gifshow.activity.share.presenter.t0;
import android.view.View$OnClickListener;
import zw8.x1;
import zw8.y1;
import ow8.c;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.yxcorp.gifshow.activity.share.presenter.v0$a;
import com.kwai.library.widget.button.SlipSwitchButton$a;
import vw8.a;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import xw8.p0;
import zw8.z1;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.post.api.feature.tuna.UpdateShareBusinessLinkModel;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import e17.i;
import java.lang.StringBuilder;
import ekd.m1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import bba.b;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;

public class v0 extends PresenterV2	// class@00143a
{
    public GifshowActivity p;
    public p0 q;
    public b r;
    public c s;
    public View t;
    public VideoContext u;
    public View v;
    public SlipSwitchButton w;

    public void v0(){
       super();
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, v0.class, "4")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.c("ShareJudgeAssistPresenter", "onBind\(\)", objArray1);
       this.t.setVisibility(i);
       Activity uActivity = this.getActivity();
       this.v.setOnClickListener(new t0(this));
       this.t.setOnClickListener(new x1(this));
       this.w.setOnClickListener(new y1(this));
       this.w.setSwitch(c.o());
       this.w.setOnSwitchChangeListener2(new v0$a(this, uActivity));
       this.S8();
       if (uActivity != null) {
          boolean switch = this.w.getSwitch();
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(uActivity, Boolean.valueOf(switch), objArray, uoa, "2")) {
             Object[] objArray2 = new Object[i];
             a.c("PublishLogger", "logShowJudgeAssistSwitch\(\)", objArray2);
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "JUDGE_ASSISTANT";
             JsonObject jsonObject = new JsonObject();
             String str = (switch)? "open": "close";
             jsonObject.c0("button_status", str);
             i = jsonObject.toString();
             uElementPack.params = i;
             u1.D0("3721824", uActivity, 6, uElementPack, null, null);
          }
       }
       this.X7(this.q.k.subscribe(new z1(this)));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, v0.class, "8");
    }
    public final boolean P8(){
       v0 obj = PatchProxy.apply(null, this, v0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       boolean b = (obj != null && obj.P() != null)? true: false;
       return b;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, v0.class, "6")) {
          return;
       }
       if (this.P8()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f100a3b);
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, v0.class, "5")) {
          return;
       }
       int i = 1;
       int i1 = this.P8() ^ i;
       boolean b = c.o();
       Object[] objArray = new Object[0];
       a.c("ShareJudgeAssistPresenter", "updateSwitchState\(\) set switch enable="+i1+" isOpen="+b, objArray);
       v0 tw = this.w;
       if (!i1 || !b) {
          i = false;
       }
       tw.setSwitch(i);
       this.w.setOnlyResponseClick((i1 ^ 0x01));
       v0 tw1 = this.w;
       float f = (i1)? 0x3f800000: 0x3f000000;
       tw1.setAlpha(f);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v0.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.share_judge_assistant_container);
       this.t = p0;
       this.v = m1.f(p0, 0x7f0a3c5b);
       this.w = m1.f(this.t, 0x7f0a3c3f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v0.class, "1")) {
          return;
       }
       this.p = this.r8("SHARE_ACTIVITY");
       this.q = this.r8("SHARE_PAGE_PRESENTER_MODEL");
       this.r = this.t8("PUBLISH");
       this.s = this.t8("WORKSPACE");
       this.u = this.t8("SHARE_VIDEO_CONTEXT");
       return;
    }
}

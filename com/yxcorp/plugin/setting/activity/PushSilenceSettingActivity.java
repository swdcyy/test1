package com.yxcorp.plugin.setting.activity.PushSilenceSettingActivity;
import ml8.d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.SwitchItem;
import n3d.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.content.Context;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.EmojiTextView;
import com.kwai.library.widget.button.SlipSwitchButton;
import zfd.l;
import android.view.View$OnClickListener;
import zfd.k;
import zfd.j;
import android.app.Activity;
import android.content.res.Resources;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import android.view.Window;
import com.yxcorp.gifshow.model.SelectOption;
import java.lang.CharSequence;
import com.yxcorp.plugin.setting.activity.f;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import ga.n0;
import java.lang.Boolean;
import java.util.Calendar;
import java.lang.Long;
import java.lang.Number;
import java.text.SimpleDateFormat;
import com.yxcorp.gifshow.util.DateUtils;
import java.text.ParsePosition;
import java.util.Date;

public class PushSilenceSettingActivity extends GifshowActivity implements d	// class@000814
{
    public TextView A;
    public TextView B;
    public View C;
    public View D;
    public n0 E;
    public n0 F;
    public String G;
    public String H;
    public SwitchItem I;
    public boolean J;
    public EmojiTextView y;
    public SlipSwitchButton z;
    public static final int K;

    public void PushSilenceSettingActivity(){
       super();
    }
    public static void x3(GifshowActivity p0,SwitchItem p1,a p2){
       PushSilenceSettingActivity pushSilenceS = PushSilenceSettingActivity.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, PushSilenceSettingActivity.class, "2")) {
          return;
       }
       Intent intent = new Intent(p0, pushSilenceS);
       SerializableHook.putExtra(intent, "selected_item", p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, objArray, pushSilenceS, "18")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.name = "push_silence";
          uElementPack.type = 1;
          uElementPack.action = 0x768a;
          u1.u(1, uElementPack, objArray);
       }
       p0.t1(intent, 4, p2);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PushSilenceSettingActivity.class, "1")) {
          return;
       }
       this.D = m1.f(p0, 0x7f0a36a4);
       this.A = m1.f(p0, 0x7f0a3b2f);
       this.B = m1.f(p0, 0x7f0a0d47);
       this.y = m1.f(p0, 0x7f0a3f7b);
       this.C = m1.f(p0, 0x7f0a1344);
       this.z = m1.f(p0, 0x7f0a3349);
       m1.a(p0, new l(this), R.id.ignore_end_view);
       m1.a(p0, new k(this), R.id.ignore_start_view);
       m1.a(p0, new j(this), R.id.left_btn);
       return;
    }
    public void finish(){
       if (PatchProxy.applyVoid(null, this, PushSilenceSettingActivity.class, "11")) {
          return;
       }
       Intent intent = new Intent();
       PushSilenceSettingActivity tI = this.I;
       if (tI != null) {
          SerializableHook.putExtra(intent, "result_silence_data", tI);
       }
       this.setResult(-1, intent);
       super.finish();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, PushSilenceSettingActivity.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "kwai://pushsilence";
    }
    public void onCreate(Bundle p0){
       boolean b;
       PushSilenceSettingActivity pushSilenceS = PushSilenceSettingActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, pushSilenceS, "3")) {
          return;
       }
       super.onCreate(p0);
       this.setContentView(R.layout.arg_RES_7f0d1292);
       this.doBindView(this.getWindow().getDecorView());
       this.D = this.findViewById(0x7f0a36a4);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, pushSilenceS, "4")) {
          if (!PatchProxy.applyVoid(objArray, this, pushSilenceS, "5") && this.getIntent() != null) {
             this.I = SerializableHook.getSerializableExtra(this.getIntent(), "selected_item");
          }
          PushSilenceSettingActivity tI = this.I;
          int i = 0;
          if (tI != null) {
             this.G = tI.mSilenceStartTime;
             this.H = tI.mSilenceEndTime;
             b = (tI.mSelectedOption.mValue == 7)? true: false;
             this.J = b;
             this.z.setSwitch(b);
          }
          if (!PatchProxy.applyVoid(objArray, this, pushSilenceS, "6")) {
             this.y.setText(this.getString(R.string.arg_RES_7f10407d));
             this.A.setText(this.G);
             this.B.setText(this.H);
             tI = this.C;
             if (!this.z.getSwitch()) {
                i = 8;
             }
             tI.setVisibility(i);
             this.z.setOnSwitchChangeListener(new f(this));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, pushSilenceS, "14")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action = 0x7689;
          uElementPack.type = 13;
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          showEvent.status = 1;
          showEvent.type = 1;
          showEvent.elementPackage = uElementPack;
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 64;
          showEvent.urlPackage = urlPackage;
          b.a(0x4b316083).h(showEvent);
       }
       return;
    }
    public final n0 u3(boolean p0){
       n0 obj;
       PushSilenceSettingActivity pushSilenceS = PushSilenceSettingActivity.class;
       if (PatchProxy.isSupport(pushSilenceS)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, pushSilenceS, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new n0();
       Calendar instance = Calendar.getInstance();
       PushSilenceSettingActivity tG = (p0)? this.G: this.H;
       instance.setTimeInMillis(this.z3(tG));
       obj.c(instance);
       return obj;
    }
    public void v3(boolean p0){
       PushSilenceSettingActivity pushSilenceS = PushSilenceSettingActivity.class;
       if (PatchProxy.isSupport(pushSilenceS) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, pushSilenceS, "15")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       PushSilenceSettingActivity tG = (p0)? this.G: this.H;
       uElementPack.name = tG;
       int i = (p0)? 1: 2;
       uElementPack.index = i;
       uElementPack.type = 1;
       uElementPack.action = 0x76a7;
       u1.u(1, uElementPack, null);
       return;
    }
    public final void w3(n0 p0,long p1){
       PushSilenceSettingActivity pushSilenceS = PushSilenceSettingActivity.class;
       if (PatchProxy.isSupport(pushSilenceS) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, pushSilenceS, "12")) {
          return;
       }
       Calendar instance = Calendar.getInstance();
       instance.setTimeInMillis(p1);
       p0.c(instance);
       p0.g(new boolean[6]{0x00,0x00,0x00,0x01,0x01,0x00});
       p0.f(this.getString(R.string.arg_RES_7f100563));
       p0.f = 0x7f081ac7;
       p0.h(this);
       return;
    }
    public final void y3(boolean p0){
       PushSilenceSettingActivity pushSilenceS = PushSilenceSettingActivity.class;
       if (PatchProxy.isSupport(pushSilenceS) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, pushSilenceS, "16")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = "push_silence";
       uElementPack.type = 1;
       int i = (p0)? 0x76a3: 0x76a4;
       uElementPack.action = i;
       u1.u(1, uElementPack, null);
       return;
    }
    public final long z3(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PushSilenceSettingActivity.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return DateUtils.n("HH:mm").parse(p0, new ParsePosition(0)).getTime();
    }
}

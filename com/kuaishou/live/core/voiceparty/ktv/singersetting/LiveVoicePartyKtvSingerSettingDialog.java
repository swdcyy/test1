package com.kuaishou.live.core.voiceparty.ktv.singersetting.LiveVoicePartyKtvSingerSettingDialog;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kuaishou.live.core.voiceparty.ktv.singersetting.LiveVoicePartyKtvSingerSettingDialog$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.customview.PitchView;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.customview.PitchIndexView;
import js2.e;
import com.kuaishou.live.core.voiceparty.customview.PitchView$a;
import android.widget.TextView;
import android.view.View;
import com.kwai.library.widget.button.SlipSwitchButton;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Dialog;
import ekd.m1;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import com.kwai.library.widget.seekbar.KwaiSeekBar;
import android.widget.Button;
import com.kuaishou.live.common.core.component.voiceparty.singersetting.LiveSlideSwitcher;
import com.kuaishou.live.common.core.component.music.LiveKtvReverbEffectView;
import android.widget.ScrollView;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.Window;
import o56.a;
import android.content.res.Resources;
import android.app.Application;
import android.util.DisplayMetrics;
import cw9.c;
import lnc.a1;
import com.kuaishou.live.core.voiceparty.d0;
import s81.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import crd.b;
import lnc.b9;
import js2.i;
import java.lang.Runnable;
import java.io.Serializable;
import js2.g;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import js2.f;
import android.content.Context;
import androidx.fragment.app.Fragment;
import brd.t;
import com.yxcorp.gifshow.util.hardware.HeadsetPlugMonitor;
import js2.h;
import erd.g;
import io.reactivex.internal.functions.Functions;
import js2.d;
import com.kuaishou.live.common.core.component.voiceparty.singersetting.LiveSlideSwitcher$b;
import android.graphics.drawable.Drawable;
import js2.b;
import android.view.View$OnTouchListener;
import js2.a;
import android.view.View$OnClickListener;
import android.widget.SeekBar;
import java.lang.CharSequence;
import com.kuaishou.live.core.voiceparty.ktv.singersetting.a;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.kuaishou.live.core.voiceparty.ktv.singersetting.b;
import i91.i;
import java.util.List;
import js2.c;
import com.kuaishou.live.common.core.component.music.LiveKtvReverbEffectView$d;
import android.widget.FrameLayout;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import com.yxcorp.widget.selector.drawable.DrawableCreator$Shape;

public class LiveVoicePartyKtvSingerSettingDialog extends LiveSafeDialogFragment implements d	// class@001533
{
    public PitchView A;
    public ScrollView B;
    public SlipSwitchButton C;
    public SlipSwitchButton D;
    public SizeAdjustableTextView E;
    public Dialog F;
    public LiveVoicePartyKtvSingerSettingDialog$a G;
    public boolean H;
    public boolean I;
    public boolean J;
    public b K;
    public Boolean L;
    public final LiveVoicePartyKtvSingerSettingDialog$b M;
    public LiveSlideSwitcher s;
    public Button t;
    public TextView u;
    public KwaiSeekBar v;
    public TextView w;
    public KwaiSeekBar x;
    public View y;
    public LiveKtvReverbEffectView z;
    public static final int N;

    public void LiveVoicePartyKtvSingerSettingDialog(){
       super();
       this.M = new LiveVoicePartyKtvSingerSettingDialog$b();
    }
    public final void Ah(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyKtvSingerSettingDialog.class, "17")) {
          return;
       }
       LiveVoicePartyKtvSingerSettingDialog tA = this.A;
       int i = 500;
       int i1 = (this.M.b + 5) * 50;
       Objects.requireNonNull(tA);
       if (!PatchProxy.isSupport(PitchView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), tA, PitchView.class, "3")) {
          tA.e = i;
          i = (int)((((float)i1 * 0x3f800000) / (float)i) * 10.00f);
          tA.f = i;
          tA.d.setPitchLevel(i);
       }
       this.A.setPitchLevelListener(new e(this));
       return;
    }
    public final void Bh(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyKtvSingerSettingDialog.class, "15")) {
          return;
       }
       if (this.M.e != null) {
          this.E.setVisibility(0);
          this.D.setVisibility(0);
          this.D.setSwitch(this.M.h);
       }else {
          this.E.setVisibility(8);
          this.D.setVisibility(8);
       }
       return;
    }
    public boolean d(){
       LiveVoicePartyKtvSingerSettingDialog obj = PatchProxy.apply(null, this, LiveVoicePartyKtvSingerSettingDialog.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.F;
       if (obj == null) {
          return false;
       }
       return obj.isShowing();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyKtvSingerSettingDialog.class, "1")) {
          return;
       }
       this.E = m1.f(p0, 0x7f0a0cc5);
       this.A = m1.f(p0, 0x7f0a207b);
       this.x = m1.f(p0, 0x7f0a1c0a);
       this.v = m1.f(p0, 0x7f0a1c0c);
       this.w = m1.f(p0, 0x7f0a1c0b);
       this.C = m1.f(p0, 0x7f0a1658);
       this.t = m1.f(p0, 0x7f0a2685);
       this.s = m1.f(p0, 0x7f0a25aa);
       this.z = m1.f(p0, 0x7f0a2078);
       this.u = m1.f(p0, 0x7f0a1c0d);
       this.B = m1.f(p0, 0x7f0a2079);
       this.y = m1.f(p0, 0x7f0a39b1);
       this.D = m1.f(p0, 0x7f0a02fe);
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyKtvSingerSettingDialog.class, "19")) {
          return;
       }
       super.onActivityCreated(p0);
       this.F.getWindow().setLayout(c.c(a.B.getResources()).widthPixels, a1.e(375.00f));
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyKtvSingerSettingDialog.class, "3")) {
          return;
       }
       super.onCreate(p0);
       p0.e = d0.r();
       p0.f = d0.l();
       p0.g = a.c();
       p0.h = a.b();
       p0.d = a.l();
       p0.c = a.m();
       p0.b = a.k();
       p0.g = a.c();
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyKtvSingerSettingDialog.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       this.F = uDialog;
       uDialog.setCanceledOnTouchOutside(true);
       this.F.getWindow().requestFeature(true);
       this.F.getWindow().setGravity(80);
       this.F.getWindow().setDimAmount(0);
       this.F.getWindow().setBackgroundDrawableResource(0x106000d);
       return this.F;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveVoicePartyKtvSingerSettingDialog.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.f(p0, R.layout.arg_RES_7f0d0e58, p1);
       this.doBindView(view);
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyKtvSingerSettingDialog.class, "11")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.K);
       this.K = null;
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyKtvSingerSettingDialog.class, "16")) {
          return;
       }
       super.onResume();
       this.B.post(new i(this));
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       int b;
       int i;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyKtvSingerSettingDialog.class, "10")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.L = this.ah("SUPPORT_AUDIO_PREVIEW", Boolean.FALSE);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyKtvSingerSettingDialog.class, "14")) {
          this.C.setSwitch(this.M.g);
          this.C.setOnSwitchChangeListener(new g(this));
       }
       String str = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyKtvSingerSettingDialog.class, "13")) {
          if (this.L.booleanValue()) {
             this.Bh();
             this.D.setOnSwitchChangeListener(new f(this));
             this.K = HeadsetPlugMonitor.c(this.getContext(), str).subscribe(new h(this), Functions.d());
          }else {
             b = 8;
             this.E.setVisibility(b);
             this.D.setVisibility(b);
          }
       }
       b = true;
       if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyKtvSingerSettingDialog.class, "23")) {
          if (this.M.b() && this.I == null) {
             this.xh();
          }else {
             this.wh((this.I ^ b));
          }
          this.s.a((this.H ^ b));
          this.s.setOnSlideSwitchListener(new d(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyKtvSingerSettingDialog.class, "24")) {
          if (this.J != null) {
             if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyKtvSingerSettingDialog.class, "8")) {
                LiveVoicePartyKtvSingerSettingDialog tt = this.t;
                if (tt != null) {
                   tt.setClickable(str);
                   this.t.setTextColor(a1.a(R.color.arg_RES_7f0620a0));
                   i = 0x7f0812e3;
                   if (!PatchProxy.isSupport(LiveVoicePartyKtvSingerSettingDialog.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, LiveVoicePartyKtvSingerSettingDialog.class, "22")) {
                      Drawable uDrawable = a1.f(i);
                      uDrawable.setBounds(str, str, a1.e(20.00f), a1.e(20.00f));
                      this.t.setCompoundDrawables(uDrawable, objArray, objArray, objArray);
                   }
                }
             }
          }else {
             this.t.setOnTouchListener(new b(this));
             this.t.setOnClickListener(new a(this));
          }
       }
       str = 0x42c80000;
       if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyKtvSingerSettingDialog.class, "25")) {
          this.v.setEnabled(b);
          this.v.setThumb(this.yh());
          this.v.setProgress((int)(this.M.c * str));
          this.u.setText(String.valueOf(this.v.getProgress()));
          this.v.setOnSeekBarChangeListener(new a(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyKtvSingerSettingDialog.class, "26")) {
          this.x.setEnabled(b);
          this.x.setThumb(this.yh());
          this.x.setProgress((int)(this.M.d * str));
          this.w.setText(String.valueOf(this.x.getProgress()));
          this.x.setOnSeekBarChangeListener(new b(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyKtvSingerSettingDialog.class, "18")) {
          this.z.setHorizontalMargin(a1.e(16.00f));
          this.z.setVerticalMargin(a1.e(20.00f));
          this.z.setSupportEffects(i.k);
          this.z.setOnReverbItemSelectedListener(new c(this));
       }
       this.Ah();
       return;
    }
    public void wh(boolean p0){
       if (PatchProxy.isSupport(LiveVoicePartyKtvSingerSettingDialog.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveVoicePartyKtvSingerSettingDialog.class, "6")) {
          return;
       }
       LiveVoicePartyKtvSingerSettingDialog ts = this.s;
       if (ts == null) {
          return;
       }
       boolean b = false;
       this.H = b;
       ts.a(1);
       this.s.setTag(this);
       ts = this.s;
       String str = (p0)? a1.p(R.string.arg_RES_7f102e29): null;
       ts.c(b, str);
       if (!p0) {
          b uob = new b();
          uob.v(a1.a(R.color.arg_RES_7f0604c6));
          uob.g(KwaiRadiusStyles.FULL);
          uob.s(DrawableCreator$Shape.Rectangle);
          this.y.setBackground(uob.a());
       }
       return;
    }
    public void xh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveVoicePartyKtvSingerSettingDialog.class, "7")) {
          return;
       }
       if (this.s != null && d0.m()) {
          this.s.c(true, objArray);
          b uob = new b();
          uob.v(this.getContext().getResources().getColor(R.color.arg_RES_7f060751));
          uob.g(KwaiRadiusStyles.FULL);
          uob.s(DrawableCreator$Shape.Rectangle);
          this.y.setBackground(uob.a());
       }
       return;
    }
    public final Drawable yh(){
       Drawable obj = PatchProxy.apply(null, this, LiveVoicePartyKtvSingerSettingDialog.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getResources().getDrawable(R.drawable.arg_RES_7f0806a2);
       obj.setBounds(0, 0, a1.e(24.00f), a1.e(24.00f));
       return obj;
    }
    public LiveVoicePartyKtvSingerSettingDialog$b zh(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartyKtvSingerSettingDialog.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.M.e = d0.r();
       this.M.f = d0.l();
       return this.M.a();
    }
}

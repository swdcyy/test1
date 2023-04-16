package com.kuaishou.live.core.voiceparty.userlevel.avatarframe.AvatarFramePreferenceDialog;
import com.kuaishou.live.viewcontroller.dialog.DialogViewController;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.AvatarFramePreferenceDialog$viewModel$2;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.AvatarFramePreferenceDialog$$special$$inlined$viewModels$1;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.ViewModelLazy;
import rx2.c;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.AvatarFramePreferenceDialog$$special$$inlined$viewModels$2;
import msd.a;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import d61.y;
import rx2.p;
import android.content.Context;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import rx2.p$a;
import java.lang.Integer;
import java.lang.Boolean;
import android.view.View;
import android.view.ContextThemeWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import pd6.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.AvatarFramePreferenceDialog$a;
import erd.g;
import crd.b;
import brd.t;
import rx2.k;
import androidx.lifecycle.LiveData;
import rx2.g;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import rx2.h;
import android.view.View$OnClickListener;
import rx2.i;
import rx2.j;
import rx2.o;
import rx2.m;
import msd.p;
import yx2.d;
import android.app.Dialog;
import android.view.Window;
import ia2.a;
import com.yxcorp.utility.n;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.core.voiceparty.userlevel.avatarframe.AvatarFramePreferenceDialog$b;
import ia2.b;
import qrd.p;

public final class AvatarFramePreferenceDialog extends DialogViewController	// class@001a74
{
    public final p l;
    public final UserMicSeatLevelLogger m;

    public void AvatarFramePreferenceDialog(UserMicSeatLevelLogger p0){
       a.p(p0, "logger");
       super();
       this.m = p0;
       this.l = new ViewModelLazy(m0.d(c.class), new AvatarFramePreferenceDialog$$special$$inlined$viewModels$2(new AvatarFramePreferenceDialog$$special$$inlined$viewModels$1(this)), new AvatarFramePreferenceDialog$viewModel$2(this));
    }
    public void F2(){
       p$a a;
       View view;
       String str = "2";
       if (PatchProxy.applyVoid(null, this, AvatarFramePreferenceDialog.class, str)) {
          return;
       }
       super.F2();
       if (y.d(this.B2())) {
          a = p.a;
          Context uContext = this.D2();
          Objects.requireNonNull(a);
          if (PatchProxy.isSupport(p$a.class)) {
             view = PatchProxy.applyFourRefs(uContext, Integer.valueOf(R.layout.arg_RES_7f0d16a4), null, Boolean.FALSE, a, p$a.class, "1");
             if (view != PatchProxyResult.class) {
             label_008c :
                this.R2(view);
             }
          }
          a.p(uContext, "context");
          Context uContext1 = PatchProxy.applyOneRefs(uContext, a, p$a.class, str);
          if (uContext1 != PatchProxyResult.class) {
          }else {
             Resources resources = uContext.getResources();
             a.o(resources, "context.resources");
             Configuration uConfigurati = new Configuration(resources.getConfiguration());
             uConfigurati.uiMode = (uConfigurati.uiMode & 0xcf) | 0x20;
             uContext1 = b.a(uContext, uConfigurati);
             a.o(uContext1, "context.createConfigurationContext\(config\)");
          }
          view = a.c(LayoutInflater.from(new ContextThemeWrapper(uContext1, R.style.arg_RES_7f110336)), R.layout.arg_RES_7f0d16a4, null, false);
          a.o(view, "LayoutInflater.from\(cont¡­   attachToParent\n      \)");
          goto label_008c ;
       }else {
          this.Q2(R.layout.arg_RES_7f0d16a3);
       }
       PublishSubject publishSubje = PublishSubject.g();
       publishSubje.subscribe(new AvatarFramePreferenceDialog$a(this));
       a.o(publishSubje, "PublishSubject.create<In¡­ent\(intent\)\n      }\n    }");
       k ok = new k(this.A2(0x7f0a0964), publishSubje);
       LiveData liveData = this.Y2().u0();
       String str1 = "1";
       String str2 = "state";
       String str3 = "lifecycleOwner";
       if (!PatchProxy.applyVoidTwoRefs(this, liveData, ok, k.class, str1)) {
          a.p(this, str3);
          a.p(liveData, str2);
          liveData.observe(this, new g(ok));
          ok.a.setOnClickListener(new h(ok));
          ok.b.setOnClickListener(new i(ok));
          ok.c.setOnClickListener(new j(ok));
       }
       o oo = new o(this.A2(0x7f0a3f1e), publishSubje);
       LiveData liveData1 = this.Y2().u0();
       if (!PatchProxy.applyVoidTwoRefs(this, liveData1, oo, o.class, str1)) {
          a.p(this, str3);
          a.p(liveData1, str2);
          liveData1.observe(this, new m(oo));
       }
       AvatarFramePreferenceDialog tm = this.m;
       Objects.requireNonNull(tm);
       if (!PatchProxy.applyVoid(null, tm, UserMicSeatLevelLogger.class, "3")) {
          UserMicSeatLevelLogger.b(tm, "AVATAR_FRAME_SET_CARD", null, null, 6, null).g();
       }
       return;
    }
    public void M2(){
       if (PatchProxy.applyVoid(null, this, AvatarFramePreferenceDialog.class, "3")) {
          return;
       }
       super.M2();
       AvatarFramePreferenceDialog tm = this.m;
       Objects.requireNonNull(tm);
       if (!PatchProxy.applyVoid(null, tm, UserMicSeatLevelLogger.class, "14")) {
          UserMicSeatLevelLogger.b(tm, "MIC_LEVEL_UPGRADE_POPUP", null, null, 6, null).f();
       }
       return;
    }
    public void X2(Dialog p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AvatarFramePreferenceDialog.class, "4")) {
          return;
       }
       a.p(p0, "dialog");
       p0.setCanceledOnTouchOutside(true);
       Window window = p0.getWindow();
       int i = 0;
       if (window != null) {
          if (y.d(this.B2())) {
             window.setLayout(a.a(this.B2()), -1);
             window.setGravity(0x800005);
             window.setWindowAnimations(R.style.arg_RES_7f1103e0);
          }else {
             window.setLayout(-1, (int)((double)n.j(this.B2()) * 0x3fd999999999999a));
             window.setGravity(80);
             window.setWindowAnimations(R.style.arg_RES_7f1103d9);
          }
          window.setDimAmount(0);
          window.setBackgroundDrawable(new ColorDrawable(i));
       }
       if (y.d(this.B2())) {
          this.A2(R.id.space_holder).setOnClickListener(new AvatarFramePreferenceDialog$b(this));
          this.P2().setBackground(a.b(i));
       }
       return;
    }
    public final c Y2(){
       Object obj = PatchProxy.apply(null, this, AvatarFramePreferenceDialog.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
}

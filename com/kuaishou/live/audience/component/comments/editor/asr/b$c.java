package com.kuaishou.live.audience.component.comments.editor.asr.b$c;
import t52.d;
import com.kuaishou.live.audience.component.comments.editor.asr.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.EditText;
import java.util.Objects;
import lnc.a1;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import m91.b;
import zx0.l0;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import lnc.ja;
import android.text.Editable;
import com.yxcorp.utility.TextUtils;
import com.kwai.video.waynelive.LivePlayerController;
import l32.h;
import l32.u;
import java.util.concurrent.atomic.AtomicBoolean;
import androidx.lifecycle.MutableLiveData;
import l32.g;
import java.lang.Runnable;
import android.os.Handler;
import android.os.SystemClock;
import crd.b;
import lnc.b9;
import l32.b;
import brd.w;
import erd.c;
import brd.t;
import l32.c;
import erd.g;
import com.kuaishou.audio.recorder.IAudioRecordEngine;
import tr.d;
import jw4.a;
import jw4.e;
import com.kwai.feature.api.live.base.service.record.LiveSnowAudioRecordBiz;
import ot.a;
import gt.a;
import l32.e;
import o52.n;
import android.widget.TextView;
import e17.i$b;
import e17.i;

public class b$c implements d	// class@000aa3
{
    public final b a;

    public void b$c(b p0){
       this.a = p0;
       super();
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "2")) {
          return;
       }
       this.a.s.setText("");
       return;
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, b$c.class, "1")) {
          return;
       }
       this.a.s.setText("");
       return;
    }
    public void onStart(){
       boolean b;
       b x;
       h d;
       b uob = b.class;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, b$c.class, str)) {
          return;
       }
       b$c ta = this.a;
       b = true;
       ta.C = b;
       Objects.requireNonNull(ta);
       String str1 = "8";
       if (!PatchProxy.applyVoid(objArray, ta, uob, str1)) {
          ta.R8(a1.p(R.string.arg_RES_7f101e23));
          LiveLogTag lIVE_ASR_INP = LiveLogTag.LIVE_ASR_INPUT;
          b.Z(lIVE_ASR_INP, "startAsrInput");
          b p = ta.p;
          ClientContent$LiveStreamPackage liveStreamPa = (p != null)? p.Z2.a(): objArray;
          boolean b1 = (p != null && p.Y0.r2(AudienceBizRelation.VOICE_COMMENT))? true: false;
          l0 ol0 = l0.class;
          if (!PatchProxy.isSupport(ol0) || !PatchProxy.applyVoidTwoRefs(liveStreamPa, Boolean.valueOf(b1), objArray, ol0, str)) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "COMMENT_KEEP_TALKING_SUBCARD";
             i3 oi3 = i3.f();
             String str3 = (b1)? "VOICE_TRANS": "TRANS_TEXT_ONLY";
             oi3.d("btn_type", str3);
             uElementPack.params = oi3.e();
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.liveStreamPackage = liveStreamPa;
             u1.G("", b, uElementPack, uContentPack);
          }
          ja.a();
          ta.z = TextUtils.G(ta.s).toString();
          ta.s.setFocusable(false);
          if (!PatchProxy.applyVoid(objArray, ta, uob, "14")) {
             x = ta.p;
             if (x != null) {
                x.E.mute();
             }
          }
          if (ta.x == null || (p != null && !PatchProxy.applyVoid(objArray, ta, uob, "6"))) {
             ta.x.f();
             ta.x.t = "BOTTOM_BUTTON";
          }
       label_00cb :
          x = ta.x;
          if (x != null) {
             x.h(ta.I);
             x = ta.x;
             String str2 = ta.p.Z2.c();
             Objects.requireNonNull(x);
             h oh = h.class;
             if (!PatchProxy.applyVoidTwoRefs("", str2, x, oh, str1) && !x.g.get()) {
                x.g.set(b);
                x.h.setValue(Boolean.TRUE);
                x.i = false;
                x.q = false;
                x.p = "";
                x.f = 0;
                b.Z(lIVE_ASR_INP, "startRecordVoice");
                x.c = 0;
                x.j.post(new g(x, ""));
                if (!PatchProxy.applyVoid(objArray, x, oh, "5")) {
                   x.w = SystemClock.elapsedRealtime();
                   d = x.o;
                   if (d != null) {
                      d.onStart();
                   }
                }
                b9.a(x.m);
                x.m = objArray;
                x.m = t.zip(x.l, x.k, b.a).subscribe(new c(x));
                d = x.d;
                if (d != null) {
                   d.release();
                }
                x.d = e.a(str2, x.b()).a(LiveSnowAudioRecordBiz.LIVE_ASR);
                if (a.d().g(x.d)) {
                   x.j.post(new e(x));
                }else {
                   b.Z(lIVE_ASR_INP, "real start snow Record failed, no focus");
                   n.b(b);
                }
                x.f();
             }
          }
          ta.D = false;
       }
       ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, uob, "11")) {
          ta.v.setVisibility(8);
          ta.w.setVisibility(8);
       }
       return;
    }
    public void onStop(boolean p0){
       b$c uoc = b$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "4")) {
          return;
       }
       this.a.S8(false);
       this.a.X8();
       if (p0) {
          i$b uob = i.m();
          uob.l(true);
          uob.p(R.drawable.arg_RES_7f082462);
          uob.x(R.string.arg_RES_7f102e80);
          i.z(uob);
       }
       return;
    }
}

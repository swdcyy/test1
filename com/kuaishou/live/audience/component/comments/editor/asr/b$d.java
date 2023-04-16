package com.kuaishou.live.audience.component.comments.editor.asr.b$d;
import l32.u;
import com.kuaishou.live.audience.component.comments.editor.asr.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Integer;
import lnc.a1;
import com.kuaishou.live.audience.component.comments.editor.asr.LiveAsrInputRecordView;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ekd.p0;
import e17.i;

public class b$d implements u	// class@000aa4
{
    public int a;
    public final b b;

    public void b$d(b p0){
       this.b = p0;
       super();
    }
    public void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "2")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          b$d tb = this.b;
          tb.W8(p0, tb.C);
          b.c0(LiveLogTag.LIVE_ASR_INPUT, "OnVoice2TextListener#onVoice2Text", "text", p0);
       }
       return;
    }
    public void b(int p0){
       b$d uod = b$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       uod = this.b;
       boolean b = true;
       if (uod.D == null) {
          uod.D = b;
          uod.R8(a1.p(R.string.arg_RES_7f101e20));
       }
       if (!p0) {
          return;
       }else {
          this.b.t.g = p0;
          int i = this.a + b;
          this.a = i;
          if (i > 10) {
             b.c0(LiveLogTag.LIVE_ASR_INPUT, "OnVoice2TextListener#onVolume", "volume", Integer.valueOf(p0));
             this.a = 0;
          }
          return;
       }
    }
    public void c(String p0,String p1,String p2){
       int i;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b$d.class, "3")) {
          return;
       }
       b.e0(LiveLogTag.LIVE_ASR_INPUT, "OnVoice2TextListener#onEnd", "text", p0, "reqId", p1, "endReason", p2);
       if (p2 == "COMPLETE" || (p2 == "BREAK" && !TextUtils.x(p0))) {
          b$d tb = this.b;
          tb.A = p0;
          tb.B = true;
          tb.W8(p0, tb.C);
       }else if(!p0.C(this.b.getContext())){
          i = 0x7f10469d;
       }else {
          i = 0x7f101e1f;
       }
       i.a(R.style.arg_RES_7f110668, i);
       return;
    }
    public void d(String p0){
    }
    public void onStart(){
    }
}

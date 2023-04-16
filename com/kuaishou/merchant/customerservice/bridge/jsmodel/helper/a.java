package com.kuaishou.merchant.customerservice.bridge.jsmodel.helper.a;
import com.kuaishou.merchant.customerservice.bridge.jsmodel.helper.c$b;
import com.kuaishou.merchant.customerservice.bridge.jsmodel.helper.b;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import ut3.b;
import java.lang.Throwable;
import q87.c;
import fg6.a;
import com.kuaishou.merchant.customerservice.bridge.jsmodel.component.JsAudioRecordErrorResult;
import com.google.gson.Gson;
import com.kuaishou.merchant.customerservice.bridge.jsmodel.component.JsAudioRecorderParams;
import java.lang.Long;
import com.kuaishou.merchant.customerservice.bridge.jsmodel.component.JsAudioRecorderParams$Options;
import com.kuaishou.merchant.customerservice.bridge.jsmodel.component.JsAudioRecorderProgressResult;
import lnc.a1;
import java.io.File;
import qkd.b;
import com.kuaishou.merchant.customerservice.bridge.jsmodel.component.JsAudioRecorderStopResult;

public class a implements c$b	// class@00166c
{
    public final b a;

    public void a(b p0){
       this.a = p0;
       super();
    }
    public void a(int p0,Exception p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "3")) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0)};
       b.C().u("JsAudioRecorderManager", p1, objArray);
       this.a.b(b.e.mErrorEventType, a.a.q(new JsAudioRecordErrorResult(4, p1.getMessage())));
       return;
    }
    public void b(long p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p0 - b.e.mOptions.mMaxDuration >= 0) {
          this.a.c();
          return;
       }else {
          this.a.b(b.e.mProgressEventType, a.a.q(new JsAudioRecorderProgressResult(p1, p0)));
          return;
       }
    }
    public void c(String p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (p1 - b.e.mOptions.mMinDuration < 0) {
          this.a.b(b.e.mErrorEventType, a.a.q(new JsAudioRecordErrorResult(5, a1.p(R.string.arg_RES_7f1015b2))));
          return;
       }else {
          this.a.b(b.e.mStopEventType, a.a.q(new JsAudioRecorderStopResult(p1, b.w(new File(p0)))));
          return;
       }
    }
}

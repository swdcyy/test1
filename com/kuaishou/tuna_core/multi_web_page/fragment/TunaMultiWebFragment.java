package com.kuaishou.tuna_core.multi_web_page.fragment.TunaMultiWebFragment;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.kuaishou.tuna_core.multi_web_page.fragment.TunaMultiWebFragment$a;
import nsd.u;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import android.app.Activity;
import kotlin.jvm.internal.a;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.tuna_core.multi_web_page.model.TunaMultiWebConfigInfo;
import com.kuaishou.tuna_core.multi_web_page.model.a;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import android.util.Log;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import com.kuaishou.tuna_core.multi_web_page.fragment.TunaMultiWebFragment$onCreate$3;
import msd.a;
import c15.b;
import com.kuaishou.tuna_core.multi_web_page.fragment.TunaMultiWebFragment$onCreate$1;
import lnc.g2;
import a05.a;
import lnc.g2$a;

public final class TunaMultiWebFragment extends LazyInitSupportedFragment	// class@0010e9
{
    public a s;
    public g2 t;
    public static final TunaMultiWebFragment$a u;

    static {
       TunaMultiWebFragment.u = new TunaMultiWebFragment$a(null);
    }
    public void TunaMultiWebFragment(){
       super();
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View view;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, TunaMultiWebFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       int i = 1;
       boolean b = false;
       try{
          view = a.g(p0, R.layout.arg_RES_7f0d1643, p1, b);
          if (view != null) {
             i = 0;
          }
       }catch(java.lang.Exception e0){
          view = new View(this.getActivity());
       }
       if (e0) {
          FragmentActivity activity = this.getActivity();
          if (activity != null) {
             activity.finish();
          }
       }
       a.o(view, "view");
       return view;
    }
    public String o(){
       return "BUSINESS_CONSULTATION_COMMODITY";
    }
    public void onCreate(Bundle p0){
       String stackTraceSt;
       FragmentActivity activity;
       if (PatchProxy.applyVoidOneRefs(p0, this, TunaMultiWebFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       Activity uActivity = null;
       Serializable serializable = (p0 != null)? SerializableHook.getSerializable(p0, "config"): uActivity;
       String str = "JsInjectKwai";
       if (serializable instanceof TunaMultiWebConfigInfo) {
          a uoa = new a(serializable);
          this.s = uoa;
          IllegalArgumentException illegalArgum = (uoa.a != null)? 1: null;
          if (!illegalArgum) {
             stackTraceSt = Log.getStackTraceString(new IllegalArgumentException("TunaMultiWebFragment onFinish, config data is invalid"));
             a.o(stackTraceSt, "Log.getStackTraceString\(¡­config data is invalid\"\)\)");
             b.b(KsLogTunaCoreTag.TUNA_MULTI_WEB_VIEW.appendTag(str), new TunaMultiWebFragment$onCreate$3(stackTraceSt));
             activity = this.getActivity();
             if (activity != null) {
                a.o(activity, "it");
                if (activity.isFinishing() ^ 1) {
                   uActivity = activity;
                }
                if (uActivity != null) {
                   uActivity.finish();
                }
             }
          }
          return;
       }else {
          stackTraceSt = Log.getStackTraceString(new IllegalArgumentException("TunaMultiWebFragment onFinish, config data is null"));
          a.o(stackTraceSt, "Log.getStackTraceString\(¡­h, config data is null\"\)\)");
          b.b(KsLogTunaCoreTag.TUNA_MULTI_WEB_VIEW.appendTag(str), new TunaMultiWebFragment$onCreate$1(stackTraceSt));
          activity = this.getActivity();
          if (activity != null) {
             a.o(activity, "it");
             if (activity.isFinishing() ^ 1) {
                uActivity = activity;
             }
             if (uActivity != null) {
                uActivity.finish();
             }
          }
          return;
       }
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TunaMultiWebFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoid(null, this, TunaMultiWebFragment.class, "4")) {
          this.t = new g2(this, a.b);
       }
       TunaMultiWebFragment tt = this.t;
       if (tt != null) {
          Object[] objArray = new Object[2];
          int i = 0;
          TunaMultiWebFragment ts = this.s;
          if (ts == null) {
             a.S("mMultiPageContext");
          }
          objArray[i] = ts;
          objArray[1] = this;
          tt.b(objArray);
       }
       return;
    }
}

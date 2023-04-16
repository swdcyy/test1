package com.yxcorp.gifshow.featured.detail.featured.preinit.PreRequestFeaturedApiInitModule;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.ABTestInitModule;
import com.kwai.framework.network.RetrofitInitModule;
import com.kwai.framework.switchs.SwitchConfigInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import kotlin.jvm.internal.a;
import o56.d;
import com.kwai.component.taskdispatcher.utils.DispatchStrategyUtil;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper;
import nh5.b;
import java.lang.Runnable;
import t45.c;
import uv8.m1;
import android.os.Looper;
import ukd.a;
import android.os.MessageQueue;
import android.os.Message;
import android.os.Handler;
import lnc.d;
import android.content.Intent;
import lnc.w3;
import kda.e;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Set;
import com.yxcorp.gifshow.featured.detail.featured.preinit.f;
import ok.x;
import java.lang.Boolean;
import com.yxcorp.gifshow.featured.detail.featured.preinit.f$a;
import wkd.b;
import com.yxcorp.gifshow.w;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import com.yxcorp.gifshow.featured.detail.featured.t;
import com.yxcorp.gifshow.featured.detail.featured.preinit.e;
import erd.g;
import k2b.u1;

public final class PreRequestFeaturedApiInitModule extends a	// class@000f48
{

    public void PreRequestFeaturedApiInitModule(){
       super();
    }
    public int f0(){
       return 14;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, PreRequestFeaturedApiInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{ABTestInitModule.class,RetrofitInitModule.class,SwitchConfigInitModule.class};
       ArrayList uArrayList = Lists.e(obj);
       a.o(uArrayList, "Lists.newArrayList\(\n    ¡­tModule::class.java\n    \)");
       return uArrayList;
    }
    public void n(){
       Intent intent;
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PreRequestFeaturedApiInitModule.class, "1")) {
          return;
       }
       if (!d.i) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, DispatchStrategyUtil.class, "4") && (SlideDispatchHelper.e() || SlideDispatchHelper.h())) {
          c.a(b.b);
       }
       if (m1.b() && d.b) {
          MessageQueue messageQueue = a.d(Looper.getMainLooper(), "mQueue");
          _monitor_enter(messageQueue);
          Message message = a.d(messageQueue, "mMessages");
          if (message != null && (message.getTarget() == d.b() && d.c(message))) {
             intent = w3.b(message);
             _monitor_exit(messageQueue);
          }else if(message != null){
             message = a.d(message, "next");
             if (message != null && (message.getTarget() == d.b() && d.c(message))) {
                intent = w3.b(message);
                _monitor_exit(messageQueue);
             }
          }else {
             _monitor_exit(messageQueue);
             intent = objArray;
          }
          int i = 1;
          int i1 = 0;
          if (intent != null) {
             Object[] objArray1 = new Object[i1];
             e.C().w("PreRequestFeaturedApiInitModule", "intent: "+intent, objArray1);
             if (TextUtils.n("android.intent.action.MAIN", intent.getAction())) {
                Set categories = intent.getCategories();
                b = (categories != null)? categories.contains("android.intent.category.LAUNCHER"): false;
                if (b) {
                   i1 = 1;
                }
             }
          }
          if (!i1) {
             return;
          }else if(PatchProxy.applyVoid(objArray, objArray, f.class, "8") || !f.f.get().booleanValue()){
             f$a g = f.g;
             if (g.a == null) {
                b.a(-1343064608).w();
                t ot = f.a(i, objArray, objArray);
                g.a = ot;
                ot.l2(e.b);
                u1.R("FEATURE_PREFETCH_IN_APPLICATION", "prefetch feature in application start!", 14);
             }
          }
       }
    }
    public int priority(){
       return Integer.MAX_VALUE;
    }
}

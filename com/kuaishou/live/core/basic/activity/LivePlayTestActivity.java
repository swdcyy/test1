package com.kuaishou.live.core.basic.activity.LivePlayTestActivity;
import im8.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import yy6.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import m02.o1;
import java.util.Map;
import java.util.HashMap;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kwai.framework.activitycontext.ActivityContext$a;
import java.lang.StringBuilder;
import com.kuaishou.live.core.basic.activity.LivePlayTestActivity$cleanMemory$2;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import e17.i;
import java.lang.System;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import com.kuaishou.live.core.basic.activity.LivePlayTestActivity$TestContainerFragment;
import androidx.fragment.app.Fragment;

public final class LivePlayTestActivity extends GifshowActivity implements g	// class@001820
{
    public final c y;
    public HashMap z;

    public void LivePlayTestActivity(){
       super();
       this.y = new c();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePlayTestActivity.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LivePlayTestActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LivePlayTestActivity.class, new o1());
       }else {
          obj.put(LivePlayTestActivity.class, null);
       }
       return obj;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, LivePlayTestActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       LivePlayTestActivity livePlayTest = LivePlayTestActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, livePlayTest, "1")) {
          return;
       }
       super.onCreate(p0);
       if (!PatchProxy.applyVoid(null, this, livePlayTest, "2")) {
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          List list = uActivityCon.d();
          a.o(list, "ActivityContext.getInsta¡­\(\).activityStackWithState");
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             ActivityContext$a uoa = iterator.next();
             a.o(uoa, "it");
             Activity uActivity = uoa.a();
             if (uActivity != null) {
                uArrayList.add(uActivity);
             }
          }
          ArrayList uArrayList1 = new ArrayList();
          iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             Object obj1 = (obj != this)? 1: null;
             if (obj1) {
                uArrayList1.add(obj);
             }
          }
          iterator = uArrayList1.iterator();
          while (iterator.hasNext()) {
             iterator.next().releaseInstance();
          }
          i.d(R.style.arg_RES_7f110668, "release ALL OTHER activities:"+CollectionsKt___CollectionsKt.V2(uArrayList1, "\n", null, null, 0, null, LivePlayTestActivity$cleanMemory$2.INSTANCE, 30, null));
          System.gc();
          System.gc();
          System.gc();
       }
       e uoe = this.getSupportFragmentManager().beginTransaction();
       uoe.f(0x1020002, new LivePlayTestActivity$TestContainerFragment());
       uoe.n();
       return;
    }
}

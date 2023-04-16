package com.kuaishou.krn.bundle.preload.j;
import java.lang.Runnable;
import java.lang.String;
import java.util.List;
import com.kuaishou.krn.model.LoadingStateTrack;
import java.lang.Object;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import gj0.d;
import com.kuaishou.krn.bundle.preload.PreloadType;
import java.lang.Enum;
import hj0.c;
import com.kuaishou.krn.instance.JsFramework;
import gu6.b;
import brd.a0;
import iu6.a;
import fk0.a;
import hj0.a;
import com.kuaishou.krn.instance.BaseJsExecutorType$Type;
import com.kuaishou.krn.c;
import kj0.f;
import xj0.e;
import java.lang.Throwable;
import ek0.d;
import com.kuaishou.krn.bundle.preload.k;
import com.facebook.react.bridge.UiThreadUtil;

public final class j implements Runnable	// class@00084a
{
    public final String b;
    public final List c;
    public final LoadingStateTrack d;

    public void j(String p0,List p1,LoadingStateTrack p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       j tb = this.b;
       j tc = this.c;
       j td = this.d;
       ArrayList uArrayList = PatchProxy.applyTwoRefs(tb, tc, null, KrnReactRootPreloadManager.class, "3");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          uArrayList = new ArrayList();
          if (tc != null && tc.size() > 0) {
             Iterator iterator = tc.iterator();
             while (iterator.hasNext()) {
                d uod = iterator.next();
                if (uod.preloadType != PreloadType.GENERATE_CODE_CACHE.ordinal()) {
                   continue ;
                }else {
                   try{
                      a uoa = a.a(c.a.a(uod.d()).o(uod.a()).e());
                      KrnReactRootPreloadManager.a(tb, uod, uoa, BaseJsExecutorType$Type.V8_JIT, uArrayList);
                      if (c.b().f().e().isEnabled()) {
                         KrnReactRootPreloadManager.a(tb, uod, uoa, BaseJsExecutorType$Type.V8_LITE, uArrayList);
                      }
                   }catch(java.lang.Exception e4){
                      d.k("generateCodecacheInterceptor error", e4);
                      goto label_0027 ;
                   }
                }
             }
          }
       }
       UiThreadUtil.runOnUiThread(new k(tb, uArrayList, td));
       return;
    }
}

package com.frog.engine.view.FrogRender$b;
import com.frog.engine.utils.TelephonyManagerWrapper;
import com.frog.engine.view.FrogRender;
import android.app.Application;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import com.frog.engine.internal.FrogLog;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.frog.engine.view.FrogRender$b$b;
import java.lang.Runnable;
import java.lang.Throwable;
import android.util.Log;
import com.frog.engine.view.FrogRender$b$a;

public class FrogRender$b extends TelephonyManagerWrapper	// class@001597
{
    public HashMap a;

    public void FrogRender$b(FrogRender p0,Application p1){
       super(p1);
       this.a = new HashMap();
    }
    public void onCallStateChanged(int p0){
       Map sFrogRenders;
       Iterator iterator;
       Map$Entry uEntry;
       FrogRender$b uob = FrogRender$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "1")) {
          return;
       }
       FrogLog.d("FrogRender", "onCallStateChanged:"+p0);
       if (p0) {
          if (p0 == 1) {
             sFrogRenders = FrogRender.sFrogRenders;
             if (sFrogRenders != null) {
                iterator = sFrogRenders.entrySet().iterator();
                while (iterator.hasNext()) {
                   uEntry = iterator.next();
                   if (uEntry != null && (!TextUtils.isEmpty(uEntry.getKey()) && uEntry.getValue() != null)) {
                      FrogRender.postGLRunnable(uEntry.getKey(), new FrogRender$b$b(this, uEntry));
                   }
                }
             }
          }
       }else {
          sFrogRenders = FrogRender.sFrogRenders;
          if (sFrogRenders != null) {
             iterator = sFrogRenders.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                if (uEntry != null && (!TextUtils.isEmpty(uEntry.getKey()) && uEntry.getValue() != null)) {
                   FrogRender.postGLRunnable(uEntry.getKey(), new FrogRender$b$a(this, uEntry));
                }
             }
          }
       }
       return;
    }
}

package com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager$initViewContainers$attachContainer$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager;
import com.kuaishou.live.lite.layoutmanager.LayoutViewType;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.view.View;
import com.yxcorp.utility.SystemUtil;
import eb3.c;
import android.content.res.Resources;
import android.app.Activity;
import android.view.View$OnTouchListener;
import java.util.Map;
import java.lang.Number;

public final class LiveLiteLayoutManager$initViewContainers$attachContainer$1 extends Lambda implements p	// class@000915
{
    public final LiveLiteLayoutManager this$0;

    public void LiveLiteLayoutManager$initViewContainers$attachContainer$1(LiveLiteLayoutManager p0){
       this.this$0 = p0;
       super(2);
    }
    public final ViewGroup invoke(LayoutViewType p0,int p1){
       View obj;
       if (PatchProxy.isSupport(LiveLiteLayoutManager$initViewContainers$attachContainer$1.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, LiveLiteLayoutManager$initViewContainers$attachContainer$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "viewType");
       obj = this.this$0.l.findViewById(p1);
       View view = obj;
       if (SystemUtil.I()) {
          String resourceName = this.this$0.N.getResources().getResourceName(p1);
          a.o(resourceName, "activity.resources.getResourceName\(viewId\)");
          view.setOnTouchListener(new c(resourceName));
       }
       a.o(view, "it");
       this.this$0.k.put(p0, view);
       a.o(obj, "layoutRoot.findViewById<¡­rs[viewType] = it\n      }");
       return view;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1.intValue());
    }
}

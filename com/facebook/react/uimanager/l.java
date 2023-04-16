package com.facebook.react.uimanager.l;
import com.facebook.react.uimanager.UIManagerModule$b;
import java.lang.Object;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.HashMap;
import vd.d;
import java.util.Iterator;
import com.facebook.react.uimanager.ViewManager;
import java.lang.String;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.uimanager.IllegalViewOperationException;
import java.lang.StringBuilder;
import hg.a;

public final class l	// class@001374
{
    public final Map a;
    public final UIManagerModule$b b;
    public boolean c;
    public List d;

    public void l(UIManagerModule$b p0){
       super();
       this.c = false;
       this.d = new ArrayList();
       this.a = new ConcurrentHashMap();
       this.b = p0;
    }
    public void l(List p0,UIManagerModule$b p1){
       super();
       this.c = false;
       this.d = new ArrayList();
       HashMap hashMap = d.b();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ViewManager viewManager = iterator.next();
          hashMap.put(viewManager.getName(), viewManager);
       }
       this.a = hashMap;
       this.b = p1;
       return;
    }
    public void l(Map p0){
       super();
       this.c = false;
       this.d = new ArrayList();
       if (p0 != null) {
       }else {
          HashMap hashMap = d.b();
       }
       this.a = p0;
       this.b = null;
       return;
    }
    public ViewManager a(String p0){
       ViewManager obj = PatchProxy.applyOneRefs(p0, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       _monitor_enter(this);
       obj = this.a.get(p0);
       if (obj != null) {
          _monitor_exit(this);
          return obj;
       }else if(this.b != null){
          obj = this.b(p0);
          if (obj == null) {
             throw new IllegalViewOperationException("ViewManagerResolver returned null for "+p0);
          }
          _monitor_exit(this);
          return obj;
       }else {
          throw new IllegalViewOperationException("No ViewManager found for class "+p0);
       }
    }
    public final ViewManager b(String p0){
       l ol = l.class;
       ViewManager obj = PatchProxy.applyOneRefs(p0, this, ol, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.a(p0);
       if (obj != null) {
          this.a.put(p0, obj);
       }else if(PatchProxy.applyVoid(null, this, ol, "1") || this.b == null){
          String str = "initFallbackViewManager";
          a.a(0, str);
          Iterator iterator = this.b.c(this.c, this.d).iterator();
          while (iterator.hasNext()) {
             ViewManager viewManager = iterator.next();
             if (!this.a.containsKey(viewManager.getName())) {
                this.a.put(viewManager.getName(), viewManager);
             }
          }
          this.c = true;
          a.c(0, str);
       }
       if (obj == null) {
          obj = this.a.get(p0);
       }
       return obj;
    }
}

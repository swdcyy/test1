package com.kuaishou.render.engine.tk.view.TKWrapView$a;
import com.kuaishou.tachikoma.TKViewContainerWrapView$b;
import com.kuaishou.render.engine.tk.view.TKWrapView;
import java.lang.Object;
import java.lang.Throwable;
import tx4.w;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import java.lang.Runnable;
import java.lang.Exception;
import java.util.HashMap;
import pv.a;
import java.util.Map;
import nv.c;

public class TKWrapView$a implements TKViewContainerWrapView$b	// class@000ef7
{
    public final TKWrapView a;

    public void TKWrapView$a(TKWrapView p0){
       this.a = p0;
       super();
    }
    public void a(){
    }
    public void b(Throwable p0,w p1){
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, TKWrapView$a.class, "1")) {
          return;
       }
       Iterator iterator = this.a.k.iterator();
       while (iterator.hasNext()) {
          Runnable runnable = iterator.next();
          try{
             runnable.run();
          }catch(java.lang.Exception e1){
             String[] stringArray = new String[]{"bundleId","viewKey","msg"};
             String[] stringArray1 = new String[]{this.a.m,this.a.l,e1.getMessage()};
             c.d("invoke error", a.a(stringArray, stringArray1));
             if (this.a.o != null) {
             label_0057 :
                throw e1;
             }
             goto label_0014 ;
          }
       }
       this.a.k.clear();
       return;
    }
}

package com.kwai.plugin.dva.work.ListenableWork;
import com.kwai.plugin.dva.work.d;
import com.kwai.plugin.dva.work.ListenableWork$a;
import nsd.u;
import java.lang.Exception;
import java.util.LinkedList;
import java.lang.Object;
import asd.c;
import com.kwai.plugin.dva.work.ListenableWork$run$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import qj7.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.kwai.plugin.dva.work.ListenableWork$b;
import qrd.l1;
import java.lang.Throwable;
import java.lang.Integer;

public abstract class ListenableWork extends d	// class@000ec6
{
    public List a;
    public final Object b;
    public boolean c;
    public static final ListenableWork$a d;
    public static final Exception e;

    static {
       ListenableWork.d = new ListenableWork$a(null);
       ListenableWork.e = new Exception();
    }
    public void ListenableWork(){
       super();
       this.a = new LinkedList();
       this.b = new Object();
    }
    public static Object g(ListenableWork p0,c p1){
       ListenableWork$run$1 orun$1;
       ListenableWork$run$1 l$0;
       if (p1 instanceof ListenableWork$run$1) {
          orun$1 = p1;
          ListenableWork$run$1 label = orun$1.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             orun$1.label = label - i;
          label_0018 :
             ListenableWork$run$1 result = orun$1.result;
             Object obj = b.h();
             ListenableWork$run$1 label1 = orun$1.label;
             if (label1 != null) {
                if (label1 == true) {
                   l$0 = orun$1.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                orun$1.L$0 = p0;
                orun$1.label = 1;
                result = p0.a(orun$1);
                if (result == obj) {
                   return obj;
                }
             }
             l$0.c = true;
             d.c("post success");
             if (!PatchProxy.applyVoidOneRefs(result, l$0, ListenableWork.class, "3")) {
                l$0.d(result);
                Iterator iterator = l$0.a.iterator();
                while (iterator.hasNext()) {
                   iterator.next().onSucceed(result);
                }
             }
             return l1.a;
          }
       }
       orun$1 = new ListenableWork$run$1(p0, p1);
       goto label_0018 ;
    }
    public abstract void b(Exception p0);
    public abstract void c(int p0);
    public abstract void d(Object p0);
    public final void e(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ListenableWork.class, "4")) {
          return;
       }
       this.b(p0);
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().onError(p0);
       }
       return;
    }
    public final void f(int p0){
       ListenableWork listenableWo = ListenableWork.class;
       if (PatchProxy.isSupport(listenableWo) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, listenableWo, "2")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       this.c(p0);
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().onProgress(p0);
       }
       return;
    }
}

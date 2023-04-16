package com.kwai.sdk.eve.internal.common.scheduler.internal.PriorityQueueSelect$a;
import rsd.f;
import java.util.concurrent.BlockingQueue;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import vsd.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dn7.b;

public final class PriorityQueueSelect$a implements f	// class@00148e
{
    public final BlockingQueue a;

    public void PriorityQueueSelect$a(BlockingQueue p0){
       a.p(p0, "queue");
       super();
       this.a = p0;
    }
    public Object a(Object p0,n p1){
       return this.c(p0, p1);
    }
    public void b(Object p0,n p1,Object p2){
       this.d(p0, p1, p2);
    }
    public String c(Object p0,n p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, PriorityQueueSelect$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "property");
       p0 = this.a;
       if (!p0 instanceof b) {
          p0 = null;
       }
       if (p0 != null) {
          p0 = p0.d();
          if (p0 != null) {
          label_0028 :
             return p0;
          }
       }
       p0 = "";
       goto label_0028 ;
    }
    public void d(Object p0,n p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, PriorityQueueSelect$a.class, "1")) {
          return;
       }
       a.p(p1, "property");
       a.p(p2, "value");
       p0 = this.a;
       if (!p0 instanceof b) {
          p0 = null;
       }
       if (p0 != null) {
          p0.b(p2);
       }
       return;
    }
}

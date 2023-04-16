package com.kuaishou.live.effect.resource.download.v2.a;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$Type;
import java.lang.Object;
import java.util.HashMap;
import com.kuaishou.live.effect.resource.download.v2.IMagicGiftResourceLoader$Status;
import java.util.Map;
import com.kuaishou.live.effect.resource.download.v2.a$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.Iterator;
import java.lang.Boolean;
import java.util.Map$Entry;
import java.lang.Throwable;
import java.lang.Integer;
import java.lang.StringBuilder;

public class a	// class@001b59
{
    public final Map a;
    public final Map b;

    public void a(IMagicGiftResourceLoader$Type[] p0){
       super();
       this.a = new HashMap();
       this.b = new HashMap();
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          this.a.put(p0[i], IMagicGiftResourceLoader$Status.IDLE);
       }
       return;
    }
    public synchronized final a$a a(){
       IMagicGiftResourceLoader$Type obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = IMagicGiftResourceLoader$Type.UNDEFINE;
       Iterator iterator = this.b.keySet().iterator();
       while (iterator.hasNext()) {
          IMagicGiftResourceLoader$Type type = iterator.next();
          if (type.getReportPriority() > obj.getReportPriority()) {
             obj = type;
          }
       }
       return this.b.get(obj);
    }
    public synchronized boolean b(){
       Iterator obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.entrySet().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return true;
          }
          if (!IMagicGiftResourceLoader$Status.isDownloadComplete(obj.next().getValue())) {
             break ;
          }
       }
       return false;
    }
    public synchronized void c(IMagicGiftResourceLoader$Type p0,IMagicGiftResourceLoader$Status p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       this.d(p0, p1, 0, null);
       return;
    }
    public synchronized void d(IMagicGiftResourceLoader$Type p0,IMagicGiftResourceLoader$Status p1,int p2,Throwable p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, a.class, "2")) {
          return;
       }
       this.a.put(p0, p1);
       this.b.put(p0, new a$a(p2, p3));
       return;
    }
    public synchronized String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "DownloadStatus{mStatusMap="+this.a+"mErrorInfo="+this.b+'}';
    }
}

package com.yxcorp.download.g;
import mu8.q;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.download.g$a;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import mu8.n;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class g	// class@0011be
{
    public List a;
    public q b;
    public static final q c;
    public static final q d;
    public static g e;

    static {
       g.c = q.b(0);
       g.d = q.b(1);
       g.e = new g();
    }
    public void g(){
       super();
       this.a = new CopyOnWriteArrayList();
       this.b = g.c;
    }
    public static g c(){
       return g.e;
    }
    public synchronized final void a(q p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "6")) {
          return;
       }
       g tb = this.b;
       this.b = p0;
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(tb, p0);
       }
       Log.b("DownloadManager:NetworkFocusManager", "changeFocus ## formerFocus:"+tb.toString()+"  ##  changedFocus:"+p0.toString());
       return;
    }
    public q b(){
       return this.b;
    }
    public synchronized void d(){
       if (PatchProxy.applyVoid(null, this, g.class, "4")) {
          return;
       }
       if (!n.b(this.b.a())) {
          Log.b("DownloadManager:NetworkFocusManager", "releaseNetworkFocus ## currentFocus is none, don\'t need to release");
          return;
       }else if(this.b.c()){
          this.a(g.d);
       }else {
          this.a(g.c);
       }
       return;
    }
    public synchronized boolean e(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "3");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (!n.b(this.b.a())) {
          Log.b("DownloadManager:NetworkFocusManager", "releaseNetworkFocus ## currentFocus is none, don\'t need to release");
          return false;
       }else {
          og = this.b;
          og.a = (~ p0) & og.a;
          this.a(og);
          return true;
       }
    }
    public synchronized boolean f(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (!p0) {
          return b;
       }else {
          g tb = this.b;
          q a = tb.a;
          if ((p0 & a) > 0) {
             b = true;
          }
          if (b) {
             Log.b("DownloadManager:NetworkFocusManager", "requestNetworkFocus ## focus host doesn\'t change : "+this.b.toString());
             return true;
          }else {
             tb.a = p0 | a;
             this.a(tb);
             return true;
          }
       }
    }
    public synchronized boolean g(q p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       if (p0.a() == this.b.a()) {
          Log.b("DownloadManager:NetworkFocusManager", "requestNetworkFocus ## focus host doesn\'t change : "+p0.toString());
          return true;
       }else if(this.b.c() && !p0.c()){
          p0.a = p0.a | true;
       }
       this.a(p0);
       return true;
    }
}

package pm7.h;
import android.content.Context;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.robust.Robust;
import java.lang.String;
import java.io.File;
import android.content.pm.ApplicationInfo;
import pm7.m$c;
import pm7.m$e;
import pm7.m$a;
import pm7.m$d;
import pm7.m$b;
import android.os.HandlerThread;
import pm7.h$a;
import android.os.Looper;
import java.lang.Runnable;
import android.os.Handler;
import java.util.List;
import com.kwai.robust2.patchmanager.c;
import pm7.e;
import pm7.d;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import pm7.b;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;
import com.kwai.robust2.patchmanager.b;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.robust.Patch;
import java.util.Map;
import rm7.a;
import rm7.k;
import rm7.c;
import rm7.g;
import rm7.v;
import com.kwai.robust2.patchmanager.model.PatchModel;
import java.lang.Throwable;
import com.google.gson.Gson;
import com.kwai.robust2.patchmanager.model.PatchEvent;
import java.util.Arrays;
import com.kwai.robust2.patchmanager.apiservice.SafeModeApiServiceWrapper;
import com.kwai.robust2.patchmanager.apiservice.SafeModeApiServiceWrapper$b;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.kuaishou.live.common.core.basic.tools.h;
import crd.b;
import qm7.b;
import qm7.b$a;
import android.os.Message;
import pm7.m;

public class h	// class@0021da
{
    public final m a;
    public final m b;
    public final m c;
    public final m d;
    public final m e;
    public final File f;
    public final Context g;
    public final String h;
    public m i;
    public final HandlerThread j;
    public h$a k;
    public Map l;

    public void h(Context p0){
       super();
       this.l = new ConcurrentHashMap();
       this.g = p0;
       this.h = Robust.get().getRobustId(p0);
       this.f = new File(p0.getApplicationInfo().dataDir, "robust2");
       m$c uoc = new m$c(this);
       this.a = uoc;
       this.b = new m$e(this);
       this.c = new m$a(this);
       this.d = new m$d(this);
       this.e = new m$b(this);
       this.i = uoc;
       HandlerThread handlerThrea = new HandlerThread("Robust2PatchThread");
       this.j = handlerThrea;
       handlerThrea.start();
       this.k = new h$a(this, handlerThrea.getLooper());
    }
    public void a(Runnable p0){
       this.k.post(p0);
    }
    public Context b(){
       return this.g;
    }
    public List c(){
       List list = c.c();
       Object[] objArray = new Object[0];
       d.b().a("PatchContext", "getLoadedPatchIds:"+TextUtils.join(",", list), objArray);
       return list;
    }
    public Set d(){
       HashSet hashSet = new HashSet(c.c());
       Iterator iterator = b.l(this).iterator();
       while (iterator.hasNext()) {
          hashSet.add(iterator.next().getId());
       }
       return hashSet;
    }
    public File e(){
       return this.f;
    }
    public String f(){
       return this.h;
    }
    public boolean g(String p0){
       boolean b = (this.l.remove(p0) != null)? true: false;
       return b;
    }
    public void h(a p0,Object[] p1){
       if (p0.c != null) {
          c.a().i(p0, this.h, p1);
          if (p0.d()) {
             if (p0 instanceof k) {
                this.i(p0, p0.a().getId());
             }else if(p0 instanceof c){
                this.i(p0, p0.a().getId());
             }else if(p0 instanceof g){
                this.i(p0, p0.a().getId());
             }else if(p0 instanceof v){
                this.i(p0, p0.a().patchId);
             }
          }
       }
       return;
    }
    public final void i(a p0,String p1){
       String str;
       if (TextUtils.isEmpty(p1)) {
          return;
       }
       Gson gson = new Gson();
       PatchEvent[] patchEventAr = new PatchEvent[1];
       if (p0.b == null) {
       label_002c :
          str = "unknown";
       }else if(p0 instanceof k){
          str = "androidHotfixDownload";
       }else if(p0 instanceof c || p0 instanceof g){
          str = "androidHotfixApply";
       }else if(p0 instanceof v){
          str = "androidHotfixRollback";
       }else {
          goto label_002c ;
       }
       patchEventAr[0] = PatchEvent.newInstance(str, this.h, p1);
       str = gson.q(Arrays.asList(patchEventAr));
       if (c.a().d()) {
          SafeModeApiServiceWrapper.c.a().b(str).subscribe(Functions.d(), h.b);
       }else {
          b.b.a().b(str).subscribe(Functions.d(), h.b);
       }
       return;
    }
    public void j(a p0){
       this.k.sendMessage(this.k.obtainMessage(1, p0));
    }
    public final void k(m p0){
       this.i = p0;
    }
    public void l(){
       this.k(this.a);
    }
}

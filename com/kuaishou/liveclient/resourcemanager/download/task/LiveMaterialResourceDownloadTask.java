package com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask$b;
import nsd.u;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import com.yxcorp.download.DownloadTask$DownloadTaskType;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask$TaskState;
import java.io.File;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import ftd.r1;
import kotlinx.coroutines.CoroutineDispatcher;
import ftd.z0;
import com.kuaishou.liveclient.resourcemanager.download.task.LiveMaterialResourceDownloadTask$notifyAllListenerIfNeeded$1;
import asd.c;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import ftd.z1;
import kotlinx.coroutines.a;
import java.lang.Throwable;
import kotlin.jvm.internal.a;

public final class LiveMaterialResourceDownloadTask	// class@00108e
{
    public CopyOnWriteArrayList a;
    public List b;
    public DownloadTask$DownloadTaskType c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Integer h;
    public String i;
    public LiveMaterialResourceDownloadTask$TaskState j;
    public String k;
    public long l;
    public long m;
    public Throwable n;
    public int o;
    public int p;
    public String q;
    public boolean r;
    public static final LiveMaterialResourceDownloadTask$b s;

    static {
       LiveMaterialResourceDownloadTask.s = new LiveMaterialResourceDownloadTask$b(null);
    }
    public void LiveMaterialResourceDownloadTask(){
       super();
       this.a = new CopyOnWriteArrayList();
       this.c = DownloadTask$DownloadTaskType.PRE_DOWNLOAD;
       this.d = "";
       this.e = "";
       this.j = LiveMaterialResourceDownloadTask$TaskState.INIT;
       this.k = "UNDEFINED";
       this.o = -1;
    }
    public void LiveMaterialResourceDownloadTask(u p0){
       super();
       this.a = new CopyOnWriteArrayList();
       this.c = DownloadTask$DownloadTaskType.PRE_DOWNLOAD;
       this.d = "";
       this.e = "";
       this.j = LiveMaterialResourceDownloadTask$TaskState.INIT;
       this.k = "UNDEFINED";
       this.o = -1;
    }
    public final long a(){
       return this.l;
    }
    public final File b(){
       Object[] objArray = null;
       LiveMaterialResourceDownloadTask obj = PatchProxy.apply(objArray, this, LiveMaterialResourceDownloadTask.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       int i = (obj == null || !obj.length())? 1: 0;
       if (!i) {
          objArray = new File(obj);
       }
       return objArray;
    }
    public final String c(){
       return this.k;
    }
    public final long d(){
       return this.m;
    }
    public final String e(){
       return this.f;
    }
    public final String f(){
       return this.d;
    }
    public final String g(){
       return this.g;
    }
    public final String h(){
       return this.d;
    }
    public final LiveMaterialResourceDownloadTask$TaskState i(){
       return this.j;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, LiveMaterialResourceDownloadTask.class, "6")) {
          return;
       }
       a.f(r1.b, z0.f(), null, new LiveMaterialResourceDownloadTask$notifyAllListenerIfNeeded$1(this, null), 2, null);
       return;
    }
    public final void k(String p0,Throwable p1){
       this.k = p0;
       this.n = p1;
    }
    public final void l(long p0){
       this.l = p0;
    }
    public final void m(long p0){
       this.m = p0;
    }
    public final void n(LiveMaterialResourceDownloadTask$TaskState p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMaterialResourceDownloadTask.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.j = p0;
       return;
    }
}

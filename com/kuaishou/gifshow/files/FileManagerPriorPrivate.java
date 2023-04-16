package com.kuaishou.gifshow.files.FileManagerPriorPrivate;
import j80.c;
import com.kuaishou.gifshow.files.FileManagerPriorPrivate$a;
import nsd.u;
import com.kuaishou.gifshow.files.FileManagerPriorPrivate$_rootDir$1;
import java.lang.Object;
import msd.a;
import l80.a;
import l80.b;
import com.kuaishou.gifshow.files.FileManagerPriorPrivate$_photoDir$1;
import com.kuaishou.gifshow.files.FileManagerPriorPrivate$_cacheRootDir$1;
import com.kuaishou.gifshow.files.FileManagerPriorPrivate$_cacheDir$1;
import com.kuaishou.gifshow.files.FileManagerPriorPrivate$_tmpDir$1;
import com.kuaishou.gifshow.files.FileManagerPriorPrivate$_privateCacheDir$1;
import com.kuaishou.gifshow.files.FileManagerPriorPrivate$_privateRootDir$1;
import java.util.ArrayList;
import k80.b;
import java.io.File;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.files.a;
import java.lang.Boolean;
import j80.c$a;
import java.util.List;
import java.util.Iterator;
import k80.a;
import ekd.e0;
import java.lang.StringBuilder;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.yxcorp.utility.Log;

public final class FileManagerPriorPrivate extends c	// class@000842
{
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    public final a h;
    public final a i;
    public final a j;
    public final a k;
    public final a l;
    public final a m;
    public final a n;
    public final List o;
    public a p;
    public static final FileManagerPriorPrivate$a q;

    static {
       FileManagerPriorPrivate.q = new FileManagerPriorPrivate$a(null);
    }
    public void FileManagerPriorPrivate(){
       super();
       a uoa = b.a(null, new FileManagerPriorPrivate$_rootDir$1(this), 1, null);
       this.a = uoa;
       this.b = uoa;
       uoa = b.a(null, new FileManagerPriorPrivate$_photoDir$1(this), 1, null);
       this.c = uoa;
       this.d = uoa;
       uoa = b.a(null, new FileManagerPriorPrivate$_cacheRootDir$1(this), 1, null);
       this.e = uoa;
       this.f = uoa;
       uoa = b.a(null, new FileManagerPriorPrivate$_cacheDir$1(this), 1, null);
       this.g = uoa;
       this.h = uoa;
       uoa = b.a(null, new FileManagerPriorPrivate$_tmpDir$1(this), 1, null);
       this.i = uoa;
       this.j = uoa;
       uoa = b.a(null, new FileManagerPriorPrivate$_privateCacheDir$1(this), 1, null);
       this.k = uoa;
       this.l = uoa;
       uoa = b.a(null, new FileManagerPriorPrivate$_privateRootDir$1(this), 1, null);
       this.m = uoa;
       this.n = uoa;
       this.o = new ArrayList();
       this.p = new b();
    }
    public static File u(FileManagerPriorPrivate p0,File p1,String p2,int p3,Object p4){
       p2 = (p3 & 0x01)? "unknown": null;
       return p0.t(p1, p2);
    }
    public File a(){
       Object obj = PatchProxy.apply(null, this, FileManagerPriorPrivate.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public File b(){
       Object obj = PatchProxy.apply(null, this, FileManagerPriorPrivate.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public File c(String p0){
       File obj = PatchProxy.applyOneRefs(p0, this, FileManagerPriorPrivate.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "subPath");
       obj = new File(this.b(), p0);
       obj.mkdirs();
       this.t(obj, "getDirInCache");
       return obj;
    }
    public File e(String p0,boolean p1){
       a.p(p0, "subPath");
       File uFile = new File(this.k(), p0);
       uFile.mkdirs();
       this.t(uFile, "getDirInPhoto");
       a.a(uFile);
       return uFile;
    }
    public File i(String p0,boolean p1){
       File obj;
       FileManagerPriorPrivate uFileManager = FileManagerPriorPrivate.class;
       if (PatchProxy.isSupport(uFileManager)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uFileManager, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "subPath");
       obj = new File(this.n(), p0);
       obj.mkdirs();
       this.t(obj, "getDirInRoot");
       a.a(obj);
       return obj;
    }
    public File j(String p0){
       File obj = PatchProxy.applyOneRefs(p0, this, FileManagerPriorPrivate.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "subPath");
       obj = new File(this.o(), p0);
       obj.mkdirs();
       this.t(obj, "getDirInTmp");
       return obj;
    }
    public File k(){
       return this.d.getValue();
    }
    public File l(){
       Object obj = PatchProxy.apply(null, this, FileManagerPriorPrivate.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
    public File m(){
       Object obj = PatchProxy.apply(null, this, FileManagerPriorPrivate.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.n.getValue();
    }
    public File n(){
       Object obj = PatchProxy.apply(null, this, FileManagerPriorPrivate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public File o(){
       Object obj = PatchProxy.apply(null, this, FileManagerPriorPrivate.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public void p(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FileManagerPriorPrivate.class, "12")) {
          return;
       }
       a.p(p0, "listener");
       this.o.add(p0);
       return;
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, FileManagerPriorPrivate.class, "8")) {
          return;
       }
       this.a.reset();
       this.c.reset();
       this.e.reset();
       this.g.reset();
       this.i.reset();
       this.k.reset();
       Iterator iterator = this.o.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void r(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FileManagerPriorPrivate.class, "13")) {
          return;
       }
       a.p(p0, "listener");
       this.o.remove(p0);
       return;
    }
    public final a s(){
       return this.p;
    }
    public final File t(File p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, FileManagerPriorPrivate.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (e0.a) {
          Log.b("FileManager", "path["+SystemUtil.r(e0.b)+"]: "+p1+" = "+p0.getCanonicalPath()+", exists = "+p0.exists());
       }
       return p0;
    }
}

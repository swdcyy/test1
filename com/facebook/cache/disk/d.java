package com.facebook.cache.disk.d;
import com.facebook.cache.disk.b;
import ab.h;
import java.lang.String;
import com.facebook.cache.common.CacheErrorLogger;
import java.lang.Object;
import com.facebook.cache.disk.d$a;
import java.io.File;
import com.facebook.cache.disk.b$a;
import java.lang.Class;
import java.lang.Throwable;
import cb.a;
import com.facebook.cache.disk.b$c;
import com.facebook.cache.disk.b$d;
import sa.a;
import java.util.Collection;
import com.facebook.common.file.FileUtils;
import cb.c;
import com.facebook.cache.disk.DefaultDiskStorage;
import com.facebook.cache.common.CacheErrorLogger$CacheErrorCategory;
import za.a;
import ab.e;

public class d implements b	// class@000439
{
    public final int a;
    public final h b;
    public final String c;
    public final CacheErrorLogger d;
    public d$a e;
    public static final Class f;

    static {
       d.f = d.class;
    }
    public void d(int p0,h p1,String p2,CacheErrorLogger p3){
       super();
       this.a = p0;
       this.d = p3;
       this.b = p1;
       this.c = p2;
       this.e = new d$a(null, null);
    }
    public b$a a(){
       return this.l().a();
    }
    public void b(){
       this.l().b();
    }
    public boolean c(String p0,Object p1){
       return this.l().c(p0, p1);
    }
    public void d(){
       try{
          this.l().d();
       }catch(java.io.IOException e0){
          a.d(d.f, "purgeUnexpectedResources", e0);
       }
       return;
    }
    public boolean e(String p0,Object p1){
       return this.l().e(p0, p1);
    }
    public long f(b$c p0){
       return this.l().f(p0);
    }
    public b$d g(String p0,Object p1){
       return this.l().g(p0, p1);
    }
    public String h(){
       try{
          return this.l().h();
       }catch(java.io.IOException e0){
          return "";
       }
    }
    public a i(String p0,Object p1){
       return this.l().i(p0, p1);
    }
    public boolean isEnabled(){
       try{
          return this.l().isEnabled();
       }catch(java.io.IOException e0){
          return false;
       }
    }
    public boolean isExternal(){
       try{
          return this.l().isExternal();
       }catch(java.io.IOException e0){
          return false;
       }
    }
    public Collection j(){
       return this.l().j();
    }
    public final void k(){
       File uFile = this.b.get();
       d tc = this.c;
       try{
          File uFile1 = new File(uFile, tc);
          FileUtils.a(uFile1);
          Class f = d.f;
          String absolutePath = uFile1.getAbsolutePath();
          if (a.a.d(3)) {
             Object[] objArray = new Object[]{absolutePath};
             a.a.d(a.j(f), a.i("Created cache directory %s", objArray));
          }
          this.e = new d$a(uFile1, new DefaultDiskStorage(uFile1, this.a, this.d));
          return;
       }catch(com.facebook.common.file.FileUtils$CreateDirectoryException e0){
          this.d.a(CacheErrorLogger$CacheErrorCategory.WRITE_CREATE_DIR, d.f, "createRootDirectoryIfNecessary", e0);
          throw e0;
       }
    }
    public synchronized b l(){
       d te = this.e;
       if (te.a != null) {
          d$a b = te.b;
          if (b != null && b.exists()) {
             te = null;
          label_0015 :
             if (te) {
                if (this.e.a != null && this.e.b != null) {
                   a.b(this.e.b);
                }
                this.k();
             }
             b = this.e.a;
             e.d(b);
             return b;
          }
       }
       te = 1;
       goto label_0015 ;
    }
    public long remove(String p0){
       return this.l().remove(p0);
    }
}

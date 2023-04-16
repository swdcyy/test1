package com.facebook.cache.disk.DefaultDiskStorage;
import com.facebook.cache.disk.b;
import java.util.concurrent.TimeUnit;
import java.io.File;
import com.facebook.cache.common.CacheErrorLogger;
import java.lang.Object;
import ab.e;
import android.os.Environment;
import java.lang.String;
import java.lang.CharSequence;
import com.facebook.cache.common.CacheErrorLogger$CacheErrorCategory;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Throwable;
import java.lang.Integer;
import java.util.Locale;
import za.a;
import com.facebook.common.file.FileUtils;
import hb.d;
import com.facebook.cache.disk.b$a;
import java.util.List;
import java.util.Iterator;
import com.facebook.cache.disk.b$c;
import com.facebook.cache.disk.DefaultDiskStorage$c;
import sa.b;
import java.lang.Byte;
import com.facebook.cache.disk.b$b;
import java.util.Map;
import com.facebook.cache.disk.DefaultDiskStorage$f;
import za.b;
import com.facebook.cache.disk.b$d;
import com.facebook.cache.disk.DefaultDiskStorage$d;
import com.facebook.cache.disk.DefaultDiskStorage$a;
import com.facebook.cache.disk.DefaultDiskStorage$e;
import sa.a;
import hb.a;
import java.util.Collection;
import com.facebook.cache.disk.DefaultDiskStorage$b;
import java.util.Collections;
import java.lang.Math;

public class DefaultDiskStorage implements b	// class@00042c
{
    public final File a;
    public final boolean b;
    public final File c;
    public final CacheErrorLogger d;
    public final a e;
    public static final Class f;
    public static final long g;

    static {
       DefaultDiskStorage.f = DefaultDiskStorage.class;
       DefaultDiskStorage.g = TimeUnit.MINUTES.toMillis(30);
    }
    public void DefaultDiskStorage(File p0,int p1,CacheErrorLogger p2){
       boolean b;
       String canonicalPat;
       super();
       e.d(p0);
       this.a = p0;
       int i = 0;
       try{
          int i1 = 0;
          File externalStor = Environment.getExternalStorageDirectory();
          if (externalStor != null) {
             String str = externalStor.toString();
             try{
                canonicalPat = p0.getCanonicalPath();
                try{
                   b = canonicalPat.contains(str);
                label_0045 :
                   this.b = b;
                   Object[] objArray = new Object[]{"v2",Integer.valueOf(100),Integer.valueOf(p1)};
                   b = new File(this.a, String.format(i1, "%s.ols%d.%d", objArray));
                   this.c = b;
                   this.d = p2;
                   if (this.a.exists()) {
                      if (!b.exists()) {
                         a.b(this.a);
                      }else if(i){
                         FileUtils.a(b);
                      }
                      this.e = d.a();
                      return;
                   }
                   i = 1;
                   goto label_0084 ;
                }catch(java.io.IOException e2){
                }catch(java.lang.Exception e8){
                   p2.a(CacheErrorLogger$CacheErrorCategory.OTHER, DefaultDiskStorage.f, "failed to get the external storage directory!", e8);
                }
             }catch(java.io.IOException e2){
                canonicalPat = i1;
             }
             p2.a(CacheErrorLogger$CacheErrorCategory.OTHER, DefaultDiskStorage.f, "failed to read folder to check if external: "+canonicalPat, e2);
          }
       }catch(java.lang.Exception e8){
       }
       b = false;
       goto label_0045 ;
    }
    public b$a a(){
       String str1;
       String str2;
       String str3;
       b$a uoa = new b$a();
       Iterator iterator = this.m().iterator();
       while (iterator.hasNext()) {
          b$c uoc = iterator.next();
          byte[] uobyteArray = uoc.a().read();
          String str = "undefined";
          int i = 0;
          if (uobyteArray.length >= 2) {
             if (uobyteArray[i] == -1 && uobyteArray[1] == -40) {
                str1 = "jpg";
             }else if(uobyteArray[i] == -119 && uobyteArray[1] == 80){
                str1 = "png";
             }else {
                String str4 = 73;
                if (uobyteArray[i] == 82 && uobyteArray[1] == str4) {
                   str1 = "webp";
                }else if(uobyteArray[i] == 71 && uobyteArray[1] == str4){
                   str1 = "gif";
                }
             }
             str2 = str1;
          label_0066 :
             if (str2.equals(str)) {
                int i1 = 4;
                if (uobyteArray.length >= i1) {
                   Object[] objArray = new Object[i1];
                   objArray[i] = Byte.valueOf(uobyteArray[i]);
                   objArray[1] = Byte.valueOf(uobyteArray[1]);
                   objArray[2] = Byte.valueOf(uobyteArray[2]);
                   i = 3;
                   objArray[i] = Byte.valueOf(uobyteArray[i]);
                   str3 = String.format(null, "0x%02X 0x%02X 0x%02X 0x%02X", objArray);
                label_009d :
                   b$b uob = new b$b(uoc.getId(), uoc.a().c().getPath(), str2, (float)uoc.getSize(), str3);
                   b$b c = str3.c;
                   Integer integer = uoa.b.get(c);
                   if (integer == null) {
                      uoa.b.put(c, Integer.valueOf(1));
                   }else {
                      int i2 = integer.intValue() + 1;
                      uoa.b.put(c, Integer.valueOf(i2));
                   }
                   uoa.a.add(str3);
                }
             }
             str3 = "";
             goto label_009d ;
          }
       label_0065 :
          str2 = str;
          goto label_0066 ;
       }
       return uoa;
    }
    public void b(){
       a.a(this.a);
    }
    public boolean c(String p0,Object p1){
       return this.q(p0, false);
    }
    public void d(){
       a.c(this.a, new DefaultDiskStorage$f(this));
    }
    public boolean e(String p0,Object p1){
       return this.q(p0, true);
    }
    public long f(b$c p0){
       return this.k(p0.a().c());
    }
    public b$d g(String p0,Object p1){
       String str = ".tmp";
       p1 = new DefaultDiskStorage$d(str, p0, null);
       File uFile = this.o(p1.b);
       if (!uFile.exists()) {
          try{
             FileUtils.a(uFile);
          }catch(com.facebook.common.file.FileUtils$CreateDirectoryException e5){
             this.d.a(CacheErrorLogger$CacheErrorCategory.WRITE_CREATE_DIR, DefaultDiskStorage.f, "insert", e5);
             throw e5;
          }
       }
       try{
          return new DefaultDiskStorage$e(this, p0, File.createTempFile(p1.b+".", str, uFile));
       }catch(java.io.IOException e5){
          this.d.a(CacheErrorLogger$CacheErrorCategory.WRITE_CREATE_TEMPFILE, DefaultDiskStorage.f, v3, e5);
          throw e5;
       }
    }
    public String h(){
       String absolutePath = this.a.getAbsolutePath();
       return "_"+absolutePath.substring((absolutePath.lastIndexOf(47) + 1), absolutePath.length())+"_"+absolutePath.hashCode();
    }
    public a i(String p0,Object p1){
       File uFile = this.l(p0);
       if (!uFile.exists()) {
          return null;
       }
       uFile.setLastModified(this.e.now());
       return new b(uFile);
    }
    public boolean isEnabled(){
       return true;
    }
    public boolean isExternal(){
       return this.b;
    }
    public Collection j(){
       return this.m();
    }
    public final long k(File p0){
       if (!p0.exists()) {
          return 0;
       }
       long l = p0.length();
       if (p0.delete()) {
          return l;
       }
       return -1;
    }
    public File l(String p0){
       DefaultDiskStorage$d uod = new DefaultDiskStorage$d(".cnt", p0, null);
       return new File(this.p(uod.b)+File.separator+uod.b+uod.a);
    }
    public List m(){
       DefaultDiskStorage$b uob = new DefaultDiskStorage$b(this);
       a.c(this.c, uob);
       return Collections.unmodifiableList(uob.a);
    }
    public DefaultDiskStorage$d n(File p0){
       DefaultDiskStorage$d uod1;
       String name = p0.getName();
       int i = 46;
       int i1 = name.lastIndexOf(i);
       DefaultDiskStorage$d uod = null;
       if (i1 > 0) {
          String str = name.substring(i1);
          String str1 = ".cnt";
          if (!str1.equals(str)) {
             str1 = (".tmp".equals(str))? ".tmp": uod;
          }
       label_0027 :
          if (str1 != null) {
             name = name.substring(0, i1);
             if (str1.equals(".tmp")) {
                i = name.lastIndexOf(i);
                if (i > 0) {
                   name = name.substring(0, i);
                }
             }
             uod1 = new DefaultDiskStorage$d(str1, name);
          label_0045 :
             if (uod1 == null) {
                return uod;
             }else if(this.o(uod1.b).equals(p0.getParentFile())){
                uod = uod1;
             }
             return uod;
          }
       }
    label_000d :
       uod1 = uod;
       goto label_0045 ;
    }
    public final File o(String p0){
       return new File(this.p(p0));
    }
    public final String p(String p0){
       return this.c+File.separator+String.valueOf(Math.abs((p0.hashCode() % 100)));
    }
    public final boolean q(String p0,boolean p1){
       File uFile = this.l(p0);
       boolean b = uFile.exists();
       if (p1 && b) {
          uFile.setLastModified(this.e.now());
       }
       return b;
    }
    public long remove(String p0){
       return this.k(this.l(p0));
    }
}

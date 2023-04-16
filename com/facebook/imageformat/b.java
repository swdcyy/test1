package com.facebook.imageformat.b;
import java.lang.Object;
import com.facebook.imageformat.DefaultImageFormatChecker;
import java.io.InputStream;
import com.facebook.imageformat.a;
import java.util.Objects;
import ab.e;
import java.lang.Boolean;
import com.facebook.common.internal.a;
import com.facebook.imageformat.a$a;
import java.util.Iterator;
import java.util.List;
import java.lang.String;
import java.io.FileInputStream;
import com.facebook.common.internal.b;
import java.lang.Throwable;
import java.lang.RuntimeException;
import com.facebook.common.internal.e;
import java.lang.Math;

public class b	// class@00046a
{
    public int a;
    public List b;
    public final a$a c;
    public static b d;

    public void b(){
       super();
       this.c = new DefaultImageFormatChecker();
       this.e();
    }
    public static a a(InputStream p0){
       int i1;
       b b;
       b uob = b.d();
       Objects.requireNonNull(uob);
       e.d(p0);
       b a = uob.a;
       byte[] uobyteArray = new byte[a];
       e.d(p0);
       e.d(uobyteArray);
       int i = 0;
       e.a(Boolean.TRUE);
       if (p0.markSupported()) {
          p0.mark(a);
          i1 = a.b(p0, uobyteArray, i, a);
          p0.reset();
       }else {
          i1 = a.b(p0, uobyteArray, i, a);
       }
       a uoa = uob.c.determineFormat(uobyteArray, i1);
       if (uoa == null || uoa == a.c) {
          b = uob.b;
          if (b != null) {
             Iterator iterator = b.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   a uoa1 = iterator.next().determineFormat(uobyteArray, i1);
                   if (uoa1 != null && uoa1 != a.c) {
                      uoa = uoa1;
                      break ;
                   }
                }
             }
          }
          uoa = a.c;
       }
       return uoa;
    }
    public static a b(String p0){
       FileInputStream uFileInputSt;
       int i = 0;
       try{
          try{
             uFileInputSt = new FileInputStream(p0);
             b.b(uFileInputSt);
             return b.a(uFileInputSt);
          }catch(java.io.IOException e0){
             InputStream inputStream = uFileInputSt;
             b.b(e0);
             return a.c;
          }
       }catch(java.io.IOException e0){
       }
    }
    public static a c(InputStream p0){
       try{
          return b.a(p0);
       }catch(java.io.IOException e0){
          e.a(e0);
          throw null;
       }
    }
    public static synchronized b d(){
       _monitor_enter(b.class);
       if (b.d == null) {
          b.d = new b();
       }
       _monitor_exit(b.class);
       return b.d;
    }
    public final void e(){
       this.a = this.c.getHeaderSize();
       b tb = this.b;
       if (tb != null) {
          Iterator iterator = tb.iterator();
          while (iterator.hasNext()) {
             this.a = Math.max(this.a, iterator.next().getHeaderSize());
          }
       }
       return;
    }
}

package av6.a;
import av6.b;
import ht6.c;
import av6.a$a;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.io.File;
import cv6.b;
import ht6.a;
import java.util.UUID;
import jt6.b;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import it6.a;
import ht6.b;
import java.lang.Enum;
import com.kwai.kds.patcher.applier.KdsDiffException;
import java.lang.Exception;

public final class a implements b	// class@00037c
{
    public static final a a;

    static {
       a.a = new a();
       c b = c.b;
       a$a uoa = new a$a();
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(uoa, b, c.class, "3")) {
       }else {
          a.q(uoa, "fileOperation");
          c.a = uoa;
       }
    }
    public void a(){
       super();
    }
    public void a(File p0,File p1,File p2,b p3){
       a a;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "1")) {
          return;
       }
       a.p(p0, "srcFile");
       a.p(p1, "dstFile");
       a.p(p2, "diffFile");
       a.p(p3, "bundleConfig");
       c b = c.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, b, c.class, "4")) {
          a.q(p0, "oldDir");
          a.q(p1, "newDir");
          a.q(p2, "patchZip");
          a = c.a;
          if (a == null) {
             a.S("mFileOperation");
          }
          File uFile = a.f();
          String str = UUID.randomUUID().toString();
          try{
             File uFile1 = new File(uFile, str);
             a = c.a;
             if (a == null) {
                a.S("mFileOperation");
             }
             a.d(uFile1);
             b.a.b(p2, uFile1);
             a a1 = c.a;
             if (a1 == null) {
                a.S("mFileOperation");
             }
             a1.c(p1);
             a1 = c.a;
             if (a1 == null) {
                a.S("mFileOperation");
             }
             a1.a(p0, p1);
             Iterator iterator = b.b(uFile1).iterator();
             while (iterator.hasNext()) {
                a1 = iterator.next();
                File uFile2 = new File(p1, a1.b());
                int i = b.a[a1.deltaType.ordinal()];
                if (i != 1) {
                   if (i != 2) {
                      if (i != 3) {
                         if (i != 4) {
                            continue ;
                         }else {
                            a a2 = c.a;
                            if (a2 == null) {
                               a.S("mFileOperation");
                            }
                            a2.c(new File(p1, a1.c()));
                         }
                      }else {
                         a = c.a;
                         if (a == null) {
                            a.S("mFileOperation");
                         }
                         a.b(new File(p1, a1.c()), uFile2);
                         c.b.a(uFile2, a1.a());
                      }
                   }else {
                      uFile = File.createTempFile(UUID.randomUUID().toString(), "");
                      c str1 = c.b;
                      a.h(uFile, "dstFile");
                      str1.c(uFile2, uFile, new File(uFile1, a1.d()));
                      a a3 = c.a;
                      if (a3 == null) {
                         a.S("mFileOperation");
                      }
                      a3.c(uFile2);
                      a3 = c.a;
                      if (a3 == null) {
                         a.S("mFileOperation");
                      }
                      a3.b(uFile, uFile2);
                      str1.a(uFile2, a1.a());
                   }
                }else {
                   a = c.a;
                   if (a == null) {
                      a.S("mFileOperation");
                   }
                   a.g(new File(uFile1, a1.b()), uFile2);
                   c.b.a(uFile2, a1.a());
                }
             }
             a a4 = c.a;
             if (a4 == null) {
                a.S("mFileOperation");
             }
             a4.c(uFile1);
          }catch(java.lang.Exception e9){
             throw new KdsDiffException(e9);
          }
       }
       return;
    }
}

package cg7.b;
import cg7.b$e;
import cg7.b$d;
import cg7.b$a;
import cg7.b$c;
import cg7.b$b;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.util.Map;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Float;
import kotlin.text.Regex;
import java.util.ListIterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import kotlin.TypeCastException;

public final class b	// class@00054c
{
    public static File a;
    public static File b;
    public static final FilenameFilter c;
    public static final FilenameFilter d;
    public static final FilenameFilter e;
    public static final FilenameFilter f;
    public static final FilenameFilter g;
    public static final b h;

    static {
       b.h = new b();
       b.c = b$e.b;
       b.d = b$d.b;
       b.e = b$a.b;
       b.f = b$c.b;
       b.g = b$b.b;
    }
    public void b(){
       super();
    }
    public static File b(b p0,String p1,int p2,Object p3){
       File uFile = null;
       String str = (p2 & 0x01)? "/sys/class/kgsl/kgsl-3d0": uFile;
       p3 = b.a;
       if (p3 != null) {
          uFile = p3;
       }else {
          p3 = new File(str);
          if (p3.exists() && p3.isDirectory()) {
             File[] uFileArray = p3.listFiles(b.e);
             if (uFileArray == null) {
                uFileArray = new File[false];
             }
             int len = uFileArray.length;
             int i = 0;
             while (i < len) {
                object oobject = uFileArray[i];
                if (oobject.exists()) {
                   a.h(oobject, "kgslDetailFile");
                   String name = oobject.getName();
                   a.h(name, "kgslDetailFile.name");
                   if (!StringsKt__StringsKt.O2(name, "gpu_busy_percentage", false, 2, uFile)) {
                      name = oobject.getName();
                      a.h(name, "kgslDetailFile.name");
                      if (!StringsKt__StringsKt.O2(name, "gpubusy", false, 2, uFile)) {
                      label_0063 :
                         i = i + 1;
                      }
                   }
                   b.a = oobject;
                   uFile = oobject;
                   break ;
                }
             }
          }
       }
       return uFile;
    }
    public static void d(b p0,String p1,Map p2,FilenameFilter p3,int p4,Object p5){
       FilenameFilter e = (p4 & 0x04)? b.e: null;
       File uFile = new File(p1);
       if (uFile.exists() && uFile.isDirectory()) {
          File[] uFileArray = uFile.listFiles(e);
          int i = 0;
          if (uFileArray == null) {
             uFileArray = new File[i];
          }
          uFile = uFileArray.length;
          while (i < uFile) {
             p5 = uFileArray[i];
             if (p5.exists()) {
                a.h(p5, "gpuDetailFile");
                String absolutePath = p5.getAbsolutePath();
                a.h(absolutePath, "gpuDetailFile.absolutePath");
                p2.put(absolutePath, CollectionsKt___CollectionsKt.m2(FilesKt__FileReadWriteKt.x(p5, null, 1, null)));
             }
             i++;
          }
       }
       return;
    }
    public final float a(){
       String name;
       boolean b;
       String str = "destFile!!.name";
       int i = 1;
       String str1 = null;
       File uFile = b.b(this, str1, i, str1);
       if (this.c()) {
          if (uFile == null) {
             a.L();
          }
          name = uFile.getName();
          a.h(name, str);
          if (StringsKt__StringsKt.L2(name, "gpu_busy_percentage", false)) {
             return Float.parseFloat(CollectionsKt___CollectionsKt.m2(FilesKt__FileReadWriteKt.x(uFile, str1, i, str1)));
          }else {
             name = uFile.getName();
             a.h(name, str);
             if (StringsKt__StringsKt.L2(name, "gpubusy", false)) {
                str = CollectionsKt___CollectionsKt.m2(FilesKt__FileReadWriteKt.x(uFile, str1, i, str1));
                if (str != null) {
                   List list = new Regex(" +").split(StringsKt__StringsKt.o5(str).toString(), false);
                   if (!list.isEmpty()) {
                      ListIterator listIterator = list.listIterator(list.size());
                      while (true) {
                         if (listIterator.hasPrevious()) {
                            b = (!listIterator.previous().length())? true: false;
                            if (!b) {
                               list = CollectionsKt___CollectionsKt.u5(list, (listIterator.nextIndex() + i));
                            label_0093 :
                               String[] stringArray = new String[false];
                               Object[] objArray = list.toArray(stringArray);
                               if (objArray != null) {
                                  if (objArray.length == 2) {
                                     return (Float.parseFloat(objArray[0]) / Float.parseFloat(objArray[i]));
                                  }
                               }else {
                                  throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                               }
                            }
                         }
                      }
                   }
                   list = CollectionsKt__CollectionsKt.E();
                   goto label_0093 ;
                }else {
                   throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
             }
          }
       }
       return 0;
    }
    public final boolean c(){
       boolean b;
       b.b(this, null, 1, null);
       File a = b.a;
       b = (a != null)? a.exists(): false;
       return b;
    }
}

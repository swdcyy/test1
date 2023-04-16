package isd.k;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.util.Objects;
import isd.g;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.util.Collection;

public class k	// class@001985
{

    public void k(){
       super();
    }
    public static final File a(File p0){
       a.p(p0, "$this$root");
       return new File(k.c(p0));
    }
    public static final int b(String p0){
       int i = StringsKt__StringsKt.h3(p0, File.separatorChar, 0, false, 4, null);
       int i1 = 1;
       if (!i) {
          if (p0.length() > i1) {
             char separatorCha = File.separatorChar;
             if (p0.charAt(i1) == separatorCha) {
                i = StringsKt__StringsKt.h3(p0, separatorCha, 2, false, 4, null);
                if (i >= 0) {
                   i = StringsKt__StringsKt.h3(p0, File.separatorChar, (i + 1), false, 4, null);
                   if (i >= 0) {
                      return (i + i1);
                   }else {
                      return p0.length();
                   }
                }
             }
          }
          return i1;
       }else if(i > 0 && p0.charAt((i - 1)) == ':'){
          return (i + i1);
       }else if(i == -1 && StringsKt__StringsKt.R2(p0, ':', false, 2, null)){
          return p0.length();
       }else {
          return false;
       }
    }
    public static final String c(File p0){
       a.p(p0, "$this$rootName");
       String path = p0.getPath();
       a.o(path, "path");
       String path1 = p0.getPath();
       a.o(path1, "path");
       Objects.requireNonNull(path, "null cannot be cast to non-null type java.lang.String");
       path1 = path.substring(0, k.b(path1));
       a.o(path1, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       return path1;
    }
    public static final boolean d(File p0){
       a.p(p0, "$this$isRooted");
       String path = p0.getPath();
       a.o(path, "path");
       boolean b = (k.b(path) > 0)? true: false;
       return b;
    }
    public static final File e(File p0,int p1,int p2){
       a.p(p0, "$this$subPath");
       return k.f(p0).j(p1, p2);
    }
    public static final g f(File p0){
       a.p(p0, "$this$toComponents");
       String path = p0.getPath();
       a.o(path, "path");
       int i = k.b(path);
       int i1 = 0;
       String str = path.substring(i1, i);
       a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
       String str1 = path.substring(i);
       a.o(str1, "\(this as java.lang.String\).substring\(startIndex\)");
       g og = 1;
       List list = (!str1.length())? 1: null;
       if (list) {
          list = CollectionsKt__CollectionsKt.E();
       }else {
          char[] uocharArray = new char[og];
          uocharArray[i1] = File.separatorChar;
          list = StringsKt__StringsKt.G4(str1, uocharArray, false, 0, 6, null);
          ArrayList uArrayList = new ArrayList(u.Y(list, 10));
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(new File(iterator.next()));
          }
          ArrayList uArrayList1 = uArrayList;
       }
       return new g(new File(str), list);
    }
}

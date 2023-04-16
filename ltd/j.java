package ltd.j;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import java.lang.ClassLoader;
import java.lang.reflect.Constructor;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.util.List;
import java.util.ServiceLoader;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ltd.k;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Collections;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.net.URL;
import java.util.Collection;
import trd.y;
import java.util.Set;
import trd.u;
import zsd.u;
import kotlin.text.StringsKt__StringsKt;
import java.util.jar.JarFile;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.io.InputStream;
import java.io.Reader;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import qrd.i;
import java.util.LinkedHashSet;
import java.lang.CharSequence;
import java.lang.Character;
import kotlin.TypeCastException;
import msd.l;
import nsd.c0;

public final class j	// class@001e09
{
    public static final j a;

    static {
       j.a = new j();
    }
    public void j(){
       super();
    }
    public final MainDispatcherFactory a(Class p0,String p1){
       MainDispatcherFactory mainDispatch;
       boolean b = true;
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          mainDispatch = p0.cast(Class.forName(p1, b, p0.getClassLoader()).getDeclaredConstructor(uClassArray).newInstance(objArray));
       }catch(java.lang.ClassNotFoundException e0){
          mainDispatch = null;
       }
       return mainDispatch;
    }
    public final Object b(String p0,ClassLoader p1,Class p2){
       boolean b = false;
       Class uClass = Class.forName(p0, b, p1);
       if (!p2.isAssignableFrom(uClass)) {
          throw new IllegalArgumentException("Expected service of class "+p2+", but found "+uClass.toString());
       }
       Class[] uClassArray = new Class[b];
       Object[] objArray = new Object[b];
       return p2.cast(uClass.getDeclaredConstructor(uClassArray).newInstance(objArray));
    }
    public final List c(Class p0,ClassLoader p1){
       List list = this.e(p0, p1);
       return list;
    }
    public final List d(){
       int i;
       MainDispatcherFactory mainDispatch1;
       MainDispatcherFactory mainDispatch2;
       MainDispatcherFactory mainDispatch = MainDispatcherFactory.class;
       if (!k.a()) {
          return this.c(mainDispatch, mainDispatch.getClassLoader());
       }
       ArrayList uArrayList = new ArrayList(2);
       String str = "kotlinx.coroutines.android.AndroidDispatcherFactory";
       boolean b = true;
       try{
          i = 0;
          Class[] uClassArray = new Class[i];
          Object[] objArray = new Object[i];
          mainDispatch1 = mainDispatch.cast(Class.forName(str, b, mainDispatch.getClassLoader()).getDeclaredConstructor(uClassArray).newInstance(objArray));
       }catch(java.lang.ClassNotFoundException e0){
          mainDispatch1 = null;
       }
       if (mainDispatch1 != null) {
          uArrayList.add(mainDispatch1);
       }
       str = "kotlinx.coroutines.test.internal.TestMainDispatcherFactory";
       try{
          Class[] uClassArray1 = new Class[i];
          Object[] objArray1 = new Object[i];
          mainDispatch2 = e0.cast(Class.forName(str, b, e0.getClassLoader()).getDeclaredConstructor(uClassArray1).newInstance(objArray1));
       }catch(java.lang.ClassNotFoundException e0){
       }
       if (mainDispatch2 != null) {
          uArrayList.add(mainDispatch2);
       }
       return uArrayList;
    }
    public final List e(Class p0,ClassLoader p1){
       ArrayList uArrayList = Collections.list(p1.getResources("META-INF/services/"+p0.getName()));
       a.h(uArrayList, "java.util.Collections.list\(this\)");
       ArrayList uArrayList1 = new ArrayList();
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          y.q0(uArrayList1, j.a.f(iterator.next()));
       }
       Set set = CollectionsKt___CollectionsKt.L5(uArrayList1);
       if (!(set.isEmpty() ^ 0x01)) {
          throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
       }
       uArrayList1 = new ArrayList(u.Y(set, 10));
       iterator = set.iterator();
       while (iterator.hasNext()) {
          uArrayList1.add(j.a.b(iterator.next(), p1, p0));
       }
       return uArrayList1;
    }
    public final List f(URL p0){
       String str = p0.toString();
       boolean b = false;
       int i = 2;
       if (u.q2(str, "jar", b, i, null)) {
          JarFile jarFile = new JarFile(StringsKt__StringsKt.i5(StringsKt__StringsKt.b5(str, "jar:file:", null, i, null), '!', null, i, null), b);
          BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(StringsKt__StringsKt.b5(str, "!/", null, i, null))), "UTF-8"));
          b.a(uBufferedRea, null);
          jarFile.close();
          return j.a.g(uBufferedRea);
       }else {
          BufferedReader uBufferedRea1 = new BufferedReader(new InputStreamReader(p0.openStream()));
          b.a(uBufferedRea1, null);
          return j.a.g(uBufferedRea1);
       }
    }
    public final List g(BufferedReader p0){
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       while (true) {
          String str = p0.readLine();
          if (str == null) {
             return CollectionsKt___CollectionsKt.G5(linkedHashSe);
          }
          str = StringsKt__StringsKt.j5(str, "#", null, 2, null);
          if (str == null) {
             throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
          }
          str = StringsKt__StringsKt.o5(str).toString();
          int i = 0;
          int i1 = 0;
          while (true) {
             if (i1 < str.length()) {
                char c = str.charAt(i1);
                String str1 = (c == '.' || Character.isJavaIdentifierPart(c))? 1: null;
                if (!str1) {
                   i1 = 0;
                label_0040 :
                   if (i1) {
                      if (str.length() > 0) {
                         i = 1;
                      }
                      if (i) {
                         linkedHashSe.add(str);
                      }else {
                         continue ;
                      }
                   }else {
                      break ;
                   }
                }else {
                   i1 = i1 + 1;
                }
             }else {
                i1 = 1;
                goto label_0040 ;
             }
          }
          throw new IllegalArgumentException("Illegal service provider class name: "+str.toString());
       }
    }
    public final Object h(JarFile p0,l p1){
       c0.d(1);
       p0.close();
       c0.c(1);
       return p1.invoke(p0);
    }
}

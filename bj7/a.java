package bj7.a;
import java.util.concurrent.CopyOnWriteArraySet;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import android.os.Build$VERSION;
import com.kwai.plugin.dva.util.CpuAbiUtils;
import java.lang.ClassLoader;
import java.util.List;
import java.lang.reflect.Field;
import com.kwai.plugin.dva.util.b;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import trd.u;
import java.util.Iterator;
import java.io.File;
import kotlin.collections.ArraysKt___ArraysKt;
import ji7.a;
import lj7.i;
import java.lang.RuntimeException;
import java.lang.Throwable;
import qrd.i;

public final class a	// class@0002e8
{
    public static final a a;
    public static final CopyOnWriteArraySet b;

    static {
       a.a = new a();
       a.b = new CopyOnWriteArraySet();
    }
    public void a(){
       super();
    }
    public final boolean a(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "context");
       boolean b = (Build$VERSION.SDK_INT < 23 && CpuAbiUtils.b(p0))? true: false;
       return b;
    }
    public final List b(ClassLoader p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "classLoader");
       p0 = b.e(p0, "pathList").get(p0);
       p0 = b.e(p0, "nativeLibraryDirectories").get(p0);
       if (p0 == null) {
          return CollectionsKt__CollectionsKt.E();
       }
       List list = CollectionsKt___CollectionsKt.d2(p0);
       ArrayList uArrayList = new ArrayList(u.Y(list, 10));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getAbsolutePath());
       }
       return uArrayList;
    }
    public final void c(ClassLoader p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       a.p(p0, "pluginClassLoader");
       ClassLoader uClassLoader = a.b.a();
       try{
          a.m(uClassLoader);
          Iterator iterator = this.b(uClassLoader).iterator();
          while (iterator.hasNext()) {
             i.a(p0, new File(iterator.next()));
          }
          return;
       }catch(java.lang.Exception e4){
          throw new RuntimeException(a.C("²éÕÒappµÄsoDirsÊ§°Ü, ", i.i(e4)));
       }
    }
    public final boolean d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "featureName");
       return a.b.contains(p0);
    }
}

package androidx.fragment.app.PluginManagerForMemoryRestart;
import androidx.fragment.app.PluginManagerForMemoryRestart$mAllFeatureFragments$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import android.content.Context;
import java.util.Collection;
import java.lang.String;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManagerState;
import java.lang.StringBuilder;
import androidx.fragment.app.PluginManagerForMemoryRestart$memoryRestartIntercept$1;
import java.lang.Iterable;
import java.lang.CharSequence;
import msd.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import qj7.d;
import java.util.Set;
import java.util.ArrayList;
import java.lang.ClassLoader;
import java.util.Iterator;
import java.lang.Class;
import androidx.fragment.app.FragmentState;
import com.kwai.plugin.dva.feature.core.FeatureManager;
import trd.u;
import com.kwai.plugin.dva.entity.Plugin;
import java.util.Objects;
import kotlin.collections.ArraysKt___ArraysKt;

public final class PluginManagerForMemoryRestart	// class@00079e
{
    public static final PluginManagerForMemoryRestart a;
    public static final p b;

    static {
       PluginManagerForMemoryRestart.a = new PluginManagerForMemoryRestart();
       PluginManagerForMemoryRestart.b = s.c(PluginManagerForMemoryRestart$mAllFeatureFragments$2.INSTANCE);
    }
    public void PluginManagerForMemoryRestart(){
       super();
    }
    public static List c(PluginManagerForMemoryRestart p0,Context p1,Collection p2,Collection p3,String p4,int p5,Object p6){
       return p0.b(p1, p2, p3, null);
    }
    public static final void e(Activity p0,Bundle p1){
       PluginManagerForMemoryRestart a;
       Bundle uBundle = p1;
       a.p(p0, "activity");
       FragmentManagerState uFragmentMan = (!uBundle)? null: uBundle.getParcelable("android:support:fragments");
       if (uFragmentMan != null && uFragmentMan instanceof FragmentManagerState) {
          FragmentManagerState b = uFragmentMan.b;
          StringBuilder str = (b == null || b.isEmpty())? 1: null;
          if (str) {
             return;
          }else {
             a = PluginManagerForMemoryRestart.a;
             a.o(b, "activeFragmentsState");
             d.c("memoryRestartIntercept"+" fragments=["+CollectionsKt___CollectionsKt.V2(b, null, null, null, 0, null, PluginManagerForMemoryRestart$memoryRestartIntercept$1.INSTANCE, 31, null));
             Set set = a.d();
             PluginManagerForMemoryRestart pluginManage = a;
             String str1 = "memoryRestartIntercept";
             PluginManagerForMemoryRestart pluginManage1 = a;
             List list = PluginManagerForMemoryRestart.c(pluginManage, p0, b, set, null, 8, null);
             if (list.isEmpty()) {
                d.c(a.C(str1, " featureFragments=empty}"));
                return;
             }else {
                d.c(str1+" featureFragments="+CollectionsKt___CollectionsKt.V2(list, null, null, null, 0, null, null, 63, null)+'}');
                ClassLoader classLoader = p0.getClassLoader();
                a.o(classLoader, "activity.classLoader");
                if (!pluginManage1.a(list, classLoader)) {
                   d.c(a.C(str1, " checkFragmentsExist=false, remove all fragment"));
                   uBundle.remove("android:support:fragments");
                }else {
                   d.c(a.C(str1, " checkFragmentsExist=true"));
                }
             }
          }
       }
       return;
    }
    public final boolean a(List p0,ClassLoader p1){
       int i;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          try{
             i = 0;
             Class.forName(str, i, p1);
          }catch(java.lang.ClassNotFoundException e0){
             d.c("memoryRestartIntercept ClassNotFoundException: "+e0+", on memory restart.");
             return i;
          }
       }
       return true;
    }
    public final List b(Context p0,Collection p1,Collection p2,String p3){
       Iterator iterator = p1.iterator();
       ArrayList uArrayList = new ArrayList();
       while (iterator.hasNext()) {
          FragmentState uFragmentSta = iterator.next();
          FragmentState b = uFragmentSta.b;
          String str = null;
          int b1 = (p3 != null && p3.equals(b) == true)? true: false;
          if (b1) {
             continue ;
          }else if(p2.contains(b)){
             a.o(b, "fragmentName");
             uArrayList.add(b);
          }
          uFragmentSta = uFragmentSta.n;
          if (uFragmentSta == null) {
             continue ;
          }else {
             uFragmentSta.setClassLoader(p0.getClassLoader());
             Parcelable parcelable = uFragmentSta.getParcelable("android:support:fragments");
             if (parcelable != null && parcelable instanceof FragmentManagerState) {
                FragmentManagerState b2 = parcelable.b;
                if (b2 != null) {
                   b1 = b2.isEmpty() ^ 1;
                   if (b1 == 1) {
                      str = 1;
                   }
                }
                if (str) {
                   FragmentManagerState b3 = parcelable.b;
                   a.o(b3, "childFragmentState.mActive");
                   uArrayList.addAll(this.b(p0, b3, p2, b));
                }
             }
          }
       }
       return uArrayList;
    }
    public final Set d(){
       return PluginManagerForMemoryRestart.b.getValue();
    }
    public final void f(Bundle p0){
       a.p(p0, "savedInstanceState");
       List list = FeatureManager.b();
       ArrayList uArrayList = new ArrayList(u.Y(list, 10));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getName());
       }
       String[] stringArray = new String[0];
       Object[] objArray = uArrayList.toArray(stringArray);
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Array<T>");
       Object[] objArray1 = objArray;
       p0.putStringArray("features_installed_before", objArray1);
       d.c(a.C("memoryRestartIntercept saveFeatureInfoToBundle: ", ArraysKt___ArraysKt.Gg(objArray1, null, null, null, 0, null, null, 63, null)));
       return;
    }
}

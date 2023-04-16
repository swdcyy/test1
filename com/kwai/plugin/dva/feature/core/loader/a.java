package com.kwai.plugin.dva.feature.core.loader.a;
import java.lang.Object;
import java.util.WeakHashMap;
import java.util.Map;
import java.util.Collections;
import android.content.Context;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.util.Arrays;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.Field;
import com.kwai.plugin.dva.feature.core.loader.a$b;
import java.util.Collection;
import android.os.Build$VERSION;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.ref.WeakReference;
import com.kwai.robust.PatchProxyResult;
import com.kwai.plugin.dva.util.b;
import android.content.res.AssetManager;
import java.util.ArrayList;
import java.lang.reflect.Method;
import java.lang.Integer;
import java.lang.Throwable;
import qj7.d;
import com.kwai.plugin.dva.feature.core.FeatureManager;
import com.kwai.plugin.dva.entity.Plugin;
import com.kwai.plugin.dva.repository.model.PluginInfo;
import android.content.res.Resources;
import com.kwai.plugin.dva.feature.core.loader.a$a;
import java.util.HashSet;
import com.kwai.plugin.dva.feature.core.loader.SplitCompatResourcesException;
import java.util.LinkedHashSet;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import java.lang.Boolean;
import ii7.b;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook$b;

public class a	// class@001313
{
    public static final Object a;
    public static final Map b;
    public static final boolean c;

    static {
       a.a = new Object();
       a.b = Collections.synchronizedMap(new WeakHashMap());
    }
    public void a(){
       super();
    }
    public static synchronized void a(Context p0,List p1){
       _monitor_enter(a.class);
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, a.class, "2")) {
          _monitor_exit(a.class);
          return;
       }else if(p1.isEmpty()){
          _monitor_exit(a.class);
          return;
       }else if(!p1.contains(obj)){
          a.c(p0, p1);
          a.b(p0, p1);
          _monitor_exit(a.class);
          return;
       }else {
          String[] stringArray = new String[p1.size()];
          p1.toArray(stringArray);
          throw new IllegalArgumentException("apk list contains null path,"+Arrays.toString(stringArray));
       }
    }
    public static void b(Context p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "6")) {
          return;
       }
       ApplicationInfo applicationI = p0.getApplicationInfo();
       a$b.n().set(applicationI, a.i(a$b.n().get(applicationI), p1));
       a$b.l().set(applicationI, a.i(a$b.l().get(applicationI), p1));
       return;
    }
    public static void c(Context p0,List p1){
       Class uClass;
       Field[] uFieldArray;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "4")) {
          return;
       }
       try{
          uClass = a$b.g();
       }catch(java.lang.ClassNotFoundException e0){
          uClass = a$b.i();
       }
       int i = 0;
       int i1 = 1;
       if (Build$VERSION.SDK_INT < 27) {
          uFieldArray = new Field[]{a$b.j(),a$b.k()};
       }else {
          uFieldArray = new Field[i1];
          uFieldArray[i] = a$b.j();
       }
       Object obj = a$b.a(p0);
       ApplicationInfo applicationI = p0.getApplicationInfo();
       i1 = uFieldArray.length;
       for (; i < i1; i = i + 1) {
          a.d(p1, applicationI, uClass, uFieldArray[i].get(obj));
       }
       return;
    }
    public static void d(List p0,ApplicationInfo p1,Class p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "5")) {
          return;
       }
       Iterator iterator = p3.entrySet().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next().getValue().get();
          if (obj == null) {
             continue ;
          }else {
             Field uField = PatchProxy.applyOneRefs(p2, null, a$b.class, "29");
             if (uField != PatchProxyResult.class) {
             }else if(a$b.C == null){
                a$b.C = b.d(p2, "mResDir");
             }
             uField = a$b.C;
             if ((p1.sourceDir).equals(uField.get(obj))) {
                a$b.m(p2).set(obj, a.i(a$b.m(p2).get(obj), p0));
             }
          }
       }
       return;
    }
    public static List e(AssetManager p0){
       int len;
       Object[] objArray2;
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (Build$VERSION.SDK_INT >= 28) {
          Object[] objArray = new Object[0];
          Object[] objArray1 = a$b.d().invoke(p0, objArray);
          if (objArray1 != null) {
             len = objArray1.length;
             for (int i = 0; i < len; i = i + 1) {
                objArray2 = new Object[0];
                obj.add(a$b.e().invoke(objArray1[i], objArray2));
             }
          }
       }else {
          Object[] objArray3 = a$b.o().get(p0);
          if (objArray3 != null && objArray3.length > 0) {
             len = objArray3.length;
             int i1 = 1;
             while (i1 <= len) {
                try{
                   objArray2 = new Object[]{Integer.valueOf(i1)};
                   obj.add(a$b.f().invoke(p0, objArray2));
                }catch(java.lang.IndexOutOfBoundsException e0){
                }catch(java.lang.reflect.InvocationTargetException e5){
                   d.b("SplitResourcesLoader Unable to get cookie name for resources index "+i1, e5);
                }
                i1 = i1 + 1;
             }
          }
       }
       return obj;
    }
    public static Collection f(){
       List obj = PatchProxy.apply(null, null, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FeatureManager.a.c();
       ArrayList uArrayList = new ArrayList(obj.size());
       Iterator iterator = obj.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().getPluginInfo().apkPath);
       }
       return uArrayList;
    }
    public static void g(Context p0,Resources p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "11")) {
          return;
       }
       a$a.p(p1, p2);
       return;
    }
    public static void h(Context p0,Resources p1){
       a uoa = a.class;
       AssetManager obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, uoa, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(p0, p1, obj, uoa, "8")) {
          Collection uCollection = a.f();
          if (!uCollection.isEmpty()) {
             obj = p1.getAssets();
             Map b = a.b;
             Set set = b.get(obj);
             if (set == null || !set.containsAll(uCollection)) {
                HashSet hashSet = new HashSet(a.e(obj));
                if (!hashSet.containsAll(uCollection)) {
                   a.j(p0, p1, hashSet, uCollection);
                }
                if (!uCollection instanceof Set) {
                   uCollection = new HashSet(uCollection);
                }
                b.put(obj, uCollection);
             }
          }
       }
       return;
    }
    public static String[] i(String[] p0,Collection p1){
       LinkedHashSet obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null || !p0.length) {
          p0 = new String[p1.size()];
          p1.toArray(p0);
       }else {
          obj = new LinkedHashSet(Arrays.asList(p0));
          obj.addAll(p1);
          p0 = new String[obj.size()];
          obj.toArray(p0);
       }
       return p0;
    }
    public static void j(Context p0,Resources p1,Collection p2,Collection p3){
       boolean b;
       AssetManagerHook$b a;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, a.class, "9")) {
          return;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p3.iterator();
       while (iterator.hasNext()) {
          String str = iterator.next();
          if (!p2.contains(str)) {
             uArrayList.add(str);
          }
       }
       AssetManager assets = p1.getAssets();
       iterator = PatchProxy.applyTwoRefs(assets, uArrayList, null, AssetManagerHook.class, "2");
       if (iterator != PatchProxyResult.class) {
          b = iterator.booleanValue();
       }else if(!b.e){
          a = AssetManagerHook.a;
          if (a != null) {
             b = a.a(assets, uArrayList);
          }
       }
       b = false;
       if (!b) {
          a.g(p0, p1, uArrayList);
       }
       return;
    }
}

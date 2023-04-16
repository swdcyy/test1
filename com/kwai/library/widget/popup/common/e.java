package com.kwai.library.widget.popup.common.e;
import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import com.kwai.library.widget.popup.common.PopupInterface$i;
import com.kwai.library.widget.popup.common.e$b;
import p07.b;
import java.util.Objects;
import java.util.Set;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import com.kwai.library.widget.popup.common.exception.KwaiPopupBuildException;
import android.app.Application;
import com.yxcorp.utility.Log;
import java.lang.StringBuilder;
import java.util.ArrayList;
import com.kwai.library.widget.popup.common.e$a;
import android.app.Application$ActivityLifecycleCallbacks;

public final class e	// class@000995
{
    public static Application a;
    public static List b;
    public static e$b c;

    public static WeakReference a(Activity p0){
       WeakReference weakReferenc;
       List b = e.b;
       if (b == null) {
          return null;
       }
       Iterator iterator = b.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          weakReferenc = iterator.next();
          if (weakReferenc.get() == p0) {
             break ;
          }
       }
       return weakReferenc;
    }
    public static Context b(){
       Activity uActivity = e.c();
       if (uActivity != null) {
          return uActivity;
       }
       Application a = e.a;
       if (a == null) {
          Context obj = null;
          try{
             Class[] uClassArray = new Class[0];
             Object[] objArray = new Object[0];
             obj = Class.forName("android.app.ActivityThread").getMethod("currentApplication", uClassArray).invoke(obj, objArray);
          }catch(java.lang.Exception e0){
          }
       }
       return e0;
    }
    public static Activity c(){
       WeakReference weakReferenc;
       List b = e.b;
       if (b == null) {
          return null;
       }
       int i = b.size() - 1;
       while (true) {
          if (i < 0) {
             return null;
          }
          weakReferenc = e.b.get(i);
          if (weakReferenc.get() != null) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return weakReferenc.get();
    }
    public static PopupInterface$i d(){
       return e.c.a;
    }
    public static b e(Object p0){
       b uob;
       e$b c = e.c;
       Objects.requireNonNull(c);
       p0 = p0.getClass();
       Iterator iterator = c.b.keySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             throw new KwaiPopupBuildException("IPopupPageConverter no set!!");
          }
          Class uClass = iterator.next();
          if (!uClass.isAssignableFrom(p0)) {
             continue ;
          }else {
             uob = c.b.get(uClass);
             if (uob != null) {
                break ;
             }
          }
       }
       return uob;
    }
    public static void f(Application p0,e$b p1){
       if (e.a != null) {
          Log.d("Popup#PopupGlobalConfig", "PopupGlobalConfig is already init£¬can\'t init twice!");
          return;
       }else {
          Log.g("Popup#PopupGlobalConfig", "PopupGlobalConfig init: "+p1.a);
          e.b = new ArrayList();
          e.a = p0;
          e.c = p1;
          p0.registerActivityLifecycleCallbacks(new e$a());
          return;
       }
    }
    public static boolean g(){
       boolean b = (e.a != null)? true: false;
       return b;
    }
    public static void h(Activity p0){
       List b = e.b;
       if (b == null) {
          return;
       }
       Iterator iterator = b.iterator();
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          if (weakReferenc != null && weakReferenc.get() == p0) {
             iterator.remove();
             break ;
          }
       }
       return;
    }
}

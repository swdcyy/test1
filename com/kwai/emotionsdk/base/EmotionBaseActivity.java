package com.kwai.emotionsdk.base.EmotionBaseActivity;
import n3d.a$a;
import androidx.fragment.app.FragmentActivity;
import jl5.a;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jl5.n;
import ak5.j;
import ak5.a;
import ak5.a$b;
import java.util.Locale;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.res.Resources;
import android.content.res.Configuration;
import pd6.b;
import android.app.Activity;
import android.content.Intent;
import java.lang.Integer;
import java.util.Objects;
import n3d.a;
import androidx.fragment.app.c;
import java.util.List;
import androidx.fragment.app.Fragment;
import java.util.Set;
import java.util.Iterator;

public abstract class EmotionBaseActivity extends FragmentActivity implements a$a	// class@000d74
{
    public a b;

    public void EmotionBaseActivity(){
       super();
       this.b = new a(this);
    }
    public void attachBaseContext(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmotionBaseActivity.class, "7")) {
          return;
       }
       try{
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          n on = n.class;
          Locale obj = PatchProxy.applyOneRefs(p0, null, on, "1");
          if (obj != patchProxyRe) {
             p0 = obj;
          }else {
             obj = j.o().i().a().a();
             if (obj != null) {
                Locale locale = n.a(p0);
                if (locale == null || (!TextUtils.equals(locale.getLanguage(), obj.getLanguage()) || !TextUtils.equals(locale.getCountry(), obj.getCountry()))) {
                   Configuration obj1 = PatchProxy.applyTwoRefs(p0, obj, null, on, "3");
                   if (obj1 != patchProxyRe) {
                      p0 = obj1;
                   }else {
                      Locale.setDefault(obj);
                      Resources resources = p0.getResources();
                      if (resources != null) {
                         obj1 = new Configuration(resources.getConfiguration());
                         obj1.setLocale(obj);
                         p0 = b.a(p0, obj1);
                      }
                   }
                }
             }
          }
          super.attachBaseContext(p0);
          return;
       }catch(java.lang.ArrayIndexOutOfBoundsException e0){
       }catch(java.util.ConcurrentModificationException e0){
       }
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       int i1;
       if (PatchProxy.isSupport(EmotionBaseActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, EmotionBaseActivity.class, "6")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       EmotionBaseActivity tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, tb, a.class, "3")) {
          int i = 0;
          if (p0 == tb.c) {
             a e = tb.e;
             tb.e = null;
             tb.c = i;
             if (e != null) {
                e.onActivityCallback(p0, p1, p2);
             }
          }else if(tb.b.getSupportFragmentManager() != null){
             List fragments = tb.b.getSupportFragmentManager().getFragments();
             if (fragments != null) {
                int i4 = fragments.size();
                Fragment[] uFragmentArr = new Fragment[i4];
                fragments.toArray(uFragmentArr);
                i1 = 0;
                while (i1 < i4) {
                   object oobject1 = uFragmentArr[i1];
                   if (oobject1 != null) {
                      oobject1.onActivityResult(p0, p1, p2);
                   }
                   i1 = i1 + 1;
                }
             }
          }
          i1 = tb.d.size();
          a[] uoaArray = new a[i1];
          tb.d.toArray(uoaArray);
          int i2 = 0;
          int i3 = 0;
          while (i2 < i1) {
             object oobject = uoaArray[i2];
             if (oobject != null) {
                oobject.onActivityCallback(p0, p1, p2);
             }else {
                i3 = 1;
             }
             i2++;
          }
          if (i3) {
             for (; i < i1; i = i + 1) {
             }
             Iterator iterator = tb.d.iterator();
             while (iterator.hasNext()) {
                a uoa = iterator.next();
             }
          }
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, EmotionBaseActivity.class, "1")) {
          return;
       }
       EmotionBaseActivity tb = this.b;
       tb.c = 0;
       tb.e = null;
       super.onDestroy();
       return;
    }
    public void t1(Intent p0,int p1,a p2){
       if (PatchProxy.isSupport(EmotionBaseActivity.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, EmotionBaseActivity.class, "2")) {
          return;
       }
       this.b.t1(p0, p1, p2);
       return;
    }
}

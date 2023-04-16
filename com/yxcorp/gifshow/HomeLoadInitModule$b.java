package com.yxcorp.gifshow.HomeLoadInitModule$b;
import fw8.r$a;
import com.yxcorp.gifshow.HomeLoadInitModule;
import java.lang.Object;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import fw8.q;
import android.content.Intent;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.j0;
import android.net.Uri;
import com.yxcorp.gifshow.HomeActivity;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.lang.StringBuilder;
import uh5.e;
import com.kwai.kcube.TabIdentifier;
import on5.a;
import java.lang.Exception;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.KeyEvent;

public class HomeLoadInitModule$b implements r$a	// class@0012ec
{
    public final HomeLoadInitModule b;

    public void HomeLoadInitModule$b(HomeLoadInitModule p0){
       this.b = p0;
       super();
    }
    public void a(Activity p0,View p1,ViewGroup$LayoutParams p2){
       q.k(this, p0, p1, p2);
    }
    public void b(Activity p0,View p1){
       q.j(this, p0, p1);
    }
    public String c(Intent p0){
       String obj = PatchProxy.applyOneRefs(p0, this, HomeLoadInitModule$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String str = null;
       if (j0.f(p0, "backUri") == null && (p0.getData() != null && HomeActivity.H3() == null)) {
          try{
             String queryParamet = p0.getData().getQueryParameter("commonBackHomeTabId");
             if (!TextUtils.x(queryParamet)) {
                int i = Integer.valueOf(queryParamet).intValue();
                obj = "kwai://home/";
                if (e.f()) {
                   if (i == 4) {
                      queryParamet = "local";
                   }else if(i == 2){
                      queryParamet = "following";
                   }else {
                      queryParamet = "hot";
                   }
                   str = obj+queryParamet;
                }else {
                   TabIdentifier tabIdentifie = a.e(i);
                   if (tabIdentifie != null) {
                      queryParamet = (i == 5)? 1: null;
                      if (queryParamet) {
                         str = "kwai://featured";
                      }else {
                         str = obj+a.d(tabIdentifie);
                      }
                   }
                }
             }
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
          }
       }
    }
    public void d(Intent p0,View p1){
       q.l(this, p0, p1);
    }
    public void e(Intent p0){
       q.a(this, p0);
    }
    public void f(FragmentActivity p0,Bundle p1){
       q.d(this, p0, p1);
    }
    public void g(FragmentActivity p0,Bundle p1){
       q.f(this, p0, p1);
    }
    public void h(FragmentActivity p0,MotionEvent p1){
       q.c(this, p0, p1);
    }
    public void i(FragmentActivity p0,Intent p1){
       q.e(this, p0, p1);
    }
    public void j(Activity p0,int p1){
       q.i(this, p0, p1);
    }
    public void k(FragmentActivity p0,KeyEvent p1){
       q.b(this, p0, p1);
    }
    public void onSaveInstanceState(Bundle p0){
       q.g(this, p0);
    }
}

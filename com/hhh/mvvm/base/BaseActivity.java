package com.hhh.mvvm.base.BaseActivity;
import lm.c;
import com.mini.swipeback.SwipeBackActivity;
import java.util.LinkedList;
import com.hhh.mvvm.base.BaseFragment;
import lm.b;
import android.app.Activity;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import cm.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.pm.PackageManager;
import android.content.Context;
import android.content.Intent;
import android.content.ComponentName;
import androidx.fragment.app.FragmentActivity;
import dm.b;
import java.util.Iterator;
import java.util.List;
import dm.c;
import androidx.activity.ComponentActivity;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;

public abstract class BaseActivity extends SwipeBackActivity implements c	// class@00055f
{
    public final List e;
    public BaseFragment f;
    public b g;
    public int h;

    public void BaseActivity(){
       super();
       this.e = new LinkedList();
    }
    public abstract BaseFragment G2();
    public boolean O0(){
       return b.a(this);
    }
    public int R1(){
       return -1;
    }
    public boolean e1(){
       return b.b(this);
    }
    public void finish(){
       String a;
       super.finish();
       if (this.isTaskRoot()) {
          String name = this.getClass().getName();
          if (!TextUtils.isEmpty(a.a)) {
             a = a.a;
          }else {
             ComponentName component = this.getPackageManager().getLaunchIntentForPackage(this.getPackageName()).getComponent();
             if (component != null) {
                a.a = component.getClassName();
             }
             a = a.a;
          }
          if (!TextUtils.equals(name, a)) {
             this.startActivity(this.getPackageManager().getLaunchIntentForPackage(this.getPackageName()));
          }
       }
       return;
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       super.onActivityResult(p0, p1, p2);
       BaseActivity tg = this.g;
       if (tg != null && this.h == p0) {
          tg.onActivityResult(p0, p1, p2);
       }
       return;
    }
    public void onBackPressed(){
       Iterator iterator = this.e.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next().onBackPressed()) {
                break ;
             }
          }else {
             super.onBackPressed();
             return;
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       c supportFragm = this.getSupportFragmentManager();
       BaseFragment uBaseFragmen = supportFragm.findFragmentById(0x1020002);
       this.f = uBaseFragmen;
       if (uBaseFragmen == null) {
          uBaseFragmen = this.G2();
          this.f = uBaseFragmen;
          if (uBaseFragmen != null) {
             e uoe = supportFragm.beginTransaction();
             BaseActivity tf = this.f;
             uoe.w(0x1020002, tf, tf.getClass().getName());
             uoe.m();
          }
       }
       return;
    }
    public int s0(){
       return b.c(this);
    }
}

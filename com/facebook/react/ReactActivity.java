package com.facebook.react.ReactActivity;
import je.a;
import je.d;
import androidx.appcompat.app.AppCompatActivity;
import rd.k;
import java.lang.String;
import je.e;
import android.app.Activity;
import androidx.activity.ComponentActivity;
import android.content.Intent;
import rd.b0;
import rd.n;
import com.facebook.react.a;
import android.os.Bundle;
import rd.i;
import com.facebook.react.ReactRootView;
import android.view.View;
import java.lang.IllegalStateException;
import android.view.KeyEvent;
import java.lang.Object;
import od.a;
import zd.b;
import ae.e;
import androidx.fragment.app.FragmentActivity;
import rd.j;
import java.lang.ClassCastException;
import com.facebook.react.bridge.Callback;

public abstract class ReactActivity extends AppCompatActivity implements a, d	// class@001168
{
    public final k b;

    public void ReactActivity(){
       super();
       this.b = new k(this, null);
    }
    public void N7(String[] p0,int p1,e p2){
       ReactActivity tb = this.b;
       tb.c = p2;
       tb.b().requestPermissions(p0, p1);
    }
    public void X0(){
       super.onBackPressed();
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       k e = this.b.e;
       if (e.a().d()) {
          e.a().b().A(e.a, p0, p1, p2);
       }
       return;
    }
    public void onBackPressed(){
       k e = this.b.e;
       if (e.a().d()) {
          e.a().b().B();
          e = 1;
       }else {
          e = 0;
       }
       if (!e) {
          super.onBackPressed();
       }
       return;
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       ReactActivity tb = this.b;
       k b = tb.b;
       i oi = new i(tb, tb.b(), tb.c(), b, null);
       tb.e = v7;
       if (tb.b != null) {
          if (v7.b == null) {
             ReactRootView reactRootVie = v7.b();
             v7.b = reactRootVie;
             reactRootVie.setUniqueId(v7.a().b().r());
             v7.b.l(v7.a().b(), b, v7.d);
             tb.b().setContentView(tb.e.b);
          }else {
             throw new IllegalStateException("Cannot loadApp while app is already running.");
          }
       }
       return;
    }
    public void onDestroy(){
       super.onDestroy();
       k e = this.b.e;
       n b = e.b;
       if (b != null) {
          b.m();
          e.b = null;
       }
       if (e.a().d()) {
          e.a().b().C(e.a);
       }
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       ReactActivity tb = this.b;
       boolean b = true;
       if (tb.c().d() && (tb.c().c() && p0 == 90)) {
          p1.startTracking();
          tb = 1;
       }else {
          tb = 0;
       }
       if (!tb && !super.onKeyDown(p0, p1)) {
          b = false;
       }
       return b;
    }
    public boolean onKeyLongPress(int p0,KeyEvent p1){
       ReactActivity tb = this.b;
       boolean b = true;
       if (tb.c().d() && (tb.c().c() && p0 == 90)) {
          tb.c().b().S();
          tb = 1;
       }else {
          tb = 0;
       }
       if (!tb && !super.onKeyLongPress(p0, p1)) {
          b = false;
       }
       return b;
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       k e = this.b.e;
       boolean b = true;
       if (e.a().d() && e.a().c()) {
          if (p0 == 82) {
             e.a().b().S();
          }else {
             n e1 = e.e;
             a.c(e1);
             if (e1.a(p0, e.a.getCurrentFocus())) {
                e.a().b().o().F();
             }
          }
          e = 1;
       label_004d :
          if (!e && !super.onKeyUp(p0, p1)) {
             b = false;
          }
          return b;
       }
    label_004c :
       e = 0;
       goto label_004d ;
    }
    public void onNewIntent(Intent p0){
       ReactActivity tb = this.b;
       if (tb.c().d()) {
          tb.c().b().G(p0);
          tb = 1;
       }else {
          tb = 0;
       }
       if (!tb) {
          super.onNewIntent(p0);
       }
       return;
    }
    public void onPause(){
       super.onPause();
       k e = this.b.e;
       if (e.a().d()) {
          e.a().b().D(e.a);
       }
       return;
    }
    public void onRequestPermissionsResult(int p0,String[] p1,int[] p2){
       ReactActivity tb = this.b;
       tb.d = new j(tb, p0, p1, p2);
    }
    public void onResume(){
       n a;
       super.onResume();
       ReactActivity tb = this.b;
       k e = tb.e;
       if (e.a().d()) {
          if (e.a instanceof a) {
             a = e.a;
             e.a().b().E(a, a);
          }else {
             throw new ClassCastException("Host Activity does not implement DefaultHardwareBackBtnHandler");
          }
       }
       e = tb.d;
       if (e != null) {
          Object[] objArray = new Object[0];
          e.invoke(objArray);
          tb.d = null;
       }
       return;
    }
    public void onWindowFocusChanged(boolean p0){
       super.onWindowFocusChanged(p0);
       ReactActivity tb = this.b;
       if (tb.c().d()) {
          tb.c().b().H(p0);
       }
       return;
    }
}

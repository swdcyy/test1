package com.kuaishou.krn.page.KrnActivity;
import ik0.o;
import je.a;
import je.d;
import com.kuaishou.krn.base.KrnBaseActivity;
import com.kuaishou.krn.page.KrnFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import je.e;
import java.lang.Integer;
import androidx.activity.ComponentActivity;
import android.content.res.Resources;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import ekd.i;
import android.os.Parcelable;
import com.kuaishou.krn.model.LaunchModel;
import androidx.fragment.app.e;
import android.view.KeyEvent;
import java.lang.Boolean;

public class KrnActivity extends KrnBaseActivity implements o, a, d	// class@00090c
{

    public void KrnActivity(){
       super();
    }
    public final KrnFragment F2(){
       Object obj = PatchProxy.apply(null, this, KrnActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getSupportFragmentManager().findFragmentById(0x1020002);
    }
    public void N7(String[] p0,int p1,e p2){
       if (PatchProxy.isSupport(KrnActivity.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, KrnActivity.class, "13")) {
          return;
       }
       this.F2().N7(p0, p1, p2);
       return;
    }
    public void U0(boolean p0){
    }
    public void X0(){
       if (PatchProxy.applyVoid(null, this, KrnActivity.class, "11")) {
          return;
       }
       super.onBackPressed();
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KrnActivity.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(KrnActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, KrnActivity.class, "6")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       this.F2().onActivityResult(p0, p1, p2);
       return;
    }
    public void onBackPressed(){
       if (PatchProxy.applyVoid(null, this, KrnActivity.class, "10")) {
          return;
       }
       if (!this.F2().onBackPressed()) {
          super.onBackPressed();
       }
       return;
    }
    public void onCreate(Bundle p0){
       KrnActivity krnActivity = KrnActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, krnActivity, "2")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, krnActivity, "3")) {
          this.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
          i.a(this, 0, true);
       }
       super.onCreate(p0);
       if (p0 == null && !PatchProxy.applyVoid(objArray, this, krnActivity, "4")) {
          e uoe = this.getSupportFragmentManager().beginTransaction();
          uoe.v(0x1020002, KrnFragment.Vg(this.getIntent().getParcelableExtra("rn_launch_model")));
          uoe.m();
       }
       return;
    }
    public boolean onKeyDown(int p0,KeyEvent p1){
       KrnActivity krnActivity = KrnActivity.class;
       if (PatchProxy.isSupport(krnActivity)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, krnActivity, "7");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.F2().onKeyDown(p0, p1) || super.onKeyDown(p0, p1))? true: false;
       return b;
    }
    public boolean onKeyLongPress(int p0,KeyEvent p1){
       KrnActivity krnActivity = KrnActivity.class;
       if (PatchProxy.isSupport(krnActivity)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, krnActivity, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.F2().onKeyLongPress(p0, p1) || super.onKeyLongPress(p0, p1))? true: false;
       return b;
    }
    public boolean onKeyUp(int p0,KeyEvent p1){
       KrnActivity krnActivity = KrnActivity.class;
       if (PatchProxy.isSupport(krnActivity)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, krnActivity, "8");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.F2().onKeyUp(p0, p1) || super.onKeyUp(p0, p1))? true: false;
       return b;
    }
    public void onNewIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnActivity.class, "12")) {
          return;
       }
       if (!this.F2().onNewIntent(p0)) {
          super.onNewIntent(p0);
       }
       return;
    }
    public void onRequestPermissionsResult(int p0,String[] p1,int[] p2){
       if (PatchProxy.isSupport(KrnActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KrnActivity.class, "14")) {
          return;
       }
       this.F2().onRequestPermissionsResult(p0, p1, p2);
       return;
    }
    public void onWindowFocusChanged(boolean p0){
       KrnActivity krnActivity = KrnActivity.class;
       if (PatchProxy.isSupport(krnActivity) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, krnActivity, "15")) {
          return;
       }
       super.onWindowFocusChanged(p0);
       this.F2().onWindowFocusChanged(p0);
       return;
    }
    public boolean x0(){
       return true;
    }
}

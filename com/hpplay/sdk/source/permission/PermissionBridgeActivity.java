package com.hpplay.sdk.source.permission.PermissionBridgeActivity;
import android.app.Activity;
import java.lang.String;
import com.hpplay.sdk.source.a.a;
import com.hpplay.sdk.source.permission.a;
import java.lang.Object;
import android.media.projection.MediaProjectionManager;
import android.content.Intent;
import java.lang.Throwable;
import com.hpplay.sdk.source.process.b;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;
import java.lang.StringBuilder;
import java.lang.System;
import android.view.Window;
import android.view.MotionEvent;
import android.content.res.Resources;
import android.view.ContextThemeWrapper;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import com.hpplay.sdk.source.api.LelinkPlayerInfo;
import android.os.Bundle;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;
import android.os.Parcelable;
import android.content.Context;
import com.hpplay.sdk.source.permission.d;

public class PermissionBridgeActivity extends Activity	// class@000676
{
    public boolean h;
    public LelinkPlayerInfo j;
    public boolean k;
    public int l;
    public boolean o;
    public long p;

    public void PermissionBridgeActivity(){
       super();
       this.h = true;
       this.k = false;
       this.l = 0;
    }
    public void a(){
       String[] stringArray;
       boolean b = true;
       this.k = b;
       PermissionBridgeActivity tl = this.l;
       if (tl == 2) {
          a.f("PermissionBridgeActivity", "start get scard read permission");
          stringArray = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
          a.a(this, stringArray, 0);
       }else if(tl == b){
          a.f("PermissionBridgeActivity", "start get phone state permission");
          stringArray = new String[]{"android.permission.READ_PHONE_STATE"};
          a.a(this, stringArray, 0);
       }else {
          a.f("PermissionBridgeActivity", "start get phone state audio");
          stringArray = new String[]{"android.permission.RECORD_AUDIO"};
          a.a(this, stringArray, 10);
       }
       return;
    }
    public void b(){
       String str = "PermissionBridgeActivity";
       try{
          a.f(str, "registerMediaProjectionPermission");
          this.startActivityForResult(this.getSystemService("media_projection").createScreenCaptureIntent(), 1);
       }catch(java.lang.Exception e1){
          a.b(str, e1);
          b.b().i.onError(0x33838, 0x33839);
       }
       return;
    }
    public void c(){
       a.f("PermissionBridgeActivity", "finish bridge act");
       b.b().a();
       a.f("ptime", (System.currentTimeMillis() - this.p)+"  s");
    }
    public final void d(){
       Window window = this.getWindow();
       window.setStatusBarColor(0);
       window.setNavigationBarColor(0);
       a.f("PermissionBridgeActivity", "change status bar style to trans");
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       if (p0.getAction()) {
          return super.dispatchTouchEvent(p0);
       }
       this.c();
       return true;
    }
    public Resources getResources(){
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       a.f("PermissionBridgeActivity", "onActivityResult requestCode:"+p0+" resultCode:"+p1);
       int i = 1;
       if (-1 == p1) {
          if (p0 == i) {
             b.b().a(this, p2, this.j);
          }
       }else if(p0 == i){
          b.b().i.onError(0x33838, 0x3383a);
       }
       this.c();
       super.onActivityResult(p0, p1, p2);
       return;
    }
    public void onCreate(Bundle p0){
       super.onCreate(p0);
       this.d();
       this.p = System.currentTimeMillis();
       b.b().a(this);
       this.l = this.getIntent().getIntExtra("permission_type", 0);
       a.f("PermissionBridgeActivity", "PermissionBridgeActivity  onCreate");
    }
    public void onResume(){
       try{
          super.onResume();
          PermissionBridgeActivity tl = this.l;
          b uob = 2;
          if (tl != 3 && this.k != null) {
             if (tl == uob) {
                a.f("PermissionBridgeActivity", "send local media");
                b.b().a(b.b().c, b.b().a, b.b().b);
             }
             this.c();
             return;
          }else if(tl == uob || tl == 1){
             this.a();
          }else if(this.h != null){
             if (this.k == null) {
                this.j = this.getIntent().getParcelableExtra("mirror_info");
             }
             if (this.j.isMirrorAudioEnable() && (this.k == null && d.a(this, "android.permission.RECORD_AUDIO") == -1)) {
                a.f("PermissionBridgeActivity", " not audio permission ");
                this.a();
                return;
             }else {
                this.b();
             }
          }
          this.h = false;
       }catch(java.lang.Exception e1){
          a.b("PermissionBridgeActivity", e1);
          this.c();
       }
          return;
    }
    public void onStop(){
       super.onStop();
       this.c();
    }
}

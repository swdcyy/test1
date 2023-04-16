package com.hpplay.sdk.source.process.b;
import java.lang.Object;
import java.util.concurrent.LinkedBlockingQueue;
import com.hpplay.sdk.source.process.b$1;
import com.hpplay.sdk.source.process.b$2;
import com.hpplay.sdk.source.process.b$3;
import com.hpplay.sdk.source.process.b$4;
import com.hpplay.sdk.source.process.b$6;
import com.hpplay.sdk.source.g;
import java.util.List;
import com.hpplay.sdk.source.browse.api.AuthListener;
import com.hpplay.sdk.source.api.IConnectListener;
import com.hpplay.sdk.source.browse.api.IBrowseListener;
import com.hpplay.sdk.source.api.ILelinkPlayerListener;
import com.hpplay.sdk.source.e;
import com.hpplay.sdk.source.browse.api.IParceResultListener;
import android.content.Context;
import java.lang.String;
import java.io.File;
import com.hpplay.sdk.source.b.a;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import android.app.Activity;
import com.hpplay.sdk.source.api.ILelinkPlayer;
import com.hpplay.sdk.source.process.b$5;
import com.hpplay.sdk.source.browse.api.IAPI;
import android.content.Intent;
import com.hpplay.sdk.source.api.LelinkPlayerInfo;
import com.hpplay.sdk.source.permission.PermissionBridgeActivity;
import java.lang.Class;
import java.lang.StringBuilder;
import com.hpplay.sdk.source.a.a;
import com.hpplay.sdk.source.browse.api.LelinkSetting$LelinkSettingBuilder;
import com.hpplay.sdk.source.browse.api.LelinkSetting;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.hpplay.sdk.source.browse.api.ILelinkServiceManager;
import com.hpplay.sdk.source.browse.api.LelinkServiceManager;
import java.lang.Boolean;
import android.net.Uri;
import com.hpplay.sdk.source.permission.d;
import com.hpplay.sdk.source.browse.api.LelinkServiceInfo;

public class b	// class@000696
{
    public IParceResultListener A;
    public String a;
    public int b;
    public LelinkServiceInfo c;
    public LelinkPlayerInfo d;
    public Activity e;
    public AuthListener f;
    public IConnectListener g;
    public IBrowseListener h;
    public ILelinkPlayerListener i;
    public IParceResultListener j;
    public ILelinkServiceManager m;
    public ILelinkPlayer n;
    public ILelinkPlayerListener o;
    public IBrowseListener p;
    public IConnectListener q;
    public Context r;
    public LinkedBlockingQueue s;
    public e t;
    public g u;
    public AuthListener v;
    public int w;
    public int x;
    public List y;
    public boolean z;
    public static b l;

    public void b(){
       super();
       this.s = new LinkedBlockingQueue();
       this.f = new b$1(this);
       this.g = new b$2(this);
       this.h = new b$3(this);
       this.i = new b$4(this);
       this.j = new b$6(this);
    }
    public static int a(b p0,int p1){
       p0.w = p1;
       return p1;
    }
    public static g a(b p0){
       return p0.u;
    }
    public static List a(b p0,List p1){
       p0.y = p1;
       return p1;
    }
    public static AuthListener b(b p0){
       return p0.v;
    }
    public static b b(){
       _monitor_enter(b.class);
       if (b.l == null) {
          b.l = new b();
       }
       _monitor_exit(b.class);
       return b.l;
    }
    public static IConnectListener c(b p0){
       return p0.q;
    }
    public static List d(b p0){
       return p0.y;
    }
    public static IBrowseListener e(b p0){
       return p0.p;
    }
    public static int f(b p0){
       return p0.x;
    }
    public static int g(b p0){
       return p0.w;
    }
    public static ILelinkPlayerListener h(b p0){
       return p0.o;
    }
    public static e i(b p0){
       return p0.t;
    }
    public static IParceResultListener j(b p0){
       return p0.A;
    }
    public int a(Context p0,String p1,String p2,boolean p3){
       this.r = p0;
       if (!new File(p1).exists()) {
          return -1;
       }
       return a.a(p0, p1, p2, p3);
    }
    public void a(){
       Iterator iterator = this.s.iterator();
       while (iterator.hasNext()) {
          iterator.next().get().finish();
       }
       this.s.clear();
       return;
    }
    public void a(int p0){
       b tn = this.n;
       if (tn != null) {
          tn.setVolume(p0);
       }
       return;
    }
    public void a(int p0,Object[] p1){
       int i = 0;
       switch (p0){
           case 0x10003:
             if (p1[i] instanceof e) {
                this.t = p1[i];
                Object[] objArray = new Object[]{new b$5(this),p1[1]};
                this.m.setOption(p0, objArray);
             }
             break;
           case 0x10004:
             if (p1[i] instanceof g) {
                this.u = p1[i];
             }
             if (p1[i] instanceof AuthListener) {
                this.v = p1[i];
             }
             break;
           case 0x100029:
             this.n.setOption(p0, p1);
             break;
           default:
       }
    label_0044 :
       return;
    }
    public void a(Activity p0){
       this.s.offer(new WeakReference(p0));
    }
    public void a(Activity p0,Intent p1,LelinkPlayerInfo p2){
    }
    public void a(Context p0){
       Intent intent = new Intent(p0, PermissionBridgeActivity.class);
       intent.setFlags(0x10000000);
       intent.putExtra("permission_type", 1);
       p0.startActivity(intent);
    }
    public void a(Context p0,LelinkPlayerInfo p1){
    }
    public void a(Context p0,String p1,String p2,String p3,String p4,String p5){
       this.r = p0;
       String str = "LelinkSdkManager";
       a.f(str, "appid "+p1+" appSecret "+p2+" userId "+p3+" oaid "+p5);
       LelinkSetting lelinkSettin = new LelinkSetting$LelinkSettingBuilder(p1, p2, p5).setAppVersion(p4).build();
       if (!TextUtils.isEmpty(p3)) {
          lelinkSettin.setUserId(p3);
       }
       a.f(str, "start load mLelinkServiceManager  ");
       this.m = LelinkServiceManager.getInstance(p0);
       a.f(str, "mLelinkServiceManager  "+this.m);
       Object[] objArray = new Object[]{this.f};
       this.m.setOption(0x10004, objArray);
       this.m.setLelinkSetting(lelinkSettin);
       Object[] objArray1 = new Object[]{Boolean.FALSE};
       this.m.setOption(0x10005, objArray1);
       this.m.setOnBrowseListener(this.h);
       this.m.setDebug(this.z);
       this.c(p0);
       return;
    }
    public void a(IConnectListener p0){
       this.q = p0;
    }
    public void a(ILelinkPlayerListener p0){
       this.o = p0;
    }
    public void a(LelinkPlayerInfo p0){
       if (this.n != null && p0 != null) {
          if (!TextUtils.isEmpty(p0.getLocalPath()) || (p0.getLoaclUri() != null && d.a(this.r, "android.permission.READ_EXTERNAL_STORAGE") == -1)) {
             this.d = p0;
             b.b().b(this.r);
             return;
          }else {
             this.x = p0.getType();
             this.n.setDataSource(p0);
             this.n.start();
          }
       }
       return;
    }
    public void a(IBrowseListener p0){
       this.p = p0;
    }
    public void a(LelinkServiceInfo p0){
       b tn = this.n;
       if (tn != null) {
          Object[] objArray = new Object[]{this.y,p0};
          tn.setOption(0x100054, objArray);
       }
       return;
    }
    public void a(LelinkServiceInfo p0,String p1,int p2){
       if (this.n != null) {
          b td = this.d;
          if (td == null) {
             td = new LelinkPlayerInfo();
             td.setType(p2);
             td.setLocalPath(p1);
             if (this.c != null) {
                td.setLelinkServiceInfo(p0);
             }
          }
          this.x = td.getType();
          this.n.setDataSource(td);
          this.n.start();
       }
       return;
    }
    public void a(LelinkServiceInfo p0,String p1,int p2,boolean p3){
       this.d = null;
       if (this.n != null) {
          this.c = p0;
          if (p3 && d.a(this.r, "android.permission.READ_EXTERNAL_STORAGE") == -1) {
             this.a = p1;
             this.b = p2;
             b.b().b(this.r);
             return;
          }else {
             LelinkPlayerInfo lelinkPlayer = new LelinkPlayerInfo();
             lelinkPlayer.setType(p2);
             if (!p3) {
                lelinkPlayer.setUrl(p1);
             }else {
                lelinkPlayer.setLocalPath(p1);
             }
             b tc = this.c;
             if (tc != null) {
                lelinkPlayer.setLelinkServiceInfo(tc);
             }
             this.x = lelinkPlayer.getType();
             this.n.setDataSource(lelinkPlayer);
             this.n.start();
          }
       }
       return;
    }
    public void a(String p0,IParceResultListener p1){
       this.A = p1;
       this.m.addQRServiceInfo(p0, this.j);
    }
    public void a(boolean p0){
       if (p0) {
          a.a();
       }else {
          a.a(false);
       }
       this.z = p0;
       b tm = this.m;
       if (tm != null) {
          tm.setDebug(p0);
       }
       return;
    }
    public void a(boolean p0,boolean p1){
       a.f("LelinkSdkManager", "sdk manager start browse ");
       int i = 0;
       if (!p0 || !p1) {
          if (p0) {
             i = 1;
          }else if(p1){
             i = 3;
          }
       }
       if (this.m != null) {
          a.f("LelinkSdkManager", "sdk manager start useLelink ");
          this.m.browse(i);
       }
       return;
    }
    public void b(int p0){
       b tn = this.n;
       if (tn != null) {
          tn.seekTo(p0);
       }
       return;
    }
    public void b(Context p0){
       Intent intent = new Intent(p0, PermissionBridgeActivity.class);
       intent.setFlags(0x10000000);
       intent.putExtra("permission_type", 2);
       p0.startActivity(intent);
    }
    public void b(LelinkServiceInfo p0){
       a.f("LelinkSdkManager", "sdk manager  connect ");
       b tn = this.n;
       if (tn != null && p0 != null) {
          tn.connect(p0);
       }
       return;
    }
    public void b(String p0,IParceResultListener p1){
       this.A = p1;
       this.m.addPinCodeServiceInfo(p0, this.j);
    }
    public int c(int p0){
       if (p0 == 0x100032) {
          return this.i();
       }
       return 0;
    }
    public void c(){
       a.f("LelinkSdkManager", "sdk manager   stopBrowse ");
       b tm = this.m;
       if (tm != null) {
          tm.stopBrowse();
       }
       return;
    }
    public final void c(Context p0){
       ILelinkPlayer iLelinkPlaye = a.c(p0);
       this.n = iLelinkPlaye;
       iLelinkPlaye.setPlayerListener(this.i);
       this.n.setConnectListener(this.g);
    }
    public boolean c(LelinkServiceInfo p0){
       b tn = this.n;
       if (tn != null && p0 != null) {
          return tn.disConnect(p0);
       }
       return false;
    }
    public void d(){
       b tn = this.n;
       if (tn != null) {
          tn.addVolume();
       }
       return;
    }
    public boolean d(LelinkServiceInfo p0){
       b tn = this.n;
       if (tn != null) {
          return tn.canPlayScreen(p0);
       }
       return false;
    }
    public void e(){
       b tn = this.n;
       if (tn != null) {
          tn.subVolume();
       }
       return;
    }
    public boolean e(LelinkServiceInfo p0){
       b tn = this.n;
       if (tn != null) {
          return tn.canPlayLocalVideo(p0);
       }
       return false;
    }
    public List f(){
       return this.n.getConnectLelinkServiceInfos();
    }
    public void g(){
       b tn = this.n;
       if (tn != null) {
          tn.resume();
       }
       return;
    }
    public void h(){
       b tn = this.n;
       if (tn != null) {
          tn.pause();
       }
       return;
    }
    public int i(){
       a.f("LelinkSdkManager", "getPlayState  "+this.w);
       return this.w;
    }
    public void j(){
       b tn = this.n;
       if (tn != null) {
          tn.stop();
       }
       this.a();
       return;
    }
    public void k(){
       b tn = this.n;
       if (tn != null) {
          tn.release();
       }
       return;
    }
}

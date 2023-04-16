package com.kwai.feature.component.screenshot.a;
import java.lang.Object;
import com.kwai.feature.component.screenshot.a$a;
import com.kwai.feature.component.screenshot.a$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.Context;
import android.net.Uri;
import java.lang.Boolean;
import e06.a;
import q87.c;
import android.content.ContentResolver;
import com.yxcorp.gifshow.albumcontrol.a;
import java.lang.System;
import v79.a;
import android.database.Cursor;
import e06.d;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.Long;
import com.yxcorp.gifshow.util.DateUtils;
import f06.a;
import java.lang.Integer;
import f06.b;
import com.yxcorp.utility.RomUtils;
import e06.e;
import java.lang.Exception;
import e06.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.feature.component.screenshot.ScreenshotUserEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import e06.c;
import t45.c;
import android.os.HandlerThread;
import android.os.Looper;
import android.app.Application;
import o56.a;
import com.kwai.feature.component.screenshot.a$c;
import android.provider.MediaStore$Images$Media;
import android.database.ContentObserver;

public class a	// class@001283
{
    public long a;
    public boolean b;
    public boolean c;
    public String[] d;
    public a e;
    public b f;
    public HandlerThread g;
    public Handler h;

    public void a(){
       super();
       this.a = -1;
       this.b = true;
       this.c = false;
    }
    public void a(a$a p0){
       super();
       this.a = -1;
       this.b = true;
       this.c = false;
    }
    public static a b(){
       return a$b.a;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       boolean b = (QCurrentUser.ME.isLogined() && !QCurrentUser.ME.isScreenshotFeedbackDisabled())? true: false;
       this.c = b;
       return;
    }
    public void c(Context p0,Uri p1,boolean p2){
       Cursor uCursor;
       Object[] objArray1;
       a uoa = this;
       Uri uri = p1;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "8")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.B().w("ScreenshotMonitor", "handleMediaContentChanged", objArray);
       try{
          int i1 = 0;
          if (uoa.d == null) {
             String[] stringArray = new String[]{"_id","_data","width","height","date_added","date_modified","datetaken"};
             uoa.d = stringArray;
          }
          try{
             String[] stringArray1 = new String[]{String.valueOf(uoa.a),String.valueOf(System.currentTimeMillis())};
             uCursor = a.b.j("feed_screen_shot_share", p0.getContentResolver(), p1, uoa.d, "datetaken between ? and ?", stringArray1, "datetaken desc limit 1").a();
             if (uCursor == null) {
                objArray1 = new Object[i];
                a.B().w("ScreenshotMonitor", "cursor is null", objArray1);
                if (uCursor != null && !uCursor.isClosed()) {
                   uCursor.close();
                }
                return;
             }else if(!uCursor.moveToFirst()){
                objArray1 = new Object[i];
                a.B().w("ScreenshotMonitor", "cursor no data.", objArray1);
                if (p2) {
                   uoa.h.postDelayed(new d(uoa, p0, uri), 2000);
                }
                if (!uCursor.isClosed()) {
                   uCursor.close();
                }
                return;
             }else {
                String str = uCursor.getString(uCursor.getColumnIndex("_data"));
                int intx = uCursor.getInt(uCursor.getColumnIndex("width"));
                int intx1 = uCursor.getInt(uCursor.getColumnIndex("height"));
                objArray1 = new Object[]{p1.toString(),Long.valueOf(uCursor.getLong(uCursor.getColumnIndex("_id"))),str,DateUtils.a(uCursor.getLong(uCursor.getColumnIndex("date_added"))),DateUtils.a(uCursor.getLong(uCursor.getColumnIndex("date_modified"))),DateUtils.a(uCursor.getLong(uCursor.getColumnIndex("datetaken")))};
                Object[] objArray2 = new Object[0];
                a.B().w("ScreenshotMonitor", String.format("uri:%s id:%s data:%s dateAdded:%s dateModified:%s dateTaken:%s", objArray1), objArray2);
                this.d(p0);
                if (!uoa.e.b(str)) {
                   objArray1 = new Object[0];
                   a.B().w("ScreenshotMonitor", "dont pass path filter", objArray1);
                   if (!uCursor.isClosed()) {
                      uCursor.close();
                   }
                   return;
                }else if(!uoa.f.b(Integer.valueOf(intx), Integer.valueOf(intx1))){
                   objArray1 = new Object[0];
                   a.B().w("ScreenshotMonitor", "dont pass size filter", objArray1);
                   if (!uCursor.isClosed()) {
                      uCursor.close();
                   }
                   return;
                }else {
                   Object[] objArray3 = new Object[0];
                   a.B().w("ScreenshotMonitor", "post screenshot event", objArray3);
                   this.g();
                   if (RomUtils.s()) {
                      uoa.h.postDelayed(new e(uoa, uri, str), 500);
                   }else {
                      uoa.f(uri, str);
                   }
                   if (!uCursor.isClosed()) {
                      uCursor.close();
                   }
                label_01cb :
                   return;
                }
             }
          }catch(java.lang.Exception e0){
             Cursor uCursor1 = uCursor;
          }
          e0.printStackTrace();
          if (i1 && !i1.isClosed()) {
             i1.close();
             goto label_01cb ;
          }else {
             goto label_01cb ;
          }
       }catch(java.lang.Exception e0){
          goto label_01bd ;
       }
    }
    public final void d(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "7")) {
          return;
       }
       if (this.e == null) {
          this.e = new a();
       }
       if (this.f == null) {
          this.f = new b(p0);
       }
       return;
    }
    public final boolean e(){
       boolean b = (this.b != null && !this.a - -1)? true: false;
       return b;
    }
    public final void f(Uri p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "10")) {
          return;
       }
       if (this.c != null) {
          RxBus.f.b(new b(p0, p1));
       }
       RxBus.f.b(new ScreenshotUserEvent(p0, p1));
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "SCREEN_SHOTS";
       u1.B(new ClickMetaData().setElementPackage(uElementPack));
       return;
    }
    public void h(boolean p0){
       this.b = p0;
    }
    public void i(boolean p0){
       this.c = p0;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       if (this.e()) {
          this.l();
       }
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       if (this.e()) {
          c.a(new c(this));
       }
       return;
    }
    public synchronized final void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.a = System.currentTimeMillis();
       if (this.g == null) {
          HandlerThread handlerThrea = new HandlerThread("thread-screenshotmonitor", 10);
          this.g = handlerThrea;
          handlerThrea.start();
          this.h = new Handler(this.g.getLooper());
       }
       Application uApplication = a.b();
       a$c uoc = new a$c(this, uApplication, this.h);
       uApplication.getApplicationContext().getContentResolver().registerContentObserver(MediaStore$Images$Media.EXTERNAL_CONTENT_URI, true, uoc);
       return;
    }
}

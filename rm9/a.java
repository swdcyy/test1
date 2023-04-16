package rm9.a;
import rm9.a$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.app.PendingIntent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.os.Build$VERSION;
import java.lang.Boolean;
import crd.b;
import s7.b;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.kuaishou.android.model.music.Music;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat$Builder;
import java.lang.CharSequence;
import s2.a;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.core.app.NotificationCompat$j;
import android.content.pm.PackageManager;
import com.yxcorp.utility.RomUtils;
import android.app.NotificationChannel;
import android.app.Application;
import o56.a;
import android.content.IntentFilter;
import rm9.a$b;
import android.support.v4.media.session.MediaSessionCompat$b;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Long;
import rm9.a$c;
import io.reactivex.g;
import brd.t;
import t45.d;
import brd.z;
import rm9.a$d;
import erd.g;

public abstract class a	// class@00396f
{
    public int a;
    public Context b;
    public MediaSessionCompat c;
    public boolean d;
    public boolean e;
    public IntentFilter f;
    public b g;
    public long h;
    public final Context i;
    public static final a$a j;

    static {
       a.j = new a$a(null);
    }
    public void a(){
       super(null, 1, null);
    }
    public void a(Context p0){
       super();
       this.i = p0;
       this.e = true;
       this.j();
    }
    public void a(Context p0,int p1,u p2){
       super(null);
    }
    public static final Context a(a p0){
       p0 = p0.b;
       if (p0 == null) {
          a.S("mNotifyContext");
       }
       return p0;
    }
    public static void d(a p0,boolean p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = false;
       }
       p0.c(p1);
       return;
    }
    public static void u(a p0,long p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = 0;
       }
       p0.t(p1);
       return;
    }
    public final PendingIntent b(String p0){
       Intent obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Intent(p0);
       a tb = this.b;
       String str = "mNotifyContext";
       if (tb == null) {
          a.S(str);
       }
       Intent intent = obj.setPackage(tb.getPackageName());
       a.o(intent, "Intent\(type\).setPackage\(¡­otifyContext.packageName\)");
       int i = (Build$VERSION.SDK_INT > 23)? 0xc000000: 0x8000000;
       a tb1 = this.b;
       if (tb1 == null) {
          a.S(str);
       }
       a ta = this.a;
       this.a = ta + 1;
       return PendingIntent.getBroadcast(tb1, ta, intent, i);
    }
    public final void c(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "7")) {
          return;
       }
       uoa = this.g;
       if (uoa != null) {
          uoa.dispose();
       }
       this.e = false;
       if (this.d != null || p0) {
          int i = 0xe5ca1;
          try{
             b.b(i);
             a tb = this.b;
             if (tb == null) {
                a.S("mNotifyContext");
             }
             UniversalReceiver.f(tb, this.h());
             this.d = e0;
          }catch(java.lang.Exception e0){
          }
       }
    }
    public abstract Music e();
    public final NotificationCompat$Builder f(Music p0,Bitmap p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       NotificationCompat$Builder obj = PatchProxy.applyTwoRefs(p0, p1, this, uoa, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       a tb = this.b;
       if (tb == null) {
          a.S("mNotifyContext");
       }
       obj = new NotificationCompat$Builder(tb, "service_push_v1").setSmallIcon(R.drawable.arg_RES_7f081a36);
       Music mArtist = p0.mArtist;
       String str = "";
       if (mArtist == null) {
          mArtist = str;
       }
       obj = obj.setContentText(mArtist);
       p0 = p0.mName;
       if (p0 != null) {
          str = p0;
       }
       NotificationCompat$Builder uBuilder = obj.setContentTitle(str).setPriority(2).setLargeIcon(p1).addAction(R.drawable.arg_RES_7f080dd0, "Previous", this.b("com.yxcorp.gifshow.common_music_player.notification.previous"));
       int i = (this.m())? 0x7f080dd2: 0x7f080dcf;
       uBuilder = uBuilder.addAction(i, "Play", this.b("com.yxcorp.gifshow.common_music_player.notification.play")).addAction(R.drawable.arg_RES_7f080dce, "Next", this.b("com.yxcorp.gifshow.common_music_player.notification.next"));
       a uoa1 = new a();
       a tc = this.c;
       Object[] objArray = null;
       MediaSessionCompat$Token token = (tc != null)? tc.c(): objArray;
       uoa1.A(token);
       uoa1.B(new int[3]{0,1,2});
       uBuilder = uBuilder.setStyle(uoa1);
       Object[] objArray1 = PatchProxy.apply(objArray, this, uoa, "3");
       boolean b = false;
       if (objArray1 != patchProxyRe) {
       }else {
          uoa1 = this.b;
          if (uoa1 == null) {
             a.S("mNotifyContext");
          }
          PackageManager packageManag = uoa1.getPackageManager();
          if (packageManag != null) {
             a tb1 = this.b;
             if (tb1 == null) {
                a.S("mNotifyContext");
             }
             Intent launchIntent = packageManag.getLaunchIntentForPackage(tb1.getPackageName());
             if (launchIntent != null) {
                tb1 = this.b;
                if (tb1 == null) {
                   a.S("mNotifyContext");
                }
                objArray = PendingIntent.getActivity(tb1, b, launchIntent, b);
             }
          }
          objArray1 = objArray;
       }
       uBuilder = uBuilder.setContentIntent(objArray1).setShowWhen(b).setOnlyAlertOnce(true).setAutoCancel(b);
       if (!RomUtils.q()) {
          b = true;
       }
       uBuilder = uBuilder.setOngoing(b);
       a.o(uBuilder, "NotificationCompat.Build¡­|| BuildConfig.IS_NEBULA\)");
       return uBuilder;
    }
    public final long g(){
       return this.h;
    }
    public abstract BroadcastReceiver h();
    public final void i(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 26) {
          NotificationChannel notification = new NotificationChannel("service_push_v1", "MusicListPlayer", 4);
          notification.setLockscreenVisibility(1);
          b.c(notification);
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.i();
       a ti = this.i;
       if (ti == null) {
          ti = a.b();
          a.o(ti, "AppEnv.getAppContext\(\)");
       }
       this.b = ti;
       IntentFilter intentFilter = new IntentFilter();
       this.f = intentFilter;
       intentFilter.addAction("com.yxcorp.gifshow.common_music_player.notification.previous");
       intentFilter.addAction("com.yxcorp.gifshow.common_music_player.notification.play");
       String str = "com.yxcorp.gifshow.common_music_player.notification.next";
       try{
          intentFilter.addAction(str);
          a tb = this.b;
          if (tb == null) {
             a.S("mNotifyContext");
          }
          MediaSessionCompat mediaSession = new MediaSessionCompat(tb, "MusicListPlayerNotification");
          this.c = mediaSession;
          mediaSession.g(new a$b(this));
       }catch(java.lang.Exception e0){
          ExceptionHandler.handleCaughtException(e0);
       }
       return;
    }
    public abstract boolean k();
    public abstract long l();
    public abstract boolean m();
    public abstract void n();
    public abstract void o();
    public abstract void p();
    public abstract void q();
    public abstract void r();
    public abstract void s(long p0);
    public final void t(long p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, uoa, "6")) {
          return;
       }
       this.h = p0;
       Music music = this.e();
       a tg = this.g;
       if (tg != null) {
          tg.dispose();
       }
       if (music == null || (this.c == null || (this.k() && !music.isCopyrightRiskMusic()))) {
          this.e = true;
          this.g = t.create(new a$c(music)).subscribeOn(d.c).observeOn(d.a).subscribe(new a$d(this, music));
       }
    label_0058 :
       return;
    }
    public final void v(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       a tg = this.g;
       if (tg != null) {
          tg.dispose();
       }
       tg = this.c;
       if (tg != null) {
          tg.e();
       }
       return;
    }
}

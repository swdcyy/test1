package androidx.media.session.MediaButtonReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.support.v4.media.session.PlaybackStateCompat;
import android.content.Intent;
import java.lang.String;
import android.view.KeyEvent;
import android.os.Parcelable;
import android.content.pm.PackageManager;
import java.util.List;
import java.lang.Object;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import android.content.pm.ServiceInfo;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import android.os.Build$VERSION;
import com.kwai.plugin.dva.feature.core.hook.a;
import android.content.BroadcastReceiver$PendingResult;
import androidx.media.session.MediaButtonReceiver$a;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaBrowserCompat$b;
import android.os.Bundle;

public class MediaButtonReceiver extends BroadcastReceiver	// class@00084d
{

    public void MediaButtonReceiver(){
       super();
    }
    public static PendingIntent a(Context p0,long p1){
       ComponentName uComponentNa = MediaButtonReceiver.c(p0);
       if (uComponentNa == null) {
          return null;
       }
       return MediaButtonReceiver.b(p0, uComponentNa, p1);
    }
    public static PendingIntent b(Context p0,ComponentName p1,long p2){
       int i = PlaybackStateCompat.g(p2);
       if (!i) {
          return null;
       }
       Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
       intent.setComponent(p1);
       intent.putExtra("android.intent.extra.KEY_EVENT", new KeyEvent(0, i));
       return PendingIntent.getBroadcast(p0, i, intent, 0);
    }
    public static ComponentName c(Context p0){
       Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
       intent.setPackage(p0.getPackageName());
       int i = 0;
       List list = p0.getPackageManager().queryBroadcastReceivers(intent, i);
       if (list.size() == 1) {
          ResolveInfo activityInfo = list.get(i).activityInfo;
          return new ComponentName(activityInfo.packageName, activityInfo.name);
       }else {
          list.size();
          return null;
       }
    }
    public static ComponentName d(Context p0,String p1){
       Intent intent = new Intent(p1);
       intent.setPackage(p0.getPackageName());
       int i = 0;
       List list = p0.getPackageManager().queryIntentServices(intent, i);
       if (list.size() == 1) {
          ResolveInfo serviceInfo = list.get(i).serviceInfo;
          return new ComponentName(serviceInfo.packageName, serviceInfo.name);
       }else if(list.isEmpty()){
          return null;
       }else {
          throw new IllegalStateException("Expected 1 service that handles "+p1+", found "+list.size());
       }
    }
    public static void e(Context p0,Intent p1){
       if (Build$VERSION.SDK_INT >= 26) {
          a.d(p0, p1);
       }else {
          a.e(p0, p1);
       }
       return;
    }
    public void onReceive(Context p0,Intent p1){
       if (p1 != null) {
          String str = "android.intent.action.MEDIA_BUTTON";
          if (str.equals(p1.getAction()) && p1.hasExtra("android.intent.extra.KEY_EVENT")) {
             ComponentName uComponentNa = MediaButtonReceiver.d(p0, str);
             if (uComponentNa != null) {
                p1.setComponent(uComponentNa);
                MediaButtonReceiver.e(p0, p1);
                return;
             }else {
                uComponentNa = MediaButtonReceiver.d(p0, "android.media.browse.MediaBrowserService");
                if (uComponentNa != null) {
                   p0 = p0.getApplicationContext();
                   MediaButtonReceiver$a uoa = new MediaButtonReceiver$a(p0, p1, this.goAsync());
                   MediaBrowserCompat mediaBrowser = new MediaBrowserCompat(p0, uComponentNa, uoa, null);
                   uoa.f(mediaBrowser);
                   mediaBrowser.a();
                   return;
                }else {
                   throw new IllegalStateException("Could not find any Service that handles android.intent.action.MEDIA_BUTTON or implements a media browser service.");
                }
             }
          }
       }
       "Ignore unsupported intent: "+p1;
       return;
    }
}

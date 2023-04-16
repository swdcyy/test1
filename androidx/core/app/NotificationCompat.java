package androidx.core.app.NotificationCompat;
import android.app.Notification;
import android.os.Build$VERSION;
import androidx.core.app.NotificationCompat$e;
import android.app.Notification$BubbleMetadata;
import java.lang.String;
import java.lang.CharSequence;
import android.os.Bundle;
import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;
import androidx.core.app.NotificationCompat$b;
import androidx.core.app.d;
import java.lang.Object;
import m1.a;
import android.content.LocusId;

public class NotificationCompat	// class@0006f0
{
    public static final int a = 128;
    public static final String b = "android.people";

    public static int A(Notification p0){
       return p0.visibility;
    }
    public static boolean B(Notification p0){
       boolean b = (p0.flags & 0x0200)? true: false;
       return b;
    }
    public static boolean a(Notification p0){
       if (Build$VERSION.SDK_INT >= 29) {
          return p0.getAllowSystemGeneratedContextualActions();
       }
       return false;
    }
    public static boolean b(Notification p0){
       boolean b = (p0.flags & 0x10)? true: false;
       return b;
    }
    public static int c(Notification p0){
       if (Build$VERSION.SDK_INT >= 26) {
          return p0.getBadgeIconType();
       }
       return 0;
    }
    public static NotificationCompat$e d(Notification p0){
       if (Build$VERSION.SDK_INT >= 29) {
          return NotificationCompat$e.a(p0.getBubbleMetadata());
       }
       return null;
    }
    public static String e(Notification p0){
       return p0.category;
    }
    public static String f(Notification p0){
       if (Build$VERSION.SDK_INT >= 26) {
          return p0.getChannelId();
       }
       return null;
    }
    public static int g(Notification p0){
       return p0.color;
    }
    public static CharSequence h(Notification p0){
       return p0.extras.getCharSequence("android.infoText");
    }
    public static CharSequence i(Notification p0){
       return p0.extras.getCharSequence("android.text");
    }
    public static CharSequence j(Notification p0){
       return p0.extras.getCharSequence("android.title");
    }
    public static Bundle k(Notification p0){
       return p0.extras;
    }
    public static String l(Notification p0){
       return p0.getGroup();
    }
    public static boolean m(Notification p0){
       boolean b = (p0.flags & 0x0080)? true: false;
       return b;
    }
    public static List n(Notification p0){
       ArrayList uArrayList = new ArrayList();
       Bundle bundle = p0.extras.getBundle("android.car.EXTENSIONS");
       if (bundle == null) {
          return uArrayList;
       }
       bundle = bundle.getBundle("invisible_actions");
       if (bundle != null) {
          for (int i = 0; i < bundle.size(); i = i + 1) {
             uArrayList.add(d.c(bundle.getBundle(Integer.toString(i))));
          }
       }
       return uArrayList;
    }
    public static boolean o(Notification p0){
       boolean b = (p0.flags & 0x0100)? true: false;
       return b;
    }
    public static a p(Notification p0){
       a uoa;
       if (Build$VERSION.SDK_INT >= 29) {
          LocusId locusId = p0.getLocusId();
          if (locusId != null) {
             uoa = a.d(locusId);
          label_0013 :
             return uoa;
          }
       }
       uoa = null;
       goto label_0013 ;
    }
    public static boolean q(Notification p0){
       boolean b = (p0.flags & 0x02)? true: false;
       return b;
    }
    public static boolean r(Notification p0){
       boolean b = (p0.flags & 0x08)? true: false;
       return b;
    }
    public static Notification s(Notification p0){
       return p0.publicVersion;
    }
    public static CharSequence t(Notification p0){
       if (Build$VERSION.SDK_INT >= 26) {
          return p0.getSettingsText();
       }
       return null;
    }
    public static String u(Notification p0){
       if (Build$VERSION.SDK_INT >= 26) {
          return p0.getShortcutId();
       }
       return null;
    }
    public static boolean v(Notification p0){
       return p0.extras.getBoolean("android.showWhen");
    }
    public static String w(Notification p0){
       return p0.getSortKey();
    }
    public static CharSequence x(Notification p0){
       return p0.extras.getCharSequence("android.subText");
    }
    public static long y(Notification p0){
       if (Build$VERSION.SDK_INT >= 26) {
          return p0.getTimeoutAfter();
       }
       return 0;
    }
    public static boolean z(Notification p0){
       return p0.extras.getBoolean("android.showChronometer");
    }
}

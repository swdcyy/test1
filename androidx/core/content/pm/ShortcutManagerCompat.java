package androidx.core.content.pm.ShortcutManagerCompat;
import java.lang.Object;
import android.content.Context;
import androidx.core.content.pm.a;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import android.content.Intent;
import android.os.Build$VERSION;
import android.content.pm.ShortcutManager;
import java.lang.Class;
import android.content.pm.ShortcutInfo;
import androidx.core.content.pm.b;
import java.lang.ClassLoader;
import java.lang.String;
import java.lang.reflect.Method;
import androidx.core.content.pm.b$a;
import androidx.core.content.ContextCompat;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.IntentSender;
import androidx.core.content.pm.ShortcutManagerCompat$1;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.os.Bundle;

public class ShortcutManagerCompat	// class@000710
{
    public static b a;

    public void ShortcutManagerCompat(){
       super();
    }
    public static boolean a(Context p0,a p1){
       a i = p1.i;
       if (i == null) {
          return false;
       }
       IconCompat a = i.a;
       if (a != 6 && a != 4) {
          return true;
       }
       InputStream inputStream = i.C(p0);
       if (inputStream == null) {
          return false;
       }
       Bitmap uBitmap = BitmapFactory.decodeStream(inputStream);
       if (uBitmap == null) {
          return false;
       }
       IconCompat iconCompat = (a == 6)? IconCompat.k(uBitmap): IconCompat.n(uBitmap);
       p1.i = iconCompat;
       return true;
    }
    public static void b(Context p0,List p1){
       Iterator iterator = new ArrayList(p1).iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (!ShortcutManagerCompat.a(p0, uoa)) {
             p1.remove(uoa);
          }
       }
       return;
    }
    public static Intent c(Context p0,a p1){
       Intent intent = (Build$VERSION.SDK_INT >= 26)? p0.getSystemService(ShortcutManager.class).createShortcutResultIntent(p1.f()): null;
       if (intent == null) {
          intent = new Intent();
       }
       p1.a(intent);
       return intent;
    }
    public static b d(Context p0){
       if (ShortcutManagerCompat.a == null) {
          if (Build$VERSION.SDK_INT >= 23) {
             try{
                Class[] uClassArray = new Class[]{Context.class};
                Object[] objArray = new Object[]{p0};
                ShortcutManagerCompat.a = Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, ShortcutManagerCompat.class.getClassLoader()).getMethod("getInstance", uClassArray).invoke(null, objArray);
             }catch(java.lang.Exception e0){
             }
          }
       }
    label_003e :
       return ShortcutManagerCompat.a;
    }
    public static boolean e(Context p0){
       ActivityInfo permission;
       if (Build$VERSION.SDK_INT >= 26) {
          return p0.getSystemService(ShortcutManager.class).isRequestPinShortcutSupported();
       }
       if (ContextCompat.checkSelfPermission(p0, "com.android.launcher.permission.INSTALL_SHORTCUT")) {
          return false;
       }
       Iterator iterator = p0.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), false).iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          permission = iterator.next().activityInfo.permission;
          if (TextUtils.isEmpty(permission) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(permission)) {
             break ;
          }
       }
       return true;
    }
    public static boolean f(Context p0,a p1,IntentSender p2){
       if (Build$VERSION.SDK_INT >= 26) {
          return p0.getSystemService(ShortcutManager.class).requestPinShortcut(p1.f(), p2);
       }
       if (!ShortcutManagerCompat.e(p0)) {
          return false;
       }
       Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
       p1.a(intent);
       if (p2 == null) {
          p0.sendBroadcast(intent);
          return true;
       }else {
          p0.sendOrderedBroadcast(intent, null, new ShortcutManagerCompat$1(p2), null, -1, null, null);
          return true;
       }
    }
    public static boolean g(Context p0,List p1){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT <= 29) {
          ShortcutManagerCompat.b(p0, p1);
       }
       if (sDK_INT >= 25) {
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = p1.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next().f());
          }
          if (!p0.getSystemService(ShortcutManager.class).updateShortcuts(uArrayList)) {
             return false;
          }
       }
       ShortcutManagerCompat.d(p0).a(p1);
       return true;
    }
}

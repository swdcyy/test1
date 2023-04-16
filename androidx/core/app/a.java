package androidx.core.app.a;
import androidx.core.content.ContextCompat;
import android.app.Activity;
import androidx.core.app.a$d;
import android.os.Build$VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.a$b;
import java.lang.Runnable;
import l1.b;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Object;
import java.util.Arrays;
import androidx.core.app.a$e;
import androidx.core.app.a$c;
import androidx.core.app.a$a;
import androidx.core.app.g;
import androidx.core.app.a$f;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.os.Bundle;
import android.content.IntentSender;

public class a extends ContextCompat	// class@0006fb
{
    public static a$d a;

    public static void a(Activity p0){
       p0.finishAffinity();
    }
    public static void b(Activity p0){
       p0.finishAfterTransition();
    }
    public static a$d c(){
       return a.a;
    }
    public static void d(Activity p0){
       p0.postponeEnterTransition();
    }
    public static void e(Activity p0){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 28) {
          p0.recreate();
       }else if(sDK_INT <= 23){
          new Handler(p0.getMainLooper()).post(new a$b(p0));
       }else if(!b.i(p0)){
          p0.recreate();
       }
       return;
    }
    public static void f(Activity p0,String[] p1,int p2){
       a$d a = a.a;
       if (a != null && a.a(p0, p1, p2)) {
          return;
       }
       int len = p1.length;
       int i = 0;
       while (true) {
          if (i < len) {
             if (!TextUtils.isEmpty(p1[i])) {
                i = i + 1;
             }else {
                throw new IllegalArgumentException("Permission request for permissions "+Arrays.toString(p1)+" must not contain null or empty values");
             }
          }else if(Build$VERSION.SDK_INT >= 23){
             if (p0 instanceof a$e) {
                p0.validateRequestPermissionsRequestCode(p2);
             }
             p0.requestPermissions(p1, p2);
             break ;
          }else if(p0 instanceof a$c){
             new Handler(Looper.getMainLooper()).post(new a$a(p1, p0, p2));
             break ;
          }
          break ;
       }
       return;
    }
    public static void g(Activity p0,g p1){
       a$f uof = (p1 != null)? new a$f(p1): null;
       p0.setEnterSharedElementCallback(uof);
       return;
    }
    public static void h(Activity p0,g p1){
       a$f uof = (p1 != null)? new a$f(p1): null;
       p0.setExitSharedElementCallback(uof);
       return;
    }
    public static boolean i(Activity p0,String p1){
       if (Build$VERSION.SDK_INT >= 23) {
          return p0.shouldShowRequestPermissionRationale(p1);
       }
       return false;
    }
    public static void j(Activity p0,Intent p1,int p2,Bundle p3){
       p0.startActivityForResult(p1, p2, p3);
    }
    public static void k(Activity p0,IntentSender p1,int p2,Intent p3,int p4,int p5,int p6,Bundle p7){
       p0.startIntentSenderForResult(p1, p2, p3, p4, p5, p6, p7);
    }
    public static void l(Activity p0){
       p0.startPostponedEnterTransition();
    }
}

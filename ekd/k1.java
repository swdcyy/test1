package ekd.k1;
import android.os.Handler;
import android.os.Looper;
import java.util.Random;
import java.lang.System;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.IllegalStateException;
import java.util.Locale;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.Runnable;
import ekd.e0;
import android.os.Message;

public class k1	// class@00155c
{
    public static final Handler a;
    public static final Random b;

    static {
       k1.a = new Handler(Looper.getMainLooper());
       k1.b = new Random(System.currentTimeMillis());
    }
    public void k1(){
       super();
    }
    public static Object a(Object p0){
       k1.b(p0, "");
       return p0;
    }
    public static Object b(Object p0,String p1){
       Objects.requireNonNull(p0, p1);
       return p0;
    }
    public static void c(){
       if (!k1.g()) {
          return;
       }
       throw new IllegalStateException("This method cannot be called from the UI thread.");
    }
    public static void d(){
       if (k1.g()) {
          return;
       }
       throw new IllegalStateException("This method must be called from the UI thread.");
    }
    public static String e(){
       String language = Locale.getDefault().getLanguage();
       String country = Locale.getDefault().getCountry();
       if (!TextUtils.isEmpty(country)) {
          language = language+"-"+country.toLowerCase();
       }
       return language;
    }
    public static boolean f(){
       return ("zh").equalsIgnoreCase(Locale.getDefault().getLanguage());
    }
    public static boolean g(){
       boolean b = (Looper.myLooper() == Looper.getMainLooper())? true: false;
       return b;
    }
    public static boolean h(){
       return ("zh").equals(Locale.getDefault().getLanguage());
    }
    public static long i(){
       return System.currentTimeMillis();
    }
    public static long j(){
       return k1.b.nextLong();
    }
    public static long k(long p0){
       return ThreadLocalRandom.current().nextLong(p0);
    }
    public static boolean l(float p0){
       boolean b = (k1.b.nextFloat() - p0 < 0)? true: false;
       return b;
    }
    public static void m(Runnable p0){
       k1.a.removeCallbacks(p0);
    }
    public static void n(Object p0){
       if (e0.a) {
          k1.a(p0);
       }
       k1.a.removeCallbacksAndMessages(p0);
       return;
    }
    public static void o(Runnable p0){
       if (Looper.getMainLooper() == Looper.myLooper()) {
          p0.run();
       }else {
          k1.a.post(p0);
       }
       return;
    }
    public static void p(Runnable p0,Object p1){
       k1.s(p0, p1, 0);
    }
    public static void q(Runnable p0){
       if (Looper.getMainLooper() == Looper.myLooper()) {
          p0.run();
       }else {
          k1.a.postAtFrontOfQueue(p0);
       }
       return;
    }
    public static void r(Runnable p0,long p1){
       k1.a.postDelayed(p0, p1);
    }
    public static void s(Runnable p0,Object p1,long p2){
       Handler a = k1.a;
       Message message = Message.obtain(a, p0);
       message.obj = p1;
       a.sendMessageDelayed(message, p2);
    }
    public static long t(long p0){
       return (System.currentTimeMillis() - p0);
    }
}

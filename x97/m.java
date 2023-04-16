package x97.m;
import x97.n;
import java.lang.String;
import x97.k;
import java.util.List;
import c97.d;
import h97.g;
import java.util.ArrayList;
import java.lang.Object;
import java.util.Map;
import okhttp3.OkHttpClient$Builder;

public final class m	// class@0027d4
{

    public static String a(n p0){
       return null;
    }
    public static boolean b(n p0){
       return true;
    }
    public static k c(n p0){
       return new k();
    }
    public static List d(n p0){
       return null;
    }
    public static List e(n p0){
       ArrayList uArrayList;
       if (d.a().b().isTestMode()) {
          uArrayList = new ArrayList();
          uArrayList.add("zt.test.gifshow.com");
          return uArrayList;
       }else {
          uArrayList = new ArrayList();
          uArrayList.add("api.kuaishouzt.com");
          uArrayList.add("api.kwaizt.com");
          return uArrayList;
       }
    }
    public static void f(n p0,String p1,Map p2){
    }
    public static void g(n p0,OkHttpClient$Builder p1){
    }
    public static boolean h(n p0){
       return true;
    }
    public static boolean i(n p0){
       boolean b = (!d.a().j() && !d.a().i())? true: false;
       return b;
    }
}

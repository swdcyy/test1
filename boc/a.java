package boc.a;
import boc.b;
import java.io.File;
import java.lang.String;
import qkd.b;
import doc.a;
import com.yxcorp.gifshow.util.resource.response.YlabModelConfigResponse$ModelConfig$DiffInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import java.io.FilenameFilter;
import java.lang.Object;
import ekd.j;
import boc.b0;
import qfc.a;
import q87.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public final class a	// class@000439
{

    static {
    }
    public static void a(b p0){
       File uFile = new File(p0.getResourceDir());
       if (uFile.exists()) {
          b.q(uFile);
       }
       return;
    }
    public static YlabModelConfigResponse$ModelConfig$DiffInfo b(b p0,a p1){
       return null;
    }
    public static String c(b p0,String p1){
       if (!TextUtils.x(p1)) {
          int i = 47;
          if (p1.lastIndexOf(i) != -1) {
             p1 = p1.substring((p1.lastIndexOf(i) + 1));
          label_001c :
             if (p0.useYcnnModelConfig()) {
                p1 = p0.getResourceDir()+p1;
             }
             return p1;
          }
       }
       p1 = "";
       goto label_001c ;
    }
    public static boolean d(b p0,File p1){
       boolean b = (!p1.exists() || j.h(p1.listFiles(b.c0)))? true: false;
       return b;
    }
    public static boolean e(b p0){
       return true;
    }
    public static boolean f(b p0){
       return new File(p0.getResourceDir()).exists();
    }
    public static void g(b p0,boolean p1){
       b0.e(p0.getResourceName(), p1);
    }
    public static void h(b p0,String p1){
       p1 = p0.d(p1);
       String resourceName = p0.getResourceName();
       try{
          SharedPreferences a = b0.a;
          Object[] objArray = new Object[0];
          a.C().w("CategoryPreference", "setConfig "+resourceName+" "+p1, objArray);
          g.a(b0.a.edit().putString(resourceName, p1));
       }catch(java.lang.Exception e6){
          PostUtils.D("ks://"+resourceName, "writeError", e6);
       }
       return;
    }
    public static void i(b p0,boolean p1){
       String str = p0.getResourceName()+"is_incremental";
       try{
          Object[] objArray = new Object[0];
          a.C().D("CategoryPreference", "[yModel][keypath][check] ", "setIncrementalFlag "+str+" "+p1, objArray);
          g.a(b0.a.edit().putBoolean(str, p1));
       }catch(java.lang.Exception e7){
          PostUtils.D("ks://"+str, "writeError", e7);
       }
       return;
    }
    public static boolean j(b p0,a p1){
       return false;
    }
    public static boolean k(b p0){
       return false;
    }
    public static boolean l(File p0,String p1){
       return a.m(p0, p1);
    }
    public static boolean m(File p0,String p1){
       return ((".nomedia").equals(p1) ^ 0x01);
    }
}

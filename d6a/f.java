package d6a.f;
import d6a.g;
import zva.a;
import androidx.fragment.app.Fragment;
import java.lang.String;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import k2b.k0;
import java.lang.Throwable;
import android.util.Log;
import java.lang.Object;
import q87.c;

public final class f	// class@001e9a
{

    public static void a(g p0,a p1){
    }
    public static String b(Fragment p0){
       if (p0 == null) {
          return String.valueOf(System.currentTimeMillis());
       }
       return p0.hashCode()+"#"+System.currentTimeMillis();
    }
    public static int c(String p0){
       if (TextUtils.x(p0)) {
          return 0;
       }
       String[] stringArray = p0.split("#");
       if (stringArray.length != 2) {
          return 0;
       }
       try{
          return Integer.parseInt(stringArray[0]);
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[v1];
          k0.C().t("SlidePlayDataFetcher", Log.getStackTraceString(e4), objArray);
          return v1;
       }
    }
}

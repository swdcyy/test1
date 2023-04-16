package wnc.a;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.net.NetworkInfo;
import com.yxcorp.utility.SystemUtil;
import java.util.Map;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Iterator;
import java.lang.Object;
import java.util.Map$Entry;

public final class a	// class@00276f
{

    public static boolean a(){
       NetworkInfo networkInfo = SystemUtil.c(a.a().a());
       boolean b = (networkInfo != null && networkInfo.isConnected())? true: false;
       return b;
    }
    public static String b(Map p0){
       if (p0.isEmpty()) {
          return "";
       }
       StringBuilder str = "";
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          str = str+uEntry.getKey()+'='+uEntry.getValue()+';';
       }
       str.deleteCharAt((str.length() - 1));
       return str;
    }
}

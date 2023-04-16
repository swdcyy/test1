package ag6.a;
import java.lang.Throwable;
import com.google.common.base.b;
import android.content.Context;
import java.lang.RuntimeException;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.lang.CharSequence;
import android.content.res.Resources$Theme;
import java.lang.Object;
import com.kwai.performance.stability.hack.a;
import java.lang.Integer;
import java.lang.StringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;

public class a	// class@00009d
{

    public static Throwable a(Throwable p0){
       try{
          return b.c(p0);
       }catch(java.lang.IllegalArgumentException e0){
          return null;
       }
    }
    public static RuntimeException b(Context p0,int p1,RuntimeException p2){
       Throwable throwable = a.a(p2);
       if (!throwable instanceof UnsupportedOperationException || (throwable.getMessage() == null || !(throwable.getMessage()).contains("Failed to resolve attribute at index"))) {
          return p2;
       }
       Resources$Theme theme = p0.getTheme();
       int i = 0;
       if (theme != null) {
          try{
             Object[] objArray = new Object[i];
             i = a.a(theme, "getAppliedStyleResId", objArray).intValue();
          }catch(java.lang.Exception e0){
             i = -1;
          }
       }
    }
    public static View c(LayoutInflater p0,int p1,ViewGroup p2,boolean p3){
       try{
          return p0.inflate(p1, p2, p3);
       }catch(java.lang.RuntimeException e2){
          throw a.b(p0.getContext(), p1, e2);
       }
    }
}

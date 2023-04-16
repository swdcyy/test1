package mg.r1;
import f55.a;
import java.lang.Object;
import p55.a;
import java.lang.String;
import f55.g;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import java.lang.Class;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import com.google.gson.Gson;
import java.lang.NullPointerException;
import mg.r1$a;
import java.lang.Runnable;
import ekd.k1;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;

public abstract class r1 implements a	// class@002656
{

    public void r1(){
       super();
    }
    public final void a(a p0,String p1,g p2){
       Gson a;
       try{
          a.p(p0, "context");
          a.p(p1, "paramsStr");
          Object obj = null;
          if (!TextUtils.x(p1)) {
             a = a.a;
             Type genericSuper = this.getClass().getGenericSuperclass();
             if (genericSuper != null) {
                obj = a.i(p1, genericSuper.getActualTypeArguments()[1]);
             }else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
             }
          }
          k1.o(new r1$a(this, p0, obj, p2));
          return;
       }catch(java.lang.RuntimeException e0){
       }
    }
    public void b(g p0,int p1,String p2){
       if (p0 == null) {
          return;
       }
       p0.a(p1, p2, null);
       return;
    }
    public final Activity c(a p0){
       Context context;
       a.p(p0, "context");
       context = p0.getContext();
       if (context instanceof Activity) {
          return context;
       }
       return null;
    }
    public abstract String d();
    public abstract void e(a p0,Object p1,g p2);
    public final boolean f(Activity p0){
       boolean b = (p0 != null && !p0.isFinishing())? true: false;
       return b;
    }
}

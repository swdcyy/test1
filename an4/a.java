package an4.a;
import f55.a;
import java.lang.Object;
import p55.a;
import java.lang.String;
import f55.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import com.google.gson.Gson;
import java.lang.NullPointerException;
import an4.a$a;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Integer;
import android.os.Bundle;
import com.kwai.yoda.function.FunctionResultParams;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import java.lang.Boolean;

public abstract class a implements a	// class@0000a0
{

    public void a(){
       super();
    }
    public final void a(a p0,String p1,g p2){
       Gson a;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "1")) {
          return;
       }
       try{
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
          k1.o(new a$a(this, p0, obj, p2));
          return;
       }catch(java.lang.RuntimeException e0){
       }
    }
    public void b(g p0,int p1,String p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "6")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.a(p1, p2, null);
       return;
    }
    public void c(g p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.onSuccess(p1);
       return;
    }
    public void d(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       FunctionResultParams uFunctionRes = new FunctionResultParams();
       uFunctionRes.mResult = 1;
       p0.onSuccess(uFunctionRes);
       return;
    }
    public final Activity e(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Context context = p0.getContext();
       if (context instanceof Activity) {
          return context;
       }
       return null;
    }
    public abstract String f();
    public abstract void g(a p0,Object p1,g p2);
    public final boolean h(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 != null && !p0.isFinishing())? true: false;
       return b;
    }
}

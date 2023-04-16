package com.yxcorp.gifshow.gamecenter.api.pluginimpl.a;
import java.lang.reflect.InvocationHandler;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import xka.a;
import xka.b;
import com.smile.gifshow.annotation.plugin.a;
import java.lang.Boolean;
import java.lang.Void;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import java.lang.ref.WeakReference;
import tka.e;
import java.util.Objects;
import tka.c;
import java.util.List;
import java.lang.Integer;

public class a implements InvocationHandler	// class@0012af
{

    public void a(){
       super();
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       int this;
       e a;
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       Log.b("GameCenterPluginInvocationHandler", "invoke "+p1.getName());
       if (!(p1.getName()).equals("initialize")) {
          p0 = p1.getReturnType();
          boolean b = p1.isAnnotationPresent(a.class);
          boolean b1 = p1.isAnnotationPresent(b.class);
          this = 0;
          if (a.b(p0) || a.a(p0)) {
             return Integer.valueOf(this);
          }else if(p0 == Boolean.TYPE || p0 == Boolean.class){
             return Boolean.FALSE;
          }else if(p0 == String.class){
             return "";
          }else if(p0 != Void.TYPE && (p0 == Void.class || b1)){
             if (p2 != null && p2.length > 0) {
                while (this < p2.length) {
                   p0 = p2[this];
                   if (p0 instanceof Fragment || p0 instanceof Activity) {
                      p2[this] = new WeakReference(p0);
                   }
                   this++;
                }
             }
             p0 = e.a();
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoidTwoRefs(p1, p2, p0, e.class, "5")) {
                a = p0.a;
                _monitor_enter(a);
                p0.a.add(new c(p1, p2));
                _monitor_exit(a);
             }
             if (b) {
                e.a().b(true, b1);
             }
          }
       }
       return null;
    }
}

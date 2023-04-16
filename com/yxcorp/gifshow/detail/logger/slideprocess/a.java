package com.yxcorp.gifshow.detail.logger.slideprocess.a;
import com.yxcorp.gifshow.detail.logger.slideprocess.a$a;
import java.lang.reflect.Type;
import el.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import s1a.a;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import uw9.c;
import android.content.SharedPreferences;
import km8.b;
import s1a.c;
import java.lang.Runnable;
import t45.c;
import java.util.HashMap;
import java.util.Collections;
import s1a.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class a	// class@001577
{
    public Map a;
    public static final Type b;

    static {
       a.b = new a$a().getType();
    }
    public void a(){
       super();
    }
    public void a(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
          return;
       }
       if (this.b()) {
          a.E("log manager has init");
          return;
       }else {
          _monitor_enter(this);
          if (this.b()) {
             a.E("log manager has init");
             _monitor_exit(this);
             return;
          }else {
             Object[] objArray1 = PatchProxy.apply(objArray, this, uoa, "5");
             if (objArray1 != PatchProxyResult.class) {
             }else {
                Type b = a.b;
                String str = c.a.getString("slideProcessInfo", "");
                if (str != null && str != "") {
                   objArray = b.a(str, b);
                }
                objArray1 = objArray;
             }
             if (objArray1 == null || (!objArray1.isEmpty() && (!PatchProxy.applyVoidOneRefs(objArray1, this, uoa, "2") && !objArray1.isEmpty()))) {
                c.a(new c(objArray1));
             }
          label_006c :
             this.a = Collections.synchronizedMap(new HashMap());
             this.d();
             a.E("log manager init  completed");
             _monitor_exit(this);
             return;
          }
       }
    }
    public final boolean b(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public void c(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       if (!TextUtils.x(p0) && p1 != null) {
          if (!this.b()) {
             this.a();
          }
          this.a.put(p0, p1);
          this.d();
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putString("slideProcessInfo", b.e(this.a));
       g.a(uEditor);
       return;
    }
}

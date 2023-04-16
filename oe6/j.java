package oe6.j;
import km8.a;
import oe6.k;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.lang.reflect.Type;
import android.content.SharedPreferences;
import oe6.n;
import java.lang.Integer;
import android.app.Application;
import o56.a;
import android.content.Context;
import vid.b;
import com.kwai.framework.model.user.QCurrentUser;

public class j implements a	// class@002018
{
    public SharedPreferences a;
    public final k b;

    public void j(k p0){
       this.b = p0;
       super();
    }
    public String a(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return a.a.q(p0);
    }
    public Object b(String p0,Type p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a.i(p0, p1);
    }
    public Object c(String p0){
       j oj = PatchProxy.applyOneRefs(p0, this, j.class, "1");
       if (oj != PatchProxyResult.class) {
       }else if(this.a == null){
          this.a = n.b();
       }
       oj = this.a;
       return oj;
    }
    public Object d(String p0,int p1){
       SharedPreferences sharedPrefer;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          sharedPrefer = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oj, "2");
          if (sharedPrefer != PatchProxyResult.class) {
          label_0021 :
             return sharedPrefer;
          }
       }
       sharedPrefer = b.c(a.b(), p0, p1);
       goto label_0021 ;
    }
    public String e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (("user").equals(p0) && QCurrentUser.ME != null) {
          return QCurrentUser.ME.getId();
       }
       return "";
    }
}

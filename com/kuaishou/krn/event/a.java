package com.kuaishou.krn.event.a;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.krn.event.a$a;
import com.kuaishou.krn.event.a$b;
import java.lang.String;
import oj0.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Map;

public class a	// class@00086c
{
    public final Map a;
    public b b;

    public void a(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public void a(a$a p0){
       super();
       this.a = new ConcurrentHashMap();
    }
    public static a b(){
       return a$b.a;
    }
    public boolean a(String p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0) || p1 == null) {
          return false;
       }
       this.a.put(p0, p1);
       return true;
    }
    public boolean c(String p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.isEmpty(p0) || p1 == null) {
          return false;
       }
       this.a.remove(p0);
       return true;
    }
}

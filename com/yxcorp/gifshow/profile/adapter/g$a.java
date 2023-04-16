package com.yxcorp.gifshow.profile.adapter.g$a;
import im8.g;
import k2b.t2$a;
import io.reactivex.subjects.PublishSubject;
import xl8.b;
import jv6.b;
import java.lang.Object;
import com.yxcorp.gifshow.profile.adapter.g$a$a;
import com.yxcorp.gifshow.profile.adapter.g$a$b;
import v1c.e;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.adapter.f;
import java.util.Map;
import java.util.HashMap;

public class g$a implements g	// class@00120e
{
    public t2$a b;
    public e c;
    public e d;
    public o e;
    public final b f;

    public void g$a(t2$a p0,PublishSubject p1,PublishSubject p2,b p3,b p4){
       super();
       this.f = p4;
       this.b = p0;
       this.c = new g$a$a(this, p1, p3);
       this.d = new g$a$b(this, p2, p3);
       this.e = new e(this);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, g$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(g$a.class, new f());
       }else {
          obj.put(g$a.class, null);
       }
       return obj;
    }
}

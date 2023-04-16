package com.yxcorp.gifshow.relation.user.adapter.e$b;
import im8.g;
import com.yxcorp.gifshow.relation.user.base.UserListFragment;
import java.lang.Object;
import zbc.c;
import zbc.d;
import nu7.a;
import ok.h;
import com.yxcorp.gifshow.relation.user.adapter.f;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.user.adapter.k;
import java.util.Map;
import java.util.HashMap;

public class e$b implements g	// class@0019ef
{
    public d b;
    public c c;
    public a d;

    public void e$b(UserListFragment p0){
       super();
       this.c = p0.Kh();
       this.b = p0.Mh();
       this.d = new a(p0.Oh(), null);
    }
    public void e$b(c p0){
       super();
       this.c = p0;
       this.b = f.a;
       this.d = new a(false, null);
    }
    public void e$b(c p0,d p1,boolean p2){
       super();
       this.c = p0;
       this.b = p1;
       this.d = new a(p2, null);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e$b.class, new k());
       }else {
          obj.put(e$b.class, null);
       }
       return obj;
    }
}

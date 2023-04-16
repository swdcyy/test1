package com.yxcorp.gifshow.relation.select.SelectUsersActivity$a;
import im8.g;
import java.lang.Object;
import mrd.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.select.u;
import java.util.Map;
import java.util.HashMap;

public class SelectUsersActivity$a implements g	// class@001983
{
    public c b;
    public c c;
    public c d;
    public c e;
    public c f;
    public c g;
    public c h;

    public void SelectUsersActivity$a(){
       super();
       this.b = a.g();
       this.c = a.g();
       this.d = a.g();
       this.e = a.g();
       this.f = a.g();
       this.g = a.g();
       this.h = a.g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SelectUsersActivity$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, SelectUsersActivity$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(SelectUsersActivity$a.class, new u());
       }else {
          obj.put(SelectUsersActivity$a.class, null);
       }
       return obj;
    }
}

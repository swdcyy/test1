package com.yxcorp.gifshow.relation.select.v$a;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.select.h;
import java.util.Map;
import java.util.HashMap;

public class v$a implements g	// class@0019c6
{
    public User b;
    public int c;
    public v d;
    public b e;
    public b f;
    public String g;

    public void v$a(){
       super();
       this.g = "";
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, v$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(v$a.class, new h());
       }else {
          obj.put(v$a.class, null);
       }
       return obj;
    }
}

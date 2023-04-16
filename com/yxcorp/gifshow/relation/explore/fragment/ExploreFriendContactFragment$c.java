package com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment$c;
import im8.g;
import dac.b;
import zbc.c;
import java.lang.Object;
import java.util.Objects;
import dac.j;
import xwb.c;
import nu7.a;
import ok.h;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.relation.explore.fragment.h;
import java.util.Map;
import java.util.HashMap;

public class ExploreFriendContactFragment$c implements g	// class@0017ff
{
    public final b b;
    public c c;
    public d d;
    public a e;

    public void ExploreFriendContactFragment$c(b p0,c p1){
       super();
       this.c = p1;
       this.b = p0;
       p0 = p0.a;
       Objects.requireNonNull(p0);
       this.d = new j(p0);
       this.e = new a(true, null);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ExploreFriendContactFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, ExploreFriendContactFragment$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(ExploreFriendContactFragment$c.class, new h());
       }else {
          obj.put(ExploreFriendContactFragment$c.class, null);
       }
       return obj;
    }
}

package com.kwai.live.gzone.emotion.j;
import xk5.a;
import java.util.List;
import y47.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import yk5.e;
import com.kwai.emotionsdk.bean.EmotionPackage;
import yk5.f;
import zk5.a;
import com.kwai.live.gzone.emotion.j$a;

public class j implements a	// class@000ce4
{
    public List a;
    public a b;

    public void j(List p0,a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public List a(){
       ArrayList obj = PatchProxy.apply(null, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (this.a != null) {
          obj = new ArrayList();
          for (int i = 0; i < this.a.size(); i = i + 1) {
             obj.add(new e(this.a.get(i)));
          }
       }
       return obj;
    }
    public int b(){
       return 1;
    }
    public a c(f p0){
       p0 = PatchProxy.applyOneRefs(p0, this, j.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new j$a(this.b);
    }
}

package com.mini.js.jsapi.BaseBindAPI;
import na8.b;
import ma8.i;
import com.mini.js.jsapi.BaseBindAPI$InterceptedStrategy;
import fc8.i;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import na8.a;
import la8.b;
import fc8.c;
import java.lang.Integer;
import com.mini.js.jsapi.BaseBindAPI$a;
import java.lang.Enum;
import zd8.d;
import java.lang.RuntimeException;

public abstract class BaseBindAPI extends b	// class@001973
{
    public BaseBindAPI$InterceptedStrategy d;

    public void BaseBindAPI(i p0){
       super(p0, BaseBindAPI$InterceptedStrategy.FAIL_CALLBACK);
    }
    public void BaseBindAPI(i p0,BaseBindAPI$InterceptedStrategy p1){
       super(p0);
       this.d = p1;
    }
    public abstract Object E(i p0,String p1,Object p2);
    public Object F(Object p0,String p1){
       i obj = PatchProxy.applyTwoRefs(p0, p1, this, BaseBindAPI.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b.g.c(p1);
       obj = c.o(p0, p1);
       if (obj == null) {
          return null;
       }
       int i = this.y(p1);
       if (!i) {
          return this.E(obj, p1, p0);
       }
       this.G(obj, i, p1);
       return null;
    }
    public void G(i p0,int p1,String p2){
       if (PatchProxy.isSupport(BaseBindAPI.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, BaseBindAPI.class, "2")) {
          return;
       }
       if (BaseBindAPI$a.a[this.d.ordinal()] == 1) {
          throw new RuntimeException("forbidden in half screen display mode");
       }
       p0.h(this.b.h.a(p1));
       return;
    }
}

package aja.b;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import sq4.a;
import kp.r1;
import com.kuaishou.android.model.feed.PhotoType;
import com.yxcorp.utility.TextUtils;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import sq4.c;
import sq4.b;
import java.lang.System;

public final class b	// class@000088
{
    public int a;
    public a b;
    public String c;
    public long d;
    public b[] e;

    public void b(){
       super();
    }
    public b a(int p0){
       this.a = p0;
       return this;
    }
    public b b(BaseFeed p0){
       a obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return this;
       }
       obj = new a();
       obj.a = r1.t1(p0);
       obj.d = TextUtils.N((long)r1.S1(p0).toInt());
       obj.b = r1.M0(p0);
       obj.c = r1.h1(p0);
       i3 oi3 = i3.f();
       oi3.d("myFollowPreLlsid", r1.h1(p0));
       oi3.c("myFollowPreFeedType", Integer.valueOf(r1.S1(p0).toInt()));
       obj.e = oi3.e();
       this.b = obj;
       return this;
    }
    public c c(){
       c obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       obj.c = this.a;
       obj.d = this.b;
       obj.e = this.e;
       obj.a = TextUtils.k(this.c);
       obj.b = this.d;
       return obj;
    }
    public b d(BaseFeed p0){
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b();
       obj.b = r1.U1(p0);
       String[] stringArray = new String[]{r1.t1(p0)};
       obj.c = stringArray;
       b[] uobArray = new b[]{obj};
       this.e = uobArray;
       return this;
    }
    public b e(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.d = System.currentTimeMillis();
       return this;
    }
    public b f(String p0){
       this.c = p0;
       return this;
    }
}

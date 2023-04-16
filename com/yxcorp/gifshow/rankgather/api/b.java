package com.yxcorp.gifshow.rankgather.api.b;
import qvb.f;
import android.net.Uri;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import com.yxcorp.gifshow.rankgather.api.RankGatherFeedResponse;
import wkd.b;
import c8c.a;
import cjd.e;
import erd.o;
import c8c.b;
import erd.g;
import qvb.n0$a;
import com.yxcorp.gifshow.rankgather.api.a;
import ekd.x0;
import com.kuaishou.android.model.feed.PhotoType;

public class b extends f	// class@0016ee
{
    public String p;
    public String q;
    public String r;
    public String s;
    public int t;
    public String u;
    public String v;
    public static final int w;

    public void b(Uri p0){
       super();
       this.t = 0;
       this.i2(p0);
    }
    public t I1(){
       RankGatherFeedResponse rankGatherFe;
       Object[] objArray = null;
       String str = "2";
       Object[] obj = PatchProxy.apply(objArray, this, b.class, str);
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (("aggregate").equals(this.u)) {
          obj = (this.K() || this.L0() == null)? objArray: this.L0();
          if (str.equals(this.r)) {
             a uoa = b.a(0x748175f8);
             b tq = this.q;
             if (obj != null) {
                objArray = obj.mCursor;
             }
             return uoa.b(tq, objArray).map(new e()).doOnNext(new b(this));
          }else if(("0").equals(this.r)){
             return this.h2();
          }
       }
       return this.h2();
    }
    public void K1(n0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       super.K1(p0);
       this.t = this.t + 1;
       return;
    }
    public final t h2(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(0x748175f8).a(this.p, this.v).map(new e()).doOnNext(a.b);
    }
    public boolean i(){
       return false;
    }
    public void i2(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       this.u = p0.getHost();
       this.p = x0.a(p0, "feedId");
       this.q = x0.b(p0, "roamingCityId", "");
       this.v = x0.b(p0, "ext_params", "");
       this.r = x0.b(p0, "type", "0");
       this.s = x0.b(p0, "feedType", String.valueOf(PhotoType.VIDEO.toInt()));
       return;
    }
}

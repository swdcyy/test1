package com.yxcorp.gifshow.profile.artical.d;
import o3c.p;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import o3c.l;
import qvb.n0;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.profile.artical.c;
import erd.g;
import y1c.g;
import y1c.h;
import la6.b;
import java.util.List;
import qvb.f;
import qk.g0;
import b06.d;

public class d extends p	// class@00121d
{
    public final String p;
    public static final int q;

    public void d(String p0){
       super();
       this.p = p0;
    }
    public t I1(){
       Object[] objArray = null;
       l obj = PatchProxy.apply(objArray, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(0x37313f08);
       d tp = this.p;
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return obj.D(tp, 30, objArray).map(new e()).doOnNext(c.b).doOnNext(new g(this)).doOnError(new h(this));
    }
    public List W1(b p0,List p1){
       List list = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "2");
       if (list != PatchProxyResult.class) {
       }else {
          list = super.W1(p0, p1);
          if (list != null) {
             d.f(list);
          }
       }
       return list;
    }
    public boolean i(){
       return false;
    }
}

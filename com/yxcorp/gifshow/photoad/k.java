package com.yxcorp.gifshow.photoad.k;
import mxb.z0;
import com.kwai.framework.model.feed.BaseFeed;
import com.google.gson.Gson;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import zk.d;
import com.yxcorp.gifshow.photoad.k$a;
import zk.a;
import vq4.c;
import java.lang.Integer;
import xf6.j;
import com.google.protobuf.nano.MessageNano;
import ekd.s;
import com.kwai.framework.security.LogEncryptor;
import java.lang.StringBuilder;
import brd.a0;
import mxb.j;
import s00.b$b;
import s00.b;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.AdAggregateTemplateFeed;
import mxb.g0;
import erd.o;

public class k extends z0	// class@000f98
{
    public static final int n;

    public void k(BaseFeed p0){
       super(p0);
    }
    public static Gson q(){
       d obj = PatchProxy.apply(null, null, k.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new d();
       obj.a(new k$a());
       return obj.b();
    }
    public static String r(int p0,c p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, ok, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (j.b()) {
          return p1.toString();
       }else {
          j.i(a0.B("buildLogContent success actionType=="+p0));
          return b.b().a(LogEncryptor.c.a(s.b(MessageNano.toByteArray(p1))));
       }
    }
    public a0 j(int p0){
       PhotoAdvertisement obj;
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ok, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.a.get("AD");
       if (obj == null && !this.a instanceof AdAggregateTemplateFeed) {
          return null;
       }else {
          this.k();
          return a0.B(this.a).C(new g0(this, p0, obj));
       }
    }
}

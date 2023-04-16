package com.yxcorp.gifshow.log.o;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.lang.Object;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import t45.c;
import kvb.a;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import kvb.c;
import java.io.File;
import kvb.f;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$EventPackage;
import com.yxcorp.gifshow.numberfour.NumberFourEventType;
import y2b.b;
import java.lang.Boolean;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import q2b.j;
import java.util.Queue;
import kvb.d;
import java.util.Map;
import k2b.g2;
import java.lang.Runnable;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import f3b.g;
import zk.g;

public class o	// class@0011fb
{
    public ExecutorService a;
    public a b;
    public static Queue c;

    static {
       o.c = new ConcurrentLinkedQueue();
    }
    public void o(){
       super();
       this.a = c.f("number_four_manager");
    }
    public a a(){
       return this.b;
    }
    public List b(long p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Integer.valueOf(p1), this, oo, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.b(p0, p1);
    }
    public List c(List p0,int p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oo, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.b.a(p0, p1);
    }
    public void d(Context p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o.class, "1")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       File uFile = new File(p0.getFilesDir().getAbsolutePath(), "conan");
       if (!uFile.exists()) {
          uFile.mkdirs();
       }
       this.b = new f(p0, uFile, p1);
       return;
    }
    public void e(ClientEvent$EventPackage p0,NumberFourEventType p1,boolean p2,b p3){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, o.class, "6")) {
          return;
       }
       if (!n.A1().Q()) {
          return;
       }
       if (this.b == null) {
          o.c.offer(new j(p0, p1, p2, p3));
          return;
       }else {
          Object obj = d.a.get(p1);
          if (obj != null && (!obj.isEmpty() && p2)) {
             g2 og2 = new g2(this, p0, obj, p3, p1);
             this.a.execute(v0);
          }
       label_0057 :
          return;
       }
    }
    public final void f(Map p0,List p1,StidContainerProto$StidContainer p2,boolean p3){
       String str;
       String str1;
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, o.class, "7")) {
          return;
       }
       if (!TextUtils.x(p2.stRecoId)) {
          str = g.f(p2.stRecoId);
          str1 = (p3)? "c_r": "i_r";
          this.g(p0, p1, str, str1);
       }
       if (!TextUtils.x(p2.stRecoStgyId)) {
          str = g.f(p2.stRecoStgyId);
          str1 = (p3)? "c_rs": "i_rs";
          this.g(p0, p1, str, str1);
       }
       if (!TextUtils.x(p2.stAdId)) {
          str = g.f(p2.stAdId);
          str1 = (p3)? "c_a": "i_a";
          this.g(p0, p1, str, str1);
       }
       if (!TextUtils.x(p2.stSsid)) {
          str = g.f(p2.stSsid);
          str1 = (p3)? "c_s": "i_s";
          this.g(p0, p1, str, str1);
       }
       if (!TextUtils.x(p2.stKsOrderId)) {
          str = g.f(p2.stKsOrderId);
          str1 = (p3)? "c_k": "i_k";
          this.g(p0, p1, str, str1);
       }
       if (!TextUtils.x(p2.stPushId)) {
          StidContainerProto$StidContainer stPushId = p2.stPushId;
          str1 = (p3)? "c_p": "i_p";
          this.g(p0, p1, stPushId, str1);
       }
       if (!TextUtils.x(p2.stDplinkId)) {
          p2 = p2.stDplinkId;
          String str2 = (p3)? "c_d": "i_d";
          this.g(p0, p1, p2, str2);
       }
       return;
    }
    public final void g(Map p0,List p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, o.class, "8")) {
          return;
       }
       if (p1.contains(p3)) {
          p0.put(p3, new g(p2));
       }
       return;
    }
}

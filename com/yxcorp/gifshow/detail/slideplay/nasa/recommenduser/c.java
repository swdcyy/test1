package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.c;
import qvb.n0;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import psb.c;
import psb.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.NasaRecommendUserFeed;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserMeta;
import cjd.e;
import erd.o;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.b;
import com.kwai.framework.model.user.User;
import java.util.Collection;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.a;
import k6a.b;
import java.lang.Iterable;
import z0.a;
import z1.a;
import qvb.a;
import java.util.Iterator;

public class c extends n0	// class@00175b
{
    public final List m;
    public NasaRecommendUserFeed n;
    public String o;
    public String p;
    public final int q;
    public static final int r;

    public void c(int p0){
       super();
       this.m = new ArrayList();
       this.q = p0;
    }
    public boolean B1(Object p0){
       return false;
    }
    public t I1(){
       Object obj = PatchProxy.applyWithListener(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.m.size() >= this.q) {
          PatchProxy.onMethodExit(c.class, "2");
          return t.just(this.Y1());
       }else {
          PatchProxy.onMethodExit(c.class, "2");
          return b.a().d(74, 6, this.o, this.n.mRecommendUserMeta.mPrsid).map(new e()).map(new b(this));
       }
    }
    public void M1(Object p0,List p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, c.class, "6")) {
       }else {
          p1.clear();
          for (int i = 0; i < p0.size(); i = i + 1) {
             p0.get(i).mPosition = i;
             p1.add(p0.get(i));
          }
          PatchProxy.onMethodExit(c.class, "6");
       }
       return;
    }
    public String V1(){
       return this.p;
    }
    public void W1(NasaRecommendUserFeed p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
          return;
       }
       this.n = p0;
       this.p = p0.mRecommendUserMeta.mPrsid;
       this.m.clear();
       p0 = this.n.mCacheUserList;
       if (p0 == null || p0.isEmpty()) {
          this.X1(this.n.mRecommendUserMeta.mUsersWrapper, a.a, new b(this));
       }else {
          this.m.addAll(this.n.mCacheUserList);
       }
       this.o = this.n.mCacheCursor;
       List list = this.Y1();
       for (int i = 0; i < list.size(); i = i + 1) {
          list.get(i).mPosition = i;
       }
       this.l0(list);
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
    public final void X1(Iterable p0,a p1,a p2){
       if (PatchProxy.applyVoidThreeRefsWithListener(p0, p1, p2, this, c.class, "4")) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          User user = p1.apply(iterator.next());
          if (user == null) {
             continue ;
          }else {
             p2.accept(user);
             this.m.add(user);
          }
       }
       PatchProxy.onMethodExit(c.class, "4");
       return;
    }
    public final List Y1(){
       ArrayList obj = PatchProxy.applyWithListener(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       while (this.m.size() > 0 && obj.size() < this.q) {
          obj.add(this.m.remove(0));
       }
       PatchProxy.onMethodExit(c.class, "5");
       return obj;
    }
    public void Z1(){
       if (PatchProxy.applyVoidWithListener(null, this, c.class, "7")) {
          return;
       }
       c tn = this.n;
       if (tn == null) {
          PatchProxy.onMethodExit(c.class, "7");
          return;
       }else if(tn.mCacheUserList == null){
          tn.mCacheUserList = new ArrayList();
       }
       this.n.mCacheUserList.clear();
       this.n.mCacheUserList.addAll(this.getItems());
       this.n.mCacheUserList.addAll(this.m);
       this.n.mCacheCursor = this.o;
       PatchProxy.onMethodExit(c.class, "7");
       return;
    }
}

package com.kuaishou.live.core.show.profilecard.photo.l;
import qvb.f;
import java.lang.String;
import com.kuaishou.live.core.show.profilecard.photo.LiveProfileFeedCacheManager;
import java.lang.Object;
import com.kuaishou.live.core.show.profilecard.photo.LiveProfileFeedResponse;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Locale;
import ra6.a;
import o02.f;
import o02.e;
import qvb.n0;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.show.profilecard.photo.l$a;
import erd.g;
import qvb.n0$a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;
import z12.e;
import k2b.u1;
import qvb.a;
import java.util.Objects;
import android.util.LruCache;
import com.kuaishou.live.core.show.profilecard.photo.LiveProfileFeedCacheManager$CacheEntry;
import java.lang.Boolean;
import java.lang.System;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;

public class l extends f	// class@000df1
{
    public final boolean p;
    public final String q;
    public final String r;
    public boolean s;
    public boolean t;
    public LiveProfileFeedCacheManager u;

    public void l(String p0,boolean p1,String p2,boolean p3,LiveProfileFeedCacheManager p4){
       super();
       this.q = p0;
       this.p = p1;
       this.r = p2;
       this.s = p3;
       this.u = p4;
    }
    public boolean E1(){
       return true;
    }
    public Object F1(){
       return this.i2();
    }
    public t I1(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String language = a.c().getLanguage();
       f uof = e.a();
       l tq = this.q;
       obj = (this.p != null)? "private": "public";
       String str = obj;
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       return uof.y(tq, language, 30, str, objArray, this.r, false).map(new e()).doOnNext(new l$a(this));
    }
    public void K1(n0$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       if (this.K() && (p0 != null && (!p0.b() && (p0.a() != null && (p0.a().hasMore() && (!q.f(p0.a().getItems()) && p0.a().getItems().size() <= 3)))))) {
          String str = "the number of feeds is "+p0.a().getItems().size()+", userid: "+this.q+", cursor: "+p0.a().getCursor()+" llsid: "+p0.a().getLlsid();
          String[] stringArray = new String[0];
          e.b("LiveProfilePhotoPageList", "illegal live profile feed response from server, "+str, stringArray);
          u1.R("LiveProfilePhotoPageList_illegal_response", str, 3);
       }
    label_00b7 :
       super.K1(p0);
       return;
    }
    public Object clone(){
       Object obj = PatchProxy.apply(null, this, l.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       l ol = new l(this.q, this.p, this.r, this.s, this.u);
       obj.S1(this.L0());
       obj.b(this.getItems());
       obj.R1(this.hasMore());
       return obj;
    }
    public final String h2(){
       Object obj = PatchProxy.apply(null, this, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "live_profile_photo_list_"+this.q;
    }
    public boolean i(){
       return false;
    }
    public LiveProfileFeedResponse i2(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String str = "1";
       l obj = PatchProxy.apply(objArray, this, l.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.K()) {
          obj = this.u;
          if (obj != null) {
             String str1 = this.h2();
             Objects.requireNonNull(obj);
             LiveProfileFeedCacheManager liveProfileF = LiveProfileFeedCacheManager.class;
             LiveProfileFeedCacheManager$CacheEntry obj1 = PatchProxy.applyOneRefs(str1, obj, liveProfileF, str);
             if (obj1 != patchProxyRe) {
                objArray = obj1;
             }else {
                obj1 = obj.a.get(str1);
                Object obj2 = PatchProxy.applyOneRefs(obj1, obj, liveProfileF, "3");
                if (obj2 != patchProxyRe) {
                   b = obj2.booleanValue();
                }else if(obj1 != null && System.currentTimeMillis() - obj1.mExpireTime <= 0){
                   b = true;
                }else {
                   b = false;
                }
                if (b) {
                   objArray = obj1.mLiveProfileFeedResponse;
                }else {
                   obj.a.remove(str1);
                }
             }
             if (objArray != null && (!q.f(objArray.getItems()) && (this.s != null && r1.S2(objArray.getItems().get(0))))) {
                objArray.getItems().remove(0);
             }
          }
       }
    label_0085 :
       return objArray;
    }
}

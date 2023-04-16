package com.yxcorp.gifshow.photoad.z;
import mxb.j;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.ads.PhotoAdvertisement$FanstopLiveInfo;
import com.yxcorp.gifshow.photoad.y;
import java.lang.Long;
import lnc.c3$b;
import lnc.c3;
import com.yxcorp.gifshow.photoad.x;
import java.lang.Integer;
import java.util.List;
import com.yxcorp.gifshow.photoad.v;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.commercial.adsdk.model.AdLogAltData;
import com.kuaishou.android.model.feed.k;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import brd.a0;
import tl8.d;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import mxb.y0;
import erd.o;
import com.yxcorp.gifshow.photoad.w;

public class z extends j	// class@000faf
{
    public static final Map l;
    public static final AtomicReference m;

    static {
       z.l = new ConcurrentHashMap(2);
       z.m = new AtomicReference("");
    }
    public void z(LiveStreamFeed p0){
       super();
       this.a = p0;
    }
    public long c(){
       Object obj = PatchProxy.apply(null, this, z.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return c3.b(this.p(), y.a, Long.valueOf(0)).longValue();
    }
    public int e(){
       Object obj = PatchProxy.apply(null, this, z.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return c3.b(this.p(), x.a, Integer.valueOf(0)).intValue();
    }
    public List g(){
       ArrayList uArrayList;
       List obj = PatchProxy.apply(null, this, z.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c3.a(this.p(), v.a);
       if (k.x(this.a) != null && !q.f(k.x(this.a).mTrackInfos)) {
          if (obj == null) {
             uArrayList = new ArrayList();
          }
          uArrayList.addAll(k.x(this.a).mTrackInfos);
       }
       return uArrayList;
    }
    public boolean h(){
       return this.a instanceof LiveStreamFeed;
    }
    public a0 j(int p0){
       PhotoAdvertisement obj;
       z oz = z.class;
       if (PatchProxy.isSupport(oz)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oz, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.a.get("AD");
       if (obj == null) {
          return null;
       }else {
          this.k();
          return a0.B(this.a).C(new y0(this, p0, obj));
       }
    }
    public final PhotoAdvertisement$FanstopLiveInfo p(){
       Object obj = PatchProxy.apply(null, this, z.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c3.a(this.a.get("AD"), w.a);
    }
}

package com.kuaishou.live.core.show.wish.f$a;
import bz1.a;
import com.kuaishou.live.core.show.wish.f;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import ym2.g$b;
import com.kuaishou.live.common.core.component.wishroom.LiveAudienceWishDetail;
import lp3.e;
import lp3.c;
import lp3.b;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import cn2.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.HashMap;
import com.kwai.framework.location.model.LocationCityInfo;
import o96.u;
import com.kuaishou.live.core.show.wish.model.KrnLocationCityInfo;
import fg6.a;
import com.google.gson.Gson;
import java.util.Map;
import va1.s0;
import com.kuaishou.live.core.show.wish.LiveAudienceWishRoomKrnDialogPresenter$b;

public class f$a implements a	// class@00129b
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void Ji(String p0,long p1,String p2){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, this, f$a.class, "1")) {
          return;
       }
       this.b.M.b(p0, p1, p2);
       return;
    }
    public void cl(LiveAudienceWishDetail p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "2")) {
          return;
       }
       this.b.M.c(p0);
       return;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public void oc(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f$a.class, "3")) {
          return;
       }
       String str = i.e(this.b.O.c.mEntity);
       if (!TextUtils.x(str)) {
          HashMap hashMap = new HashMap();
          hashMap.put("wishid", p0);
          hashMap.put("userIdOfWish", p1);
          hashMap.put("wishdetailfrom", "4");
          hashMap.put("sourceType", String.valueOf(this.b.O.l));
          hashMap.put("sourceUrl", i.c(this.b.O.m));
          hashMap.put("firstScreenData", p2);
          LocationCityInfo locationCity = u.d();
          if (locationCity != null) {
             hashMap.put("location", i.c(a.a.q(i.a(locationCity))));
          }
          this.b.L.a(s0.a(str, hashMap), true);
       }
       return;
    }
}

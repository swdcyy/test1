package com.kuaishou.live.core.show.giftachievement.d$a;
import com.kuaishou.live.core.show.giftachievement.e;
import com.kuaishou.live.core.show.giftachievement.d;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.core.show.giftachievement.LiveAudienceGiftAchievementModel;
import com.kuaishou.live.core.show.giftachievement.e$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.HashSet;
import com.kuaishou.live.core.show.giftachievement.LiveAudienceGiftAchievementModel$LiveAudienceGiftAchievement;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.util.Objects;
import android.util.SparseArray;
import java.util.List;
import java.util.Iterator;
import java.lang.Long;
import java.util.HashMap;

public class d$a implements e	// class@000bbf
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public String a(){
       d p = this.a.p;
       if (p != null) {
          return p.mAchievementWallUrl;
       }
       return null;
    }
    public void b(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       this.a.s.add(p0);
       return;
    }
    public void c(e$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "2")) {
          return;
       }
       this.a.s.remove(p0);
       return;
    }
    public LiveAudienceGiftAchievementModel$LiveAudienceGiftAchievement d(int p0){
       LiveAudienceGiftAchievementModel$LiveAudienceGiftAchievement liveAudience;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       uoa = this.a;
       Objects.requireNonNull(uoa);
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          liveAudience = PatchProxy.applyOneRefs(Integer.valueOf(p0), uoa, uod, "8");
          if (liveAudience != patchProxyRe) {
          label_0074 :
             return liveAudience;
          }
       }
       List list = uoa.t.get(p0);
       patchProxyRe = 0;
       if (list != null && list.size()) {
          liveAudience = Integer.MAX_VALUE;
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             LiveAudienceGiftAchievementModel$LiveAudienceGiftAchievement liveAudience1 = uoa.u.get(Long.valueOf(iterator.next().longValue()));
             if (liveAudience1 != null) {
                LiveAudienceGiftAchievementModel$LiveAudienceGiftAchievement mOrder = liveAudience1.mOrder;
                if (mOrder < liveAudience) {
                   LiveAudienceGiftAchievementModel$LiveAudienceGiftAchievement liveAudience2 = liveAudience1;
                   liveAudience = mOrder;
                }
             }
          }
       }
       liveAudience = patchProxyRe;
       goto label_0074 ;
    }
}

package com.yxcorp.gifshow.detail.HoverHelper$Companion;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.entity.QPhoto;
import ok.x;
import com.yxcorp.gifshow.detail.HoverHelper;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.HoverHelper$Companion$shouldShowRewardHover$1;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.StringBuilder;
import com.kwai.components.feedmodel.RewardPhotoInfo;
import com.yxcorp.gifshow.detail.HoverHelper$Companion$a;
import java.lang.reflect.Type;
import el.a;
import java.util.Map;
import wy5.a;
import java.util.HashMap;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.feature.component.photofeatures.reward.model.config.d;
import java.lang.Iterable;
import brd.t;
import com.kwai.feature.component.photofeatures.reward.model.config.a;
import erd.o;
import brd.a0;
import java.lang.Long;
import com.kwai.feature.component.photofeatures.reward.model.config.RewardGifFrequencyConfig;

public final class HoverHelper$Companion	// class@001339
{

    public void HoverHelper$Companion(){
       super();
    }
    public void HoverHelper$Companion(u p0){
       super();
    }
    public static boolean c(HoverHelper$Companion p0,QPhoto p1,boolean p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = false;
       }
       return p0.b(p1, p2);
    }
    public final x a(){
       return HoverHelper.m;
    }
    public final boolean b(QPhoto p0,boolean p1){
       HoverHelper$Companion$shouldShowRewardHover$1 obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       HoverHelper$Companion uCompanion = HoverHelper$Companion.class;
       if (PatchProxy.isSupport(uCompanion)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uCompanion, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "photo");
       if (HoverHelper.n) {
          return false;
       }else {
          obj = new HoverHelper$Companion$shouldShowRewardHover$1(p1);
          if (p0.getPhotoMeta() == null) {
             obj.invoke("R: PhotoMeta 为空，photoID: "+p0.getPhotoId());
             return false;
          }else {
             PhotoMeta photoMeta = p0.getPhotoMeta();
             a.m(photoMeta);
             if (photoMeta.mRewardPhotoInfo == null) {
                obj.invoke("R: RewardPhotoInfo 为空，photoID: "+p0.getPhotoId());
                return false;
             }else {
                photoMeta = p0.getPhotoMeta();
                a.m(photoMeta);
                if (photoMeta.mRewardPhotoInfo.mEnableHoverEntrance == null) {
                   obj.invoke("R: enableHoverEntrance 为 false，photoID: "+p0.getPhotoId());
                   return false;
                }else {
                   Map map = a.d(new HoverHelper$Companion$a().getType());
                   if (map == null) {
                      map = new HashMap();
                   }
                   QCurrentUser qCurrentUser = QCurrentUser.me();
                   a.o(qCurrentUser, "QCurrentUser.me\(\)");
                   d uod = map.get(qCurrentUser.getId());
                   if (uod != null) {
                      String photoId = p0.getPhotoId();
                      Object obj1 = PatchProxy.applyOneRefs(photoId, uod, d.class, "3");
                      boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): t.fromIterable(uod.b).map(a.b).contains(photoId).e().booleanValue();
                      if (b) {
                         obj.invoke("R: 当前作品已经显示过了，photoID: "+p0.getPhotoId());
                         return false;
                      }else {
                         String str = " 次";
                         String str1 = "当前为第 ";
                         if (uod.a().longValue() - this.a().get().mMaxTimesIn24H >= 0) {
                            obj.invoke("R: 24h 限制 "+this.a().get().mMaxTimesIn24H+" 次，"+str1+uod.a()+str);
                            return false;
                         }else if(uod.b((int)this.a().get().mIntervalNmin).longValue() - this.a().get().mMaxTimesInNmin >= 0){
                            obj.invoke("R: "+(int)this.a().get().mIntervalNmin+"min 限制 "+this.a().get().mMaxTimesInNmin+" 次，"+str1+uod.b((int)this.a().get().mIntervalNmin)+str);
                            return false;
                         }
                      }
                   }
                   return true;
                }
             }
          }
       }
    }
}

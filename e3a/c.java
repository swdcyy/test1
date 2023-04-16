package e3a.c;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import j2a.b;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.VisibleLevelInfo;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.android.model.mix.FansTopDisplayStyle;
import wkd.b;
import ip.b;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import vca.i;
import com.kwai.framework.model.user.User;
import java.lang.Boolean;
import com.kuaishou.android.model.mix.PhotoRelationEntrance;
import com.kuaishou.android.model.mix.PhotoRelationEntrance$PhotoRelationEntranceExtParams;
import tkd.b;
import tkd.d;
import ilc.i;
import com.kuaishou.android.model.mix.ExtEntryModel;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.detail.model.meta.OnlineStateTag;
import z1a.a;
import com.kuaishou.android.model.mix.AnalysisEntranceModel;

public final class c	// class@002061
{

    public void c(){
       super();
    }
    public static int a(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (b.a() && (p0.getPhotoMeta() == null || p0.getPhotoMeta().mVisibleLevel == null)) {
          return 0;
       }
       return p0.getPhotoMeta().mVisibleLevel.mPunishLevel;
    }
    public static int b(int p0,QPhoto p1){
       Object obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(c.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, c.class, "6");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       if (p1 == null) {
          return -1;
       }else {
          int i = 1;
          if ((QCurrentUser.ME.getId()).equals(p1.getUserId()) && (p1.getFansTopStyle() != null && p1.getFansTopStyle().shouldShowFansTopOwnnerStyle())) {
             return i;
          }else {
             boolean i1 = 2;
             if (p0 && b.a(-570058679).h(k.B(p1))) {
                return i1;
             }else {
                boolean i2 = 3;
                if (k.B(p1) != null && !TextUtils.x(k.B(p1).mSourceDescription)) {
                   return i2;
                }else if(i.d(p1)){
                   return 10;
                }else if(!p1.isPublic() || c.a(p1) == i){
                   return 4;
                }else if(!TextUtils.x(p1.getMessageGroupId())){
                   return 6;
                }else if(c.a(p1) == i1 || p1.isFriendsVisibility()){
                   return 9;
                }else if(p1.isSpecialUsersInvisibility() || p1.isSpecialUsersVisibility()){
                   return 22;
                }else if(c.a(p1) == i2 || (p1.getUser() != null && p1.getUser().isPrivate())){
                   return 5;
                }else {
                   obj = PatchProxy.applyOneRefs(p1, null, c.class, "2");
                   if (obj != patchProxyRe) {
                      i1 = obj.booleanValue();
                   }else if(p1.getPhotoMeta() != null && (!TextUtils.x(p1.getPhotoMeta().mAcquaintanceDetailRelationText) || (p1.getPhotoMeta().mPhotoRelationEntrance != null && (p1.getPhotoMeta().mPhotoRelationEntrance.mExtParams != null && p1.getPhotoMeta().mPhotoRelationEntrance.mExtParams.mPhotoRelationEntranceSource == i)))){
                      i1 = true;
                   }else {
                      i1 = false;
                   }
                   if (i1) {
                      return 17;
                   }else {
                      obj = PatchProxy.applyOneRefs(p1, null, c.class, "3");
                      if (obj != patchProxyRe) {
                         i1 = obj.booleanValue();
                      }else if(p1.getPhotoMeta() != null && p1.getPhotoMeta().mPhotoRelationEntrance != null){
                         i1 = true;
                      }else {
                         i1 = false;
                      }
                      if (i1) {
                         return 18;
                      }else {
                         i1 = 0x681d4627;
                         if (d.a(i1).r1(p1)) {
                            return 12;
                         }else {
                            ExtEntryModel extEntryMode = p1.getExtEntryModel();
                            Object obj1 = PatchProxy.applyOneRefs(extEntryMode, null, c.class, "1");
                            if (obj1 != patchProxyRe) {
                               i2 = obj1.booleanValue();
                            }else if(extEntryMode != null && !TextUtils.x(extEntryMode.mName)){
                               i2 = true;
                            }else {
                               i2 = false;
                            }
                            if (i2) {
                               return 8;
                            }else if(d.a(i1).a3(p1)){
                               return 11;
                            }else if(p0 == 9){
                               CommonMeta obj2 = PatchProxy.applyOneRefs(p1, null, c.class, "8");
                               if (obj2 != patchProxyRe) {
                                  b = obj2.booleanValue();
                               }else {
                                  obj2 = p1.getCommonMeta();
                                  if (obj2 == null) {
                                     b = false;
                                  }else if(a.b(obj2) != null && !TextUtils.x(a.b(obj2).mText)){
                                     i = 0;
                                  }
                                  obj2 = i;
                               }
                               if (b) {
                                  return 21;
                               }
                            }
                            if (c.d(p1)) {
                               return 20;
                            }else if(c.c(p1)){
                               return 23;
                            }else {
                               return 0;
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    }
    public static boolean c(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.n(p0.getUserId(), QCurrentUser.me().getId()) && (p0.getPhotoMeta() != null && p0.getPhotoMeta().mPhotoLiveRemindInfo != null))? true: false;
       return b;
    }
    public static boolean d(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((QCurrentUser.ME.getId()).equals(p0.getUserId()) && (p0.getAnalysisEntrance() != null && !TextUtils.x(p0.getAnalysisEntrance().mUrl)))? true: false;
       return b;
    }
}

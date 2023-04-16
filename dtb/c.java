package dtb.c;
import java.lang.Object;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxBaseItem;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$NotificationPackageV2;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxTextOnlyItem;
import java.lang.Integer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import dtb.a;
import lnc.c3$b;
import lnc.c3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem$ContentInfo;
import dtb.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoShowPackage;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem$CardPhotoInfo;
import java.util.List;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.w1;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxPlateSetting;
import lnc.i3;
import java.lang.Number;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem$RightButtonInfo;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem$SubContentInfo;
import k2b.e0;
import k2b.h;

public class c	// class@00255f
{

    public void c(){
       super();
    }
    public static ClientContent$ContentPackage a(NoticeBoxBaseItem p0){
       ClientContent$ContentPackage obj = PatchProxy.applyOneRefs(p0, null, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ContentPackage();
       obj.notificationPackage = c.e(p0);
       return obj;
    }
    public static ClientContent$ContentPackage b(NoticeBoxTextOnlyItem p0,int p1){
       ClientContent$ContentPackage obj1;
       c uoc = c.class;
       Object obj = null;
       if (PatchProxy.isSupport(uoc)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), obj, uoc, "11");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       obj1 = new ClientContent$ContentPackage();
       ClientContent$NotificationPackageV2 notification = c.e(p0);
       notification.index = p1;
       notification.name = p0.mTitle;
       notification.unread = String.valueOf(p0.mUnread);
       obj1.notificationPackage = notification;
       NoticeBoxBaseItem extParams = p0.extParams;
       if (extParams != null) {
          obj = c3.a(extParams.e0("ksOrderId"), a.a);
       }
       if (obj != null) {
          ClientContent$KsOrderInfoPackage ksOrderInfoP = new ClientContent$KsOrderInfoPackage();
          ksOrderInfoP.ksOrderId = obj;
          obj1.ksOrderInfoPackage = ksOrderInfoP;
       }
       return obj1;
    }
    public static ClientContent$ContentPackage c(NoticeBoxVideoCardItem p0,int p1){
       ClientContent$ContentPackage obj1;
       c uoc = c.class;
       QPhoto obj = null;
       if (PatchProxy.isSupport(uoc)) {
          obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), obj, uoc, "12");
          if (obj1 != PatchProxyResult.class) {
             return obj1;
          }
       }
       obj1 = new ClientContent$ContentPackage();
       ClientContent$NotificationPackageV2 notification = c.e(p0);
       notification.index = p1;
       NoticeBoxVideoCardItem mContentInfo = p0.mContentInfo;
       String str = (mContentInfo == null)? "": mContentInfo.mContent;
       notification.name = str;
       notification.unread = String.valueOf(p0.mUnread);
       obj1.notificationPackage = notification;
       mContentInfo = p0.extParams;
       if (mContentInfo != null) {
          obj = c3.a(mContentInfo.e0("ksOrderId"), b.a);
       }
       if (obj != null) {
          ClientContent$KsOrderInfoPackage ksOrderInfoP = new ClientContent$KsOrderInfoPackage();
          ksOrderInfoP.ksOrderId = obj;
          obj1.ksOrderInfoPackage = ksOrderInfoP;
       }
       if (p0.mCardPhotoInfo != null) {
          ClientContent$PhotoShowPackage photoShowPac = new ClientContent$PhotoShowPackage();
          ClientContent$PhotoPackage[] photoPackage = new ClientContent$PhotoPackage[p0.mCardPhotoInfo.mPhotos.size()];
          photoShowPac.photoPackage = photoPackage;
          for (int i = 0; i < p0.mCardPhotoInfo.mPhotos.size(); i = i + 1) {
             obj = p0.mCardPhotoInfo.mPhotos.get(i);
             int i1 = obj.getPosition() + 1;
             photoShowPac.photoPackage[i] = w1.g(obj.mEntity, i1);
          }
          obj1.photoShowPackage = photoShowPac;
       }
       return obj1;
    }
    public static String d(int p0,String p1,String p2,int p3,NoticeBoxPlateSetting p4){
       i3 obj;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),p1,p2,Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, null, uoc, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = i3.f();
       obj.c("box_card_type", Integer.valueOf(p0));
       if (p2 != null) {
          obj.d("click_area", p2);
       }
       if (p1 != null) {
          obj.d("btn_name", p1);
       }
       String str = "has_plate";
       if (p4 == null) {
          obj.d(str, String.valueOf(0));
       }else {
          obj.d("has_notice", String.valueOf(p4.mIsMuted));
          obj.d(str, String.valueOf(1));
          obj.c("plate_id", Integer.valueOf(p4.mPlateId));
       }
       if (p3 >= 0) {
          obj.c("user_count", Integer.valueOf(p3));
       }
       return obj.e();
    }
    public static ClientContent$NotificationPackageV2 e(NoticeBoxBaseItem p0){
       String str = null;
       ClientContent$NotificationPackageV2 obj = PatchProxy.applyOneRefs(p0, str, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$NotificationPackageV2();
       obj.type = String.valueOf(p0.mType);
       obj.notifyId = p0.mNotifyId;
       p0 = p0.extParams;
       if (p0 != null) {
          str = p0.toString();
       }
       obj.extParams = str;
       return obj;
    }
    public static String f(String p0,NoticeBoxPlateSetting p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return c.d(1, null, p0, -1, p1);
    }
    public static String g(NoticeBoxVideoCardItem p0,String p1,NoticeBoxPlateSetting p2){
       NoticeBoxVideoCardItem obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mRightButtonInfo;
       String str = (obj == null)? null: obj.mText;
       p0 = p0.mContentInfo;
       int i = -1;
       if (p0 != null) {
          NoticeBoxVideoCardItem$ContentInfo mSubContentI = p0.mSubContentInfo;
          if (mSubContentI != null) {
             i = mSubContentI.mUserList.size();
          }
       }
       return c.d(2, str, p1, i, p2);
    }
    public static void h(e0 p0,NoticeBoxVideoCardItem p1,String p2,NoticeBoxPlateSetting p3,int p4){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, null, uoc, "4")) {
             return;
          }
       }
       h oh = h.m("3155615", "NOTIFICATION_CARD");
       oh.c(c.c(p1, p4));
       oh.n(c.g(p1, p2, p3));
       oh.i(p0);
       return;
    }
    public static void i(e0 p0,NoticeBoxBaseItem p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, c.class, "8")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.d("btn_name", p2);
       p2 = oi3.e();
       h oh = h.m("3567872", "NOTIFICATION_CARD_DOUBLE_CHECK_POPUP_BUTTON");
       oh.c(c.a(p1));
       oh.n(p2);
       oh.i(p0);
       return;
    }
}

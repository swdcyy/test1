package bu7.d0;
import java.lang.Object;
import com.kwai.tokenshare.model.TokenInfoModel;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.tokenshare.model.TokenDialogModel;
import java.lang.Integer;
import java.lang.Number;
import com.kwai.tokenshare.model.ShareConfigBizType;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$IMGroupSessionPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kwai.framework.model.user.User;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import com.kwai.tokenshare.model.TokenDialogModel$ShareTag;
import com.kwai.tokenshare.model.TokenDialogModel$DialogConfig;
import com.kwai.tokenshare.model.TokenDialogModel$ShareMerchantItem;
import java.lang.NullPointerException;
import com.yxcorp.utility.Log;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public class d0	// class@000481
{

    public void d0(){
       super();
    }
    public static String a(TokenInfoModel p0){
       JsonObject obj = PatchProxy.applyOneRefs(p0, null, d0.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JsonObject();
       if (!TextUtils.isEmpty(p0.mShareId)) {
          obj.c0("share_id", p0.mShareId);
       }
       p0 = p0.mDialogModel;
       if (p0 != null) {
          obj.a0("type", Integer.valueOf(p0.mType));
          obj.a0("biz_type", Integer.valueOf(p0.mBizType));
          if (p0.mBizType == ShareConfigBizType.PUBLIC_GROUP_CHAT.mValue) {
             obj.c0("share_content", "PUBLIC_GROUP");
          }
       }
       return obj.toString();
    }
    public static ClientContent$IMGroupSessionPackage b(TokenDialogModel p0){
       ClientContent$IMGroupSessionPackage obj = PatchProxy.applyOneRefs(p0, null, d0.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$IMGroupSessionPackage();
       obj.params = p0.mExt;
       return obj;
    }
    public static ClientContent$PhotoPackage c(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d0.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return w1.f(p0);
    }
    public static ClientContent$ProfilePackage d(User p0){
       ClientContent$ProfilePackage obj = PatchProxy.applyOneRefs(p0, null, d0.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$ProfilePackage();
       obj.visitedUid = p0.getId();
       return obj;
    }
    public static ClientContent$PhotoPackage e(TokenDialogModel$ShareTag p0){
       ClientContent$PhotoPackage obj = PatchProxy.applyOneRefs(p0, null, d0.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientContent$PhotoPackage();
       obj.identity = p0.mId;
       obj.sAuthorId = "tag";
       return obj;
    }
    public static TokenDialogModel$DialogConfig f(TokenDialogModel p0){
       TokenDialogModel$DialogConfig uDialogConfi;
       p0 = (p0.mType == 18)? p0.mDialogConfig: null;
       return p0;
    }
    public static BaseFeed g(TokenDialogModel p0){
       BaseFeed uBaseFeed;
       p0 = (p0.mType == 1)? p0.mPhoto: null;
       return p0;
    }
    public static User h(TokenDialogModel p0){
       User user;
       p0 = (p0.mType == 2)? p0.mUser: null;
       return p0;
    }
    public static TokenDialogModel$ShareTag i(TokenDialogModel p0){
       TokenDialogModel$ShareTag shareTag;
       TokenDialogModel mType = p0.mType;
       p0 = (mType == 3 || mType == 7)? p0.mShareTag: null;
       return p0;
    }
    public static String j(TokenDialogModel p0){
       TokenDialogModel obj = PatchProxy.applyOneRefs(p0, null, d0.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = p0.mShareMerchantItem;
          if (obj != null) {
             return obj.mItemId;
          }else if(p0.mShareMerchantShop != null){
             return p0.mUser.getId();
          }
       }catch(java.lang.NullPointerException e3){
          Log.d("kwai_token_shop", e3.getMessage());
       }
       return "";
    }
    public static void k(int p0,TokenInfoModel p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(d0.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), Boolean.valueOf(p3), null, d0.class, "2")) {
          return;
       }
       TokenInfoModel mDialogModel = p1.mDialogModel;
       BaseFeed uBaseFeed = d0.g(mDialogModel);
       User user = d0.h(mDialogModel);
       TokenDialogModel$ShareTag shareTag = d0.i(mDialogModel);
       TokenDialogModel$DialogConfig uDialogConfi = d0.f(mDialogModel);
       TokenDialogModel mShareUser = mDialogModel.mShareUser;
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.type = 18;
       uElementPack.action = p0;
       String str = (p2)? "2": "1";
       uElementPack.name = str;
       uElementPack.params = d0.a(p1);
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       if (uBaseFeed != null) {
          uContentPack.photoPackage = d0.c(uBaseFeed);
       }else if(shareTag != null){
          uContentPack.photoPackage = d0.e(shareTag);
       }else if(uDialogConfi != null && mDialogModel.mBizType == ShareConfigBizType.PUBLIC_GROUP_CHAT.mValue){
          uContentPack.imGroupSessionPackage = d0.b(mDialogModel);
       }
       if (user != null) {
          uContentPack.profilePackage = d0.d(user);
       }
       TokenInfoModel mDialogModel1 = p1.mDialogModel;
       if (mDialogModel1.mShareMerchantShop == null && (mDialogModel1.mShareMerchantItem != null && !PatchProxy.applyVoidTwoRefs(uElementPack, p1, null, d0.class, "3"))) {
          uElementPack.action = 0x7559;
          uElementPack.index = p1.mSharePlatform;
          uElementPack.name = d0.j(p1.mDialogModel);
          p1 = p1.mDialogModel;
          if (p1.mShareMerchantItem != null) {
             uElementPack.value = 0;
          }
          if (p1.mShareMerchantShop != null) {
             uElementPack.value = 0x3ff0000000000000;
          }
       }
    label_00b4 :
       if (mShareUser != null) {
          ClientContent$UserPackage userPackage = PatchProxy.applyOneRefs(mShareUser, null, d0.class, "10");
          if (userPackage != PatchProxyResult.class) {
          }else {
             userPackage.visitedUid = mShareUser.getId();
             userPackage = new ClientContent$UserPackage();
             userPackage.identity = mShareUser.getId();
          }
          uContentPack.userPackage = userPackage;
       }
       u1.H("", 1, uElementPack, uContentPack, null);
       return;
    }
    public static void l(){
       if (PatchProxy.applyVoid(null, null, d0.class, "1")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.name = "share_token_dialog_close";
       uElementPack.action = 824;
       u1.u(1, uElementPack, null);
       return;
    }
}

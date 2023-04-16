package bu7.a0;
import erd.g;
import com.kwai.tokenshare.f;
import java.lang.String;
import java.lang.Object;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenInfo;
import java.util.Objects;
import o56.c;
import o56.a;
import android.content.Context;
import bu7.i0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.tokenshare.KwaiTokenDialog;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenDialogInfo;
import e17.i;
import androidx.fragment.app.FragmentActivity;
import com.kwai.tokenshare.model.TokenInfoModel;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.Fragment;
import bu7.f0;
import com.kwai.tokenshare.h;
import android.content.DialogInterface$OnCancelListener;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import java.lang.StringBuilder;
import java.lang.System;
import bu7.d0;
import com.kwai.tokenshare.model.TokenDialogModel;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.kwai.tokenshare.model.TokenDialogModel$ShareTag;
import com.kwai.tokenshare.model.TokenDialogModel$DialogConfig;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kwai.tokenshare.model.ShareConfigBizType;
import com.kuaishou.client.log.content.packages.nano.ClientContent$IMGroupSessionPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.kwai.tokenshare.KwaiTokenInitModule;
import j4d.b;

public final class a0 implements g	// class@00047b
{
    public final f b;
    public final int c;
    public final String d;
    public final String e;

    public void a0(f p0,int p1,String p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       TokenInfoModel extras;
       a0 uoa0 = this;
       a0 b = uoa0.b;
       a0 c = uoa0.c;
       a0 d = uoa0.d;
       a0 e = uoa0.e;
       d0 obj = p0;
       Objects.requireNonNull(b);
       Context uContext = a.a().f();
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ClientContent$ContentPackage obj1 = null;
       String str = "1";
       int i = 1;
       if (PatchProxy.applyVoidTwoRefs(uContext, obj, obj1, i0.class, str)) {
       }else if(obj != null){
          ShareTokenInfo mTokenDialog = obj.mTokenDialog;
          if (mTokenDialog != null) {
             ShareTokenDialogInfo mType = mTokenDialog.mType;
             if (mType >= i && mType <= 19) {
                mType = 1;
             label_003e :
                if (!mType) {
                   i.a(R.style.arg_RES_7f110668, 0x7f101c3e);
                }else if(!uContext instanceof FragmentActivity){
                   extras = obj.getExtras();
                   KwaiTokenDialog kwaiTokenDia = new KwaiTokenDialog();
                   BaseFeed obj2 = PatchProxy.applyOneRefs(obj, kwaiTokenDia, KwaiTokenDialog.class, str);
                   if (obj2 != patchProxyRe) {
                      kwaiTokenDia = obj2;
                   }else {
                      Bundle uBundle = new Bundle();
                      SerializableHook.putSerializable(uBundle, "data_kwai_token_token_info", obj);
                      kwaiTokenDia.setArguments(uBundle);
                   }
                   kwaiTokenDia.z = new f0(extras);
                   kwaiTokenDia.oh(h.b);
                   kwaiTokenDia.show(uContext.getSupportFragmentManager(), "token_dialog_"+System.currentTimeMillis());
                   obj = d0.class;
                   if (!PatchProxy.applyVoidOneRefs(extras, obj1, obj, "4")) {
                      TokenInfoModel mDialogModel = extras.mDialogModel;
                      obj2 = d0.g(mDialogModel);
                      User user = d0.h(mDialogModel);
                      TokenDialogModel$ShareTag shareTag = d0.i(mDialogModel);
                      TokenDialogModel$DialogConfig uDialogConfi = d0.f(mDialogModel);
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.type = 18;
                      uElementPack.action = 1132;
                      uElementPack.params = d0.a(extras);
                      ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
                      obj1 = new ClientContent$ContentPackage();
                      if (obj2 != null) {
                         obj1.photoPackage = d0.c(obj2);
                      }else if(shareTag != null){
                         obj1.photoPackage = d0.e(shareTag);
                      }else if(uDialogConfi != null && mDialogModel.mBizType == ShareConfigBizType.PUBLIC_GROUP_CHAT.mValue){
                         obj1.imGroupSessionPackage = d0.b(mDialogModel);
                      }
                      if (user != null) {
                         obj1.profilePackage = d0.d(user);
                      }
                      mDialogModel = extras.mDialogModel;
                      if (mDialogModel.mShareMerchantShop == null && (mDialogModel.mShareMerchantItem != null && !PatchProxy.applyVoidTwoRefs(showEvent, extras, null, obj, "5"))) {
                         ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                         uElementPack1.action = 0x7558;
                         uElementPack1.value = (double)extras.mSharePlatform;
                         uElementPack1.name = d0.j(extras.mDialogModel);
                         switch (extras.mDialogModel.mType){
                             case 11:
                               uElementPack1.index = 0;
                               break;
                             case 12:
                               uElementPack1.index = 1;
                               break;
                             case 13:
                               uElementPack1.index = 3;
                               break;
                             case 14:
                               uElementPack1.index = 4;
                               break;
                             case 15:
                               uElementPack1.index = 2;
                               break;
                             default:
                         }
                         showEvent.elementPackage = uElementPack1;
                      }
                      QCurrentUser qCurrentUser = QCurrentUser.me();
                      ClientContent$UserPackage userPackage = PatchProxy.applyOneRefs(qCurrentUser, null, obj, "11");
                      if (userPackage != patchProxyRe) {
                      }else {
                         new ClientContent$ProfilePackage().visitedUid = qCurrentUser.getId();
                         userPackage = new ClientContent$UserPackage();
                         userPackage.identity = qCurrentUser.getId();
                      }
                      obj1.userPackage = userPackage;
                      showEvent.contentPackage = obj1;
                      showEvent.elementPackage = uElementPack;
                      u1.h0(showEvent, false, null);
                   }
                }
             }
          }
       }
       extras = 0;
       goto label_003e ;
       KwaiTokenInitModule q = b.a.q;
       if (q != null) {
          q.C1(c, d, true, e);
       }
       return;
    }
}

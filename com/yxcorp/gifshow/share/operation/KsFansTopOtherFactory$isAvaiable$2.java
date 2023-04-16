package com.yxcorp.gifshow.share.operation.KsFansTopOtherFactory$isAvaiable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.operation.KsFansTopOtherFactory;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wh5.c;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import android.text.TextUtils;
import ul5.c;
import mhc.b2;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;

public final class KsFansTopOtherFactory$isAvaiable$2 extends Lambda implements a	// class@001bfc
{
    public final KsFansTopOtherFactory this$0;

    public void KsFansTopOtherFactory$isAvaiable$2(KsFansTopOtherFactory p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object[] objArray = null;
       User obj = PatchProxy.apply(objArray, this, KsFansTopOtherFactory$isAvaiable$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!c.b()) {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          if (!a.g(this.this$0.e.getUserId(), mE.getId())) {
             if (this.this$0.e.getUser() != null) {
                obj = this.this$0.e.getUser();
                a.o(obj, "photo.user");
                if (!obj.isPrivate()) {
                }
             }else if(!TextUtils.isEmpty(this.this$0.e.getMessageGroupId()) || (this.this$0.e.isLimitVisibility() || (this.this$0.e.isFusionVideo() || c.m(this.this$0.e)))){
                int i = 1;
                boolean b1 = (this.this$0.e.getRealRelationType() == i)? true: false;
                if (!b1 || (b2.b() || (!b1 && b2.c()))) {
                   b = true;
                }
                if (b) {
                   KsFansTopOtherFactory$isAvaiable$2 tthis$0 = this.this$0;
                   Objects.requireNonNull(tthis$0);
                   if (!PatchProxy.applyVoid(objArray, tthis$0, KsFansTopOtherFactory.class, "4")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action = 0x77c2;
                      uElementPack.name = "FANS_TOP";
                      uElementPack.type = i;
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.photoPackage = w1.f(tthis$0.e.mEntity);
                      ShowMetaData showMetaData = new ShowMetaData();
                      showMetaData.setType(4);
                      showMetaData.setElementPackage(uElementPack);
                      showMetaData.setContentPackage(uContentPack);
                      u1.B0(showMetaData);
                   }
                }
             }
          }
       }
    label_00ea :
       return b;
    }
}

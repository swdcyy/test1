package com.yxcorp.gifshow.share.operation.KsFansTopFactory$isAvaiable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.operation.KsFansTopFactory;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;
import mxb.h0;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import mhc.b2;
import wh5.c;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class KsFansTopFactory$isAvaiable$2 extends Lambda implements a	// class@001bf8
{
    public final KsFansTopFactory this$0;

    public void KsFansTopFactory$isAvaiable$2(KsFansTopFactory p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       boolean b;
       QCurrentUser obj = PatchProxy.apply(null, this, KsFansTopFactory$isAvaiable$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       if (this.this$0.e.isPublic() && (!this.this$0.e.isLimitVisibility() && (!this.this$0.e.isMessageGroupVisibility() && (this.this$0.e.isMine() && (!this.this$0.e.isAd() || h0.a(this.this$0.e)))))) {
          obj = QCurrentUser.ME;
          a.o(obj, "QCurrentUser.ME");
          if (!obj.isPrivateUser() && (b2.a() && !c.b())) {
             b = true;
          label_006d :
             if (b) {
                KsFansTopFactory$isAvaiable$2 tthis$0 = this.this$0;
                Objects.requireNonNull(tthis$0);
                if (!PatchProxy.applyVoid(null, tthis$0, KsFansTopFactory.class, "5")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action = 0x77c0;
                   uElementPack.name = "FANS_TOP";
                   uElementPack.type = i;
                   u1.u0(4, uElementPack, null);
                }
             }
             return b;
          }
       }
    label_006c :
       b = false;
       goto label_006d ;
    }
}

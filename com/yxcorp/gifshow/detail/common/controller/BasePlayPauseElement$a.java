package com.yxcorp.gifshow.detail.common.controller.BasePlayPauseElement$a;
import tl8.g;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kwai.framework.model.user.QCurrentUser;

public final class BasePlayPauseElement$a implements g	// class@0013a4
{
    public static final BasePlayPauseElement$a a;

    static {
       BasePlayPauseElement$a.a = new BasePlayPauseElement$a();
    }
    public void BasePlayPauseElement$a(){
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePlayPauseElement$a.class, "1")) {
       }else {
          a.p(p0, "in");
          ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          userPackage.identity = mE.getId();
          p0.userPackage = userPackage;
       }
       return;
    }
}

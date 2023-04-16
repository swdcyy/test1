package com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel$userNameText$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.multiline.renderpart.arenaline.audience.widget.userinfo.LiveAudienceMultiLineUserInfoViewModel;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.multiline.model.a;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import b61.b;
import androidx.lifecycle.MutableLiveData;
import yh3.a;

public final class LiveAudienceMultiLineUserInfoViewModel$userNameText$2 extends Lambda implements a	// class@001520
{
    public final LiveAudienceMultiLineUserInfoViewModel this$0;

    public void LiveAudienceMultiLineUserInfoViewModel$userNameText$2(LiveAudienceMultiLineUserInfoViewModel p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveData invoke(){
       LiveAudienceMultiLineUserInfoViewModel$userNameText$2 obj = PatchProxy.apply(null, this, LiveAudienceMultiLineUserInfoViewModel$userNameText$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0;
       String str = (obj.m != null)? "Ö÷²¥": b.a(obj.n.h);
       MutableLiveData mutableLiveD = new MutableLiveData(str);
       this.this$0.o0(mutableLiveD);
       return mutableLiveD;
    }
    public Object invoke(){
       return this.invoke();
    }
}

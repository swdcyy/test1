package bfb.p;
import erd.g;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import com.kwai.feature.api.social.message.bridge.model.GroupManagerInfo;

public final class p implements g	// class@0003b8
{
    public final IMGroupSettingBridge b;
    public final Promise c;

    public void p(IMGroupSettingBridge p0,Promise p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       IMGroupSettingBridge.c(this.b, this.c, p0);
    }
}

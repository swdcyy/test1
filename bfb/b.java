package bfb.b;
import erd.g;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import com.kwai.imsdk.group.KwaiGroupJoinRequestResponse;

public final class b implements g	// class@0003aa
{
    public final IMGroupSettingBridge b;
    public final Promise c;

    public void b(IMGroupSettingBridge p0,Promise p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       IMGroupSettingBridge.b(this.b, this.c, p0);
    }
}

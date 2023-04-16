package bfb.c;
import erd.g;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Boolean;

public final class c implements g	// class@0003ab
{
    public final IMGroupSettingBridge b;
    public final Promise c;

    public void c(IMGroupSettingBridge p0,Promise p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       IMGroupSettingBridge.a(this.b, this.c, p0);
    }
}

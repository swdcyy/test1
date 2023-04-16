package bfb.g;
import erd.g;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;

public final class g implements g	// class@0003af
{
    public final String b;
    public final Promise c;

    public void g(String p0,Promise p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       IMGroupSettingBridge.lambda$commitGroupNotice$0(this.b, this.c, p0);
    }
}

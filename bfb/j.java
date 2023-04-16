package bfb.j;
import erd.g;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.message.newgroup.manage.krn.IMGroupSettingBridge;

public final class j implements g	// class@0003b2
{
    public final Promise b;

    public void j(Promise p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       IMGroupSettingBridge.lambda$getInactiveMemberInfos$13(this.b, p0);
    }
}

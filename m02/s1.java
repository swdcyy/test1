package m02.s1;
import erd.g;
import com.kuaishou.live.core.basic.activity.LiveShellActivity;
import java.lang.Object;
import java.lang.Void;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;

public final class s1 implements g	// class@0030df
{
    public final LiveShellActivity b;

    public void s1(LiveShellActivity p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       s1 tb = this.b;
       tb.finish();
       tb.overridePendingTransition(R.anim.arg_RES_7f01004a, 0x7f01004c);
    }
}

package f83.a$a;
import android.view.View$OnLayoutChangeListener;
import f83.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import fe3.a;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class a$a implements View$OnLayoutChangeListener	// class@0028e9
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public final void onLayoutChange(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       if (PatchProxy.isSupport(a$a.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Integer.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = Integer.valueOf(p8);
          if (PatchProxy.applyVoid(objArray, this, a$a.class, "1")) {
             return;
          }
       }
       a a = this.b.a;
       a.o(a, "multiChatRootView");
       a a1 = this.b.a;
       a.o(a1, "multiChatRootView");
       a uoa = new a(a.getWidth(), a1.getHeight());
       this.b.d.setValue(uoa);
       b.c0(LiveCommonLogTag.LITE_NEW_MULTI_CHAT, "AdjustRenderArea playerViewLayoutChanged", "size", uoa.d()+"  "+uoa.c());
       return;
    }
}

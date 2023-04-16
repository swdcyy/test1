package lr1.a$a;
import erd.g;
import lr1.a;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lr1.b;
import androidx.lifecycle.LiveData;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import oe3.h;
import com.kuaishou.live.common.core.basic.widget.LiveMultiVideoSceneAudioWidget;
import android.view.View;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.util.BitmapUtil;
import msd.p;

public final class a$a implements g	// class@003008
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          p0 = this.b.l.getValue();
          if (p0 != null) {
             this.b.o.invoke(String.valueOf(p0.userId), new h(BitmapUtil.j(this.b.V2())));
          }
       }
       return;
    }
}

package lg9.e;
import qxc.a;
import qm6.b;
import java.lang.Object;
import android.view.View;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import lnc.a1;
import q87.c;
import eh9.l;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroup;
import java.util.List;
import com.kwai.gifshow.post.api.core.model.PosterActivityTabInfo;
import com.yxcorp.gifshow.camera.record.tab.c;

public final class e implements a	// class@002de3
{
    public final long a;
    public final b b;

    public void e(long p0,b p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(View p0){
       e tb = this.b;
       Object[] objArray = new Object[0];
       a.D().s("RecordPluginImpl", "preInflateView cost:"+a1.o(this.a), objArray);
       l.m(tb.W0);
       c.I(p0.findViewById(R.id.camera_tab_scroll_container), p0.findViewById(R.id.camera_tab_scroll_group), l.h(tb.y1), tb.W0, tb.U, tb.k);
    }
}

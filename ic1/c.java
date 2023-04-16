package ic1.c;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.common.core.component.bottombubble.notices.chatnotice.LiveCommonChatNoticeView;
import android.view.View$OnClickListener;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c extends m	// class@002891
{
    public final View$OnClickListener c;
    public final LiveCommonChatNoticeView d;

    public void c(LiveCommonChatNoticeView p0,View$OnClickListener p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c tc = this.c;
       if (tc != null) {
          tc.onClick(p0);
       }
       return;
    }
}

package gd1.b;
import bq5.d;
import gd1.c;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.generic.LiveGenericCommentNoticeInfoWithBaseExtra;
import java.lang.Object;
import bq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import mc1.a;

public class b implements d	// class@0024a3
{
    public final LiveGenericCommentNoticeInfoWithBaseExtra a;
    public final c b;

    public void b(c p0,LiveGenericCommentNoticeInfoWithBaseExtra p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       return c.d(this);
    }
    public void b(){
       c.b(this);
    }
    public void onDismiss(){
       c.a(this);
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       b tb = this.b;
       b ta = this.a;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(ta, tb, c.class, "4")) {
          a.e(tb.b.a(), String.valueOf(ta.mNoticeType), ta.mBizId);
       }
       return;
    }
}

package nd1.b;
import bq5.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler;
import com.kuaishou.live.common.core.component.bottombubble.notices.tk.LiveTkNoticeHandler$TkCommentNoticeInfo;
import z51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bq5.c;
import xp5.i;
import lp3.c;
import lp3.e;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import mc1.a;

public final class b implements d	// class@0032df
{
    public final LiveTkNoticeHandler a;
    public final LiveTkNoticeHandler$TkCommentNoticeInfo b;
    public final c c;

    public void b(LiveTkNoticeHandler p0,LiveTkNoticeHandler$TkCommentNoticeInfo p1,c p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public boolean a(){
       return true;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       c.b(this);
       this.c.b();
       return;
    }
    public void onDismiss(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       c.a(this);
       this.c.b();
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       c uoc = this.a.d.a(i.class);
       a.o(uoc, "serviceManager.getServic¡­kageProvider::class.java\)");
       a.e(uoc.a(), String.valueOf(201), this.b.mBizId);
       return;
    }
}

package hy0.j;
import u07.u;
import hy0.p;
import com.kuaishou.live.core.basic.model.LiveSendBulletCommentResultResponse;
import java.lang.Object;
import u07.t;
import android.view.View;
import fq5.b;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.core.basic.model.LivePayBulletResponse;
import hy0.v;

public final class j implements u	// class@0027aa
{
    public final p b;
    public final LiveSendBulletCommentResultResponse c;

    public void j(p p0,LiveSendBulletCommentResultResponse p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       j tb = this.b;
       v.c(tb.p.b().a(), this.c.getShotCode(), tb.w.getPrice(), false);
    }
}

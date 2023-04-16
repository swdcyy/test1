package fq1.a$a;
import java.lang.Runnable;
import fq1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import java.lang.Boolean;
import android.view.ViewGroup;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import p91.m;
import java.util.Objects;
import com.kuaishou.live.comments.view.a;
import android.view.View;
import android.graphics.Rect;
import p02.x;
import gt5.a;
import kotlin.jvm.internal.a;
import com.kwai.feature.api.live.service.show.comments.view.LayoutParamsType;
import com.kwai.feature.api.live.service.show.comments.LiveCommentsBiz;
import java.lang.Enum;
import dq5.b;

public final class a$a implements Runnable	// class@00237e
{
    public final a b;
    public final boolean c;

    public void a$a(a p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "1")) {
          return;
       }
       b.f0(LiveCommonLogTag.NEW_MULTI_CHAT, "notifyCenterWindow", "isReset", Boolean.valueOf(this.c), "renderHeight", Integer.valueOf(this.b.f.getHeight()), "renderTop", Integer.valueOf(this.b.f.getTop()), "renderBottom", Integer.valueOf(this.b.f.getBottom()));
       if (this.b.d.e()) {
          a$a tb = this.b;
          a uoa = null;
          int i = (this.c != null)? 0: tb.f.getHeight();
          Objects.requireNonNull(tb);
          a uoa1 = a.class;
          if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, uoa1, "8")) {
             if (tb.c == null) {
                tb.c = tb.h.Tl();
             }
             if (i > 0) {
                ViewGroup viewGroup = tb.h.a2();
                a.o(viewGroup, "commentService.commentContainerView");
                i = x.a(viewGroup).bottom - (x.a(tb.f).top + i);
             }else {
                a c = tb.c;
                tb.c = uoa;
             }
             if (i > null) {
                tb.h.K0(LayoutParamsType.HEIGHT, LiveCommentsBiz.CHAT.ordinal(), i);
             }
          }
       }else {
          this.b.g.a();
       }
       return;
    }
}

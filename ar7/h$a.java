package ar7.h$a;
import u07.u;
import ar7.h;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ar7.j;
import android.widget.TextView;
import ar7.l$a;
import com.kuaishou.android.model.mix.CoCreateInvitationInfo;
import com.kuaishou.android.model.mix.CoCreateInvitationInfo$InvitationOption;
import ar7.l;

public final class h$a implements u	// class@00034e
{
    public final h b;

    public void h$a(h p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$a.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "<anonymous parameter 1>");
       h c = this.b.c;
       j m = c.m;
       if (m == null) {
          a.S("mRejectedInvite");
       }
       c.y(m, j.v(this.b.c));
       h$a tb = this.b;
       tb.e.g(new l$a(j.w(tb.c).mDisagreeOption.mTargetStatus, true));
       return;
    }
}

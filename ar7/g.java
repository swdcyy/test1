package ar7.g;
import com.yxcorp.gifshow.widget.m;
import ar7.j;
import ar7.l;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import ar7.l$a;
import com.kuaishou.android.model.mix.CoCreateInvitationInfo;
import com.kuaishou.android.model.mix.CoCreateInvitationInfo$InvitationOption;
import uv8.h1;
import e17.i;

public final class g extends m	// class@00034d
{
    public final j c;
    public final l d;

    public void g(j p0,l p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       g tc = this.c;
       tc.y(j.v(tc), j.x(this.c));
       this.d.g(new l$a(j.w(this.c).mAgreeOption.mTargetStatus, true));
       h1.a.a(R.string.arg_RES_7f100665);
       return;
    }
}

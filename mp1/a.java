package mp1.a;
import com.kuaishou.live.viewcontroller.ViewController;
import fh3.f;
import lp1.d;
import lp1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import mp1.a$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import fh3.d;
import mp1.c;
import com.kuaishou.live.common.core.basic.debuglog.LiveCommonLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class a extends ViewController	// class@0031da
{
    public final d j;
    public final f k;
    public final d l;
    public final b m;

    public void a(f p0,d p1,b p2){
       a.p(p0, "onInviteProcessor");
       a.p(p1, "multiChatDelegate");
       a.p(p2, "multiChatCallback");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.j = new a$a(this);
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.k.w(this.j);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.l.g();
       this.k.H(this.j);
       return;
    }
    public final void V2(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       b.c0(LiveCommonLogTag.NEW_MULTI_CHAT, "ChatOnInvite acceptInvitationInner", "onInviteExtra", p0);
       this.k.a(p0.e(), p0.d(), null);
       return;
    }
}

package bu2.h;
import erd.g;
import bu2.l;
import java.lang.String;
import z1.a;
import java.lang.Object;
import njd.a;
import pp.d;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.Integer;
import com.google.common.collect.ImmutableMap;
import pp.c;
import java.util.Map;
import java.lang.Boolean;

public final class h implements g	// class@00045b
{
    public final l b;
    public final String c;
    public final int d;
    public final a e;

    public void h(l p0,String p1,int p2,a p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       h te = this.e;
       this.b.W8().m(LiveVoicePartyLogTag.ANCHOR, "requestInviteUser", ImmutableMap.of("inviteUserId", this.c, "inviteUserSource", Integer.valueOf(this.d)));
       if (te != null) {
          te.accept(Boolean.TRUE);
       }
       return;
    }
}

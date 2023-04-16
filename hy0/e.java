package hy0.e;
import z1.a;
import hy0.p;
import com.kuaishou.livestream.message.nano.WealthHighGradeBulletComment;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveRichTextUserState;
import java.util.Objects;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import im2.f;

public final class e implements a	// class@0027a5
{
    public final p a;
    public final WealthHighGradeBulletComment b;

    public void e(p p0,WealthHighGradeBulletComment p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       e ta = this.a;
       e tb = this.b;
       Objects.requireNonNull(ta);
       tb.senderState.userStateSegment = p0.userStateSegment;
       ta.q.a(tb, 0);
    }
}

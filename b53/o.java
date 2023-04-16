package b53.o;
import z1.a;
import com.kuaishou.live.gzone.barrage.h$a;
import java.lang.Object;
import com.kuaishou.live.common.core.component.comments.combo.ComboCommentMessage;
import java.util.Objects;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.gzone.barrage.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import com.kwai.framework.model.user.UserInfo;
import tl2.a;
import java.util.Date;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import bb1.o;
import java.lang.Enum;
import com.kuaishou.live.common.core.component.comments.model.CommentMessage;
import com.kuaishou.live.common.core.component.comments.parser.LiveCommentsMocker;
import java.util.ArrayList;
import java.util.List;

public final class o implements a	// class@00031c
{
    public final h$a a;
    public final a b;

    public void o(h$a p0,a p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void accept(Object p0){
       o ta = this.a;
       Objects.requireNonNull(ta);
       this.b.accept(p0);
       h$a b = ta.b;
       p0 = p0.mContent;
       Objects.requireNonNull(b);
       if (PatchProxy.applyVoidOneRefs(p0, b, h.class, "23")) {
       }else {
          ArrayList uArrayList = new ArrayList();
          uArrayList.add(LiveCommentsMocker.b(p0, a.a(b.s), new Date().getTime(), b.s.b2.d(QCurrentUser.me().getId()).ordinal()));
          b.R8(uArrayList);
       }
       return;
    }
}

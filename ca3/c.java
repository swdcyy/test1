package ca3.c;
import yh3.a;
import androidx.lifecycle.LiveData;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ca3.c$a;
import z0.a;
import androidx.lifecycle.Transformations;
import zh3.c;
import com.kuaishou.live.mvvm.viewmodel.state.LiveEvent;
import ca3.c$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kuaishou.live.lite.comment.model.GiftSentMessage;
import com.kwai.framework.model.user.UserInfo;

public final class c extends a	// class@0004d8
{
    public final String a;
    public final LiveData b;
    public final LiveEvent c;
    public final LiveData d;

    public void c(LiveData p0){
       a.p(p0, "giftSentMessageLiveData");
       super();
       this.d = p0;
       this.a = "GiftSentMessageViewModel";
       p0 = Transformations.map(p0, new c$a());
       a.h(p0, "Transformations.map\(this\) { transform\(it\) }");
       this.b = p0;
       c uoc = new c();
       this.p0(uoc);
       this.c = uoc;
    }
    public void u0(c$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       b.Z(LiveLogTag.LIVE_LITE_COMMENT, this.a+" handleIntent ClickNameIntent");
       Object value = this.d.getValue();
       Objects.requireNonNull(value, "null cannot be cast to non-null type com.kuaishou.live.lite.comment.model.GiftSentMessage");
       this.s0(this.c).q(value.getUserInfo());
       return;
    }
}

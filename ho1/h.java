package ho1.h;
import lf3.g;
import com.kuaishou.live.common.core.component.like.count.i;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lf3.f;

public final class h implements g	// class@00275a
{
    public final i b;

    public void h(i p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, i.class, "8")) {
       }else {
          tb.h(p0.displayLikeCount, p0.likeCount);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}

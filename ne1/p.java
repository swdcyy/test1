package ne1.p;
import lf3.g;
import com.kuaishou.live.common.core.component.comments.e;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveRichTextFeedPush$SCLiveRichTextFeedPush;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextFeed;
import lf3.f;

public final class p implements g	// class@0032f8
{
    public final e b;

    public void p(e p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       p tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "4")) {
       }else if(p0 == null){
          tb.P8(p0.richTextFeed);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}

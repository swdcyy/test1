package gm1.b;
import lf3.g;
import gm1.c;
import java.lang.Object;
import com.google.protobuf.nano.MessageNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCFeedPush;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import w51.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import lf3.f;

public final class b implements g	// class@00251b
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void H4(MessageNano p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, c.class, "2")) {
       }else if(p0 == null){
          b.Z(LiveGiftTag.FEED_PUSH, "[LiveGiftFeedPushModel][handleSCFeedPush]: scFeedPush is null");
       }else if(a.D()){
          tb.d("LiveGiftFeedPushModel", p0);
       }
       return;
    }
    public boolean V(){
       return f.a(this);
    }
}

package d4b.j;
import erd.o;
import d4b.h;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import s5b.b;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.MagicEmoji;
import q87.c;
import e4b.a;
import e4b.c;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import w3b.l;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import com.google.common.base.a;
import java.lang.Iterable;
import w3b.q;
import brd.t;

public final class j implements o	// class@002433
{
    public final h b;

    public void j(h p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       h c;
       t ot = PatchProxy.applyOneRefs(p0, this, j.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "localList");
          Object[] objArray = new Object[0];
          b.D().w("MagicRepository", "get dbCache : "+this.b.c.mName+" size:"+p0.size(), objArray);
          a uoa = c.a();
          MagicBusinessId mId = this.b.a.mId;
          int i = l.e();
          j tb = this.b;
          h d = tb.d;
          MagicEmojiPageConfig mTaskId = (d != null)? d.mTaskId: 0;
          c = tb.c;
          ot = uoa.p(mId, i, mTaskId, "", c.mPCursor, c.mId, a.f(',').c(p0), false, q.d);
       }
       return ot;
    }
}

package h71.q;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import h71.q$a;
import java.lang.Object;
import o63.j$a;
import asd.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o63.m;
import o63.m$a;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.Boolean;
import dsd.a;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import com.kuaishou.live.common.core.component.comments.parser.LiveCommentsMocker$LiveRichTextOldSegment;
import java.lang.StringBuilder;
import lp3.e;
import ft5.b;
import lp3.c;
import com.kuaishou.live.common.core.component.comments.parser.LiveCommentsMocker;
import com.kuaishou.live.common.core.component.comments.model.RichTextMessageOld;
import com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$RichTextSegment;
import java.lang.Iterable;
import qk.m;
import com.kuaishou.live.common.core.component.comments.parser.a;
import ok.h;
import java.util.ArrayList;
import n81.a;
import com.kuaishou.live.basic.model.QLiveMessage;

public final class q extends AbstractLiveJsCommand	// class@002644
{

    public void q(){
       super();
    }
    public Class a(){
       return q$a.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, q.class, "1");
       if (p1 != patchProxyRe) {
          return p1;
       }
       if (!p0 instanceof q$a) {
          return m.g.c("send text comment invalid params");
       }
       if (q.f(p0.a())) {
          return m.g.c("send text comment param is empty");
       }
       if (a.g(p0.realSend, a.a(true))) {
          p0 = p0.a();
          a.m(p0);
          p0 = p0.iterator();
          String str = "";
          while (p0.hasNext()) {
             str = str+p0.next().mText;
          }
          p0 = this.h().c(b.class);
          if (p0 != null) {
             p0.U2(str);
          }
       }else {
          p0 = p0.a();
          if (p0 != null) {
             RichTextMessageOld richTextMess = PatchProxy.applyOneRefs(p0, null, LiveCommentsMocker.class, "14");
             if (richTextMess != patchProxyRe) {
             }else {
                richTextMess = new RichTextMessageOld();
                LiveStreamRichTextFeed$RichTextSegment[] richTextSegm = new LiveStreamRichTextFeed$RichTextSegment[p0.size()];
                ArrayList uArrayList = new ArrayList();
                m.s(p0).F(a.b).n(uArrayList);
                uArrayList.toArray(richTextSegm);
                richTextMess.mSegments = richTextSegm;
             }
             if (richTextMess != null) {
                this.h().a(a.class).R0(richTextMess);
             }
          }
       }
       return m$a.g(m.g, null, false, 3, null);
    }
}

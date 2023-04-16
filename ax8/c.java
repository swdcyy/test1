package ax8.c;
import erd.o;
import ax8.e;
import java.lang.Object;
import com.kwai.feature.post.api.feature.producer.help.ProducerHelpConfig;
import java.util.Objects;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import ow8.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import wba.p0;
import f66.i;
import jq.a;
import q87.c;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo$DialogInfo;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.util.List;
import com.kwai.feature.post.api.feature.tuna.ShareBusinessLinkInfo$DialogItemInfo;
import tkd.b;
import tkd.d;
import u06.g;

public final class c implements o	// class@00032b
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       boolean b1;
       c tb = this.b;
       Objects.requireNonNull(tb);
       boolean b = LivePluginManager.c();
       e v = tb.v;
       e s = tb.s;
       ShareBusinessLinkInfo shareBusines = null;
       Object[] obj = PatchProxy.applyTwoRefs(v, s, shareBusines, c.class, "28");
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(v != null && v.v() != null){
          Workspace workspace = v.v();
          if (workspace.getType() != Workspace$Type.VIDEO && (workspace.getType() != Workspace$Type.LONG_VIDEO && (workspace.getType() == Workspace$Type.ALBUM_MOVIE || (workspace.getType() == Workspace$Type.AI_CUT && !p0.a(workspace.getSource()))))) {
          label_0062 :
             b1 = true;
          }
       }else if(s != null){
          goto label_0062 ;
       }
       b1 = false;
       if (b1 || (p0.mShareBusinessLinkInfo != null || !b)) {
          ProducerHelpConfig mShareBusine = p0.mShareBusinessLinkInfo;
          if (!PatchProxy.applyVoidOneRefs(mShareBusine, tb, e.class, "8")) {
             obj = new Object[0];
             a.b().w("ShareProducerPresenter", "filterLivePrediction", obj);
             if (mShareBusine != null) {
                shareBusines = mShareBusine.mDialog;
             }
             if (shareBusines != null && !q.f(shareBusines.mItems)) {
                Iterator iterator = shareBusines.mItems.iterator();
                while (iterator.hasNext()) {
                   if (("30").equals(iterator.next().mEntryId)) {
                      obj = new Object[0];
                      a.b().w("ShareProducerPresenter", "filterLivePrediction remove live", obj);
                      iterator.remove();
                   }
                }
             }
          }
          if (!b) {
             d.a(0x565dccdc).GY(1);
             Object[] objArray = new Object[0];
             a.b().w("ShareProducerPresenter", "remove live enter when live plugin invalid!", objArray);
          }
       }
       return p0;
    }
}

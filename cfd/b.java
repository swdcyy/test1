package cfd.b;
import erd.g;
import cfd.d;
import java.lang.Object;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$VideoStatEvent;
import java.util.Objects;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import jfd.b;
import com.yxcorp.gifshow.entity.QPhoto;
import uy5.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.log.model.StatMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import jfd.d;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.search.entity.SearchItem;
import k2b.u1;

public final class b implements g	// class@00031a
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       d uod = d.class;
       ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
       if (PatchProxy.applyVoidOneRefs(p0, tb, uod, "5")) {
       }else if(p0 != null && p0.duration - null <= 0){
          d q = tb.q;
          if (q != null && q.c() instanceof QPhoto) {
             long videoDuratio = tb.q.c().getVideoDuration();
             Object[] objArray = new Object[0];
             a.C().s("VideoStateReportPresenter", "checkAndFixStatEventDuration videoDuration : "+p0.duration+", photoDuration : "+videoDuratio, objArray);
             p0.duration = videoDuratio;
          }
       }
       statPackage.videoStatEvent = p0;
       p0 = new StatMetaData().setStatPackage(statPackage);
       FeedLogCtx uFeedLogCtx = tb.q.c0();
       FeedLogCtx uFeedLogCtx1 = PatchProxy.applyOneRefs(uFeedLogCtx, tb, uod, "3");
       if (uFeedLogCtx1 != PatchProxyResult.class) {
       }else if(uFeedLogCtx != null){
          uFeedLogCtx = tb.r.getReportFeedLogCtx();
       }
       uFeedLogCtx1 = uFeedLogCtx;
       u1.F0(p0.setFeedLogCtx(uFeedLogCtx1));
       return;
    }
}

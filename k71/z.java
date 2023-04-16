package k71.z;
import com.kuaishou.live.jsbridge.AbstractLiveJsCommand;
import java.lang.Class;
import k71.y;
import java.lang.Object;
import o63.j$a;
import asd.c;
import xp5.i;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import lp3.e;
import lp3.c;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import pp.a;
import java.lang.StringBuilder;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import q87.c;
import k2b.e0;
import k2b.u1;
import com.kuaishou.live.bridge.commands.migrated.TaskEventParams;
import java.lang.Integer;
import com.yxcorp.gifshow.log.model.CommonParams;
import com.kuaishou.live.bridge.commands.migrated.CommonParams;
import com.google.gson.JsonElement;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ResultPackage;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import o63.m;
import o63.m$a;

public final class z extends AbstractLiveJsCommand	// class@002cd1
{

    public void z(){
       super();
    }
    public Class a(){
       return y.class;
    }
    public Object l(Object p0,j$a p1,c p2){
       int i;
       i oi = i.class;
       p1 = PatchProxy.applyThreeRefs(p0, p1, p2, this, z.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1;
       }
       if (!p0 instanceof y) {
          p0 = null;
       }
       if (p0 != null) {
          ClientContent$ContentPackage uContentPack = p0.a();
          if (uContentPack != null) {
             c uoc = this.h().a(oi);
             a.o(uoc, "serviceManager\n      .ge¡­kageProvider::class.java\)");
             uContentPack.liveStreamPackage = uoc.a();
          }
          if (p0.b() == null) {
             p0.contentWrapper = new ClientContentWrapper$ContentWrapper();
          }
          z oz = z.class;
          if (!PatchProxy.applyVoidOneRefs(p0, this, oz, "2")) {
             a uoa = a.C();
             StringBuilder str = "logClickEvent type:"+p0.e()+" action:";
             ClientEvent$ElementPackage uElementPack = p0.c();
             uElementPack = (uElementPack != null)? uElementPack.action2: null;
             Object[] uElementPack1 = new Object[false];
             uoa.w("LivejsLogger", str+uElementPack, uElementPack1);
             String str1 = p0.e();
             i = str1.hashCode();
             if (i != 0x35dafd) {
                if (i != 0x363585) {
                   if (i != 0x5a5c588 || (str1.equals("click") && !PatchProxy.applyVoidOneRefs(p0, this, oz, "4"))) {
                      u1.M("", this.g(oi).getPage(), 1, p0.c(), p0.a(), p0.b());
                   }
                }else if(!str1.equals("task") || PatchProxy.applyVoidOneRefs(p0, this, oz, "5")){
                   TaskEventParams taskEventPar = p0.d();
                   String action2 = (taskEventPar != null)? taskEventPar.getAction2(): null;
                   if (action2 != null && p0.d().getStatus() != null) {
                      CommonParams uCommonParam = new CommonParams();
                      y commonParams = p0.commonParams;
                      h$b mCsLogCorrel = (commonParams != null)? commonParams.getMCsLogCorrelateInfo(): null;
                      if (!mCsLogCorrel instanceof JsonElement) {
                         mCsLogCorrel = null;
                      }
                      uCommonParam.mCsLogCorrelateInfo = mCsLogCorrel;
                      mCsLogCorrel = h$b.e(p0.d().getStatus().intValue(), p0.d().getAction2());
                      mCsLogCorrel.h(p0.a());
                      mCsLogCorrel.k(p0.c());
                      mCsLogCorrel.q(p0.resultPackage);
                      mCsLogCorrel.g(uCommonParam);
                      mCsLogCorrel.l(this.g(oi).c0());
                      u1.p0("", this.g(oi).getPage(), mCsLogCorrel);
                   }
                }
             }else if(!str1.equals("show") || PatchProxy.applyVoidOneRefs(p0, this, oz, "3")){
                u1.D0("", this.g(oi).getPage(), 9, p0.c(), p0.a(), p0.b());
             }
          }
       label_018a :
          return m$a.g(m.g, "success", false, 2, null);
       }else {
          return m.g.c("invalid request params");
       }
    }
}

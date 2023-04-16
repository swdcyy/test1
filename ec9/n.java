package ec9.n;
import ec9.k;
import ec9.b1;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import sa6.a;
import cc9.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import sa6.b;
import cc9.q;
import java.util.List;
import ac9.g;
import com.yxcorp.gifshow.camera.record.assistant.model.KSAssistantTemplate;
import cc9.j;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import u80.d;
import java.util.HashMap;
import java.lang.Integer;
import cc9.h;
import java.util.Map;

public final class n extends k	// class@00218c
{

    public void n(b1 p0){
       a.p(p0, "provider");
       super(p0);
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
       }else {
          a.p(p0, "action");
          b uob = this.a().j();
          g og = uob.f().get(p0.b());
          if (og instanceof KSAssistantTemplate) {
             KSTemplateDetailInfo kuaishan = og.getKuaishan();
             a.m(kuaishan);
             j oj = new j(kuaishan, -1, og.isPartitionItem(), null);
             h oh = uob.i().get(Integer.valueOf(p0.b()));
             if (oh != null && (!oh instanceof j || (a.g(oh.b().mTemplateId, oj.b().mTemplateId) ^ 0x01))) {
                uob.i().put(Integer.valueOf(p0.b()), oj);
             }
             this.a().h(q.a(uob, null, 0, 0, null, false, false, false, false, 255, null));
          }
       }
       return;
    }
}

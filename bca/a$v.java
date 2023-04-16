package bca.a$v;
import erd.o;
import bca.a;
import java.lang.Object;
import com.yxcorp.gifshow.aicut.VideoTemplateResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.util.ArrayList;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import fba.a;
import haa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.AICutTheme;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.RecommendStyle;
import kotlin.Pair;
import java.lang.Integer;
import java.lang.Long;
import brd.t;
import java.lang.Number;
import trd.u;
import h69.j;
import lnc.g7;
import h69.b;

public final class a$v implements o	// class@00045f
{
    public final a b;

    public void a$v(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Object obj;
       ArrayList obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.applyOneRefs(p0, this, a$v.class, "1");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "response");
          a$v tb = this.b;
          Objects.requireNonNull(tb);
          Object[] objArray = null;
          ArrayList uArrayList = PatchProxy.apply(objArray, tb, a.class, "13");
          if (uArrayList != patchProxyRe) {
          }else {
             uArrayList = new ArrayList();
             AICutTheme uAICutTheme = a.a(tb.j).v();
             if (uAICutTheme != null) {
                List newRecommend = uAICutTheme.getNewRecommendStyleList();
                if (newRecommend != null) {
                   Iterator iterator2 = newRecommend.iterator();
                   while (iterator2.hasNext()) {
                      RecommendStyle recommendSty = iterator2.next();
                      a.o(recommendSty, "it");
                      String id = recommendSty.getId();
                      a.o(id, "it.id");
                      uArrayList.add(new Pair(Integer.valueOf(recommendSty.getType()), Long.valueOf(Long.parseLong(id))));
                   }
                }
             }
          }
          if (uArrayList.isEmpty()) {
             p0 = t.just(p0);
          }else {
             p0 = a.a(this.b.j).v();
             int visionEngine = (p0 != null)? p0.getVisionEngineResultCount(): 0;
             if (visionEngine > 0 && p0 != null) {
                objArray = p0.getVisionEngineResult(0);
             }
             Object[] objArray1 = objArray;
             p0 = new ArrayList();
             Iterator iterator = uArrayList.iterator();
             a uoa = 1;
             while (iterator.hasNext()) {
                obj = iterator.next();
                if (obj.getFirst().intValue()) {
                   uoa = null;
                }
                if (uoa) {
                   p0.add(obj);
                }
             }
             visionEngine = 10;
             ArrayList uArrayList1 = new ArrayList(u.Y(p0, visionEngine));
             p0 = p0.iterator();
             while (p0.hasNext()) {
                uArrayList1.add(Long.valueOf(p0.next().getSecond().longValue()));
             }
             p0 = new ArrayList();
             Iterator iterator1 = uArrayList.iterator();
             while (iterator1.hasNext()) {
                obj = iterator1.next();
                obj1 = (obj.getFirst().intValue() == uoa)? 1: null;
                if (obj1) {
                   p0.add(obj);
                }
             }
             obj1 = new ArrayList(u.Y(p0, visionEngine));
             p0 = p0.iterator();
             while (p0.hasNext()) {
                obj1.add(Long.valueOf(p0.next().getSecond().longValue()));
             }
             p0 = this.b;
             p0 = p0.a.ku(objArray1, obj1, uArrayList1, j.d(p0.j, 0), g7.a(this.b.j));
          }
          ot = p0;
       }
       return ot;
    }
}

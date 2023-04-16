package bp3.k;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Iterator;
import com.kuaishou.live.rerank.LiveRerankRequestItemParam;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import com.kuaishou.live.rerank.g;
import com.kuaishou.live.rerank.h;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.live.rerank.i;
import com.kuaishou.live.rerank.j;
import java.lang.Long;
import tkd.b;
import tkd.d;
import nl9.r;
import java.util.HashMap;
import d61.a0;
import java.util.Collection;
import ekd.q;
import java.util.Map;
import fg6.a;
import com.google.gson.Gson;

public class k	// class@000415
{

    public void k(){
       super();
    }
    public static String a(List p0,int p1,List p2,QPhoto p3){
       ArrayList obj;
       Object obj2;
       int i2;
       List list = p0;
       int i = p1;
       if (PatchProxy.isSupport(k.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), p2, p3, null, k.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ArrayList();
       Iterator iterator = p0.iterator();
       int i1 = 0x691527a8;
       while (iterator.hasNext()) {
          QPhoto qPhoto = iterator.next();
          LiveRerankRequestItemParam liveRerankRe = new LiveRerankRequestItemParam(r1.n1(qPhoto.mEntity), k0.b(qPhoto.mEntity.a(CommonMeta.class), g.a, h.a).orNull(), k0.a(qPhoto.mEntity.a(LiveStreamModel.class), i.a).orNull(), k0.a(qPhoto.mEntity.a(LiveStreamModel.class), j.a).or(Long.valueOf(0)).longValue(), d.a(i1).QK(qPhoto));
          obj.add(v4);
       }
       HashMap hashMap = new HashMap();
       hashMap.put("rerankFeeds", obj);
       String obj1 = null;
       if (PatchProxy.isSupport(k.class)) {
          obj2 = PatchProxy.applyOneRefs(Integer.valueOf(p1), obj1, k.class, "2");
          if (obj2 != PatchProxyResult.class) {
          }else if(i == 90){
             i2 = 5;
          }else if(i == 82){
             i2 = 6;
          }else {
             i2 = 0;
          }
          if (PatchProxy.isSupport(a0.class)) {
             Object obj3 = PatchProxy.applyOneRefs(Integer.valueOf(i2), obj1, a0.class, "5");
             if (obj3 != PatchProxyResult.class) {
                obj2 = obj3;
             }
          }
          obj2 = a0.e(i2, 0);
       }else {
          goto label_00c9 ;
       }
       hashMap.put("clientRealReportData", obj2);
       obj1 = "refreshType";
       if (!q.f(p0) && list.get(0).isAd()) {
          hashMap.put(obj1, Integer.valueOf(1));
       }else {
          hashMap.put(obj1, Integer.valueOf(0));
       }
       d.a(i1).Z6(hashMap, p2, list, p3);
       return a.a.q(hashMap);
    }
}

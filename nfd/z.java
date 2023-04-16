package nfd.z;
import erd.g;
import com.yxcorp.plugin.search.utils.PlayRecommendController$a;
import java.lang.Object;
import com.yxcorp.plugin.search.response.RecoAfterPlayResponse;
import java.util.Objects;
import com.yxcorp.plugin.search.utils.PlayRecommendController;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.LinkedHashMap;
import android.graphics.Paint;
import android.content.res.Resources;
import lnc.a1;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import nfd.t0;
import java.util.Iterator;
import com.yxcorp.plugin.search.entity.RelatedSearchItem;
import java.util.HashMap;
import java.util.Set;
import java.util.Map$Entry;
import com.yxcorp.plugin.search.entity.RecommendAfterClickItem;
import java.util.Map;
import eed.b;
import androidx.fragment.app.Fragment;
import com.yxcorp.plugin.search.entity.SearchItem;

public final class z implements g	// class@001e2f
{
    public final PlayRecommendController$a b;

    public void z(PlayRecommendController$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b2;
       int i1;
       PlayRecommendController$a c;
       LinkedHashMap linkedHashMa1;
       z b = this.b;
       Object obj = p0;
       Objects.requireNonNull(b);
       PlayRecommendController playRecommen = PlayRecommendController.class;
       RecoAfterPlayResponse obj1 = PatchProxy.applyOneRefs(obj, b, PlayRecommendController$a.class, "3");
       int b1 = 2;
       if (obj1 != PatchProxyResult.class) {
          b2 = obj1.booleanValue();
       }else if(obj == null || (q.f(obj.mRecoItems) && (q.f(obj.mCommodityItems) || (!q.f(obj.mCommodityItems) && obj.mCommodityItems.size() < b1)))){
          b2 = false;
       }else {
          b2 = true;
       }
       if (b2) {
          obj1 = obj.mRecoItems;
          ArrayList uArrayList = new ArrayList();
          uArrayList.addAll(obj1);
          PlayRecommendController i = b.c.i;
          int x = PlayRecommendController.x;
          if (PatchProxy.isSupport(playRecommen) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), Integer.valueOf(x), uArrayList, null, PlayRecommendController.class, "30")) {
          label_0137 :
             i1 = 0;
          }else {
             LinkedHashMap linkedHashMa = new LinkedHashMap();
             Paint paint = new Paint();
             paint.setTextSize((float)(int)TypedValue.applyDimension(b1, 14.00f, c.c(a1.m())));
             float f = (float)t0.s;
             float f1 = (((float)i - f) / 2.00f) - f;
             Iterator iterator1 = uArrayList.iterator();
             int i3 = 0;
             while (iterator1.hasNext()) {
                RelatedSearchItem relatedSearc = iterator1.next();
                if (linkedHashMa.get(Integer.valueOf(i3)) == null) {
                   linkedHashMa.put(Integer.valueOf(i3), new ArrayList());
                }
                if (paint.measureText(relatedSearc.mKeywrod) - f1 > 0) {
                   if (linkedHashMa.get(Integer.valueOf(i3)).size() > 0) {
                      i3 = i3 + 1;
                      linkedHashMa.put(Integer.valueOf(i3), new ArrayList());
                   }
                   linkedHashMa.get(Integer.valueOf(i3)).add(relatedSearc);
                   i3 = i3 + true;
                }else {
                   linkedHashMa.get(Integer.valueOf(i3)).add(relatedSearc);
                   if (linkedHashMa.get(Integer.valueOf(i3)).size() == b1) {
                      i3 = i3 + 1;
                   }
                }
             }
             uArrayList.clear();
             if (PatchProxy.isSupport(playRecommen)) {
                linkedHashMa1 = linkedHashMa;
                if (PatchProxy.applyVoidThreeRefs(linkedHashMa, uArrayList, Integer.valueOf(x), null, PlayRecommendController.class, "31")) {
                   goto label_0137 ;
                }
             }else {
                linkedHashMa1 = linkedHashMa;
             }
             b1 = linkedHashMa1.size() - true;
             i1 = x - 1;
             while (b1 > i1) {
                linkedHashMa1.remove(Integer.valueOf(b1));
                b1 = b1 - 1;
             }
             Iterator iterator2 = linkedHashMa1.entrySet().iterator();
             while (iterator2.hasNext()) {
                Map$Entry uEntry = iterator2.next();
                uArrayList.addAll(uEntry.getValue());
                if (uEntry.getValue().size() == 1) {
                   uEntry.getValue().get(0).mIsFullSpan = true;
                }
             }
             if (!PatchProxy.applyVoidOneRefs(uArrayList, null, playRecommen, "32")) {
                b1 = 0;
                while (b1 < uArrayList.size()) {
                   b1 = b1 + 1;
                   uArrayList.get(b1).mPosition = b1;
                }
             }
          }
          obj1.clear();
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             obj1.add(iterator.next());
          }
          if (!PatchProxy.applyVoidOneRefs(obj, b, PlayRecommendController$a.class, "4") && !q.f(obj.mRecoItems)) {
             obj1 = obj.mRecoItems;
             int i2 = 0;
             while (i2 < obj1.size()) {
                RecommendAfterClickItem recommendAft = obj1.get(i2);
                recommendAft.mSessionId = obj.mReqId;
                i2 = i2 + 1;
                recommendAft.mPosition = i2;
             }
          }
          c = b.c;
          PlayRecommendController$a b3 = b.b;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidTwoRefs(b3, obj, c, playRecommen, "10")) {
             b uob = c.m.get(b3);
             if (uob != null) {
                if (c.d.isResumed()) {
                   uob.K2(obj, true);
                }else {
                   c.d(c.f);
                   c.f(b3, obj);
                }
             }
          }
       }
    label_0216 :
       return;
    }
}

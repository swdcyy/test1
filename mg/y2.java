package mg.y2;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsSetActionParam;
import f55.g;
import java.lang.Object;
import og.l;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import j36.d;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import j36.d$b;
import j36.d$c;
import android.util.Pair;
import kotlin.jvm.internal.a;
import java.util.Collection;
import p36.a;
import java.lang.Integer;
import android.view.View;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import r36.b;
import com.feature.post.bridge.jsmodel.JsPostGrowthCallback;

public final class y2 implements Runnable	// class@00267f
{
    public final JsSetActionParam b;
    public final g c;

    public void y2(JsSetActionParam p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       ArrayList uArrayList;
       d$b a;
       JsSetActionParam mViewId;
       y2 tb = this.b;
       y2 tc = this.c;
       int i = 0;
       Object[] objArray = new Object[i];
       l.D().w("JsGrowthBridgeFuns", "sendActions params: "+tb, objArray);
       if (tb == null || TextUtils.x(tb.mViewId)) {
          if (tc != null) {
             tc.onSuccess(JsPostGrowthCallback.getFailedParams(1));
          }
       }else {
          JsSetActionParam mPath = tb.mPath;
          d uod = (mPath == null || !mPath.length())? 1: null;
          Pair pair = null;
          if (!uod) {
             uod = d.c();
             JsSetActionParam mPath1 = tb.mPath;
             Objects.requireNonNull(uod);
             if (PatchProxy.isSupport(d.class)) {
                Boolean tRUE = Boolean.TRUE;
                uArrayList = PatchProxy.applyThreeRefs(mPath1, tRUE, tRUE, uod, d.class, "2");
                if (uArrayList != PatchProxyResult.class) {
                }else {
                label_0067 :
                   uArrayList = new ArrayList();
                   Iterator iterator = uod.a.entrySet().iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      if (!TextUtils.n(uEntry.getKey().a, mPath1) || (uEntry.getValue().b != 1 && uEntry.getValue().b != 2)) {
                      }else {
                         uArrayList.add(new Pair(uEntry.getKey(), uEntry.getValue()));
                         break ;
                      }
                   }
                }
             }else {
                goto label_0067 ;
             }
             a.o(uArrayList, "pages");
             Pair pair1 = (uArrayList.isEmpty() ^ 1)? uArrayList.get(i): pair;
             if (pair1 != null) {
                a = pair1.first.a;
                a.o(a, "page.first.mPath");
                mViewId = tb.mViewId;
                a.o(mViewId, "params.mViewId");
                pair = a.b.c(a, String.valueOf(pair1.first.b.intValue()), mViewId);
             }
          }else {
             ActivityContext uActivityCon = ActivityContext.g();
             a.o(uActivityCon, "ActivityContext.getInstance\(\)");
             mViewId = tb.mViewId;
             a.o(mViewId, "params.mViewId");
             pair = a.b.b(uActivityCon.e(), mViewId);
          }
          if (pair instanceof b) {
             pair = pair.getClickView();
          }
          if (pair == null) {
             if (tc != null) {
                tc.onSuccess(JsPostGrowthCallback.getFailedParams(1));
             }
          }else if(!pair.isEnabled()){
             if (tc != null) {
                tc.onSuccess(JsPostGrowthCallback.getFailedParams(3));
             }
          }else if(pair.callOnClick()){
             if (tc != null) {
                tc.onSuccess(JsPostGrowthCallback.getSuccessParams());
             }
          }else if(tc != null){
             tc.onSuccess(JsPostGrowthCallback.getFailedParams(2));
          }
       }
    label_0156 :
       return;
    }
}

package mg.a3;
import java.lang.Runnable;
import com.kwai.feature.post.api.feature.bridge.JsViewClipAttrUpdateParam;
import f55.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import og.l;
import q87.c;
import android.os.Bundle;
import p36.a;
import android.view.View;
import r36.b;
import android.view.ViewGroup;
import java.lang.Boolean;
import android.view.ViewParent;

public final class a3 implements Runnable	// class@0025cc
{
    public final JsViewClipAttrUpdateParam b;
    public final g c;

    public void a3(JsViewClipAttrUpdateParam p0,g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       Object[] objArray;
       View view;
       a3 tb = this.b;
       a3 tc = this.c;
       a.p(tb, "params");
       if (tb.mRecurseCount <= null) {
          if (tc != null) {
             tc.onSuccess(new JsSuccessResult());
          }
       }else {
          ActivityContext uActivityCon = ActivityContext.g();
          a.o(uActivityCon, "ActivityContext.getInstance\(\)");
          Activity uActivity = uActivityCon.e();
          int i = -1;
          int i1 = 0;
          if (uActivity == null) {
             objArray = new Object[i1];
             l.D().w("PostGrowth", "JsGrowthBridgeFuns activity is null", objArray);
             if (tc != null) {
                tc.a(i, "activity is null", null);
             }
          }else if(tb.mTargetViewId != null){
             JsViewClipAttrUpdateParam mTargetPath = tb.mTargetPath;
             if (mTargetPath != null && tb.mTargetPathId != null) {
                a.o(mTargetPath, "params.mTargetPath");
                JsViewClipAttrUpdateParam mTargetViewI = tb.mTargetViewId;
                a.o(mTargetViewI, "params.mTargetViewId");
                view = a.b.c(mTargetPath, tb.mTargetPathId, mTargetViewI);
             }else {
                view = null;
             }
             if (view == null) {
                JsViewClipAttrUpdateParam mTargetViewI1 = tb.mTargetViewId;
                a.o(mTargetViewI1, "params.mTargetViewId");
                view = a.b.b(uActivity, mTargetViewI1);
             }
             if (view instanceof b) {
                view = view.getTKViewContainer();
             }
          }else {
             view = null;
          }
          if (view == null) {
             objArray = new Object[i1];
             l.D().w("PostGrowth", "JsGrowthBridgeFuns target view is null", objArray);
             if (tc != null) {
                tc.a(i, "target view is null", null);
             }
          }else {
             while (i1 < tb.mRecurseCount && view != null) {
                if (view instanceof ViewGroup) {
                   JsViewClipAttrUpdateParam mClipChildre = tb.mClipChildren;
                   if (mClipChildre != null) {
                      view.setClipChildren(mClipChildre.booleanValue());
                   }
                   mClipChildre = tb.mClipPadding;
                   if (mClipChildre != null) {
                      view.setClipToPadding(mClipChildre.booleanValue());
                   }
                }
                i1 = i1 + 1;
                view = view.getParent();
             }
             if (tc != null) {
                tc.onSuccess(new JsSuccessResult());
             }
          }
       }
       return;
    }
}

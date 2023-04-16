package com.yxcorp.gifshow.hot.spot.view.HotSpotLoadingView;
import com.kwai.written.view.IWrittenLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import msd.l;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.hot.spot.view.HotSpotLoadingView$createView$1;
import java.lang.Integer;
import qrd.l1;
import com.yxcorp.gifshow.hot.spot.view.HotSpotLoadingView$placeHolderView$1;
import android.view.ViewGroup;
import jva.a;

public final class HotSpotLoadingView extends IWrittenLayout	// class@001870
{

    public void HotSpotLoadingView(Context p0){
       a.p(p0, "context");
       super(p0);
    }
    public static LinearLayout$LayoutParams o1(HotSpotLoadingView p0,int p1,int p2,l p3,int p4,Object p5){
       return p0.n1(p1, p2, null);
    }
    public View k1(){
       LinearLayout linearLayout = PatchProxy.apply(null, this, HotSpotLoadingView.class, "1");
       if (linearLayout != PatchProxyResult.class) {
       }else {
          linearLayout = this.X(1, new ViewGroup$LayoutParams(-1, -1), new HotSpotLoadingView$createView$1(this));
       }
       return linearLayout;
    }
    public final LinearLayout$LayoutParams n1(int p0,int p1,l p2){
       LinearLayout$LayoutParams obj;
       if (PatchProxy.isSupport(HotSpotLoadingView.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, HotSpotLoadingView.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LinearLayout$LayoutParams(p0, p1);
       if (p2 != null) {
          p2.invoke(obj);
       }
       return obj;
    }
    public final View p1(LinearLayout p0,int p1,ViewGroup$LayoutParams p2){
       if (PatchProxy.isSupport(HotSpotLoadingView.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, HotSpotLoadingView.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.w0(p0, null, p2, new HotSpotLoadingView$placeHolderView$1(this, p1));
    }
    public final View q1(LinearLayout p0,ViewGroup$LayoutParams p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, HotSpotLoadingView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p1(p0, a.a(2), p1);
    }
}

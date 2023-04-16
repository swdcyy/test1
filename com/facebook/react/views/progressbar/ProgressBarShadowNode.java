package com.facebook.react.views.progressbar.ProgressBarShadowNode;
import lg.e;
import com.facebook.react.uimanager.LayoutShadowNode;
import android.util.SparseIntArray;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import lg.g;
import com.facebook.yoga.YogaMeasureMode;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.lang.Integer;
import java.util.Set;
import ze.n0;
import android.content.Context;
import android.widget.ProgressBar;
import android.view.View$MeasureSpec;
import lg.f;

public class ProgressBarShadowNode extends LayoutShadowNode implements e	// class@0013dc
{
    public String b;
    public final SparseIntArray c;
    public final SparseIntArray d;
    public final Set e;

    public void ProgressBarShadowNode(){
       super();
       this.b = "Normal";
       this.c = new SparseIntArray();
       this.d = new SparseIntArray();
       this.e = new HashSet();
       if (PatchProxy.applyVoid(null, this, ProgressBarShadowNode.class, "1")) {
       }else {
          this.setMeasureFunction(this);
       }
       return;
    }
    public long a(g p0,float p1,YogaMeasureMode p2,float p3,YogaMeasureMode p4){
       if (PatchProxy.isSupport(ProgressBarShadowNode.class)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(p1),p2,Float.valueOf(p3),p4};
          p0 = PatchProxy.apply(objArray, this, ProgressBarShadowNode.class, "2");
          if (p0 != PatchProxyResult.class) {
             return p0.longValue();
          }
       }
       int styleFromStr = ReactProgressBarViewManager.getStyleFromString(this.b);
       if (!this.e.contains(Integer.valueOf(styleFromStr))) {
          ProgressBar progressBar = ReactProgressBarViewManager.createProgressBar(this.getThemedContext(), styleFromStr);
          progressBar.measure(View$MeasureSpec.makeMeasureSpec(-2, 0), View$MeasureSpec.makeMeasureSpec(-2, 0));
          this.c.put(styleFromStr, progressBar.getMeasuredHeight());
          this.d.put(styleFromStr, progressBar.getMeasuredWidth());
          this.e.add(Integer.valueOf(styleFromStr));
       }
       return f.b(this.d.get(styleFromStr), this.c.get(styleFromStr));
    }
    public void setStyle(String p0){
       if (p0 == null) {
          p0 = "Normal";
       }
       this.b = p0;
       return;
    }
}

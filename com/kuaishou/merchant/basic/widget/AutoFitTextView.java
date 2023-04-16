package com.kuaishou.merchant.basic.widget.AutoFitTextView;
import com.kuaishou.merchant.basic.widget.AutoFitRowsView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import android.widget.TextView;
import java.util.HashMap;

public class AutoFitTextView extends AutoFitRowsView	// class@0015ef
{

    public void AutoFitTextView(Context p0){
       super(p0);
    }
    public void AutoFitTextView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void AutoFitTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void e(View p0,int p1,int p2,int p3,int p4,int p5,int p6){
       if (PatchProxy.isSupport(AutoFitTextView.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5),Integer.valueOf(p6)};
          if (PatchProxy.applyVoid(objArray, this, AutoFitTextView.class, "1")) {
             return;
          }
       }
       if (!p0 instanceof TextView) {
          return;
       }else {
          View view = this.j.get(Integer.valueOf(p6));
          if (view == null) {
             super.e(p0, p1, p2, p3, p4, p5, p6);
             return;
          }else {
             p6 = view.getBaseline();
             int baseline = p0.getBaseline();
             if (baseline != p6) {
                baseline = baseline + 2;
             }
             p2 = ((p2 + p5) - p4) - ((p5 - p6) - (p4 - baseline));
             p0.layout(p1, p2, (p3 + p1), (p4 + p2));
             return;
          }
       }
    }
}

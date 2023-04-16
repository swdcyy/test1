package com.kuaishou.ark.rtx.widget.listview.view.FixedNestedRecyclerView;
import com.tachikoma.core.component.recyclerview.view.NestedRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.robust.PatchProxyResult;
import rr.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.tachikoma.core.component.recyclerview.view.CustomRecyclerView;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import java.lang.Number;
import android.util.DisplayMetrics;
import java.lang.Math;

public class FixedNestedRecyclerView extends NestedRecyclerView	// class@000f9e
{
    public boolean p;
    public boolean q;

    public void FixedNestedRecyclerView(Context p0){
       super(p0);
    }
    public void FixedNestedRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void FixedNestedRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onMeasure(int p0,int p1){
       int size;
       Object obj;
       int i1;
       DisplayMetrics uDisplayMetr;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       String str = "1";
       if (PatchProxy.isSupport(FixedNestedRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FixedNestedRecyclerView.class, str)) {
          return;
       }
       if (this.q == null) {
          super.onMeasure(p0, p1);
          return;
       }else {
          int i = Integer.MIN_VALUE;
          if (this.p != null) {
             size = View$MeasureSpec.getSize(p0);
             Context context = this.getContext();
             obj = PatchProxy.applyOneRefs(context, null, uob, str);
             if (obj != patchProxyRe) {
                i1 = obj.intValue();
             }else {
                uDisplayMetr = new DisplayMetrics();
                b.a(context, uDisplayMetr);
                uDisplayMetr = uDisplayMetr.widthPixels;
             }
             i1 = Math.min(i1, size);
             p0 = View$MeasureSpec.getMode(p0);
             if (p0) {
                i = p0;
             }
             p0 = View$MeasureSpec.makeMeasureSpec(i1, i);
          }else {
             size = View$MeasureSpec.getSize(p1);
             Context context1 = this.getContext();
             obj = PatchProxy.applyOneRefs(context1, null, uob, "2");
             if (obj != patchProxyRe) {
                i1 = obj.intValue();
             }else {
                uDisplayMetr = new DisplayMetrics();
                b.a(context1, uDisplayMetr);
                uDisplayMetr = uDisplayMetr.heightPixels;
             }
             i1 = Math.min(i1, size);
             p1 = View$MeasureSpec.getMode(p1);
             if (p1) {
                i = p1;
             }
             p1 = View$MeasureSpec.makeMeasureSpec(i1, i);
          }
          super.onMeasure(p0, p1);
          return;
       }
    }
    public void setIsHorizontal(boolean p0){
       this.p = p0;
    }
    public void setIsNested(boolean p0){
       this.q = p0;
    }
}

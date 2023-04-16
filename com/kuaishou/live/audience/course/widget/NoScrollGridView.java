package com.kuaishou.live.audience.course.widget.NoScrollGridView;
import android.widget.GridView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.AbsListView;
import java.lang.Integer;
import android.view.View$MeasureSpec;

public class NoScrollGridView extends GridView	// class@000c0f
{
    public boolean b;
    public boolean c;

    public void NoScrollGridView(Context p0){
       super(p0);
       this.b = true;
    }
    public void NoScrollGridView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = true;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NoScrollGridView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b == null || super.onInterceptTouchEvent(p0))? true: false;
       return b;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(NoScrollGridView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, NoScrollGridView.class, "2")) {
             return;
          }
       }
       this.c = false;
       super.onLayout(p0, p1, p2, p3, p4);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(NoScrollGridView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, NoScrollGridView.class, "1")) {
          return;
       }
       this.c = true;
       super.onMeasure(p0, View$MeasureSpec.makeMeasureSpec(0x1fffffff, Integer.MIN_VALUE));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NoScrollGridView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.b != null && super.onTouchEvent(p0))? true: false;
       return b;
    }
    public void setClickable(boolean p0){
       this.b = p0;
    }
}

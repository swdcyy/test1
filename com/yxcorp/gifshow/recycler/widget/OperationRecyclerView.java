package com.yxcorp.gifshow.recycler.widget.OperationRecyclerView;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.lang.Integer;
import android.view.View$MeasureSpec;

public final class OperationRecyclerView extends CustomRecyclerView	// class@0017bf
{
    public boolean q;
    public int r;

    public void OperationRecyclerView(Context p0){
       super(p0, null);
    }
    public void OperationRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OperationRecyclerView.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.dispatchTouchEvent(p0);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(OperationRecyclerView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, OperationRecyclerView.class, "2")) {
          return;
       }
       if (this.r > null) {
          p1 = View$MeasureSpec.makeMeasureSpec(this.r, View$MeasureSpec.getMode(p1));
       }
       super.onMeasure(p0, p1);
       return;
    }
    public void setMaxHeight(int p0){
       this.r = p0;
    }
    public final void setNeedIgnoreAfterDetachedFromWindow(boolean p0){
       this.q = p0;
    }
    public void x(){
       if (PatchProxy.applyVoid(null, this, OperationRecyclerView.class, "1")) {
          return;
       }
       if (this.q != null) {
          return;
       }
       super.x();
       return;
    }
}

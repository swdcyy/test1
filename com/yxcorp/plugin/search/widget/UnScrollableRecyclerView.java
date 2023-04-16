package com.yxcorp.plugin.search.widget.UnScrollableRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class UnScrollableRecyclerView extends RecyclerView	// class@0007f3
{
    public boolean b;

    public void UnScrollableRecyclerView(Context p0){
       super(p0);
       this.b = true;
    }
    public void UnScrollableRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = true;
    }
    public void UnScrollableRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = true;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UnScrollableRecyclerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b == null) {
          return false;
       }
       return super.onInterceptTouchEvent(p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UnScrollableRecyclerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b == null) {
          return false;
       }
       return super.onTouchEvent(p0);
    }
    public void setEnableScroll(boolean p0){
       this.b = p0;
    }
}

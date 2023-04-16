package com.yxcorp.gifshow.follow.common.widget.FollowHorizontallyGestureRecyclerView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import iha.a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.ViewGroup;
import com.kwai.library.widget.refresh.RefreshLayout;

public class FollowHorizontallyGestureRecyclerView extends RecyclerView	// class@001089
{
    public final a b;

    public void FollowHorizontallyGestureRecyclerView(Context p0){
       super(p0);
       this.b = new a();
    }
    public void FollowHorizontallyGestureRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new a();
    }
    public void FollowHorizontallyGestureRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new a();
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowHorizontallyGestureRecyclerView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.b.a(p0);
       return super.dispatchTouchEvent(p0);
    }
    public void setRefreshLayout(RefreshLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowHorizontallyGestureRecyclerView.class, "1")) {
          return;
       }
       this.b.b(p0);
       return;
    }
}

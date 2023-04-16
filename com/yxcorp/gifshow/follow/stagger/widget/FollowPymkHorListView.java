package com.yxcorp.gifshow.follow.stagger.widget.FollowPymkHorListView;
import com.yxcorp.gifshow.pymk.widget.PymkHorListView;
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

public class FollowPymkHorListView extends PymkHorListView	// class@00124f
{
    public final a m;

    public void FollowPymkHorListView(Context p0){
       super(p0);
       this.m = new a();
    }
    public void FollowPymkHorListView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.m = new a();
    }
    public void FollowPymkHorListView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.m = new a();
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowPymkHorListView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.m.a(p0);
       return super.dispatchTouchEvent(p0);
    }
    public void setRefreshLayout(RefreshLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowPymkHorListView.class, "1")) {
          return;
       }
       this.m.b(p0);
       return;
    }
}

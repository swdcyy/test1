package com.kuaishou.live.core.show.guestactivity.LiveAudienceGuestActivityRecyclerView;
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
import android.view.ViewParent;
import android.view.ViewGroup;

public class LiveAudienceGuestActivityRecyclerView extends CustomRecyclerView	// class@000bc6
{

    public void LiveAudienceGuestActivityRecyclerView(Context p0){
       super(p0);
    }
    public void LiveAudienceGuestActivityRecyclerView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void LiveAudienceGuestActivityRecyclerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceGuestActivityRecyclerView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.getParent().requestDisallowInterceptTouchEvent(true);
       return super.dispatchTouchEvent(p0);
    }
}

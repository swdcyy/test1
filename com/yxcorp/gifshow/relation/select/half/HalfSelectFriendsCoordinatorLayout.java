package com.yxcorp.gifshow.relation.select.half.HalfSelectFriendsCoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public class HalfSelectFriendsCoordinatorLayout extends CoordinatorLayout	// class@00199d
{

    public void HalfSelectFriendsCoordinatorLayout(Context p0){
       super(p0);
    }
    public void HalfSelectFriendsCoordinatorLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void HalfSelectFriendsCoordinatorLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HalfSelectFriendsCoordinatorLayout.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          return super.onInterceptTouchEvent(p0);
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
          Log.e("HalfSelectFriends", "onInterceptTouchEvent", e3);
          return false;
       }
    }
}

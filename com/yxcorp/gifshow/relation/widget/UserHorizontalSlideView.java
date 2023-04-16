package com.yxcorp.gifshow.relation.widget.UserHorizontalSlideView;
import com.kwai.library.widget.scrollview.HorizontalSlideView;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.HorizontalScrollView;
import android.view.View;
import com.yxcorp.utility.n;

public class UserHorizontalSlideView extends HorizontalSlideView	// class@001a62
{

    public void UserHorizontalSlideView(Context p0){
       super(p0);
    }
    public void UserHorizontalSlideView(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void UserHorizontalSlideView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, UserHorizontalSlideView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.b()) {
          this.requestDisallowInterceptTouchEvent(true);
          if (!n.N(this.getSecondView(), p0) && !p0.getActionMasked()) {
             return false;
          }
       }
       return super.onInterceptTouchEvent(p0);
    }
}

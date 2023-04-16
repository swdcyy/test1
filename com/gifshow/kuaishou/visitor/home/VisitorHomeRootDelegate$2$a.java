package com.gifshow.kuaishou.visitor.home.VisitorHomeRootDelegate$2$a;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.gifshow.kuaishou.visitor.home.VisitorHomeRootDelegate$2;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.HomeActivity;
import android.app.Activity;
import com.kuaishou.growth.privacy.dialog.helper.PrivacyDialogHelper;

public class VisitorHomeRootDelegate$2$a extends GestureDetector$SimpleOnGestureListener	// class@0015d8
{
    public final VisitorHomeRootDelegate$2 b;

    public void VisitorHomeRootDelegate$2$a(VisitorHomeRootDelegate$2 p0){
       this.b = p0;
       super();
    }
    public void onLongPress(MotionEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VisitorHomeRootDelegate$2$a.class, "1")) {
          return;
       }
       VisitorHomeRootDelegate$2$a tb = this.b;
       tb.b = true;
       tb.f.dispatchTouchEvent(MotionEvent.obtain(p0.getDownTime(), p0.getEventTime(), 3, p0.getX(), p0.getY(), p0.getMetaState()));
       PrivacyDialogHelper.q(HomeActivity.H3());
       return;
    }
    public boolean onSingleTapUp(MotionEvent p0){
       return false;
    }
}

package com.kuaishou.live.gameinteractive.ui.GameInteractiveBoardContainer;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import android.view.MotionEvent;
import java.lang.Boolean;

public class GameInteractiveBoardContainer extends FrameLayout	// class@001bf6
{
    public ViewParent b;

    public void GameInteractiveBoardContainer(Context p0){
       super(p0);
    }
    public void GameInteractiveBoardContainer(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void GameInteractiveBoardContainer(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public final ViewParent a(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GameInteractiveBoardContainer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ViewParent parent = p0.getParent();
       if (parent == null) {
          return parent;
       }
       if (parent instanceof VerticalViewPager) {
          return parent;
       }
       if (parent instanceof View) {
          parent = this.a(parent);
       }
       return parent;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       GameInteractiveBoardContainer obj = PatchProxy.applyOneRefs(p0, this, GameInteractiveBoardContainer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int actionMasked = p0.getActionMasked();
       if (this.b == null) {
          this.b = this.a(this);
       }
       obj = this.b;
       if (obj == null) {
          return false;
       }else if(actionMasked && actionMasked != 2){
          obj.requestDisallowInterceptTouchEvent(false);
       }else {
          obj.requestDisallowInterceptTouchEvent(true);
       }
       return false;
    }
}

package com.kwai.component.photo.reduce.PhotoReduceReasonFragment$a;
import android.view.View$OnTouchListener;
import com.kwai.component.photo.reduce.PhotoReduceReasonFragment;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Rect;

public class PhotoReduceReasonFragment$a implements View$OnTouchListener	// class@000ad4
{
    public final PhotoReduceReasonFragment b;

    public void PhotoReduceReasonFragment$a(PhotoReduceReasonFragment p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, PhotoReduceReasonFragment$a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       if (!p1.getAction()) {
          Rect rect = new Rect();
          this.b.J.getGlobalVisibleRect(rect);
          if (!rect.contains((int)p1.getX(), (int)p1.getY())) {
             return true;
          }
       }else if(p1.getAction() == 1){
          this.b.dismissAllowingStateLoss();
       }
       return false;
    }
}

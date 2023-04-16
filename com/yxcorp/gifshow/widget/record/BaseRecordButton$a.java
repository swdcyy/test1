package com.yxcorp.gifshow.widget.record.BaseRecordButton$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.widget.record.BaseRecordButton;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.content.Context;
import android.app.Activity;
import e3a.a;
import com.yxcorp.utility.n;
import android.graphics.Point;

public class BaseRecordButton$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0019ae
{
    public final BaseRecordButton b;

    public void BaseRecordButton$a(BaseRecordButton p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, BaseRecordButton$a.class, "1")) {
          return;
       }
       this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       int[] ointArray = new int[2];
       this.b.getLocationOnScreen(ointArray);
       Activity uActivity = a.b(this.b.getContext());
       if (uActivity != null) {
          this.b.f = new Point(ointArray[0], (ointArray[1] - n.A(uActivity)));
          this.b.e = new Point(n.k(uActivity), n.j(uActivity));
       }
       return;
    }
}

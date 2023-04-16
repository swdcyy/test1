package com.yxcorp.gifshow.prettify.widget.SizeChangeNotifyFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.prettify.widget.SizeChangeNotifyFrameLayout$a;

public class SizeChangeNotifyFrameLayout extends FrameLayout	// class@0011e2
{
    public List b;

    public void SizeChangeNotifyFrameLayout(Context p0){
       super(p0);
    }
    public void SizeChangeNotifyFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void SizeChangeNotifyFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(SizeChangeNotifyFrameLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SizeChangeNotifyFrameLayout.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       SizeChangeNotifyFrameLayout tb = this.b;
       if (tb != null) {
          Iterator iterator = tb.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
       }
       return;
    }
}

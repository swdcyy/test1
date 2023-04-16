package com.yxcorp.gifshow.follow.stagger.view.SizeChangeListeningFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.View;
import com.yxcorp.gifshow.follow.stagger.view.SizeChangeListeningFrameLayout$a;

public class SizeChangeListeningFrameLayout extends FrameLayout	// class@00124e
{
    public SizeChangeListeningFrameLayout$a b;

    public void SizeChangeListeningFrameLayout(Context p0){
       super(p0);
    }
    public void SizeChangeListeningFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void SizeChangeListeningFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(SizeChangeListeningFrameLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, SizeChangeListeningFrameLayout.class, "1")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       SizeChangeListeningFrameLayout tb = this.b;
       if (tb != null) {
          tb.onSizeChanged(p0, p1, p2, p3);
       }
       return;
    }
    public void setOnSizeChangeListener(SizeChangeListeningFrameLayout$a p0){
       this.b = p0;
    }
}

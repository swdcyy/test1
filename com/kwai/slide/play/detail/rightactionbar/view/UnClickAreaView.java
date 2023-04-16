package com.kwai.slide.play.detail.rightactionbar.view.UnClickAreaView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.slide.play.detail.rightactionbar.view.UnClickAreaView$a;
import android.view.View$OnClickListener;

public final class UnClickAreaView extends View	// class@001876
{
    public HashMap b;

    public void UnClickAreaView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void UnClickAreaView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void UnClickAreaView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.setOnClickListener(UnClickAreaView$a.b);
    }
    public void UnClickAreaView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
}

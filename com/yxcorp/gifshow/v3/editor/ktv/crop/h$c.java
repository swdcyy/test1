package com.yxcorp.gifshow.v3.editor.ktv.crop.h$c;
import com.yxcorp.gifshow.widget.CustomHorizontalScroller$b;
import com.yxcorp.gifshow.v3.editor.ktv.crop.h;
import java.lang.Object;
import android.graphics.Canvas;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.HorizontalScrollView;
import java.util.Objects;
import com.yxcorp.gifshow.v3.editor.ktv.crop.KtvBaseTimeLineView;
import java.lang.Integer;
import java.lang.Math;
import android.widget.FrameLayout;

public class h$c implements CustomHorizontalScroller$b	// class@000fca
{
    public final h a;

    public void h$c(h p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
    }
    public void b(){
    }
    public void c(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h$c.class, "1")) {
          return;
       }
       h$c ta = this.a;
       h y = ta.y;
       int scrollX = ta.p.getScrollX();
       Objects.requireNonNull(y);
       if (!PatchProxy.isSupport(KtvBaseTimeLineView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(scrollX), y, KtvBaseTimeLineView.class, "2")) {
          y.t = Math.max(0, (((float)scrollX - y.o) - y.q));
          y.invalidate();
       }
       return;
    }
}

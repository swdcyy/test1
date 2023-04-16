package com.yxcorp.gifshow.editor.fine.tuning.widget.ScrollSpeedLinearLayoutManger$a;
import androidx.recyclerview.widget.o;
import com.yxcorp.gifshow.editor.fine.tuning.widget.ScrollSpeedLinearLayoutManger;
import android.content.Context;
import android.graphics.PointF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.util.DisplayMetrics;

public class ScrollSpeedLinearLayoutManger$a extends o	// class@001bae
{
    public final ScrollSpeedLinearLayoutManger q;

    public void ScrollSpeedLinearLayoutManger$a(ScrollSpeedLinearLayoutManger p0,Context p1){
       this.q = p0;
       super(p1);
    }
    public PointF a(int p0){
       ScrollSpeedLinearLayoutManger$a uoa = ScrollSpeedLinearLayoutManger$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.q.computeScrollVectorForPosition(p0);
    }
    public float v(DisplayMetrics p0){
       return (this.q.r / p0.density);
    }
}

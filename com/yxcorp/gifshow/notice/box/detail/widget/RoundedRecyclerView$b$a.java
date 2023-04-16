package com.yxcorp.gifshow.notice.box.detail.widget.RoundedRecyclerView$b$a;
import android.view.ViewOutlineProvider;
import com.yxcorp.gifshow.notice.box.detail.widget.RoundedRecyclerView$b;
import com.yxcorp.gifshow.notice.box.detail.widget.RoundedRecyclerView;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;

public class RoundedRecyclerView$b$a extends ViewOutlineProvider	// class@002177
{
    public final RoundedRecyclerView a;
    public final RoundedRecyclerView$b b;

    public void RoundedRecyclerView$b$a(RoundedRecyclerView$b p0,RoundedRecyclerView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RoundedRecyclerView$b$a.class, "1")) {
          return;
       }
       RoundedRecyclerView$b$a tb = this.b;
       p1.setRoundRect(tb.a, tb.g.c);
       return;
    }
}

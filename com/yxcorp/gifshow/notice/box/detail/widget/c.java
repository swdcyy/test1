package com.yxcorp.gifshow.notice.box.detail.widget.c;
import android.view.ViewOutlineProvider;
import com.yxcorp.gifshow.notice.box.detail.widget.RoundedRecyclerView$b;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.notice.box.detail.widget.RoundedRecyclerView;
import android.graphics.Rect;

public class c extends ViewOutlineProvider	// class@002181
{
    public final RoundedRecyclerView$b a;

    public void c(RoundedRecyclerView$b p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "1")) {
          return;
       }
       c ta = this.a;
       p1.setRoundRect(ta.a, ta.g.c);
       return;
    }
}

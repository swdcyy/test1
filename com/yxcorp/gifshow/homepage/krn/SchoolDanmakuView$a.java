package com.yxcorp.gifshow.homepage.krn.SchoolDanmakuView$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.homepage.krn.SchoolDanmakuView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.animation.Interpolator;

public class SchoolDanmakuView$a extends RecyclerView$r	// class@001763
{
    public final SchoolDanmakuView a;

    public void SchoolDanmakuView$a(SchoolDanmakuView p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       SchoolDanmakuView$a uoa = SchoolDanmakuView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (!p1) {
          int i = this.a.computeHorizontalScrollRange();
          this.a.scrollBy((- i), 0);
          SchoolDanmakuView$a ta = this.a;
          int i1 = (int)((float)i * 6.25f);
          ta.e = i1;
          ta.smoothScrollBy(i, 0, ta.d, i1);
       }
       return;
    }
}

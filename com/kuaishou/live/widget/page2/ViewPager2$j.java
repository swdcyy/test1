package com.kuaishou.live.widget.page2.ViewPager2$j;
import androidx.recyclerview.widget.t;
import com.kuaishou.live.widget.page2.ViewPager2;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class ViewPager2$j extends t	// class@001038
{
    public final ViewPager2 f;

    public void ViewPager2$j(ViewPager2 p0){
       this.f = p0;
       super();
    }
    public View h(RecyclerView$LayoutManager p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ViewPager2$j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = (this.f.b())? null: super.h(p0);
       return view;
    }
}

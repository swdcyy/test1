package com.yxcorp.gifshow.hot.spot.view.HotSpotTodayListPartViewV2$createView$1$a;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import lnc.a1;

public final class HotSpotTodayListPartViewV2$createView$1$a extends RecyclerView$n	// class@001886
{

    public void HotSpotTodayListPartViewV2$createView$1$a(){
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, HotSpotTodayListPartViewV2$createView$1$a.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       int childAdapter = p2.getChildAdapterPosition(p1);
       RecyclerView$Adapter adapter = p2.getAdapter();
       int itemCount = (adapter != null)? adapter.getItemCount(): 0;
       int i = 4;
       p0.left = (childAdapter < i)? a1.d(0x7f070283): a1.d(0x7f070295);
       int i1 = itemCount % 4;
       if (i1) {
          i = i1;
       }
       if (itemCount > 0 && childAdapter >= (itemCount - i)) {
          p0.right = a1.d(0x7f0702ab);
       }
       return;
    }
}

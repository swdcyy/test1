package com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$a;
import androidx.recyclerview.widget.p;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.slipmode.ui.HGalleryLayoutManager$c;
import androidx.recyclerview.widget.o;
import android.content.Context;
import android.view.ViewGroup;

public class HGalleryLayoutManager$a extends p	// class@000f24
{
    public final HGalleryLayoutManager f;

    public void HGalleryLayoutManager$a(HGalleryLayoutManager p0){
       this.f = p0;
       super();
    }
    public int[] c(RecyclerView$LayoutManager p0,View p1){
       int[] obj = PatchProxy.applyTwoRefs(p0, p1, this, HGalleryLayoutManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.c(p0, p1);
       obj = new int[2];
       obj[0] = (p0.canScrollHorizontally())? HGalleryLayoutManager$c.D(p1, p0): 0;
       obj[1] = 0;
       return obj;
    }
    public o f(RecyclerView$LayoutManager p0){
       return new HGalleryLayoutManager$c(this.f.n.getContext());
    }
}

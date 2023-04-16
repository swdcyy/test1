package com.yxcorp.gifshow.home.block.topbar.view.BlockTabView$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.home.block.topbar.view.BlockTabView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.FrameLayout;

public final class BlockTabView$b implements Runnable	// class@00168b
{
    public final BlockTabView b;

    public void BlockTabView$b(BlockTabView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, BlockTabView$b.class, "1")) {
          return;
       }
       this.b.requestLayout();
       return;
    }
}

package com.yxcorp.gifshow.follow.stagger.presenter.y$a;
import androidx.recyclerview.widget.RecyclerView$i;
import com.yxcorp.gifshow.follow.stagger.presenter.y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import eja.y0;
import java.lang.Runnable;
import android.view.ViewGroup;

public class y$a extends RecyclerView$i	// class@001225
{
    public final y a;

    public void y$a(y p0){
       this.a = p0;
       super();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, y$a.class, "1")) {
          return;
       }
       this.a.t.h0().postDelayed(new y0(this), 300);
       return;
    }
}

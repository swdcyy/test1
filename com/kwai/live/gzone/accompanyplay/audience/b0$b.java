package com.kwai.live.gzone.accompanyplay.audience.b0$b;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kwai.live.gzone.accompanyplay.audience.b0;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import d61.y;
import com.yxcorp.utility.n;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class b0$b extends RecyclerView$n	// class@000b69
{
    public int a;
    public final b0 b;

    public void b0$b(b0 p0){
       this.b = p0;
       super();
       Context context = p0.getContext();
       float f = (y.d(p0.getActivity()))? 2.00f: 8.00f;
       this.a = n.c(context, f);
       return;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b0$b.class, "1")) {
          return;
       }
       int childAdapter = p2.getChildAdapterPosition(p1);
       b0$b ta = this.a;
       p0.left = ta;
       p0.right = ta;
       if (!childAdapter) {
          p0.left = 0;
       }else if(childAdapter == (p2.getAdapter().getItemCount() - 1)){
          p0.right = 0;
       }
       return;
    }
}

package com.yxcorp.gifshow.photo.download.presenter.c$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.photo.download.presenter.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.view.ViewGroup;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gxb.p;
import lnc.c3$a;
import lnc.c3;

public class c$a implements Runnable	// class@000edf
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "1")) {
          return;
       }
       c p = this.b.p;
       if (p != null) {
          int i = 0;
          if (p.getChildAt(i) != null) {
             c3.c(this.b.p.getLayoutManager(), new p(this, (((this.b.p.getWidth() / 2) - (this.b.p.getChildAt(i).getWidth() / 2)) - a1.e(8.00f))));
          }
       }
       return;
    }
}

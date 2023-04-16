package com.yxcorp.gifshow.follow.stagger.container.presenter.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.follow.stagger.container.presenter.c;
import e6a.c;
import java.lang.Object;
import y8c.g;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import jia.g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import foc.t;
import foc.y;
import oia.e;
import lnc.c3$a;
import lnc.c3;

public final class b implements Runnable	// class@00115d
{
    public final c b;
    public final int c;
    public final c d;

    public void b(c p0,int p1,c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       boolean b;
       b tb = this.b;
       b td = this.d;
       View view = tb.q.h0().getLayoutManager().findViewByPosition((this.c + tb.q.g7().t1()));
       c c = td.c;
       if (c != null) {
          QPhoto mEntity = c.mEntity;
          if (mEntity != null && r1.S2(mEntity)) {
             b = true;
          label_0034 :
             c d = td.d;
             if (!PatchProxy.isSupport(c.class) || (!PatchProxy.applyVoidThreeRefs(Integer.valueOf(d), view, Boolean.valueOf(b), tb, c.class, "12") && view != null)) {
                c3.c(y.a(d), new e(view, b));
             }
             return;
          }
       }
       b = false;
       goto label_0034 ;
    }
}

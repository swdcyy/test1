package com.yxcorp.gifshow.relation.explore.search.i$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.explore.search.i;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.utility.n;

public class i$b extends m	// class@00187f
{
    public final i c;

    public void i$b(i p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i$b.class, "1")) {
          return;
       }
       n.C(this.c.getActivity());
       this.c.P8();
       return;
    }
}

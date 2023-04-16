package com.yxcorp.gifshow.detail.comment.limitcomment.h;
import sfc.a;
import com.yxcorp.gifshow.detail.comment.limitcomment.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class h extends a	// class@00137f
{
    public final g c;

    public void h(g p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.getActivity().finish();
       return;
    }
}

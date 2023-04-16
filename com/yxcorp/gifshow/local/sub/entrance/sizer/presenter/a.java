package com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.a;
import erd.g;
import com.yxcorp.gifshow.local.sub.entrance.sizer.presenter.HomeLocalSizerViewPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.local.sub.entrance.sizer.model.NearbySubSizerResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import com.yxcorp.gifshow.local.sub.entrance.sizer.view.HomeLocalSizerView;
import f2b.e;
import java.lang.Runnable;
import android.widget.FrameLayout;

public final class a implements g	// class@001ac8
{
    public final HomeLocalSizerViewPresenter b;

    public void a(HomeLocalSizerViewPresenter p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       HomeLocalSizerViewPresenter homeLocalSiz = HomeLocalSizerViewPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, homeLocalSiz, "11")) {
       }else if(p0 == null){
          tb.P8();
          if (!PatchProxy.applyVoid(null, tb, homeLocalSiz, "13")) {
             p0 = tb.x;
             if (p0 != null && !p0.getSizerContainer().getVisibility()) {
                tb.x.post(new e(tb));
             }
          }
       }
       return;
    }
}

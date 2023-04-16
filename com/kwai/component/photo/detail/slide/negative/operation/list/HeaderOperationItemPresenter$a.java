package com.kwai.component.photo.detail.slide.negative.operation.list.HeaderOperationItemPresenter$a;
import android.view.View$OnClickListener;
import com.kwai.component.photo.detail.slide.negative.operation.list.HeaderOperationItemPresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mf5.w0;
import kotlin.jvm.internal.a;
import kf5.g;

public final class HeaderOperationItemPresenter$a implements View$OnClickListener	// class@000a83
{
    public final HeaderOperationItemPresenter b;

    public void HeaderOperationItemPresenter$a(HeaderOperationItemPresenter p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HeaderOperationItemPresenter$a.class, "1")) {
          return;
       }
       w0 ow0 = HeaderOperationItemPresenter.P8(this.b);
       w0 ow01 = HeaderOperationItemPresenter.P8(this.b);
       HeaderOperationItemPresenter q = this.b.q;
       if (q == null) {
          a.S("mIMoreOperationPanel");
       }
       ow0.d(ow01, q);
       return;
    }
}

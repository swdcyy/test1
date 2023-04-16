package com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideCollectPresenter$a;
import d6a.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideCollectPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.nonslide.toolbar.widget.CollectView;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaProfileSideCollectPresenter$a$a;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;

public final class NasaProfileSideCollectPresenter$a extends a	// class@001914
{
    public final NasaProfileSideCollectPresenter b;

    public void NasaProfileSideCollectPresenter$a(NasaProfileSideCollectPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, NasaProfileSideCollectPresenter$a.class, "2")) {
          return;
       }
       this.b.s = false;
       return;
    }
    public void i2(){
       NasaProfileSideCollectPresenter r;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NasaProfileSideCollectPresenter$a.class, "1")) {
          return;
       }
       NasaProfileSideCollectPresenter$a tb = this.b;
       tb.s = true;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, NasaProfileSideCollectPresenter.class, "9")) {
          r = tb.r;
          if (r == null) {
             a.S("mCollectView");
          }
          r.a();
       }
       this.b.S8();
       this.b.R8();
       r = this.b.r;
       if (r == null) {
          a.S("mCollectView");
       }
       r.setOnClickListener(new NasaProfileSideCollectPresenter$a$a(this));
       return;
    }
}

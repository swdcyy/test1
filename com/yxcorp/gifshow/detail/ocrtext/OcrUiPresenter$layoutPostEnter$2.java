package com.yxcorp.gifshow.detail.ocrtext.OcrUiPresenter$layoutPostEnter$2;
import androidx.lifecycle.LifecycleObserver;
import f3a.l;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.yxcorp.gifshow.detail.ocrtext.OcrFragment;
import uw9.o;
import q87.c;

public final class OcrUiPresenter$layoutPostEnter$2 implements LifecycleObserver	// class@001601
{
    public final l b;

    public void OcrUiPresenter$layoutPostEnter$2(l p0){
       this.b = p0;
       super();
    }
    public final void onResume(){
       if (PatchProxy.applyVoid(null, this, OcrUiPresenter$layoutPostEnter$2.class, "1")) {
          return;
       }
       OcrUiPresenter$layoutPostEnter$2 tb = this.b;
       if (tb.y != null) {
          tb.y = false;
          Fragment uFragment = l.R8(tb);
          Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.yxcorp.gifshow.detail.ocrtext.OcrFragment");
          uFragment.Hh(false);
          Object[] objArray = new Object[false];
          o.C().w("OcrUiPresenter", "onResume closeWhenResume", objArray);
       }
       return;
    }
}

package com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$g;
import erd.g;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PhotoSharePresenter$g implements g	// class@0017a3
{
    public final PhotoSharePresenter b;

    public void PhotoSharePresenter$g(PhotoSharePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoSharePresenter$g.class, "1")) {
       }else {
          a.p(p0, "fragmentEvent");
          if (p0 == FragmentEvent.STOP) {
             p0.S = true;
          }else if(p0 == FragmentEvent.START){
             p0 = this.b;
             p0.S = false;
             if (p0.R == null) {
                p0.V8();
             }
          }
       }
       return;
    }
}

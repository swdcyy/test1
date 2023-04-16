package com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$e;
import java.lang.Runnable;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class PhotoSharePresenter$e implements Runnable	// class@00179f
{
    public final PhotoSharePresenter b;

    public void PhotoSharePresenter$e(PhotoSharePresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       PhotoSharePresenter$e tb;
       if (PatchProxy.applyVoid(null, this, PhotoSharePresenter$e.class, "1")) {
          return;
       }
       View[] viewArray = new View[]{tb.C,tb.B,tb.D};
       tb = this.b;
       n.Z(8, viewArray);
       Boolean fALSE = Boolean.FALSE;
       this.b.y.onNext(fALSE);
       this.b.A.onNext(fALSE);
       return;
    }
}

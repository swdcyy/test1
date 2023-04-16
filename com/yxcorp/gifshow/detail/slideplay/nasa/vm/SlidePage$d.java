package com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage$d;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import v6a.m0;
import io.reactivex.subjects.PublishSubject;

public final class SlidePage$d implements Observer	// class@0017d6
{
    public final SlidePage b;

    public void SlidePage$d(SlidePage p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, SlidePage$d.class, "1")) {
       }else {
          this.b.d1().B0.onNext(p0);
          PatchProxy.onMethodExit(SlidePage$d.class, "1");
       }
       return;
    }
}

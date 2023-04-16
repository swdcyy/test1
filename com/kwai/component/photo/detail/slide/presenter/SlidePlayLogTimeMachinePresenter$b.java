package com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter$b;
import java.lang.Runnable;
import com.kwai.component.photo.detail.slide.presenter.SlidePlayLogTimeMachinePresenter;
import java.util.ArrayList;
import cda.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import kotlin.jvm.internal.a;
import java.util.List;
import trd.t;
import java.util.Collection;

public final class SlidePlayLogTimeMachinePresenter$b implements Runnable	// class@000a8a
{
    public final SlidePlayLogTimeMachinePresenter b;
    public final ArrayList c;
    public final i d;

    public void SlidePlayLogTimeMachinePresenter$b(SlidePlayLogTimeMachinePresenter p0,ArrayList p1,i p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SlidePlayLogTimeMachinePresenter$b.class, "1")) {
          return;
       }
       Iterator iterator = this.c.iterator();
       while (true) {
          if (iterator.hasNext()) {
             Object obj = iterator.next();
             if (a.g(obj.getPhotoId(), this.d.a)) {
                objArray = obj;
             }
          }
          if (objArray != null) {
             this.b.R8("reduce feed", t.k(objArray));
             break ;
          }
          break ;
       }
       return;
    }
}

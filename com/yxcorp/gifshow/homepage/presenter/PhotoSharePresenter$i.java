package com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$i;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dsa.e;
import q87.c;

public final class PhotoSharePresenter$i implements g	// class@0017a6
{
    public static final PhotoSharePresenter$i b;

    static {
       PhotoSharePresenter$i.b = new PhotoSharePresenter$i();
    }
    public void PhotoSharePresenter$i(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoSharePresenter$i.class, "1")) {
       }else {
          e.C().e("PhotoSharePresenter", "load RecordPostPlugin plugin error", p0);
       }
       return;
    }
}

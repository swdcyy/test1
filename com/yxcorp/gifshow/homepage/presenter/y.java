package com.yxcorp.gifshow.homepage.presenter.y;
import ok.h;
import com.yxcorp.gifshow.homepage.presenter.z;
import java.lang.Object;
import java.lang.Void;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import yta.f2;
import sfc.a;
import erd.g;
import crd.b;

public final class y implements h	// class@0017ee
{
    public final z b;

    public void y(z p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       y tb = this.b;
       f2 uof2 = new f2(tb);
       return tb.t.getUser().observable().subscribe(uof2, new a());
    }
}

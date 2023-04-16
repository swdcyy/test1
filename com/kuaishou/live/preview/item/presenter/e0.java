package com.kuaishou.live.preview.item.presenter.e0;
import ok.h;
import com.kuaishou.live.preview.item.presenter.g0;
import com.kwai.framework.model.user.User;
import java.lang.Object;
import java.lang.Void;
import java.util.Objects;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import dl3.b1;
import erd.g;
import crd.b;

public final class e0 implements h	// class@000e1c
{
    public final g0 b;
    public final User c;

    public void e0(g0 p0,User p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       e0 tb = this.b;
       Objects.requireNonNull(tb);
       return this.c.observable().subscribe(new b1(tb));
    }
}

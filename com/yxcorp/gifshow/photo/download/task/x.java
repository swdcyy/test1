package com.yxcorp.gifshow.photo.download.task.x;
import io.reactivex.g;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import exb.b;
import java.lang.Object;
import brd.v;
import com.yxcorp.gifshow.photo.download.task.w;
import brd.t;
import t45.d;
import brd.z;
import java.util.Objects;
import ixb.a1;
import erd.a;
import ixb.e1;
import q14.n;
import erd.g;
import crd.b;

public final class x implements g	// class@000f1d
{
    public final QPhoto b;
    public final boolean c;
    public final StatModel d;
    public final b e;

    public void x(QPhoto p0,boolean p1,StatModel p2,b p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void subscribe(v p0){
       Objects.requireNonNull(p0);
       t.create(new w(this.b, this.c, this.d)).subscribeOn(d.c).observeOn(d.a).doOnComplete(new a1(p0)).subscribe(new e1(this.e, p0), new n(p0));
    }
}

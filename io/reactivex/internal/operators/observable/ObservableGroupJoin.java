package io.reactivex.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import erd.o;
import erd.c;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableGroupJoin$GroupJoinDisposable;
import crd.b;
import io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightObserver;
import io.reactivex.internal.operators.observable.ObservableGroupJoin$a;
import crd.a;

public final class ObservableGroupJoin extends a	// class@00131a
{
    public final w c;
    public final o d;
    public final o e;
    public final c f;

    public void ObservableGroupJoin(w p0,w p1,o p2,o p3,c p4){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void subscribeActual(y p0){
       ObservableGroupJoin$GroupJoinDisposable groupJoinDis = new ObservableGroupJoin$GroupJoinDisposable(p0, this.d, this.e, this.f);
       p0.onSubscribe(groupJoinDis);
       ObservableGroupJoin$LeftRightObserver leftRightObs = new ObservableGroupJoin$LeftRightObserver(groupJoinDis, true);
       groupJoinDis.disposables.c(leftRightObs);
       ObservableGroupJoin$LeftRightObserver leftRightObs1 = new ObservableGroupJoin$LeftRightObserver(groupJoinDis, false);
       groupJoinDis.disposables.c(leftRightObs1);
       this.b.subscribe(leftRightObs);
       this.c.subscribe(leftRightObs1);
    }
}

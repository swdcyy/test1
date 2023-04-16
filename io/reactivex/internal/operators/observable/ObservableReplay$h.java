package io.reactivex.internal.operators.observable.ObservableReplay$h;
import io.reactivex.internal.operators.observable.ObservableReplay$a;
import java.util.concurrent.TimeUnit;
import brd.z;
import java.lang.Object;
import io.reactivex.internal.operators.observable.ObservableReplay$e;
import io.reactivex.internal.operators.observable.ObservableReplay$SizeAndTimeBoundReplayBuffer;

public final class ObservableReplay$h implements ObservableReplay$a	// class@00134d
{
    public final int a;
    public final long b;
    public final TimeUnit c;
    public final z d;

    public void ObservableReplay$h(int p0,long p1,TimeUnit p2,z p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public ObservableReplay$e call(){
       ObservableReplay$SizeAndTimeBoundReplayBuffer sizeAndTimeB = new ObservableReplay$SizeAndTimeBoundReplayBuffer(this.a, this.b, this.c, this.d);
       return v6;
    }
}

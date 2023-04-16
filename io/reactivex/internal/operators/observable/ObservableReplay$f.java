package io.reactivex.internal.operators.observable.ObservableReplay$f;
import io.reactivex.internal.operators.observable.ObservableReplay$a;
import java.lang.Object;
import io.reactivex.internal.operators.observable.ObservableReplay$e;
import io.reactivex.internal.operators.observable.ObservableReplay$SizeBoundReplayBuffer;

public final class ObservableReplay$f implements ObservableReplay$a	// class@00134b
{
    public final int a;

    public void ObservableReplay$f(int p0){
       super();
       this.a = p0;
    }
    public ObservableReplay$e call(){
       return new ObservableReplay$SizeBoundReplayBuffer(this.a);
    }
}

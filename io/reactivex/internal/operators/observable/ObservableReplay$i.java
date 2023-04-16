package io.reactivex.internal.operators.observable.ObservableReplay$i;
import io.reactivex.internal.operators.observable.ObservableReplay$a;
import java.lang.Object;
import io.reactivex.internal.operators.observable.ObservableReplay$e;
import io.reactivex.internal.operators.observable.ObservableReplay$UnboundedReplayBuffer;

public final class ObservableReplay$i implements ObservableReplay$a	// class@00134e
{

    public void ObservableReplay$i(){
       super();
    }
    public ObservableReplay$e call(){
       return new ObservableReplay$UnboundedReplayBuffer(16);
    }
}

package io.reactivex.internal.operators.observable.ObservableReplay$SizeBoundReplayBuffer;
import io.reactivex.internal.operators.observable.ObservableReplay$BoundedReplayBuffer;

public final class ObservableReplay$SizeBoundReplayBuffer extends ObservableReplay$BoundedReplayBuffer	// class@001344
{
    public final int limit;
    public static final long serialVersionUID = 0xae25160e83344772;

    public void ObservableReplay$SizeBoundReplayBuffer(int p0){
       super();
       this.limit = p0;
    }
    public void truncate(){
       if (this.size > this.limit) {
          this.removeFirst();
       }
       return;
    }
}

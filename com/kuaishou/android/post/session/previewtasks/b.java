package com.kuaishou.android.post.session.previewtasks.b;
import com.google.common.collect.ImmutableTable$a;
import com.google.common.collect.ImmutableTable;
import com.kuaishou.android.post.session.previewtasks.GraphTask$RunningState;
import com.google.common.collect.ImmutableList;
import java.lang.Object;

public final class b	// class@000ebe
{
    public static final ImmutableTable a;

    static {
       ImmutableTable$a uoa = ImmutableTable.builder();
       GraphTask$RunningState iDLE = GraphTask$RunningState.IDLE;
       uoa.b(iDLE, iDLE, ImmutableList.of());
       GraphTask$RunningState rUNNING = GraphTask$RunningState.RUNNING;
       uoa.b(iDLE, rUNNING, ImmutableList.of(rUNNING));
       GraphTask$RunningState rELEASED = GraphTask$RunningState.RELEASED;
       uoa.b(iDLE, rELEASED, ImmutableList.of(rELEASED));
       GraphTask$RunningState sUCCESS = GraphTask$RunningState.SUCCESS;
       uoa.b(rUNNING, sUCCESS, ImmutableList.of(sUCCESS));
       GraphTask$RunningState eRROR = GraphTask$RunningState.ERROR;
       uoa.b(rUNNING, eRROR, ImmutableList.of(eRROR));
       uoa.b(rUNNING, rELEASED, ImmutableList.of(rELEASED));
       uoa.b(eRROR, rELEASED, ImmutableList.of(rELEASED));
       uoa.b(sUCCESS, rELEASED, ImmutableList.of(rELEASED));
       uoa.b(rELEASED, iDLE, ImmutableList.of(iDLE));
       b.a = uoa.a();
    }
}

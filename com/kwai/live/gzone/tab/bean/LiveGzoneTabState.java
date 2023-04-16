package com.kwai.live.gzone.tab.bean.LiveGzoneTabState;
import com.google.common.collect.ImmutableTable$a;
import com.google.common.collect.ImmutableTable;
import com.kwai.live.gzone.tab.bean.LiveGzoneTabState$State;
import java.lang.Object;
import com.google.common.collect.ImmutableList;

public class LiveGzoneTabState	// class@000e0e
{
    public static final ImmutableTable a;

    static {
       ImmutableTable$a uoa = ImmutableTable.builder();
       LiveGzoneTabState$State iNIT = LiveGzoneTabState$State.INIT;
       LiveGzoneTabState$State cREATE = LiveGzoneTabState$State.CREATE;
       uoa.b(iNIT, cREATE, ImmutableList.of(cREATE));
       LiveGzoneTabState$State bIND = LiveGzoneTabState$State.BIND;
       uoa.b(cREATE, bIND, ImmutableList.of(bIND));
       LiveGzoneTabState$State uNBIND = LiveGzoneTabState$State.UNBIND;
       uoa.b(bIND, bIND, ImmutableList.of(uNBIND, bIND));
       uoa.b(uNBIND, bIND, ImmutableList.of(bIND));
       uoa.b(bIND, uNBIND, ImmutableList.of(uNBIND));
       LiveGzoneTabState$State dESTROY = LiveGzoneTabState$State.DESTROY;
       uoa.b(iNIT, dESTROY, ImmutableList.of());
       uoa.b(cREATE, dESTROY, ImmutableList.of(dESTROY));
       uoa.b(bIND, dESTROY, ImmutableList.of(uNBIND, dESTROY));
       uoa.b(uNBIND, dESTROY, ImmutableList.of(dESTROY));
       LiveGzoneTabState.a = uoa.a();
    }
    public void LiveGzoneTabState(){
       super();
    }
}

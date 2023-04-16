package com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsLogic;
import ts2.f;
import brd.t;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import d61.l0;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.core.voiceparty.micseats.core.interfaces.IMicSeatStateServiceKt;
import io.reactivex.BackpressureStrategy;
import yu2.c;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.core.voiceparty.micseats.pendant.OpenVideoTipsLogic$micSeatIds$1;
import msd.q;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;

public final class OpenVideoTipsLogic	// class@00172a
{
    public final l0 a;
    public final Boolean b;
    public final LiveData c;
    public LiveData d;
    public MutableLiveData e;
    public Pair f;
    public final LiveData g;

    public void OpenVideoTipsLogic(f p0,t p1){
       a.p(p0, "micSeatStateService");
       a.p(p1, "openVideoUserIdsObservable");
       super();
       l0 ol0 = l0.d("hasShowVoicePartyVideoShowOpenVideoGuide");
       this.a = ol0;
       Boolean fALSE = Boolean.FALSE;
       this.b = ol0.b(fALSE);
       LiveData liveData = IMicSeatStateServiceKt.b(p0);
       this.c = liveData;
       this.d = c.a(p1, null, 1, null);
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.e = mutableLiveD;
       this.g = LiveDataOperators.a(liveData, this.d, mutableLiveD, new OpenVideoTipsLogic$micSeatIds$1(this));
       this.e.setValue(fALSE);
    }
    public final LiveData a(){
       return this.g;
    }
}

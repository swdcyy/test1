package com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.LiveAudienceSuperFansGroupLuckyBagPendantViewModel;
import yh3.a;
import java.text.DecimalFormat;
import java.lang.String;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.m;
import androidx.lifecycle.MutableLiveData;
import java.lang.Object;
import java.lang.Boolean;
import com.kuaishou.live.core.show.fansgroup.audience.superfansgroupluckybagpendant.LiveAudienceSuperFansGroupLuckyBagPendantViewModel$a;
import android.database.Observable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;

public class LiveAudienceSuperFansGroupLuckyBagPendantViewModel extends a	// class@000b2d
{
    public final m a;
    public final MutableLiveData b;
    public final LiveData c;
    public final MutableLiveData d;
    public final LiveData e;
    public final MutableLiveData f;
    public final LiveData g;
    public final m$a h;
    public static final DecimalFormat i;

    static {
       LiveAudienceSuperFansGroupLuckyBagPendantViewModel.i = new DecimalFormat("00");
    }
    public void LiveAudienceSuperFansGroupLuckyBagPendantViewModel(m p0){
       super();
       MutableLiveData mutableLiveD = new MutableLiveData("");
       this.b = mutableLiveD;
       this.c = mutableLiveD;
       mutableLiveD = new MutableLiveData(Boolean.FALSE);
       this.d = mutableLiveD;
       this.e = mutableLiveD;
       mutableLiveD = new MutableLiveData("");
       this.f = mutableLiveD;
       this.g = mutableLiveD;
       LiveAudienceSuperFansGroupLuckyBagPendantViewModel$a uoa = new LiveAudienceSuperFansGroupLuckyBagPendantViewModel$a(this);
       this.h = uoa;
       this.a = p0;
       p0.registerObserver(uoa);
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceSuperFansGroupLuckyBagPendantViewModel.class, "1")) {
          return;
       }
       super.onCleared();
       this.a.unregisterObserver(this.h);
       return;
    }
}

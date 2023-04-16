package com.kuaishou.live.core.voiceparty.micseats.pendant.GiftPendantViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ts2.f;
import hf3.a;
import qx1.a;
import java.lang.String;
import androidx.lifecycle.LiveData;
import it2.x;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GiftPendantViewController$viewModel$2 extends Lambda implements a	// class@001600
{
    public final String $anchorUserId;
    public final a $liveLongConnection;
    public final a $liveServerSignalBlockManager;
    public final LiveData $micSeatId;
    public final f $micSeatStateService;

    public void GiftPendantViewController$viewModel$2(f p0,a p1,a p2,String p3,LiveData p4){
       this.$micSeatStateService = p0;
       this.$liveLongConnection = p1;
       this.$liveServerSignalBlockManager = p2;
       this.$anchorUserId = p3;
       this.$micSeatId = p4;
       super(0);
    }
    public final x invoke(){
       Object obj = PatchProxy.apply(null, this, GiftPendantViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       x ox = new x(this.$micSeatStateService, this.$liveLongConnection, this.$liveServerSignalBlockManager, this.$anchorUserId, this.$micSeatId);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}

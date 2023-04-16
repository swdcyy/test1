package com.kuaishou.live.core.voiceparty.micseats.pendant.UserNamePendantViewController$viewModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ts2.f;
import androidx.lifecycle.LiveData;
import it2.h1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class UserNamePendantViewController$viewModel$2 extends Lambda implements a	// class@001751
{
    public final LiveData $micSeatId;
    public final f $micSeatStateService;

    public void UserNamePendantViewController$viewModel$2(f p0,LiveData p1){
       this.$micSeatStateService = p0;
       this.$micSeatId = p1;
       super(0);
    }
    public final h1 invoke(){
       Object obj = PatchProxy.apply(null, this, UserNamePendantViewController$viewModel$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h1(this.$micSeatStateService, this.$micSeatId);
    }
    public Object invoke(){
       return this.invoke();
    }
}

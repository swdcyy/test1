package com.kuaishou.live.audience.component.treasurebox.LiveAudienceTreasureBoxPresenter$b;
import gg1.b;
import com.kuaishou.live.audience.component.treasurebox.LiveAudienceTreasureBoxPresenter;
import java.lang.Object;
import lp3.e;
import lp3.c;
import lp3.b;
import com.kuaishou.livestream.message.nano.SCLiveEncourageTreasureBoxWidget;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import j02.m;

public final class LiveAudienceTreasureBoxPresenter$b implements b	// class@000bec
{
    public final LiveAudienceTreasureBoxPresenter b;

    public void LiveAudienceTreasureBoxPresenter$b(LiveAudienceTreasureBoxPresenter p0){
       this.b = p0;
       super();
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
    public SCLiveEncourageTreasureBoxWidget y9(){
       Object[] objArray = null;
       LiveAudienceTreasureBoxPresenter obj = PatchProxy.apply(objArray, this, LiveAudienceTreasureBoxPresenter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.D;
       if (obj != null) {
          objArray = obj.V2();
       }
       return objArray;
    }
}

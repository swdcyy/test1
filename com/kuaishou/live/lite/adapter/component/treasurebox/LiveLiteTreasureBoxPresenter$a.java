package com.kuaishou.live.lite.adapter.component.treasurebox.LiveLiteTreasureBoxPresenter$a;
import gg1.b;
import com.kuaishou.live.lite.adapter.component.treasurebox.LiveLiteTreasureBoxPresenter;
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

public final class LiveLiteTreasureBoxPresenter$a implements b	// class@001e23
{
    public final LiveLiteTreasureBoxPresenter b;

    public void LiveLiteTreasureBoxPresenter$a(LiveLiteTreasureBoxPresenter p0){
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
       LiveLiteTreasureBoxPresenter obj = PatchProxy.apply(objArray, this, LiveLiteTreasureBoxPresenter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b.B;
       if (obj != null) {
          objArray = obj.V2();
       }
       return objArray;
    }
}

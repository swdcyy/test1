package com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter$a;
import oq5.d;
import com.kuaishou.live.core.show.screenrecord.LiveAudienceScreenRecordBottomBarPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;

public class LiveAudienceScreenRecordBottomBarPresenter$a implements d	// class@000fd0
{
    public final LiveAudienceScreenRecordBottomBarPresenter a;

    public void LiveAudienceScreenRecordBottomBarPresenter$a(LiveAudienceScreenRecordBottomBarPresenter p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, LiveAudienceScreenRecordBottomBarPresenter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.a.G == null) {
          return false;
       }
       i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f102b3e));
       return true;
    }
}

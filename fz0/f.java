package fz0.f;
import a71.c;
import fz0.k;
import java.lang.Object;
import java.lang.Boolean;
import androidx.lifecycle.MutableLiveData;
import java.lang.String;
import com.kuaishou.android.live.model.QLivePlayConfig;
import t02.a0;
import tkd.b;
import tkd.d;
import fs3.g;

public final class f implements c	// class@0023e1
{
    public final k a;

    public void f(k p0){
       this.a = p0;
    }
    public final void onShow(){
       f ta = this.a;
       ta.U.setValue(Boolean.TRUE);
       ta.a9("CLIENT_BOTTOM_BAR_GIFT_ICON_SHOW", "[LiveAudienceGiftBottomBarEntryPresenterV2][buildGiftItem]gift item show", 1);
       if (ta.K.C0() != null) {
          d.a(-1695065466).T50(ta.K.C0().getLiveStreamId());
       }
       return;
    }
}

package com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$5$1$a;
import ok.h;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$5$1;
import msd.l;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1$5;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager$createPlayerPanel$1;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.SlidePlayerPanelManager;
import com.yxcorp.gifshow.entity.QPhoto;
import sz9.u;
import com.kuaishou.android.model.mix.PhotoMeta;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.detail.common.rightactionbar.playerpanel.b;
import erd.g;

public final class SlidePlayerPanelManager$createPlayerPanel$1$5$1$a implements h	// class@0014e4
{
    public final SlidePlayerPanelManager$createPlayerPanel$1$5$1 b;
    public final l c;

    public void SlidePlayerPanelManager$createPlayerPanel$1$5$1$a(SlidePlayerPanelManager$createPlayerPanel$1$5$1 p0,l p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, SlidePlayerPanelManager$createPlayerPanel$1$5$1$a.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = this.b.this$0.this$0.this$0.r.a().getPhotoMeta();
          p0 = (p0 != null)? p0.observable().subscribe(new b(this)): null;
       }
       return p0;
    }
}

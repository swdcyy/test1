package com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter$c;
import com.kwai.video.player.IMediaPlayer$OnErrorListener;
import com.yxcorp.gifshow.growth.kpop.ext.fsvideo.presenter.FSVideoPresenter;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import toa.b;
import java.util.Objects;
import toa.a;

public final class FSVideoPresenter$c implements IMediaPlayer$OnErrorListener	// class@001401
{
    public final FSVideoPresenter b;

    public void FSVideoPresenter$c(FSVideoPresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onError(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport(FSVideoPresenter$c.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, FSVideoPresenter$c.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       Object[] objArray = new Object[0];
       w.C().t("FSVideoPresenter", "play error "+p1+' '+p2+' '+this.b.v, objArray);
       Objects.requireNonNull(b.b);
       a a = b.a;
       if (a != null) {
          a.d = Integer.valueOf(p1);
       }
       this.b.R8("playError");
       return 0;
    }
}

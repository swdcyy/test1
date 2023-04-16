package com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter$d;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.detail.slideplay.nasa.relax.RelaxTimeDetailPresenter;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.library.widget.refresh.KwaiLoadingView;

public class RelaxTimeDetailPresenter$d implements IMediaPlayer$OnInfoListener	// class@0017ae
{
    public final RelaxTimeDetailPresenter b;

    public void RelaxTimeDetailPresenter$d(RelaxTimeDetailPresenter p0){
       this.b = p0;
       super();
    }
    public boolean onInfo(IMediaPlayer p0,int p1,int p2){
       if (PatchProxy.isSupport2(RelaxTimeDetailPresenter$d.class, "1")) {
          p0 = PatchProxy.applyThreeRefsWithListener(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, RelaxTimeDetailPresenter$d.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       if (p1 == 701) {
          this.b.A.setVisibility(0);
       }else if(p1 == 702){
          this.b.A.setVisibility(8);
       }
       PatchProxy.onMethodExit(RelaxTimeDetailPresenter$d.class, "1");
       return 0;
    }
}

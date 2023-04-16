package gqb.r$c;
import android.view.View$OnClickListener;
import gqb.r;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.music.radio.MusicRadioLogger;
import com.yxcorp.gifshow.music.radio.MusicRadioLogger$MusicRadioBtnType;
import java.lang.Boolean;
import brd.y;

public final class r$c implements View$OnClickListener	// class@002b8d
{
    public final r b;

    public void r$c(r p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r$c.class, "1")) {
          return;
       }
       MusicRadioLogger.f(MusicRadioLogger.a(r.P8(this.b).getCurrentPhoto()), MusicRadioLogger$MusicRadioBtnType.MUSIC_RADIO_PLAY.getType(), 0, 4, null);
       r u = this.b.u;
       if (u != null) {
          u.onNext(Boolean.FALSE);
       }
       return;
    }
}

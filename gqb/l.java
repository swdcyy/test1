package gqb.l;
import z1.a;
import gqb.k;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.music.radio.MusicRadioLogger;
import com.yxcorp.gifshow.music.radio.MusicRadioLogger$MusicRadioBtnType;
import kotlin.jvm.internal.a;
import java.util.Objects;
import crd.b;
import lnc.b9;
import android.widget.TextView;
import com.yxcorp.utility.f;
import brd.t;
import gqb.m;
import erd.a;
import gqb.n;
import erd.g;

public final class l implements a	// class@002b7e
{
    public final k a;

    public void l(k p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
       }else {
          a.o(p0, "it");
          MusicRadioLogger.e(MusicRadioLogger.a(k.R8(this.a).getCurrentPhoto()), MusicRadioLogger$MusicRadioBtnType.MUSIC_RADIO_TIMER.getType(), this.a.S8(p0.intValue()));
          l ta = this.a;
          int i = p0.intValue();
          Objects.requireNonNull(ta);
          k ok = k.class;
          if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), ta, ok, "6")) {
             b9.a(ta.q);
             String str = "mCountDownTextView";
             if (!i) {
                i = ta.p;
                if (i == null) {
                   a.S(str);
                }
                i.setVisibility(8);
             }else {
                k p = ta.p;
                if (p == null) {
                   a.S(str);
                }
                p.setVisibility(0);
                ta.q = f.d().b(ta.S8(i), 1000).doOnComplete(new m(ta)).subscribe(new n(ta));
             }
          }
       }
       return;
    }
}

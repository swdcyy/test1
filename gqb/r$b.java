package gqb.r$b;
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
import java.util.Objects;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import ypb.a;
import androidx.lifecycle.LiveData;
import com.yxcorp.gifshow.music.radio.backplay.MusicRadioPlayModel;

public final class r$b implements View$OnClickListener	// class@002b8c
{
    public final r b;

    public void r$b(r p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       r r;
       r r1;
       if (PatchProxy.applyVoidOneRefs(p0, this, r$b.class, "1")) {
          return;
       }
       MusicRadioLogger.f(MusicRadioLogger.a(r.P8(this.b).getCurrentPhoto()), MusicRadioLogger$MusicRadioBtnType.MUSIC_RADIO_PRE.getType(), 0, 4, null);
       r$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, r.class, "7")) {
          r = tb.r;
          if (r == null) {
             a.S("mSlidePlayViewModel");
          }
          QPhoto currentPhoto = r.getCurrentPhoto();
          if (currentPhoto != null) {
             r w = tb.w;
             if (w != null) {
                MutableLiveData mutableLiveD = w.r0();
                if (mutableLiveD != null) {
                   if (mutableLiveD.getValue() == MusicRadioPlayModel.LIST || mutableLiveD.getValue() == MusicRadioPlayModel.SINGLE) {
                      w = tb.r;
                      if (w == null) {
                         a.S("mSlidePlayViewModel");
                      }
                      if (w.f0(currentPhoto)) {
                         r1 = tb.r;
                         if (r1 == null) {
                            a.S("mSlidePlayViewModel");
                         }
                         r1.p(true);
                      }else {
                         r = tb.r;
                         if (r == null) {
                            a.S("mSlidePlayViewModel");
                         }
                         r1 = tb.r;
                         if (r1 == null) {
                            a.S("mSlidePlayViewModel");
                         }
                         r.k((r1.Y0() - true), false);
                      }
                   }else if(mutableLiveD.getValue() == MusicRadioPlayModel.RANDOM){
                      r = tb.r;
                      if (r == null) {
                         a.S("mSlidePlayViewModel");
                      }
                      r.k(tb.R8(), false);
                   }
                }
             }
          }
       }
    label_00af :
       return;
    }
}

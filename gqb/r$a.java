package gqb.r$a;
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

public final class r$a implements View$OnClickListener	// class@002b8b
{
    public final r b;

    public void r$a(r p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       r r;
       r r1;
       if (PatchProxy.applyVoidOneRefs(p0, this, r$a.class, "1")) {
          return;
       }
       MusicRadioLogger.f(MusicRadioLogger.a(r.P8(this.b).getCurrentPhoto()), MusicRadioLogger$MusicRadioBtnType.MUSIC_RADIO_NEXT.getType(), 0, 4, null);
       r$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, r.class, "6")) {
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
                      if (w.H(currentPhoto)) {
                         r1 = tb.r;
                         if (r1 == null) {
                            a.S("mSlidePlayViewModel");
                         }
                         r1.L(true);
                      }else {
                         r1 = tb.r;
                         if (r1 == null) {
                            a.S("mSlidePlayViewModel");
                         }
                         r1.k(0, 0);
                      }
                   }else if(mutableLiveD.getValue() == MusicRadioPlayModel.RANDOM){
                      r = tb.r;
                      if (r == null) {
                         a.S("mSlidePlayViewModel");
                      }
                      r.k(tb.R8(), 0);
                   }
                }
             }
          }
       }
    label_00a3 :
       return;
    }
}

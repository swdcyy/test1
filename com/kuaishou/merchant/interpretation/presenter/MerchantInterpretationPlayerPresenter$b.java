package com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter$b;
import com.yxcorp.gifshow.util.t0$a;
import com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h04.c;
import q87.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.player.core.b;
import lnc.p9;

public class MerchantInterpretationPlayerPresenter$b implements t0$a	// class@00184e
{
    public final MerchantInterpretationPlayerPresenter a;

    public void MerchantInterpretationPlayerPresenter$b(MerchantInterpretationPlayerPresenter p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, MerchantInterpretationPlayerPresenter$b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       c.C().w("MerchantInterpretationPlayerPresenter", "get audio focus", objArray);
       if (this.a.getActivity().b3()) {
          MerchantInterpretationPlayerPresenter$b ta = this.a;
          if (ta.M == null && ta.D.isPaused()) {
             this.a.d9();
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, MerchantInterpretationPlayerPresenter$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       c.C().w("MerchantInterpretationPlayerPresenter", "lose audio focus", objArray);
       this.a.h9();
       return;
    }
    public void onAudioFocusChange(int p0){
       p9.a(this, p0);
    }
}

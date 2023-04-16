package com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter$d;
import com.kwai.video.player.IMediaPlayer$OnSeekCompleteListener;
import com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h04.c;
import java.lang.StringBuilder;
import q87.c;

public class MerchantInterpretationPlayerPresenter$d implements IMediaPlayer$OnSeekCompleteListener	// class@001850
{
    public final MerchantInterpretationPlayerPresenter a;

    public void MerchantInterpretationPlayerPresenter$d(MerchantInterpretationPlayerPresenter p0){
       this.a = p0;
       super();
    }
    public void onSeekComplete(IMediaPlayer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantInterpretationPlayerPresenter$d.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       c.C().w("MerchantInterpretationPlayerPresenter", "onSeekComplete currentPosition"+p0.getCurrentPosition(), objArray);
       MerchantInterpretationPlayerPresenter$d ta = this.a;
       if (ta.M == null) {
          ta.e9();
       }
       return;
    }
}

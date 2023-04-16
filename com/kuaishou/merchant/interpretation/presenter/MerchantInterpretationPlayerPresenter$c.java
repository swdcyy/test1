package com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter$c;
import android.widget.SeekBar$OnSeekBarChangeListener;
import com.kuaishou.merchant.interpretation.presenter.MerchantInterpretationPlayerPresenter;
import java.lang.Object;
import android.widget.SeekBar;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import h04.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.player.core.b;
import com.yxcorp.utility.TextUtils;
import java.lang.CharSequence;
import android.widget.TextView;
import h04.c;
import java.lang.StringBuilder;
import q87.c;

public class MerchantInterpretationPlayerPresenter$c implements SeekBar$OnSeekBarChangeListener	// class@00184f
{
    public final MerchantInterpretationPlayerPresenter b;

    public void MerchantInterpretationPlayerPresenter$c(MerchantInterpretationPlayerPresenter p0){
       this.b = p0;
       super();
    }
    public void onProgressChanged(SeekBar p0,int p1,boolean p2){
       long l;
       if (PatchProxy.isSupport(MerchantInterpretationPlayerPresenter$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), this, MerchantInterpretationPlayerPresenter$c.class, "1")) {
          return;
       }
       if (p2 && this.b.D != null) {
          Object[] objArray = null;
          int i = 1;
          if (!PatchProxy.applyVoid(objArray, objArray, a.class, "2")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "PROGRESS_BAR";
             u1.u(i, uElementPack, objArray);
          }
          if (this.b.Z8()) {
             this.b.j9();
          }
          MerchantInterpretationPlayerPresenter$c tb = this.b;
          MerchantInterpretationPlayerPresenter d = tb.D;
          Objects.requireNonNull(tb);
          MerchantInterpretationPlayerPresenter merchantInte = MerchantInterpretationPlayerPresenter.class;
          if (PatchProxy.isSupport(merchantInte)) {
             Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p1), tb, merchantInte, "27");
             if (obj != PatchProxyResult.class) {
                l = obj.longValue();
             label_007e :
                d.seekTo(l);
                tb = this.b;
                tb.v.setText(TextUtils.K(tb.D.getCurrentPosition()));
                objArray = new Object[i];
                objArray[0] = "progess = "+p1;
                c.C().w("MerchantInterpretationPlayerPresenter", "seekTo", objArray);
             }
          }
          l = (long)(((float)tb.D.getDuration() / 10000.00f) * (float)p1);
          goto label_007e ;
       }
       return;
    }
    public void onStartTrackingTouch(SeekBar p0){
    }
    public void onStopTrackingTouch(SeekBar p0){
    }
}

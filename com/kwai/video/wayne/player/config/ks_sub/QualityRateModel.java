package com.kwai.video.wayne.player.config.ks_sub.QualityRateModel;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.text.Regex;
import java.lang.CharSequence;
import zsd.k;
import java.lang.Integer;

public final class QualityRateModel	// class@000cfd
{
    public String qualityType;
    public int qualityTypeNumber;

    public void QualityRateModel(String p0){
       super();
       this.qualityType = p0;
       this.qualityTypeNumber = -1;
    }
    public final int getQualityNumber(){
       Object[] objArray = null;
       QualityRateModel obj = PatchProxy.apply(objArray, this, QualityRateModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.qualityTypeNumber == -1) {
          obj = this.qualityType;
          if (obj != null) {
             k ok = Regex.find$default(new Regex("\\A\\d+"), obj, 0, 2, objArray);
             if (ok != null) {
                objArray = ok.getValue();
             }
          }
          if (objArray != null) {
             this.qualityTypeNumber = Integer.parseInt(objArray);
          }
       }
       return this.qualityTypeNumber;
    }
    public final String getQualityType(){
       return this.qualityType;
    }
    public final void setQualityType(String p0){
       this.qualityType = p0;
    }
}

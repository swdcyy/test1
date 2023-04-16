package by4.e;
import msd.a;
import com.kwai.feature.plc.api.model.PlcRecoSignalInfo;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import fg6.a;
import com.google.gson.Gson;

public final class e implements a	// class@0003ee
{
    public final PlcRecoSignalInfo b;

    public void e(PlcRecoSignalInfo p0){
       this.b = p0;
    }
    public final Object invoke(){
       return "upload plc reco signal failed! invalid bizType!"+a.a.q(this.b);
    }
}

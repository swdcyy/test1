package by4.f;
import msd.a;
import com.kwai.feature.plc.api.model.PlcRecoSignalInfo;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import fg6.a;
import com.google.gson.Gson;

public final class f implements a	// class@0003ef
{
    public final PlcRecoSignalInfo b;

    public void f(PlcRecoSignalInfo p0){
       this.b = p0;
    }
    public final Object invoke(){
       return "upload plc reco signal failed! invalid bizType!"+a.a.q(this.b);
    }
}

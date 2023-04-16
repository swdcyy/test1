package dac.d0;
import ok.x;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import org.json.JSONObject;
import gbc.b;

public final class d0 implements x	// class@002139
{
    public final int b;

    public void d0(int p0){
       this.b = p0;
       super();
    }
    public Object get(){
       JSONObject jSONObject = PatchProxy.apply(null, this, d0.class, "1");
       if (jSONObject != PatchProxyResult.class) {
       }else {
          jSONObject = b.c(this.b);
       }
       return jSONObject;
    }
}

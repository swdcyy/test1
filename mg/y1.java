package mg.y1;
import erd.g;
import f55.g;
import java.lang.Object;
import om6.b$a;
import java.lang.String;
import lnc.a1;
import android.os.Bundle;
import com.kwai.feature.post.api.feature.bridge.JsAudioRecordResult;
import java.lang.Math;

public final class y1 implements g	// class@00267e
{
    public final g b;

    public void y1(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       y1 tb = this.b;
       if (p0.c != null) {
          tb.a(0, a1.p(R.string.arg_RES_7f104fc9), null);
       }else {
          tb.onSuccess(new JsAudioRecordResult(p0.a, (long)Math.ceil((double)(p0.b / 1000))));
       }
       return;
    }
}

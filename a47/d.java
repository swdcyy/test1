package a47.d;
import erd.g;
import f55.g;
import java.lang.Object;
import com.kwai.live.gzone.api.model.LiveGzoneThirdPlatformInfoResponse;
import java.lang.String;
import android.os.Bundle;

public final class d implements g	// class@00004c
{
    public final g b;

    public void d(g p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       if (p0 != null) {
          p0 = p0.mData;
          if (p0 != null) {
             tb.onSuccess(p0);
          label_0015 :
             return;
          }
       }
       tb.a(-1, "error", null);
       goto label_0015 ;
    }
}

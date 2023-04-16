package gqb.e;
import erd.g;
import gqb.g;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.music.radio.MusicRadioLogger;
import e17.i;

public final class e implements g	// class@002b75
{
    public final g b;
    public final Music c;

    public void e(g p0,Music p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          MusicRadioLogger.d(false, this.c);
          this.b.P8(false);
          i.a(R.style.arg_RES_7f11066a, 0x7f10060d);
       }
       return;
    }
}

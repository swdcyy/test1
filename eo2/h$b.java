package eo2.h$b;
import vq5.b;
import eo2.h;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import e17.i;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.lifecycle.LiveData;
import kotlin.jvm.internal.a;

public final class h$b implements b	// class@0027a0
{
    public final h a;

    public void h$b(h p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, h$b.class, "1")) {
          return;
       }
       h$b ta = this.a;
       Objects.requireNonNull(ta);
       h oh = h.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, ta, oh, "5")) {
          if (ta.v0() != null) {
             i.a(R.style.arg_RES_7f11066a, 0x7f102c01);
          }else {
             Object obj = PatchProxy.apply(objArray, ta, oh, "8");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(ta.A0()){
                obj = ta.c.getValue();
                a.m(obj);
                if (!obj.booleanValue()) {
                   obj = ta.d.getValue();
                   a.m(obj);
                   if (!obj.booleanValue()) {
                      b = true;
                   }
                }
             }
             b = false;
             if (b) {
                ta.w0(true);
             }
          }
       }
       return;
    }
}

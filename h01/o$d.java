package h01.o$d;
import k01.a;
import h01.o;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import mk1.b;
import java.util.Objects;
import qk1.a;
import jl1.a;
import s81.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public class o$d implements a	// class@0025f4
{
    public final o a;

    public void o$d(o p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,int p1){
       o$d uod = o$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Integer.valueOf(p1), this, uod, "1")) {
          return;
       }
       if (!p0) {
          return;
       }
       b a = this.a.x.a;
       Objects.requireNonNull(a);
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), a, uoa, "3")) {
          a uoa1 = a.class;
          if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p1), null, uoa1, "1")) {
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putInt(b.d("user")+"liveGiftPanelSendGiftDataLastGiftId", p1);
             g.a(uEditor);
          }
       }
       return;
    }
}

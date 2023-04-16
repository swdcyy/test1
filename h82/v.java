package h82.v;
import h82.r0;
import h82.z;
import java.lang.Object;
import h82.q0;
import h82.b0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import z61.b;
import androidx.lifecycle.MutableLiveData;

public final class v implements r0	// class@002ced
{
    public final z a;

    public void v(z p0){
       this.a = p0;
    }
    public void a(){
       q0.a(this);
    }
    public final void b(){
       v ta = this.a;
       ta.Q.h = false;
       if (PatchProxy.applyVoid(null, ta, z.class, "14")) {
       }else {
          ta.Q.g = ta.c9();
          ta.Q.mIsVisible = Boolean.valueOf(ta.d9());
          if (ta.Q.mIsVisible.booleanValue()) {
             ta.k9();
          }
          ta.R.setValue(ta.Q);
       }
       return;
    }
}

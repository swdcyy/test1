package nh9.d;
import com.kwai.video.westeros.v2.faceless.FaceMagicController$FaceMagicLoadEffectFailedListener;
import java.lang.Object;
import java.lang.String;
import nh9.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import x8c.a;
import java.lang.StringBuilder;
import q87.c;

public final class d implements FaceMagicController$FaceMagicLoadEffectFailedListener	// class@003186
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void onLoadFileError(String p0,int p1){
       if (p1 == 3 && !TextUtils.isEmpty(p0)) {
          Object[] objArray = new Object[0];
          a.D().w("ResourceRestoreHelper", "onLoadFileError beauty_resource "+p0, objArray);
       }
       return;
    }
}

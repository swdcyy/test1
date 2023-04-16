package bsb.b;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import android.app.Activity;
import lnc.b5;
import com.yxcorp.utility.RomUtils;
import android.view.View;
import ekd.i;

public final class b	// class@000460
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public static final void a(GifshowActivity p0,int p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), null, b.class, "1")) {
          return;
       }
       if (b5.a(p0) && !RomUtils.q()) {
          p0.findViewById(0x1020002).setPadding(0, 0, 0, 0);
          i.g(p0, p1);
       }else {
          i.i(p0, p1, p2, p3);
       }
       return;
    }
}

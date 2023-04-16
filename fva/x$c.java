package fva.x$c;
import ub.a;
import jva.m;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import java.lang.CharSequence;
import android.graphics.drawable.Animatable;
import bd.f;

public final class x$c extends a	// class@002a3a
{
    public final m b;
    public final HotSpotModel c;

    public void x$c(m p0,HotSpotModel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, x$c.class, "2")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "throwable");
       this.b.r1().setText(this.c.mTitleName);
       this.b.r1().setVisibility(0);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, x$c.class, "1")) {
       }else {
          a.p(p0, "id");
          this.b.r1().setVisibility(8);
       }
       return;
    }
}

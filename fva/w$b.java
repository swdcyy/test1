package fva.w$b;
import ub.a;
import jva.l;
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

public final class w$b extends a	// class@002a36
{
    public final l b;
    public final HotSpotModel c;

    public void w$b(l p0,HotSpotModel p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, w$b.class, "2")) {
          return;
       }
       a.p(p0, "id");
       a.p(p1, "throwable");
       this.b.o1().setText(this.c.mTitleName);
       this.b.o1().setVisibility(0);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, w$b.class, "1")) {
       }else {
          a.p(p0, "id");
          this.b.o1().setVisibility(8);
       }
       return;
    }
}

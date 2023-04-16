package nd9.o;
import ub.a;
import nd9.l;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.String;
import java.lang.Object;
import android.graphics.drawable.Animatable;
import bd.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import lnc.a1;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import nd9.n;
import nd9.m;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.camera.record.base.d;

public class o extends a	// class@003153
{
    public final MagicEmoji$MagicFace b;
    public final l c;

    public void o(l p0,MagicEmoji$MagicFace p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, o.class, "1")) {
       }else {
          this.c.Y1(t.timer((long)a1.m().getInteger(R.integer.arg_RES_7f0b0041), TimeUnit.MILLISECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new n(this, this.b, p1), new m(this)));
       }
       return;
    }
}

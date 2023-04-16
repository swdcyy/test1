package b8a.l1$e;
import erd.g;
import android.app.Activity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import um6.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.music.Music;

public final class l1$e implements g	// class@0003c2
{
    public final Activity b;
    public final QPhoto c;

    public void l1$e(Activity p0,QPhoto p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l1$e.class, "1")) {
       }else {
          a.p(p0, "plugin");
          p0.On(this.b, this.c.getMusic(), 0, 2);
       }
       return;
    }
}

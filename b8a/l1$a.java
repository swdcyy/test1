package b8a.l1$a;
import erd.g;
import android.app.Activity;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import um6.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class l1$a implements g	// class@0003be
{
    public final Activity b;
    public final Music c;
    public final QPhoto d;

    public void l1$a(Activity p0,Music p1,QPhoto p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l1$a.class, "1")) {
       }else {
          a.p(p0, "plugin");
          p0.QZ(this.b, this.c, this.d.getPhotoId(), "");
       }
       return;
    }
}

package b4d.v0$b;
import com.yxcorp.gifshow.widget.m;
import b4d.v0;
import com.yxcorp.gifshow.models.QMedia;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import a4d.s;
import com.kwai.emotionsdk.bean.EmotionInfo;

public class v0$b extends m	// class@000395
{
    public final QMedia c;
    public final v0 d;

    public void v0$b(v0 p0,QMedia p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       v0$b uob = v0$b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       v0$b td = this.d;
       td.x.b(td.S8(), "PICTURE", "PICTURE");
       this.d.W8(this.c, null);
       return;
    }
}

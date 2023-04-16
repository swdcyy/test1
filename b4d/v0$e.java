package b4d.v0$e;
import com.yxcorp.gifshow.widget.m;
import b4d.v0;
import com.kwai.emotionsdk.bean.EmotionInfo;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import a4d.s;
import com.yxcorp.gifshow.models.QMedia;

public class v0$e extends m	// class@000398
{
    public final EmotionInfo c;
    public final v0 d;

    public void v0$e(v0 p0,EmotionInfo p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       v0$e uoe = v0$e.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoe, "1")) {
          return;
       }
       v0$e td = this.d;
       td.x.b(td.S8(), "GIF", "GIF");
       this.d.W8(null, this.c);
       return;
    }
}

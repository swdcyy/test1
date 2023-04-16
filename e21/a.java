package e21.a;
import erd.g;
import com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.audience.component.multiline.LiveAudienceMultiLinePresenterV2$d;

public final class a implements g	// class@00208e
{
    public final LiveAudienceMultiLinePresenterV2 b;

    public void a(LiveAudienceMultiLinePresenterV2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          this.b.h1.e();
       }
       return;
    }
}

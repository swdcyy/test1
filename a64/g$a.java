package a64.g$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.merchant.live.bubble.model.CommodityBubbleModel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class g$a	// class@000031
{
    public PublishSubject a;

    public void g$a(){
       super();
       this.a = PublishSubject.g();
    }
    public void a(CommodityBubbleModel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a.class, "2")) {
          return;
       }
       this.a.onNext(p0);
       return;
    }
}

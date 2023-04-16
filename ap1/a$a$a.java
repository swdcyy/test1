package ap1.a$a$a;
import com.yxcorp.gifshow.widget.m;
import ap1.a$a;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintItem;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ap1.a;

public class a$a$a extends m	// class@00026b
{
    public final LiveGiftItemHintItem c;
    public final a$a d;

    public void a$a$a(a$a p0,LiveGiftItemHintItem p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a$a.class, "1")) {
          return;
       }
       this.d.a.P8();
       this.d.a.S8();
       this.d.a.V8(this.c);
       return;
    }
}

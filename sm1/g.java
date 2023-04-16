package sm1.g;
import xz6.e;
import android.view.View;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.LiveGiftItemLeftTagView;
import com.kuaishou.live.common.core.component.gift.giftstore.bean.GiftPanelItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.gift.LiveGiftItemLeftTagData;

public abstract class g extends e	// class@003cce
{
    public LiveGiftItemLeftTagView f;
    public GiftPanelItem g;

    public void g(View p0){
       super(p0);
       this.f = this.a(0x7f0a1d4b);
    }
    public final void b(int p0,GiftPanelItem p1,boolean p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, g.class, "2")) {
          return;
       }
       this.g = p1;
       if (p1 == null) {
          return;
       }
       this.c(p0, p1, p2);
       return;
    }
    public abstract void c(int p0,GiftPanelItem p1,boolean p2);
    public void d(){
    }
    public void e(LiveGiftItemLeftTagData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.f.setLeftTagData(p0);
       this.f.a();
       return;
    }
}

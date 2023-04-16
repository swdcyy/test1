package m61.d;
import android.view.View$OnClickListener;
import com.kuaishou.live.bottombar.component.panel.settting.a;
import com.kuaishou.live.bottombar.service.model.LiveBottomBarSettingItem;
import java.lang.Object;
import android.view.View;
import z61.l;
import z61.b;
import k61.f;

public final class d implements View$OnClickListener	// class@00312d
{
    public final a b;
    public final LiveBottomBarSettingItem c;

    public void d(a p0,LiveBottomBarSettingItem p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       d tc = this.c;
       this.b.h.a(tc, tc.mIsSelected);
    }
}

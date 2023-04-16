package ghd.t$a;
import com.kwai.library.widget.button.SlipSwitchButton$a;
import ghd.t;
import com.kwai.library.widget.popup.common.c;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import qyb.a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.plugin.setting.utils.b;
import k2b.h;
import lnc.i3;
import k2b.e0;

public class t$a implements SlipSwitchButton$a	// class@000f3b
{
    public final c b;
    public final t c;

    public void t$a(t p0,c p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void r(SlipSwitchButton p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(t$a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, t$a.class, "1")) {
          return;
       }
       b.e(this.c.c, null, null);
       h oh = h.k("ALL_PEOPLE_TOSEE_POPUP");
       i3 oi3 = i3.f();
       oi3.d("click_area", "who_can_see");
       oh.n(oi3.e());
       oh.i(this.c.c);
       this.b.o();
       return;
    }
}

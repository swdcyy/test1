package kgd.a0;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.plugin.setting.helper.j;
import pgd.y;
import k2b.e0;
import sgd.b;

public class a0 implements SlipSwitchButton$b	// class@001774
{
    public j a;
    public final g b;
    public final g c;
    public final GifshowActivity d;

    public void a0(g p0,g p1,GifshowActivity p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       a0 uoa0 = a0.class;
       if (PatchProxy.isSupport(uoa0) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa0, "1")) {
          return;
       }
       uoa0 = this.a;
       a0 tb = (p1)? this.b: this.c;
       uoa0.l(p0, "enable_profile_show_intimate_relation", p1, tb);
       b.k(this.d, "CLOSED_FRIEND_RELATIONSHIP", y.a(p0.getSwitch()));
       return;
    }
}

package jgd.s;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.plugin.setting.helper.j;

public class s implements SlipSwitchButton$b	// class@0016ef
{
    public j a;

    public void s(){
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       s os = s.class;
       if (PatchProxy.isSupport(os) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, os, "1")) {
          return;
       }
       this.a.k(p0, "add_watermark_saving_self_photo", p1);
       return;
    }
}

package kgd.x1;
import erd.g;
import com.yxcorp.plugin.setting.entries.holder.r0;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.yxcorp.gifshow.model.SwitchItem;
import com.yxcorp.gifshow.model.SelectOption;

public final class x1 implements g	// class@0017c6
{
    public final r0 b;
    public final SlipSwitchButton c;

    public void x1(r0 p0,SlipSwitchButton p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       p0 = this.b.c.mSelectedOption;
       int i = (this.c.getSwitch())? 2: 1;
       p0.mValue = i;
       return;
    }
}

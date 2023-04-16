package kgd.n;
import erd.g;
import com.yxcorp.plugin.setting.entries.holder.b;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.yxcorp.plugin.setting.entries.holder.r0;
import com.yxcorp.gifshow.model.SwitchItem;
import com.yxcorp.gifshow.model.SelectOption;

public final class n implements g	// class@0017a8
{
    public final b b;
    public final SlipSwitchButton c;

    public void n(b p0,SlipSwitchButton p1){
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

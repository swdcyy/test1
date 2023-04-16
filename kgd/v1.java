package kgd.v1;
import n3d.a;
import com.yxcorp.plugin.setting.entries.holder.p0;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import java.lang.String;
import java.io.Serializable;
import ekd.j0;
import com.yxcorp.gifshow.model.SwitchItem;
import xgc.e;
import com.yxcorp.gifshow.model.SelectOption;
import xgc.b;

public final class v1 implements a	// class@0017c0
{
    public final p0 b;

    public void v1(p0 p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       v1 tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == -1 && p2 != null) {
          SwitchItem switchItem = j0.e(p2, "result_data");
          if (switchItem != null) {
             p0 b = tb.b;
             if (b != null && !b.mId - switchItem.mId) {
                b.mSelectedOption = switchItem.mSelectedOption;
                b.mSubSwitchItems = switchItem.mSubSwitchItems;
                p0 a = tb.a;
                switchItem = switchItem.mSelectedOption;
                a.k = switchItem;
                a.d = switchItem.mName;
             }
          }
       }
       return;
    }
}

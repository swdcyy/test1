package kgd.u1;
import n3d.a;
import com.yxcorp.plugin.setting.entries.holder.p0;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import java.lang.String;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.yxcorp.gifshow.model.SwitchItem;
import xgc.e;
import com.yxcorp.gifshow.model.SelectOption;
import xgc.b;

public final class u1 implements a	// class@0017bd
{
    public final p0 b;

    public void u1(p0 p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       u1 tb = this.b;
       Objects.requireNonNull(tb);
       if (p1 == -1) {
          Serializable serializable = SerializableHook.getSerializableExtra(p2, "result_silence_data");
          if (p2 != null && (serializable != null && serializable instanceof SwitchItem)) {
             p0 b = tb.b;
             b.mSilenceStartTime = serializable.mSilenceStartTime;
             b.mSilenceEndTime = serializable.mSilenceEndTime;
             SwitchItem mSelectedOpt = serializable.mSelectedOption;
             p0 a = tb.a;
             a.k = mSelectedOpt;
             a.d = mSelectedOpt.mName;
             b.mSelectedOption = mSelectedOpt;
          }
       }
       return;
    }
}

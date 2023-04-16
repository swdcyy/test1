package kfd.a;
import erd.g;
import com.yxcorp.plugin.search.template.bigcard.state.PhoneVolumeState;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import androidx.fragment.app.Fragment;
import uy5.a;
import q87.c;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public final class a implements g	// class@001773
{
    public final PhoneVolumeState b;

    public void a(PhoneVolumeState p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          if (!PatchProxy.applyVoid(null, tb, PhoneVolumeState.class, "6") && (tb.c.getContext() != null && tb.b == null)) {
             Object[] objArray = new Object[0];
             a.C().t("PhoneVolumeState", "PhoneVolumeState", objArray);
             UniversalReceiver.e(tb.c.getContext(), tb.e, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
             tb.b = true;
          }
       }else {
          tb.a();
       }
       return;
    }
}

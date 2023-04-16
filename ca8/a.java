package ca8.a;
import androidx.lifecycle.Observer;
import ca8.b;
import java.lang.Object;
import android.os.Message;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Bundle;
import android.os.Parcelable;
import android.content.Intent;
import zh8.e;
import w78.d;
import n88.b;
import com.mini.channel.b;

public final class a implements Observer	// class@0003d4
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, b.class, "2")) {
       }else {
          Intent parcelable = p0.getData().getParcelable("key_launch_activity_intent");
          if (parcelable != null) {
             int intx = p0.getData().getInt("key_launch_activity_mini_process_id");
             parcelable.putExtra("key_launch_activity_mini_process_id", intx);
             Bundle uBundle = new Bundle();
             uBundle.putParcelable("key_launch_activity_intent", parcelable);
             uBundle.putBoolean("key_launch_activity_wait_foreground", p0.getData().getBoolean("key_launch_activity_wait_foreground"));
             e.g.j().W3(intx).d("key_ipc_launch_activity_request", uBundle);
          }
       }
       return;
    }
}

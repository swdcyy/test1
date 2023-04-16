package ar7.e;
import androidx.lifecycle.Observer;
import ar7.j;
import java.lang.Object;
import com.kuaishou.android.model.mix.CoCreateInvitationInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.widget.TextView;
import com.kuaishou.android.model.mix.CoCreateInvitationInfo$InvitationOption;
import java.lang.CharSequence;

public final class e implements Observer	// class@00034b
{
    public final j b;

    public void e(j p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
       }else {
          a.o(p0, "it");
          this.b.o = p0;
          j.v(this.b).setText(j.w(this.b).mAgreeOption.mButtonText);
          j.x(this.b).setText(j.w(this.b).mDisagreeOption.mButtonText);
       }
       return;
    }
}

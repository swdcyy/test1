package bec.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.reminder.friend.relation.FriendTabExploreFriendActivity;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k2b.h;
import com.kwai.feature.api.qrcode.model.ScanParam$a;
import androidx.fragment.app.FragmentActivity;
import n3d.a;
import lu5.c;

public final class a implements View$OnClickListener	// class@000462
{
    public final FriendTabExploreFriendActivity b;

    public void a(FriendTabExploreFriendActivity p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       h.m("", "QRCODE_BUTTON").h();
       ScanParam$a uoa = new ScanParam$a();
       uoa.b("FIND_FRIENDS");
       c.c(this.b, uoa, null);
       return;
    }
}

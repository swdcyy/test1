package afc.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.reminder.news.guide.a;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import cfc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tkd.b;
import tkd.d;
import zw5.a;

public final class c implements View$OnClickListener	// class@000116
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, null, b.class, "3")) {
       }else {
          b.a(3);
       }
       if (tb.q.getActivity() instanceof GifshowActivity) {
          d.a(0x2001f24e).ht(tb.q.getActivity());
          tb.P8();
       }
       return;
    }
}

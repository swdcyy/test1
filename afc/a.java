package afc.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.reminder.news.guide.a;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import cfc.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class a implements View$OnClickListener	// class@000114
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, null, b.class, "1")) {
       }else {
          b.a(1);
       }
       tb.P8();
       return;
    }
}

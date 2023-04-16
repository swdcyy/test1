package bp7.a$a;
import erd.g;
import bp7.a;
import java.lang.Object;
import uo7.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import ip7.g;
import com.kwai.sharelib.KsShareApi;
import android.app.Application;
import java.util.Objects;
import android.content.ClipboardManager;
import com.kwai.sharelib.model.ShareAnyResponse$ShareObject;
import uo7.i;
import java.lang.CharSequence;
import android.content.ClipData;

public final class a$a implements g	// class@000437
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
       }else {
          a.o(p0, "it");
          if (!g.a(p0, "", 2)) {
             p0 = KsShareApi.s.k().getSystemService("clipboard");
             Objects.requireNonNull(p0, "null cannot be cast to non-null type android.content.ClipboardManager");
             p0.setPrimaryClip(ClipData.newPlainText("", this.b.t().mShareMessage));
          }
       }
       return;
    }
}

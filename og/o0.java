package og.o0;
import erd.g;
import android.app.Activity;
import b26.b;
import com.kwai.feature.post.api.feature.bridge.JsSelectMixMediasParams;
import f55.g;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Intent;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import og.a;
import og.b;
import n3d.a;

public final class o0 implements g	// class@0027b8
{
    public final Activity b;
    public final b c;
    public final JsSelectMixMediasParams d;
    public final g e;

    public void o0(Activity p0,b p1,JsSelectMixMediasParams p2,g p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void accept(Object p0){
       a.p(p0, "plugin");
       o0 tb = this.b;
       Objects.requireNonNull(tb, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       o0 tc = this.c;
       o0 td = this.d;
       o0 te = this.e;
       Objects.requireNonNull(a.d);
       a.p(tc, "compressPlugin");
       a.p(tb, "activity");
       a.p(td, "params");
       a.p(te, "callback");
       tb.t1(p0.XX(this.b, "", "", ""), 19, new b(te, tc, tb, td));
       this.b.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f0100f1);
    }
}

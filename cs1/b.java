package cs1.b;
import com.kuaishou.live.viewcontroller.ViewController;
import as1.c;
import sq1.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.util.Objects;
import android.view.ViewGroup;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.model.CDNUrl;
import xr1.f;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.widget.TextView;
import cs1.a;
import android.view.View$OnClickListener;

public final class b extends ViewController	// class@001e3d
{
    public final c j;
    public final a k;

    public void b(c p0,a p1){
       a.p(p0, "puzzleConfig");
       a.p(p1, "roomDelegate");
       super();
       this.j = p0;
       this.k = p1;
    }
    public void F2(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0a32);
       if (!PatchProxy.applyVoid(objArray, this, uob, "2")) {
          View view = this.P2();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          view = m1.f(view, R.id.live_audience_multi_line_puzzle_title);
          a.o(view, "ViewBindUtils.bindWidget¡­line_puzzle_title\n      \)");
          view.U(f.a(this.j.b()));
          view = this.P2();
          Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
          view = m1.f(view, R.id.live_audience_multi_line_puzzle_check_button);
          a.o(view, "ViewBindUtils.bindWidget¡­zzle_check_button\n      \)");
          view.setOnClickListener(new a(this));
       }
       return;
    }
}

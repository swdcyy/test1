package js1.c;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.String;
import msd.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.widget.TextView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.View;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import is1.d;
import js1.b;
import java.lang.Runnable;
import androidx.lifecycle.LiveData;
import is1.a;
import com.kuaishou.live.common.core.component.multiline.renderpart.warmup.toptag.LiveAudienceMultiLinWarmupTopTagViewController$bindData$1;
import msd.p;
import com.kuaishou.live.mvvm.viewmodel.state.LiveDataOperators;
import js1.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import ls1.g;

public final class c extends ViewController	// class@002c01
{
    public final int j;
    public d k;
    public TextView l;
    public KwaiCDNImageView m;
    public final String n;
    public final a o;

    public void c(String p0,a p1){
       a.p(p1, "serverTimeProvider");
       super();
       this.n = p0;
       this.o = p1;
       this.j = a1.e(10.00f);
    }
    public static final TextView V2(c p0){
       p0 = p0.l;
       if (p0 == null) {
          a.S("countdownTextView");
       }
       return p0;
    }
    public void F2(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0a2e);
       this.l = this.A2(0x7f0a1983);
       this.m = this.A2(0x7f0a1984);
       if (!PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          this.k = new d(this.n, this.o, b.b);
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          uoc = this.k;
          String str = "warmUpModel";
          if (uoc == null) {
             a.S(str);
          }
          LiveData liveData = uoc.a();
          c tk = this.k;
          if (tk == null) {
             a.S(str);
          }
          LiveDataOperators.b(liveData, tk.b(), LiveAudienceMultiLinWarmupTopTagViewController$bindData$1.INSTANCE).observe(this, new a(this));
          uoc = this.m;
          if (uoc == null) {
             a.S("tagImageView");
          }
          g.a(uoc, R.string.arg_RES_7f1025c6, this.j);
       }
       return;
    }
}

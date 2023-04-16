package bed.d;
import erd.g;
import bed.y;
import s3b.a;
import qm6.b$a;
import ixc.c;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.util.Objects;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.Exception;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import i4b.g;
import t16.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.app.Activity;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import java.lang.CharSequence;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import z3b.a;
import z3b.f;
import bed.a0;

public final class d implements g	// class@000404
{
    public final y b;
    public final a c;
    public final b$a d;
    public final int e;
    public final c f;

    public void d(y p0,a p1,b$a p2,int p3,c p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       d te = this.e;
       d tf = this.f;
       Objects.requireNonNull(tb);
       if (!tc.h(p0)) {
          tc.i(tc.b(p0));
          if (tb.b.mMusic != null) {
             tb.g(td, te);
          }
       }else if(g.y(p0)){
          a uoa = new a("record", "taken_in_resource");
          if (!PatchProxy.isSupport(y.class) || !PatchProxy.applyVoidFourRefs(uoa, Integer.valueOf(te), p0, tf, tb, y.class, "17")) {
             String str = tb.a.getString(R.string.arg_RES_7f103667);
             ProgressFragment progressFrag = PatchProxy.applyOneRefs(str, tb, y.class, "22");
             if (progressFrag != PatchProxyResult.class) {
             }else {
                progressFrag = new ProgressFragment();
                progressFrag.Jh(str);
                progressFrag.setCancelable(0);
                progressFrag.show(tb.a.getSupportFragmentManager(), "runner");
             }
             f[] uofArray = new f[]{new a0(tb, progressFrag, te)};
             tf.H0().a(uoa.a(), uoa.b(), p0, uofArray);
          }
       }else {
          td.J(p0);
          td.K(1);
          if (tb.b.mMusic != null) {
             tb.g(td, te);
          }else {
             tb.l(td);
          }
       }
       return;
    }
}

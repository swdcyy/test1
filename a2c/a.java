package a2c.a;
import a2c.a$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import a2c.a$b;
import java.lang.Runnable;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import java.io.File;
import com.kuaishou.android.model.feed.VideoFeed;
import com.kwai.chat.components.utils.a;
import androidx.fragment.app.DialogFragment;
import lnc.a1;
import java.lang.CharSequence;
import a2c.b;
import android.view.View$OnClickListener;
import a2c.c;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import qrd.l1;
import crd.b;
import lnc.b9;
import com.kwai.framework.model.feed.BaseFeed;
import brd.t;
import cxb.n;
import t45.d;
import brd.z;
import a2c.a$c;
import erd.g;
import a2c.a$d;
import erd.a;
import io.reactivex.internal.functions.Functions;
import a2c.a$e;

public final class a	// class@000039
{
    public VideoFeed a;
    public b b;
    public ProgressFragment c;
    public File d;
    public b e;
    public b f;
    public static final a$a g;

    static {
       a.g = new a$a(null);
    }
    public void a(){
       super();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       if (!k1.g()) {
          k1.o(new a$b(this));
       }
       a tc = this.c;
       if (tc != null && tc.isAdded() == true) {
          tc = this.c;
          if (tc != null) {
             tc.dismiss();
          }
       }
       this.c = null;
       return;
    }
    public final void b(GifshowActivity p0){
       String id;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "2")) {
          return;
       }
       String str = ".mp4";
       StringBuilder str1 = PatchProxy.applyOneRefs(str, this, uoa, "5");
       if (str1 != PatchProxyResult.class) {
       }else {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          Application uApplication = uoc.a();
          a.o(uApplication, "AppEnv.get\(\).appContext");
          str1 = String.valueOf(uApplication.getExternalCacheDir())+File.separator;
          a ta = this.a;
          if (ta != null) {
             id = ta.getId();
             if (id != null) {
             label_004f :
                str1 = str1+a.c(id)+str;
             }
          }
          id = "";
          goto label_004f ;
       }
       this.d = new File(str1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "3")) {
          ProgressFragment progressFrag = new ProgressFragment();
          progressFrag.Eh(0, 100);
          progressFrag.setCancelable(0);
          progressFrag.Jh(a1.r(R.string.arg_RES_7f100aab, ""));
          progressFrag.Kh(true);
          progressFrag.Ch(R.drawable.arg_RES_7f08234f);
          progressFrag.Bh(new b(this, p0));
          progressFrag.k0(new c(this, p0));
          progressFrag.show(p0.getSupportFragmentManager(), "runner");
          this.c = progressFrag;
       }
       b9.a(this.b);
       uoa = this.a;
       if (uoa != null) {
          this.b = n.a(uoa, str1).subscribeOn(d.c).observeOn(d.a).doOnNext(new a$c(this, p0)).doFinally(new a$d(this)).subscribe(Functions.d(), new a$e(this));
       }
       return;
    }
}

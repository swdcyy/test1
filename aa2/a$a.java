package aa2.a$a;
import vq5.b;
import aa2.a;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import p91.m;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import sr5.a;
import sr5.b;
import en1.d;

public final class a$a implements b	// class@00008f
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "uri");
       Activity activity = this.a.getActivity();
       if (activity != null) {
          a.o(activity, "activity ?: return@LiveRouterCallback");
          BaseFragment uBaseFragmen = a.W8(this.a).b();
          a.o(uBaseFragmen, "liveBasicContext.fragment");
          c fragmentMana = uBaseFragmen.getFragmentManager();
          if (fragmentMana != null) {
             a.o(fragmentMana, "liveBasicContext.fragmen¡­return@LiveRouterCallback");
             String queryParamet = p0.getQueryParameter("hotspotId");
             if (queryParamet != null) {
                a.o(queryParamet, "uri.getQueryParameter\(HO¡­return@LiveRouterCallback");
                String queryParamet1 = p0.getQueryParameter("entrySrc");
                if (queryParamet1 == null) {
                   queryParamet1 = "0";
                }
                a.o(queryParamet1, "uri.getQueryParameter\(HOT_DETAIL_ENTRY_SRC\) ?: \"0\"");
                a$a ta = this.a;
                d.b(activity, fragmentMana, ta.D, ta.E, queryParamet, Integer.parseInt(queryParamet1));
             }
          }
       }
       return;
    }
}

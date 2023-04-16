package aa2.a$b;
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
import kotlin.Result;
import java.lang.Integer;
import java.lang.Throwable;
import qrd.j0;
import java.lang.Boolean;
import en1.d;
import java.util.Objects;
import sr5.a;
import sr5.b;
import un1.k;

public final class a$b implements b	// class@000090
{
    public final a a;

    public void a$b(a p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return a.a(this);
    }
    public final void b(Uri p0){
       d a;
       a d;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
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
             String queryParamet = p0.getQueryParameter("selectedHotSpotId");
             String queryParamet1 = p0.getQueryParameter("authorId");
             String queryParamet2 = p0.getQueryParameter("liveStreamId");
             Boolean uBoolean = null;
             String queryParamet3 = p0.getQueryParameter("entrySrc");
             Integer integer = (queryParamet3 != null)? Integer.valueOf(Integer.parseInt(queryParamet3)): uBoolean;
             Boolean obj = Result.constructor-impl(integer);
             if (Result.isFailure-impl(obj)) {
                obj = uBoolean;
             }
             int i = 0;
             int i1 = (obj != null)? obj.intValue(): 0;
             int i2 = 1;
             String queryParamet4 = p0.getQueryParameter("needMask");
             boolean i3 = (queryParamet4 != null)? Integer.parseInt(queryParamet4): 0;
             i3 = (i3)? true: false;
             i3 = Result.constructor-impl(Boolean.valueOf(i3));
             if (!Result.isFailure-impl(i3)) {
                uBoolean = i3;
             }
             i3 = (uBoolean != null)? uBoolean.booleanValue(): false;
             a = d.a;
             a$b ta = this.a;
             d = ta.D;
             a e = ta.E;
             Objects.requireNonNull(a);
             d uod = d.class;
             if (PatchProxy.isSupport(uod)) {
                Object[] objArray = new Object[9];
                objArray[i] = Boolean.valueOf(i3);
                objArray[i2] = activity;
                objArray[2] = fragmentMana;
                objArray[3] = Integer.valueOf(i1);
                objArray[4] = queryParamet;
                objArray[5] = queryParamet1;
                objArray[6] = queryParamet2;
                objArray[7] = d;
                objArray[8] = e;
                if (!PatchProxy.applyVoid(objArray, a, uod, "6")) {
                }
             }else {
             }
          }
       }
       return;
    }
}

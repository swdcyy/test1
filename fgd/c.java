package fgd.c;
import android.view.View$OnClickListener;
import fgd.k;
import java.lang.Object;
import android.view.View;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.GifshowActivity;
import bgd.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import k2b.u1;
import lnc.i3;
import java.util.Iterator;
import java.util.List;
import bgd.a;
import java.lang.Boolean;
import cgd.b;
import java.lang.StringBuilder;
import u07.t$a;
import lnc.a1;
import java.lang.CharSequence;
import fgd.d;
import u07.u;
import fgd.e;
import u07.t;
import u07.j;

public final class c implements View$OnClickListener	// class@000e22
{
    public final k b;

    public void c(k p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c tb = this.b;
       Activity activity = tb.getActivity();
       if (PatchProxy.applyVoidOneRefs(activity, tb, k.class, "11")) {
       }else {
          Activity uActivity = activity;
          if (!PatchProxy.applyVoidOneRefs(uActivity, null, b.class, "3")) {
             a.p(uActivity, "page");
             ShowMetaData showMetaData = new ShowMetaData();
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "CACHE_CONFIRM_POPUP";
             uElementPack.params = "";
             showMetaData.setElementPackage(uElementPack);
             showMetaData.setContentPackage(new ClientContent$ContentPackage());
             showMetaData.setLogPage(uActivity);
             u1.B0(showMetaData);
          }
          i3 oi3 = i3.f();
          Iterator iterator = tb.x.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             String str = uoa.c();
             oi3.a(str, Boolean.valueOf(uoa.a()));
             if (tb.u.L0(str)) {
                oi3.a(str+"_switch", Boolean.valueOf(uoa.b()));
             }
          }
          tb.V8(activity, "CLEAN_BUTTON", oi3.e());
          t$a uoa1 = new t$a(activity);
          uoa1.X0(a1.p(R.string.arg_RES_7f100465));
          uoa1.z0(activity.getString(R.string.arg_RES_7f100464));
          uoa1.S0(R.string.arg_RES_7f1007e2);
          uoa1.Q0(R.string.cancel);
          uoa1.t0(new d(tb, activity));
          uoa1.u0(new e(tb, activity));
          j.d(uoa1);
       }
       return;
    }
}

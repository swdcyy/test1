package bjc.j;
import android.view.View$OnClickListener;
import bjc.h$c;
import java.lang.Object;
import android.view.View;
import com.yxcorp.gifshow.share.widget.d$e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.content.pm.PackageManager;
import mhc.e2;
import io.reactivex.subjects.PublishSubject;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.app.Activity;
import java.lang.CharSequence;
import bjc.h;

public final class j implements View$OnClickListener	// class@00048c
{
    public final h$c b;

    public void j(h$c p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       j tb = this.b;
       h$c uoc = h$c.class;
       if (tb.s.a == null) {
          if (!PatchProxy.applyVoidOneRefs(p0, tb, uoc, "5")) {
             Context context = tb.getContext();
             if (context != null) {
                Intent intent = PatchProxy.applyOneRefs(context, tb, uoc, "6");
                if (intent != PatchProxyResult.class) {
                }else {
                   intent = context.getPackageManager().getLaunchIntentForPackage("com.tencent.mm");
                   if (intent != null) {
                      intent.addFlags(0x10000000);
                   }
                }
                if (intent != null) {
                   context.startActivity(intent);
                }
                tb.r.onNext(new e2(p0.getId()));
             }
          }
       }else {
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, uoc, "7")) {
             tb.t.setVisibility(0);
             tb.u.setCompoundDrawables(objArray, objArray, objArray, objArray);
             Activity activity = tb.getActivity();
             if (activity != null) {
                Object[] objArray1 = new Object[]{"0"};
                tb.u.setText(String.format(activity.getString(R.string.arg_RES_7f10503a), objArray1));
             }
             activity.a = false;
             h.C(tb.v, tb.u, 0);
             tb.s.a();
          }
       }
       return;
    }
}

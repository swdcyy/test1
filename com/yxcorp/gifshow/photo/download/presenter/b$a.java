package com.yxcorp.gifshow.photo.download.presenter.b$a;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.photo.download.presenter.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import fxb.a;
import java.util.Collection;
import ekd.q;
import androidx.fragment.app.DialogFragment;
import java.util.Objects;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import gxb.l;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class b$a extends m	// class@000edd
{
    public final b c;

    public void b$a(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       b$a tc = this.c;
       a.g(tc.u, "DOWNLOAD", TextUtils.n("SCALE_CLEAN_CONTROLLER", tc.t));
       if (q.f(this.c.r)) {
          return;
       }
       this.c.v.dismiss();
       tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, b.class, "4")) {
          String str = "android.permission.WRITE_EXTERNAL_STORAGE";
          if (!PermissionUtils.a(tc.getActivity(), str)) {
             String[] stringArray = new String[]{str};
             a.k(tc.getActivity(), stringArray).subscribe(new l(tc), Functions.d());
          }else {
             tc.P8();
          }
       }
       return;
    }
}

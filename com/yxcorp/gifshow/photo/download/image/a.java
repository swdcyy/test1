package com.yxcorp.gifshow.photo.download.image.a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.photo.download.image.ImageDownloadForSearchDialog;
import java.lang.Object;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import com.yxcorp.gifshow.photo.download.image.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dxb.o;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$AtlasPackage;
import fxb.a;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import android.app.Activity;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import dxb.u;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public final class a implements View$OnClickListener	// class@000ed3
{
    public final ImageDownloadForSearchDialog b;

    public void a(ImageDownloadForSearchDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c a;
       a tb = this.b;
       ImageDownloadForSearchDialog r = tb.r;
       FragmentActivity activity = tb.getActivity();
       Objects.requireNonNull(r);
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(activity, r, uoc, "1")) {
       }else {
          r.h = activity;
          if (r.b[r.a.n] < 0) {
             if (!PatchProxy.applyVoid(null, r, uoc, "13")) {
                a = r.a;
                a.d(r.a.a(), a.e, a.f, r.d());
             }
             String str = "android.permission.WRITE_EXTERNAL_STORAGE";
             if (!PermissionUtils.a(activity, str)) {
                String[] stringArray = new String[]{str};
                a.k(activity, stringArray).subscribe(new u(r, activity), Functions.d());
             }else {
                r.b();
             }
          }
       }
       return;
    }
}

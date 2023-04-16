package com.yxcorp.gifshow.photo.download.widget.k;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$AtlasPackage;
import fxb.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Map;
import kzc.d;
import android.app.Activity;
import o56.a;
import android.app.Application;
import java.lang.CharSequence;
import u07.t$a;
import lxb.k;
import u07.u;
import lxb.j;
import com.kwai.library.widget.popup.common.c$b;
import u07.f;
import lxb.r;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import androidx.fragment.app.KwaiDialogFragment;

public class k extends m	// class@000f49
{
    public final DownloadPicDialog c;

    public void k(DownloadPicDialog p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       k tc = this.c;
       a.a("PHOTO_DOWNLOAD_IMAGE_DIALOG_CLOSE_BUTTON", tc.O, tc.P, "CANCEL_BUTTON");
       tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       DownloadPicDialog obj = PatchProxy.apply(objArray, tc, DownloadPicDialog.class, "15");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          int i = 2;
          while (true) {
             if (i <= tc.B) {
                if (tc.L.get(Integer.valueOf(i)).intValue() == -1 || (tc.L.get(Integer.valueOf(i)).intValue() < 100 && tc.L.get(Integer.valueOf(i)).intValue() > 0)) {
                   b = true;
                }else {
                   i = i + 1;
                }
             }else {
                b = false;
             }
          }
       }
       if (b) {
          tc = this.c;
          Objects.requireNonNull(tc);
          if (!PatchProxy.applyVoid(objArray, tc, DownloadPicDialog.class, "16")) {
             obj = tc.Q;
             if (obj == null) {
                String str = "";
             }
             a.c(tc.O, tc.P);
             d uod = new d(tc.z);
             uod.z0(a.B.getString(R.string.arg_RES_7f100a9d));
             uod.T0(a.B.getString(R.string.arg_RES_7f100a9b));
             uod.R0(a.B.getString(R.string.arg_RES_7f100a9c));
             uod.t0(new k(tc, obj));
             uod.u0(new j(tc));
             uod.z(false);
             t$a uoa = f.e(uod);
             uoa.v(true);
             uoa.Y(new r(tc));
          }
       }else {
          this.c.dismissAllowingStateLoss();
       }
       return;
    }
}

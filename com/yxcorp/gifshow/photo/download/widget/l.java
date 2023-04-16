package com.yxcorp.gifshow.photo.download.widget.l;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Map;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$AtlasPackage;
import fxb.a;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import android.app.Activity;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import lxb.q;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;

public class l extends m	// class@000f4a
{
    public final DownloadPicDialog c;

    public void l(DownloadPicDialog p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       l tc = this.c;
       if (tc.L.get(Integer.valueOf(tc.D)) != null) {
          tc = this.c;
          if (tc.L.get(Integer.valueOf(tc.D)).intValue() > 0) {
             return;
          }
       }
       tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, DownloadPicDialog.class, "17")) {
          if (tc.yh(tc.D)) {
             a.d("PHOTO_DOWNLOAD_IMAGE_DIALOG_ALL_BUTTON", tc.O, tc.P, tc.uh());
          }else if(tc.Ah(tc.D)){
             a.d("PHOTO_DOWNLOAD_IMAGE_DIALOG_LONG_BUTTON", tc.O, tc.P, tc.uh());
          }else {
             a.d("PHOTO_DOWNLOAD_IMAGE_DIALOG_ONE_BUTTON", tc.O, tc.P, tc.uh());
          }
       }
       String str = "android.permission.WRITE_EXTERNAL_STORAGE";
       if (!PermissionUtils.a(this.c.z, str)) {
          String[] stringArray = new String[]{str};
          a.k(this.c.z, stringArray).subscribe(new q(this), Functions.d());
       }else {
          this.c.th();
       }
       return;
    }
}

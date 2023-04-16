package c2c.c;
import android.content.DialogInterface$OnClickListener;
import com.yxcorp.gifshow.profile.background.presenter.ProfilePreviewImagePresenter;
import android.app.Activity;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import c2c.c$a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public final class c implements DialogInterface$OnClickListener	// class@0004f8
{
    public final ProfilePreviewImagePresenter b;
    public final Activity c;

    public void c(ProfilePreviewImagePresenter p0,Activity p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(DialogInterface p0,int p1){
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, c.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       if (p1 == 0x7f1043c7) {
          String str = "android.permission.WRITE_EXTERNAL_STORAGE";
          if (PermissionUtils.a(this.c, str)) {
             this.b.V8();
          }else {
             String[] stringArray = new String[]{str};
             this.b.X7(a.k(this.c, stringArray).subscribe(new c$a(this), Functions.d()));
          }
       }
       return;
    }
}

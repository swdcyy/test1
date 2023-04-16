package djc.j1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.share.widget.KwaiUploadShareDialog;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.content.pm.PackageManager;
import java.lang.Throwable;
import djc.e0;

public final class j1 implements View$OnClickListener	// class@0021ff
{
    public final KwaiUploadShareDialog b;

    public void j1(KwaiUploadShareDialog p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       String str;
       j1 tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, KwaiUploadShareDialog.class, "9")) {
       }else {
          tb.u = true;
          try{
             tb.dismiss();
             Intent intent = PatchProxy.apply(objArray, tb, KwaiUploadShareDialog.class, "12");
             if (intent != PatchProxyResult.class) {
             label_004e :
                if (intent != null) {
                   tb.getContext().startActivity(intent);
                }
             }else {
                KwaiUploadShareDialog s = tb.s;
                if (s != 3 && s != 4) {
                   str = (s != 5)? "com.tencent.mm": "com.sina.weibo";
                }else {
                   str = "com.tencent.mobileqq";
                }
                intent = tb.getContext().getPackageManager().getLaunchIntentForPackage(str);
                if (intent != null) {
                   intent.addFlags(0x10000000);
                   goto label_004e ;
                }else {
                   goto label_004e ;
                }
             }
          }catch(java.lang.Exception e0){
             KwaiUploadShareDialog t = tb.t;
             if (t != null) {
                t.onError(e0);
             }
          }
          KwaiUploadShareDialog t1 = tb.t;
          if (t1 != null) {
             t1.e();
          }
       }
       return;
    }
}

package com.yxcorp.gifshow.share.c;
import msd.l;
import brd.v;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.yxcorp.gifshow.share.module.SimilarPhotoResponse;
import com.yxcorp.gifshow.share.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.share.OperationModel;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.share.widget.DownloadForwardDialog;
import mhc.i;
import djc.e0;
import mhc.e;
import android.content.DialogInterface$OnCancelListener;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;

public final class c implements l	// class@001b75
{
    public final v b;
    public final BaseFeed c;
    public final boolean d;
    public final String e;
    public final GifshowActivity f;

    public void c(v p0,BaseFeed p1,boolean p2,String p3,GifshowActivity p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object invoke(Object p0){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       c te = this.e;
       c tf = this.f;
       if (PatchProxy.isSupport2(d.class, "6")) {
          Object[] objArray = new Object[]{tb,tc,Boolean.valueOf(td),te,tf,p0};
          if (PatchProxy.applyVoid(objArray, null, d.class, "6")) {
          label_005f :
             return null;
          }
       }
       OperationModel operationMod = d.d(tc);
       p0 = DownloadForwardDialog.uh(operationMod.s(), 1, td, p0, tc);
       p0.vh(new i(tb, operationMod));
       p0.oh(new e(tb));
       p0.show(tf.getSupportFragmentManager(), "download_complete_share_dialog");
       PatchProxy.onMethodExit(d.class, "6");
       goto label_005f ;
    }
}

package kw8.a;
import f6c.c;
import java.lang.Object;
import android.app.Activity;
import dnc.v1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.activity.share.widget.RandomCoinDialog;
import com.kwai.library.widget.popup.common.c;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import f6c.b;
import com.kuaishou.edit.draft.Workspace$Source;
import crd.b;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import rxc.k;
import msd.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import f66.i;
import jq.a;
import q87.c;
import vw8.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.gifshow.visible.ShareVisibleFragment;
import com.yxcorp.gifshow.visible.ShareVisibleFragment$ItemsVisibilityConfig;
import com.yxcorp.gifshow.visible.ShareVisibleFragment$a;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;

public class a implements c	// class@002c27
{

    public void a(){
       super();
    }
    public void Ha(Activity p0,v1 p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       new RandomCoinDialog(p0, p1).Z();
       return;
    }
    public void TG(UploadRequest$a p0){
       b.b(this, p0);
    }
    public b he(Workspace$Source p0,boolean p1){
       k obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = k.a;
       if (obj.a(p0, false)) {
          return obj.c(null, p1);
       }else {
          return null;
       }
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean m8(){
       return b.a(this);
    }
    public void nY(GifshowActivity p0,c p1,boolean p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.b().w("PublishInternalPluginImpl", "openPhotoVisibilityDialogInEdit", objArray);
       if (!PatchProxy.applyVoidOneRefs(p0, null, a.class, "107")) {
          super();
          this.action2 = "EDIT_SETTING";
          this.type = 1;
          u1.M("", p0, 1, this, null, null);
       }
       ShareVisibleFragment.D.a(p1, p2, ShareVisibleFragment$ItemsVisibilityConfig.EDIT).Cb(p0.getSupportFragmentManager(), "visibleFragment");
       return;
    }
}

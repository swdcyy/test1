package e8a.m0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaPymkDialogFragment;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import androidx.fragment.app.KwaiDialogFragment;

public final class m0 implements View$OnClickListener	// class@0020bf
{
    public final NasaPymkDialogFragment b;

    public void m0(NasaPymkDialogFragment p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       m0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, NasaPymkDialogFragment.class, "11")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "KNOW_PEOPLE_POPUP_CLOSE";
          uElementPack.params = tb.r;
          u1.u(1, uElementPack, null);
       }
       tb.dismiss();
       return;
    }
}

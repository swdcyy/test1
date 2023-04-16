package bj4.c;
import nd4.e;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bj4.a;
import com.kuaishou.merchant.transaction.base.purchasepanel.model.PayStatusInfo;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.List;

public class c extends e	// class@000386
{

    public void c(Fragment p0){
       super(p0);
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.r = new a(this.q.mPayStepInfos, this.getActivity());
       return;
    }
}

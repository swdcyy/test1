package m19.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import m19.c;
import tkd.b;
import tkd.d;
import wm5.a;
import androidx.fragment.app.Fragment;
import g59.m;
import le5.f;
import m19.e;

public class a extends PresenterV2	// class@002ddb
{

    public void a(BaseFragment p0){
       super();
       this.U7(new c());
       PresenterV2 presenterV2 = d.a(0x66aa3a58).vR();
       if (presenterV2 != null) {
          this.U7(presenterV2);
       }
       if (m.b(p0) || f.i()) {
          this.U7(new e());
       }
       return;
    }
}

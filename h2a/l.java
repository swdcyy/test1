package h2a.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import h2a.j;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import android.text.TextPaint;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import android.view.View;
import ekd.m1;
import h2a.i;
import android.view.View$OnClickListener;
import h2a.h;
import com.yxcorp.gifshow.entity.QPhoto;

public class l extends PresenterV2	// class@00254c
{
    public TextView p;
    public TextView q;
    public QPhoto r;
    public t s;
    public DialogFragment t;
    public List u;

    public void l(){
       super();
       this.u = new ArrayList();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       this.X7(this.s.subscribe(new j(this), Functions.e));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       this.p.getPaint().setFakeBoldText(true);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, l.class, "6")) {
          return;
       }
       this.t.dismissAllowingStateLoss();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2dc0);
       this.q = m1.f(p0, 0x7f0a0e3c);
       m1.a(p0, new i(this), R.id.next_button);
       m1.a(p0, new h(this), R.id.close_button);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.s = this.r8("REASON_SELECT_STATUS_CHANGE_OBSERVABLE");
       this.t = this.q8(DialogFragment.class);
       return;
    }
}

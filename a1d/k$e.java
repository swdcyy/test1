package a1d.k$e;
import v0d.m$b;
import a1d.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.TextView;
import android.content.res.Resources;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Integer;
import java.lang.StringBuilder;
import android.content.Context;
import java.lang.CharSequence;

public class k$e implements m$b	// class@000036
{
    public final k a;

    public void k$e(k p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, k$e.class, "2")) {
          return;
       }
       k$e ta = this.a;
       k b = ta.B;
       if (b != null) {
          ta.F = false;
          b.setText(R.string.arg_RES_7f1002dc);
          this.a.B.setEnabled(true);
          ta = this.a;
          ta.B.setTextColor(ta.l8().getColor(R.color.arg_RES_7f0607c5));
       }
       return;
    }
    public void onProgress(int p0){
       k$e uoe = k$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoe, "1")) {
          return;
       }
       uoe = this.a;
       k b = uoe.B;
       if (b != null) {
          uoe.F = true;
          b.setEnabled(false);
          k$e ta = this.a;
          ta.B.setTextColor(ta.l8().getColor(R.color.arg_RES_7f061eed));
          Object[] objArray = new Object[true];
          objArray[0] = Integer.valueOf(p0);
          this.a.B.setText(this.a.getContext().getString(R.string.arg_RES_7f1002dc)+" \("+this.a.getContext().getString(R.string.arg_RES_7f104cee, objArray)+"\)");
       }
       return;
    }
}

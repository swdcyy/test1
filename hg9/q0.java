package hg9.q0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.photo.p;
import android.view.View;
import java.lang.Object;
import java.util.Objects;
import j8c.a;
import java.lang.String;
import q87.c;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.camera.record.photo.p$d;

public final class q0 implements View$OnClickListener	// class@002671
{
    public final p b;
    public final View c;
    public final View d;

    public void q0(p p0,View p1,View p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onClick(View p0){
       q0 tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().w(tb.a, "reShoot ", objArray);
       this.c.setVisibility(8);
       n.W(this.d, 0, 0);
       tb.e.b0().setVisibility(0);
       tb.e.K0();
    }
}

package jb1.s$b;
import k51.c;
import jb1.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import db1.c;
import java.lang.Integer;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class s$b extends c	// class@002b1d
{
    public TextView p;
    public c q;
    public final s r;
    public static String sLivePresenterClassName = "LiveAdminNewStyleListAdapter$LiveAdminCategoryPresenter";

    public void s$b(s p0){
       this.r = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s$b.class, "3")) {
          return;
       }
       Object[] objArray = new Object[]{Integer.valueOf(this.q.c),Integer.valueOf(this.q.d)};
       this.p.setText(String.format(this.q.b+"  \(%d/%d\)", objArray));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$b.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a188d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, s$b.class, "1")) {
          return;
       }
       this.q = this.q8(c.class);
       return;
    }
}

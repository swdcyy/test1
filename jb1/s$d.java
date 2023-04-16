package jb1.s$d;
import k51.c;
import jb1.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.View;
import ekd.m1;

public class s$d extends c	// class@002b21
{
    public TextView p;
    public final s q;
    public static String sLivePresenterClassName = "LiveAdminNewStyleListAdapter$LiveAdminPromptPresenter";

    public void s$d(s p0){
       this.q = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, s$d.class, "2")) {
          return;
       }
       this.p.setText(this.q.L);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, s$d.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a188f);
       return;
    }
}

package eya.b$a;
import android.view.View$OnClickListener;
import eya.b;
import java.lang.String;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.label.tag.span.ColorClickableSpan;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import android.app.Activity;
import e3a.a;
import java.util.Objects;
import cya.d;
import android.text.style.URLSpan;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.QComment;
import eya.b$b;

public class b$a implements View$OnClickListener	// class@00284a
{
    public final String b;
    public final User c;
    public final ColorClickableSpan d;
    public final b e;

    public void b$a(b p0,String p1,User p2,ColorClickableSpan p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       p0.setTag(R.id.open_url, new WeakReference(this));
       a.a(p0);
       Objects.requireNonNull(this.e);
       d uod = new d(this.d.getURL(), this.d.b());
       uod.g(this.e.c(this.b, this.c));
       uod.i(this.c.mId);
       uod.m(true);
       uod.l(this.e.c);
       uod.h(this.e.d);
       b$a te = this.e;
       uod.e(te.g, te.h);
       te = this.e;
       uod.d(te.i, te.j);
       uod.a(p0);
       b e = this.e.e;
       if (e != null) {
          e.a(p0, this.c);
       }
       return;
    }
}

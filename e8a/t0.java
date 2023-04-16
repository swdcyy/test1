package e8a.t0;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.i;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i$b;
import e17.i;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.j;
import e8a.u0;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.comment.utils.b$a;
import com.yxcorp.gifshow.comment.utils.b;

public final class t0 implements Runnable	// class@0020d8
{
    public final i b;
    public final BaseEditorFragment$g c;

    public void t0(i p0,BaseEditorFragment$g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       t0 tb = this.b;
       t0 tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, i.class, "2")) {
       }else {
          BaseEditorFragment$g c = tc.c;
          if (c != null && (TextUtils.x(c.trim()) && (tc.e == null && tc.f == null))) {
             i$b uob = i.m();
             uob.x(R.string.arg_RES_7f104252);
             uob.l(true);
             i.c(R.style.arg_RES_7f11066a, uob);
          }else if(!tb.b.m.i("commentKeywordActionConfiguration", tc.c, null, new u0(tb, tc), "HUMANISTIC_CARE")){
             tb.e(tc);
          }
       }
       return;
    }
}

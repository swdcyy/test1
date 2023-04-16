package el9.r;
import n3d.a;
import com.yxcorp.gifshow.comment.presenter.global.a$d;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import com.kuaishou.android.model.mix.QComment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.comment.presenter.global.a;

public final class r implements a	// class@0021ff
{
    public final a$d b;
    public final BaseEditorFragment$g c;
    public final QComment d;
    public final boolean e;
    public final BaseEditorFragment f;

    public void r(a$d p0,BaseEditorFragment$g p1,QComment p2,boolean p3,BaseEditorFragment p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       r tb = this.b;
       r tc = this.c;
       r td = this.d;
       r te = this.e;
       r tf = this.f;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined() && !tb.g.W8(tc)) {
          tb.g.R8(tc, td, te, tf);
       }
       return;
    }
}

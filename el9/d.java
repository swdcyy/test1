package el9.d;
import msd.l;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import com.kuaishou.android.model.mix.QComment;
import java.lang.Object;
import ek9.a$a;
import java.lang.String;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import com.kwai.framework.model.user.User;

public final class d implements l	// class@0021e0
{
    public final BaseEditorFragment$g b;
    public final QComment c;

    public void d(BaseEditorFragment$g p0,QComment p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object invoke(Object p0){
       d tb = this.b;
       d tc = this.c;
       p0.q(tb.c);
       p0.b(tb.e);
       p0.g(tb.f);
       p0.j(tc.getUser().getId());
       p0 = p0.h(tc);
       p0.c(tb.m);
       p0.d(tb.b);
       p0.m(tb.s);
       return null;
    }
}

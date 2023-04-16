package hl9.g0;
import msd.l;
import com.yxcorp.gifshow.comment.utils.e;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Object;
import ek9.a$a;
import java.util.Objects;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import com.kwai.emotionsdk.bean.EmotionInfo;
import com.yxcorp.gifshow.models.QMedia;
import com.kuaishou.android.model.mix.QComment;

public final class g0 implements l	// class@0026cd
{
    public final e b;
    public final BaseEditorFragment$g c;

    public void g0(e p0,BaseEditorFragment$g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object invoke(Object p0){
       g0 tb = this.b;
       g0 tc = this.c;
       Objects.requireNonNull(tb);
       String str = (TextUtils.x(tc.c))? "": tc.c;
       p0.q(str);
       p0.b(tc.e);
       p0.g(tc.f);
       p0 = p0.h(tb.l);
       p0.d(tc.b);
       p0.m(tc.s);
       return null;
    }
}

package hl9.h0;
import n3d.a;
import com.yxcorp.gifshow.comment.utils.e$b;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.comment.utils.e;

public final class h0 implements a	// class@0026cf
{
    public final e$b b;
    public final BaseEditorFragment$g c;

    public void h0(e$b p0,BaseEditorFragment$g p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       h0 tb = this.b;
       h0 tc = this.c;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.a.a(tc);
       }else {
          tb.a.l(tc);
       }
       return;
    }
}

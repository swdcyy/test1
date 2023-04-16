package com.yxcorp.gifshow.relation.pymk.kem.presenter.b$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.pymk.kem.presenter.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.model.response.dialog.PymkDialogItemViewResponse;
import com.kwai.framework.model.user.User;

public class b$b extends m	// class@00194d
{
    public final b c;

    public void b$b(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       b$b tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoidOneRefs(p0, tc, b.class, "6")) {
          tc.R8(tc.s.mUser, p0);
          tc.P8(1);
       }
       return;
    }
}

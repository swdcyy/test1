package com.kwai.live.gzone.accompanyplay.a$b$a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.accompanyplay.a$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.accompanyplay.a$a;
import com.kwai.framework.model.user.UserInfo;
import io.reactivex.subjects.PublishSubject;

public class a$b$a implements View$OnClickListener	// class@000aed
{
    public final int b;
    public final a$b c;

    public void a$b$a(a$b p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b$a.class, "1")) {
          return;
       }
       a$b$a tc = this.c;
       tc.t.onNext(new a$a(tc.u, (this.b + 1)));
       return;
    }
}

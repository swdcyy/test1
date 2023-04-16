package com.yxcorp.gifshow.comment.common.c$c;
import com.yxcorp.gifshow.comment.common.c$a;
import android.view.ViewStub;
import com.yxcorp.gifshow.comment.common.c$a$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;

public class c$c extends c$a	// class@0010a4
{
    public final c$a$a e;

    public void c$c(ViewStub p0){
       super(p0);
       this.e = new c$a$a();
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$c.class, "1")) {
          return;
       }
       this.e.b(p0.findViewById(R.id.nasa_comment_net_error_view));
       return;
    }
}

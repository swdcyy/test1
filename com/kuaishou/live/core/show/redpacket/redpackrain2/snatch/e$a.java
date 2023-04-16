package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.e$a;
import ub.a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.e;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import com.yxcorp.gifshow.image.KwaiImageView;

public class e$a extends a	// class@000f23
{
    public final boolean b;
    public final e c;

    public void e$a(e p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e$a.class, "1")) {
          return;
       }
       e$a tc = this.c;
       tc.e.setImageURI(tc.f(this.b));
       tc = this.c;
       tc.f.setImageURI(tc.e(this.b));
       return;
    }
}

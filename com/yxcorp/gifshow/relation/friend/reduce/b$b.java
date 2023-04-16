package com.yxcorp.gifshow.relation.friend.reduce.b$b;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.relation.friend.reduce.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uac.m;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import androidx.fragment.app.Fragment;
import qa9.s;
import z1.a;

public class b$b extends m	// class@0018d0
{
    public final b c;

    public void b$b(b p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       b s;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
          return;
       }
       b$b tc = this.c;
       b r = tc.r;
       b t = tc.t;
       String str = tc.W8();
       if (!PatchProxy.isSupport(m.class) || !PatchProxy.applyVoidThreeRefs(r, Boolean.valueOf(t), str, null, m.class, "3")) {
          m.a("cancel", r, t, str);
       }
       s.b(this.c.p);
       s = this.c.s;
       if (s != null) {
          s.accept(Boolean.FALSE);
       }
       return;
    }
}

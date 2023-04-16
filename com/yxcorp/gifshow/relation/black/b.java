package com.yxcorp.gifshow.relation.black.b;
import u07.u;
import com.yxcorp.gifshow.relation.black.f;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import rfc.a;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.model.BlockUser;
import com.kwai.framework.model.user.User;
import brd.t;
import cjd.e;
import erd.o;
import x9c.d;
import com.yxcorp.gifshow.relation.black.e;
import android.content.Context;
import erd.g;
import crd.b;

public final class b implements u	// class@0017e0
{
    public final f b;
    public final GifshowActivity c;

    public void b(f p0,GifshowActivity p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, f.class, "10")) {
       }else {
          b.a(0x4a533fa).a(QCurrentUser.me().getId(), tb.n.mBlockedUser.getId(), tc.getUrl(), tc.U2()).map(new e()).subscribe(new d(tb), new e(tb, tc));
       }
       return;
    }
}

package com.kuaishou.live.gzone.v2.profile.b;
import u07.u;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import wkd.b;
import rfc.a;
import java.lang.String;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import brd.t;
import cjd.e;
import erd.o;
import e63.y;
import sfc.a;
import android.content.Context;
import erd.g;
import crd.b;

public final class b implements u	// class@001cdb
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void a(t p0,View p1){
       b tb = this.b;
       Objects.requireNonNull(tb);
       y oy = new y(tb);
       b.a(0x4a533fa).a(tb.r.getAnchorUserId(), tb.r.getUserProfile().mProfile.mId, null, null).map(new e()).subscribe(oy, new a(tb.p));
    }
}

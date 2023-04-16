package com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.msghandler.a;
import rv1.b;
import com.kuaishou.live.common.core.component.pendant.miniwidget.position.rightbottom.msghandler.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.activity.GifshowActivity;
import bw1.b;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;

public class a implements b	// class@001711
{
    public final b a;

    public void a(b p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1,int p2,String p3){
       b a;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, a.class, "1")) {
          return;
       }
       a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, ta, b.class, "4")) {
          if (!QCurrentUser.me().isLogined()) {
             a = ta.a;
             if (a instanceof GifshowActivity) {
                y.a(a, a.getUrl(), "live_activity_widget", 0, "", null, null, null, new b(ta, p2, p3));
             }
          }
          ta.a(p2, p3);
       }
       return;
    }
}

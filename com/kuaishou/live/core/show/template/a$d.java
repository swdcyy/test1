package com.kuaishou.live.core.show.template.a$d;
import k72.b;
import com.kuaishou.live.core.show.template.a;
import com.kwai.feature.api.live.floatingscreen.data.LiveFloatingScreenBaseData;
import com.kuaishou.live.core.show.enterroom.floatingscreen.biz.noble.LiveAdvancedEnterRoomData;
import android.view.View;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import va1.n0;
import ar5.a;
import android.animation.AnimatorSet;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import t02.a0;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.r0;
import t02.r1;
import tx1.a;

public class a$d extends b	// class@00117c
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public boolean a(LiveFloatingScreenBaseData p0){
       return this.h(p0);
    }
    public Animator b(LiveFloatingScreenBaseData p0,View p1){
       return this.g(p0, p1);
    }
    public Animator g(LiveAdvancedEnterRoomData p0,View p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long displayDurat = p0.getDisplayDuration();
       int i = n0.f();
       float f = (float)displayDurat;
       long l = (long)(0x3c03126f * f);
       long l1 = (long)(f * 0x3b83126f);
       float f1 = (float)i;
       a uoa = new a();
       uoa.b(l);
       uoa.c(((displayDurat - l) - l1));
       uoa.e(l1);
       uoa.d((int)(f1 * 0.02f));
       uoa.f((int)((float)((i - p1.getWidth()) / 2) - (0x3c83126f * f1)));
       return uoa.a(p1);
    }
    public boolean h(LiveAdvancedEnterRoomData p0){
       a$d obj = PatchProxy.applyOneRefs(p0, this, a$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       super.h(p0);
       UserInfo userInfo = p0.getUserInfo();
       if (userInfo == null) {
          return false;
       }
       obj = this.a;
       a q = obj.q;
       if (q != null) {
          q.U.w0(new UserProfile(userInfo), LiveStreamClickType.UNKNOWN, 14, false, 100);
       }else {
          a r = obj.r;
          if (r != null) {
             r.Z.g3(new UserProfile(userInfo), LiveStreamClickType.UNKNOWN, 14, 100);
          }
       }
       return true;
    }
}

package com.yxcorp.plugin.setting.presenter.b;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.yxcorp.plugin.setting.presenter.a;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import tgd.b;
import erd.g;
import com.yxcorp.plugin.setting.helper.j;
import lu7.f;
import pgd.y;
import java.lang.Integer;
import k2b.e0;
import sgd.b;

public class b implements SlipSwitchButton$b	// class@0008d6
{
    public j a;
    public final a b;

    public void b(a p0){
       this.b = p0;
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (p1 != (QCurrentUser.ME.isAllowPushMyCommentsToOther() ^ 0x01)) {
          this.a.l(p0, "disable_push_my_comments_to_others", (p1 ^ 0x01), new b(this, p1));
       }
       b.c(this.b.s, "PUSH_MYCOMMENT_TO_OTHERS", Integer.valueOf(y.b(f.k(QCurrentUser.ME))), (QCurrentUser.ME.isAllowPushMyCommentsToOther() ^ 0x01), y.a(p0.getSwitch()));
       return;
    }
}

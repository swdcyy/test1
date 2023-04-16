package com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding$c;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;

public final class UserLevelInfoSelfBinding$c implements Observer	// class@001a5d
{
    public final UserLevelInfoSelfBinding b;

    public void UserLevelInfoSelfBinding$c(UserLevelInfoSelfBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserLevelInfoSelfBinding$c.class, "1")) {
       }else {
          UserLevelInfoSelfBinding$c tb = this.b;
          a.o(p0, "it");
          float f = p0.floatValue();
          Objects.requireNonNull(tb);
          UserLevelInfoSelfBinding userLevelInf = UserLevelInfoSelfBinding.class;
          if (!PatchProxy.isSupport(userLevelInf) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), tb, userLevelInf, "2")) {
             a uoa = new a();
             uoa.i(tb.i);
             UserLevelInfoSelfBinding j = tb.j;
             a.o(j, "progressView");
             uoa.p(j.getId(), f);
             uoa.b(tb.i);
          }
       }
       return;
    }
}

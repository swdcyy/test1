package com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding$d;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import ox2.a;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

public final class UserLevelInfoSelfBinding$d implements Observer	// class@001a5e
{
    public final UserLevelInfoSelfBinding b;

    public void UserLevelInfoSelfBinding$d(UserLevelInfoSelfBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, UserLevelInfoSelfBinding$d.class, "1")) {
       }else {
          UserLevelInfoSelfBinding$d tb = this.b;
          a.o(p0, "it");
          int i = p0.intValue();
          Objects.requireNonNull(tb);
          UserLevelInfoSelfBinding userLevelInf = UserLevelInfoSelfBinding.class;
          if (!PatchProxy.isSupport(userLevelInf) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, userLevelInf, "3")) {
             userLevelInf = tb.i;
             a.o(userLevelInf, "progressBgView");
             a = a.a;
             userLevelInf.setBackground(a.b(a, tb.b(51, i), 0, 2, null));
             userLevelInf = tb.j;
             a.o(userLevelInf, "progressView");
             userLevelInf.setBackground(a.b(a, tb.b(255, i), 0, 2, null));
          }
          this.b.k.setTextColor(p0.intValue());
          this.b.g.setTextColor(p0.intValue());
       }
       return;
    }
}

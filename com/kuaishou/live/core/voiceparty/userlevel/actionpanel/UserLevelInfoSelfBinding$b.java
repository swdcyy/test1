package com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding$b;
import androidx.lifecycle.Observer;
import com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import android.widget.TextView;

public final class UserLevelInfoSelfBinding$b implements Observer	// class@001a5a
{
    public final UserLevelInfoSelfBinding b;

    public void UserLevelInfoSelfBinding$b(UserLevelInfoSelfBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserLevelInfoSelfBinding$b.class, "1")) {
       }else {
          UserLevelInfoSelfBinding l = this.b.l;
          a.o(l, "maxExpView");
          l.setText(String.valueOf(p0));
       }
       return;
    }
}

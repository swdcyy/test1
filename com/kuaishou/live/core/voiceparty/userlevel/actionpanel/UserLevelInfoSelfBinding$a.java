package com.kuaishou.live.core.voiceparty.userlevel.actionpanel.UserLevelInfoSelfBinding$a;
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

public final class UserLevelInfoSelfBinding$a implements Observer	// class@001a59
{
    public final UserLevelInfoSelfBinding b;

    public void UserLevelInfoSelfBinding$a(UserLevelInfoSelfBinding p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, UserLevelInfoSelfBinding$a.class, "1")) {
       }else {
          UserLevelInfoSelfBinding k = this.b.k;
          a.o(k, "currentExpView");
          k.setText(String.valueOf(p0));
       }
       return;
    }
}

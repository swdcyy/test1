package com.yxcorp.gifshow.reminder.friend.presenter.single.c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.reminder.friend.presenter.single.b$b;
import com.kwai.social.startup.reminder.model.FriendTabStartupConfig$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z1.a;

public class c extends m	// class@001ad9
{
    public final FriendTabStartupConfig$a c;
    public final b$b d;

    public void c(b$b p0,FriendTabStartupConfig$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       this.d.f.accept(this.c);
       return;
    }
}

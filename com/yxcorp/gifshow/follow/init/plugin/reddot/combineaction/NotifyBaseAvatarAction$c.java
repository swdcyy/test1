package com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction$c;
import gha.p$a;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import pr6.d;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import ro5.c0;

public final class NotifyBaseAvatarAction$c implements p$a	// class@0010eb
{
    public final NotifyBaseAvatarAction a;

    public void NotifyBaseAvatarAction$c(NotifyBaseAvatarAction p0){
       this.a = p0;
       super();
    }
    public void a(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NotifyBaseAvatarAction$c.class, "1")) {
          return;
       }
       a.p(p0, "bitmap");
       if (this.a.f.g() != null) {
          c0.E(this.a.f, b.c, p0);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, NotifyBaseAvatarAction$c.class, "2")) {
          return;
       }
       this.a.g();
       return;
    }
}

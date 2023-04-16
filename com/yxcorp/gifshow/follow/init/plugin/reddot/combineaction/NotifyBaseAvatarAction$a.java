package com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction$a;
import erd.g;
import com.yxcorp.gifshow.follow.init.plugin.reddot.combineaction.NotifyBaseAvatarAction;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;

public final class NotifyBaseAvatarAction$a implements g	// class@0010e9
{
    public final NotifyBaseAvatarAction b;

    public void NotifyBaseAvatarAction$a(NotifyBaseAvatarAction p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NotifyBaseAvatarAction$a.class, "1")) {
       }else if(p0 == FragmentEvent.DESTROY_VIEW){
          this.b.c().cancel();
       }
       return;
    }
}

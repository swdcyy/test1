package com.kuaishou.live.lite.adapter.component.effect.LiveLiteEffectPresenter$d;
import ok.x;
import com.kuaishou.live.lite.adapter.component.effect.LiveLiteEffectPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.User;
import or5.d;
import xp5.g;

public final class LiveLiteEffectPresenter$d implements x	// class@001d82
{
    public final LiveLiteEffectPresenter b;

    public void LiveLiteEffectPresenter$d(LiveLiteEffectPresenter p0){
       this.b = p0;
       super();
    }
    public Object get(){
       User user = PatchProxy.apply(null, this, LiveLiteEffectPresenter$d.class, "1");
       if (user != PatchProxyResult.class) {
       }else {
          user = LiveLiteEffectPresenter.c9(this.b).I();
       }
       return user;
    }
}

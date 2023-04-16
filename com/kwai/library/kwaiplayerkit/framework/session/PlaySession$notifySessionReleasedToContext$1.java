package com.kwai.library.kwaiplayerkit.framework.session.PlaySession$notifySessionReleasedToContext$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import wx6.c;
import px6.b;
import java.lang.Object;
import vx6.c;
import qrd.l1;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class PlaySession$notifySessionReleasedToContext$1 extends Lambda implements l	// class@00087b
{
    public final b $context;
    public final c $sessionKey;
    public final b $triggerContext;

    public void PlaySession$notifySessionReleasedToContext$1(c p0,b p1,b p2){
       this.$sessionKey = p0;
       this.$context = p1;
       this.$triggerContext = p2;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(c p0){
       a.p(p0, "$receiver");
       p0.c(this.$sessionKey, a.g(this.$context, this.$triggerContext));
    }
}

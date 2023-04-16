package com.kuaishou.live.bridge.rn.b;
import javax.inject.Provider;
import java.lang.Object;
import com.kuaishou.live.viewmanager.aliastext.LiveRnAliasTextViewManager;

public final class b implements Provider	// class@000e33
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       return new LiveRnAliasTextViewManager();
    }
}

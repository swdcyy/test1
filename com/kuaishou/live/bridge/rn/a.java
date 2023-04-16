package com.kuaishou.live.bridge.rn.a;
import javax.inject.Provider;
import java.lang.Object;
import com.kuaishou.live.viewmanager.richtext.LiveRnRichTextViewManager;

public final class a implements Provider	// class@000e32
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       return new LiveRnRichTextViewManager();
    }
}

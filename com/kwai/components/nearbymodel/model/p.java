package com.kwai.components.nearbymodel.model.p;
import com.kuaishou.android.model.feed.PhotoType$a;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.components.nearbymodel.model.LocalFuncTemplateFeed;

public final class p implements PhotoType$a	// class@000cd2
{
    public static final p a;

    static {
       p.a = new p();
    }
    public void p(){
       super();
    }
    public final BaseFeed a(){
       return new LocalFuncTemplateFeed();
    }
}

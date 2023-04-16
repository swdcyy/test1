package com.kuaishou.live.core.show.redpacket.richcard.core.LiveRichCardStateManager$c;
import pp.c;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveRichCardStateManager$c implements c	// class@000f6b
{
    public static final LiveRichCardStateManager$c b;

    static {
       LiveRichCardStateManager$c.b = new LiveRichCardStateManager$c();
    }
    public void LiveRichCardStateManager$c(){
       super();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public final String getName(){
       return "LiveRichCard";
    }
}

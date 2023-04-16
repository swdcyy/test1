package com.kuaishou.live.common.core.component.livestage.LiveStageInit$a;
import pp.c;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LiveStageInit$a implements c	// class@00149d
{
    public static final LiveStageInit$a b;

    static {
       LiveStageInit$a.b = new LiveStageInit$a();
    }
    public void LiveStageInit$a(){
       super();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public final String getName(){
       return "LiveStage";
    }
}

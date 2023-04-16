package iy1.c;
import ok.x;
import iy1.l;
import java.lang.Object;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import com.kuaishou.android.live.log.b;

public final class c implements x	// class@0029c0
{
    public final l b;

    public void c(l p0){
       this.b = p0;
    }
    public final Object get(){
       c tb = this.b;
       Integer integer = Integer.valueOf(tb.getPriority());
       b.d0(LiveLogTag.LIVE_ENHANCE_MESSAGE, "getMessagePriority", "biz", tb, "priority", integer);
       return integer;
    }
}

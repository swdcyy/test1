package com.kuaishou.live.common.core.component.comments.display.c$a;
import java.util.Comparator;
import com.kuaishou.live.common.core.component.comments.display.c;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;

public class c$a implements Comparator	// class@00106f
{
    public final c b;

    public void c$a(c p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c$a.class, "1");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): Long.compare(p0.getSortRank(), p1.getSortRank());
       return i;
    }
}

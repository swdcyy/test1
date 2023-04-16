package com.kuaishou.live.common.core.component.pendant.pendantgroup.e;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;
import java.lang.Enum;

public final class e implements Comparator	// class@00171a
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p0.ordinal() - p1.ordinal());
    }
}

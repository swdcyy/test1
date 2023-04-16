package com.kuaishou.live.core.show.wealthgrade.privilegedetail.g;
import java.util.Comparator;
import java.lang.Object;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradePrivilegeItemInfo;

public final class g implements Comparator	// class@001270
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p0.mUnlockGrade - p1.mUnlockGrade);
    }
}

package com.kuaishou.live.core.show.wealthgrade.privilegedetail.f;
import java.util.Comparator;
import java.lang.Object;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradePrivilegeItemInfo;

public final class f implements Comparator	// class@00126f
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return (p0.mUnlockGrade - p1.mUnlockGrade);
    }
}

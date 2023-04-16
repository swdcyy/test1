package com.yxcorp.gifshow.record.album.u1;
import java.util.Comparator;
import java.lang.Object;
import android.util.Pair;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import java.lang.Long;

public final class u1 implements Comparator	// class@001756
{
    public static final u1 b;

    static {
       u1.b = new u1();
    }
    public void u1(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Long.compare(DraftUtils.C(p1.first), DraftUtils.C(p0.first));
    }
}

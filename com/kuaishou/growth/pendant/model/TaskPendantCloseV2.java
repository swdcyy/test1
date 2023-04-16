package com.kuaishou.growth.pendant.model.TaskPendantCloseV2;
import java.io.Serializable;
import com.kuaishou.growth.pendant.model.TaskPendantCloseV2$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class TaskPendantCloseV2 implements Serializable	// class@00068f
{
    public String mBizId;
    public int mCloseCount;
    public static final TaskPendantCloseV2$a Companion;
    public static final long serialVersionUID;

    static {
       TaskPendantCloseV2.Companion = new TaskPendantCloseV2$a(null);
    }
    public void TaskPendantCloseV2(String p0,int p1){
       a.p(p0, "mBizId");
       super();
       this.mBizId = p0;
       this.mCloseCount = p1;
    }
    public final String getMBizId(){
       return this.mBizId;
    }
    public final int getMCloseCount(){
       return this.mCloseCount;
    }
    public final void setMBizId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TaskPendantCloseV2.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mBizId = p0;
       return;
    }
    public final void setMCloseCount(int p0){
       this.mCloseCount = p0;
    }
}

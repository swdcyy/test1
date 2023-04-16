package com.kuaishou.growth.taskcenter.model.TaskPendantCommonParams;
import java.io.Serializable;
import com.kuaishou.growth.taskcenter.model.TaskPendantCommonParams$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import rkd.b;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import usd.q;

public final class TaskPendantCommonParams implements Serializable	// class@00074c
{
    public int mPendantX;
    public int mPendantY;
    public float mPendantYRatio;
    public static final TaskPendantCommonParams$a Companion;
    public static final long serialVersionUID;

    static {
       TaskPendantCommonParams.Companion = new TaskPendantCommonParams$a(null);
       TaskPendantCommonParams.serialVersionUID = 0xd9175347111995e1;
    }
    public void TaskPendantCommonParams(){
       super();
       this.mPendantX = Integer.MIN_VALUE;
       this.mPendantY = Integer.MIN_VALUE;
       this.mPendantYRatio = 0xbf800000;
    }
    public static final long getSerialVersionUID(){
       return TaskPendantCommonParams.serialVersionUID;
    }
    public final int getMPendantX(){
       return this.mPendantX;
    }
    public final int getMPendantY(){
       return this.mPendantY;
    }
    public final float getMPendantYRatio(){
       return this.mPendantYRatio;
    }
    public final void setMPendantX(int p0){
       this.mPendantX = p0;
    }
    public final void setMPendantY(int p0){
       if (PatchProxy.isSupport(TaskPendantCommonParams.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TaskPendantCommonParams.class, "1")) {
          return;
       }
       this.mPendantY = p0;
       if (PatchProxy.isSupport(TaskPendantCommonParams.class) && (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, TaskPendantCommonParams.class, "2") && (b.g() && (this.mPendantYRatio - (float)0 <= 0 && p0 != Integer.MIN_VALUE)))) {
          this.mPendantYRatio = (float)p0 / (float)q.n(n.z(a.B), n.v(a.B));
       }
    label_0057 :
       return;
    }
    public final void setMPendantYRatio(float p0){
       this.mPendantYRatio = p0;
    }
    public final void updatePendantYRatio(){
       if (PatchProxy.applyVoid(null, this, TaskPendantCommonParams.class, "3")) {
          return;
       }
       this.mPendantYRatio = (float)this.mPendantY / (float)n.v(a.B);
       return;
    }
}

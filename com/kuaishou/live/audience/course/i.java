package com.kuaishou.live.audience.course.i;
import erd.g;
import android.content.Context;
import s31.y;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.CheckCourseOrderResponse;
import com.kuaishou.live.audience.course.l;
import java.lang.String;
import java.lang.Runnable;
import e93.f;

public final class i implements g	// class@000c05
{
    public final Context b;
    public final y c;

    public void i(Context p0,y p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       i tb = this.b;
       i tc = this.c;
       if (p0.mNeedUpdatePhone != null) {
          f.j("showLocalBindPhoneDialog", new l(tb, tc), 100);
       }
       return;
    }
}

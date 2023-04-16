package com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.plc.mix.PLCLogHelper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j0;
import h4a.f;
import erd.g;

public class PLCLogHelper$b implements Runnable	// class@001683
{
    public final PLCLogHelper b;

    public void PLCLogHelper$b(PLCLogHelper p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, PLCLogHelper$b.class, "1")) {
          return;
       }
       PlcEntryStyleInfo plcEntryStyl = this.b.i();
       PLCLogHelper$b tb = this.b;
       tb.s.j(402, tb.a.mEntity, plcEntryStyl).d(new f(plcEntryStyl)).a();
       return;
    }
}

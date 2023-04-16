package com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.plc.presenter.PlcEntryLoggerImplPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import mxb.j0;
import o4a.x;
import erd.g;

public class PlcEntryLoggerImplPresenter$b implements Runnable	// class@001695
{
    public final PlcEntryLoggerImplPresenter b;

    public void PlcEntryLoggerImplPresenter$b(PlcEntryLoggerImplPresenter p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, PlcEntryLoggerImplPresenter$b.class, "1")) {
          return;
       }
       PlcEntryStyleInfo plcEntryStyl = this.b.S8();
       PlcEntryLoggerImplPresenter$b tb = this.b;
       tb.D.j(402, tb.p.mEntity, plcEntryStyl).d(new x(plcEntryStyl)).a();
       return;
    }
}

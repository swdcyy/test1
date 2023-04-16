package by4.a;
import erd.g;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import crd.a;
import java.lang.Object;
import com.kwai.feature.component.photofeatures.startup.response.PlcEntryStyleInfoResponse;
import java.lang.System;
import f4a.v;
import crd.b;
import lnc.b9;

public final class a implements g	// class@0003ea
{
    public final PlcEntryStyleInfo b;
    public final String c;
    public final QPhoto d;
    public final a e;

    public void a(PlcEntryStyleInfo p0,String p1,QPhoto p2,a p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       a te = this.e;
       PlcEntryStyleInfoResponse mPlcEntrySty = p0.mPlcEntryStyleInfo;
       if (mPlcEntrySty != null) {
          PlcEntryStyleInfoResponse mPlcResponse = p0.mPlcResponseTime;
          mPlcEntrySty.mCachedTime = (mPlcResponse - 1 < 0)? System.currentTimeMillis(): mPlcResponse;
          v.b().f(tb, mPlcEntrySty);
          v.b().g(tc, mPlcEntrySty);
       }
       td.setPlcEntryStyleInfo(mPlcEntrySty);
       b9.a(te);
       return;
    }
}

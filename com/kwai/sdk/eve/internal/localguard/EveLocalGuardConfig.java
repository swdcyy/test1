package com.kwai.sdk.eve.internal.localguard.EveLocalGuardConfig;
import java.lang.Object;
import java.util.ArrayList;
import com.kwai.sdk.eve.internal.localguard.EveLocalGuardConfig$maxLimitPeriodSecs$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.List;

public final class EveLocalGuardConfig	// class@001574
{
    public final p a;
    public final boolean clearRecordsWhenDisable;
    public final List deleteList;
    public final List disableList;
    public final boolean enable;
    public final List errorRatioLimits;
    public final List fuseTaskIdWhiteList;
    public final int recordsCount;
    public final List startNotFinishCountLimits;
    public final List succRatioLimits;
    public final List totalCostLimits;
    public final List whiteList;

    public void EveLocalGuardConfig(){
       super();
       this.deleteList = new ArrayList();
       this.disableList = new ArrayList();
       this.whiteList = new ArrayList();
       this.fuseTaskIdWhiteList = new ArrayList();
       this.succRatioLimits = new ArrayList();
       this.errorRatioLimits = new ArrayList();
       this.startNotFinishCountLimits = new ArrayList();
       this.totalCostLimits = new ArrayList();
       this.a = s.c(new EveLocalGuardConfig$maxLimitPeriodSecs$2(this));
    }
    public final List a(){
       return this.deleteList;
    }
    public final boolean b(){
       return this.enable;
    }
    public final List c(){
       return this.fuseTaskIdWhiteList;
    }
    public final int d(){
       return this.recordsCount;
    }
    public final List e(){
       return this.whiteList;
    }
}

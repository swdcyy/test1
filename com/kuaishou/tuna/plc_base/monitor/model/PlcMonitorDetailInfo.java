package com.kuaishou.tuna.plc_base.monitor.model.PlcMonitorDetailInfo;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.tuna.plc_base.monitor.model.PlcMonitorDetailInfo$a;

public class PlcMonitorDetailInfo implements Serializable	// class@00107c
{
    public String mExtra;
    public String mParamsJson;
    public int mProcessState;
    public int mSlideStyle;
    public int mStrongType;
    public int mWeakType;
    public static final long serialVersionUID = 0xb8717a77d0d550d8;

    public void PlcMonitorDetailInfo(){
       super();
       this.mProcessState = 0;
    }
    public void PlcMonitorDetailInfo(PlcMonitorDetailInfo$a p0){
       super();
    }
}

package com.kuaishou.android.model.actionreport.PhotoActionReportParams;
import java.io.Serializable;
import java.lang.Object;

public class PhotoActionReportParams implements Serializable	// class@00084c
{
    public long mActionRelativeTime;
    public int mPlayCnt;
    public static final long serialVersionUID = 0xb1f291d91644f004;

    public void PhotoActionReportParams(){
       super();
    }
    public void PhotoActionReportParams(int p0,long p1){
       super();
       this.mPlayCnt = p0;
       this.mActionRelativeTime = p1;
    }
}

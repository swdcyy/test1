package com.kwai.performance.stability.crash.monitor.message.DiskInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import vg7.h;
import java.lang.StringBuilder;

public class DiskInfo implements Serializable	// class@000e36
{
    public float mDataAvailableGB;
    public float mDataTotalGB;
    public float mExternalStorageAvailableGB;
    public float mExternalStorageTotalGB;
    public static final long serialVersionUID = 0xfdda4dd7d6b37e36;

    public void DiskInfo(){
       super();
    }
    public String toString(){
       return (new h().a()+"\t总存储空间: "+this.mDataTotalGB+" \(GB\)\n"+"\t可用存储空间: "+this.mDataAvailableGB+" \(GB\)\n"+"\t总SD卡空间: "+this.mExternalStorageTotalGB+" \(GB\)\n"+"\t可用SD卡空间: "+this.mExternalStorageAvailableGB+" \(GB\)\n").substring(0);
    }
}

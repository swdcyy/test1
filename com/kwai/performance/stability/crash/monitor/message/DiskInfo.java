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
       return (new h().a()+"\t�ܴ洢�ռ�: "+this.mDataTotalGB+" \(GB\)\n"+"\t���ô洢�ռ�: "+this.mDataAvailableGB+" \(GB\)\n"+"\t��SD���ռ�: "+this.mExternalStorageTotalGB+" \(GB\)\n"+"\t����SD���ռ�: "+this.mExternalStorageAvailableGB+" \(GB\)\n").substring(0);
    }
}

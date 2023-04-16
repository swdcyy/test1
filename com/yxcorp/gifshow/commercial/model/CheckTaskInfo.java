package com.yxcorp.gifshow.commercial.model.CheckTaskInfo;
import java.io.Serializable;
import java.lang.Object;

public class CheckTaskInfo implements Serializable	// class@001142
{
    public int interval;
    public String localApkFile;
    public long localApkFileLastModified;
    public long localApkFileLength;
    public String localApkFileMd5;
    public String targetIp;
    public String taskId;
    public int type;
    public List uploadEndpoints;
    public String uploadToken;
    public String url;
    public static final long serialVersionUID = 0x55f8fd6c37fd369c;

    public void CheckTaskInfo(){
       super();
    }
}

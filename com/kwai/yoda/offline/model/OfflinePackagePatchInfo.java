package com.kwai.yoda.offline.model.OfflinePackagePatchInfo;
import java.lang.Object;

public final class OfflinePackagePatchInfo	// class@0012ca
{
    public String md5;
    public String patchPackageUrl;
    public long size;
    public int sourceVersion;

    public void OfflinePackagePatchInfo(){
       super();
       this.sourceVersion = -1;
       this.patchPackageUrl = "";
       this.md5 = "";
       this.size = -1;
    }
}

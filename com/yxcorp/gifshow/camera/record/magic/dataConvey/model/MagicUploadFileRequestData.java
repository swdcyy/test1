package com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicUploadFileRequestData;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import nsd.u;

public final class MagicUploadFileRequestData implements Serializable	// class@000e30
{
    public final String path;
    public final boolean saveToCDN;
    public final int uploadType;

    public void MagicUploadFileRequestData(String p0,boolean p1,int p2){
       super();
       this.path = p0;
       this.saveToCDN = p1;
       this.uploadType = p2;
    }
    public void MagicUploadFileRequestData(String p0,boolean p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = false;
       }
       super(p0, p1, p2);
       return;
    }
    public final String getPath(){
       return this.path;
    }
    public final boolean getSaveToCDN(){
       return this.saveToCDN;
    }
    public final int getUploadType(){
       return this.uploadType;
    }
}

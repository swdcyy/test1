package com.ks.ksuploader.KSUploader$NicInfo;
import java.lang.Object;
import java.lang.String;

public class KSUploader$NicInfo	// class@000760
{
    public String ip;
    public boolean isCellular;
    public int socketFd;

    public void KSUploader$NicInfo(){
       super();
       this.ip = "::";
       this.isCellular = false;
       this.socketFd = -1;
    }
    public void KSUploader$NicInfo(String p0,boolean p1,int p2){
       super();
       this.ip = "::";
       this.isCellular = false;
       this.socketFd = -1;
       this.ip = p0;
       this.isCellular = p1;
       this.socketFd = p2;
    }
}

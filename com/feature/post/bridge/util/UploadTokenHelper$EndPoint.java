package com.feature.post.bridge.util.UploadTokenHelper$EndPoint;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class UploadTokenHelper$EndPoint implements Serializable	// class@0014c6
{
    public String mHost;
    public short mPort;
    public String mProtocol;

    public void UploadTokenHelper$EndPoint(){
       super();
    }
    public final String getMHost(){
       return this.mHost;
    }
    public final short getMPort(){
       return this.mPort;
    }
    public final String getMProtocol(){
       return this.mProtocol;
    }
    public final void setMHost(String p0){
       this.mHost = p0;
    }
    public final void setMPort(short p0){
       this.mPort = p0;
    }
    public final void setMProtocol(String p0){
       this.mProtocol = p0;
    }
}

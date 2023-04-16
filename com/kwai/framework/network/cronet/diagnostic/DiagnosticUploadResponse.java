package com.kwai.framework.network.cronet.diagnostic.DiagnosticUploadResponse;
import java.io.Serializable;
import java.lang.Object;

public class DiagnosticUploadResponse implements Serializable	// class@0017a6
{
    public DiagnosticUploadResponse$DiagnosticConfigModel data;
    public String message;
    public int status;

    public void DiagnosticUploadResponse(){
       super();
       this.status = -1;
    }
}

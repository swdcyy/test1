package com.ks.ksuploader.KSUploaderEventListener;
import com.ks.ksuploader.KSUploaderCloseReason;
import java.lang.String;

public interface abstract KSUploaderEventListener	// class@000766
{

    void onComplete(KSUploaderCloseReason p0,long p1,String p2,String p3,String p4,long p5,String p6);
    void onProgress(double p0,int p1);
}

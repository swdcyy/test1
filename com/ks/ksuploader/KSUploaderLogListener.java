package com.ks.ksuploader.KSUploaderLogListener;
import com.ks.ksuploader.KSUploaderLogLevel;
import java.lang.String;

public interface abstract KSUploaderLogListener	// class@000768
{

    void onLog(KSUploaderLogLevel p0,String p1,long p2);
}

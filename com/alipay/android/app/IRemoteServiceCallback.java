package com.alipay.android.app.IRemoteServiceCallback;
import android.os.IInterface;
import java.lang.String;
import java.util.Map;
import android.os.Bundle;

public interface abstract IRemoteServiceCallback implements IInterface	// class@000e34
{

    int getVersion();
    boolean isHideLoadingScreen();
    void payEnd(boolean p0,String p1);
    void r03(String p0,String p1,Map p2);
    void startActivity(String p0,String p1,int p2,Bundle p3);
}

package com.alipay.android.app.IAlixPay;
import android.os.IInterface;
import java.lang.String;
import java.util.Map;
import com.alipay.android.app.IRemoteServiceCallback;

public interface abstract IAlixPay implements IInterface	// class@000e31
{

    String Pay(String p0);
    void deployFastConnect();
    int getVersion();
    boolean manager(String p0);
    String pay02(String p0,Map p1);
    String prePay(String p0);
    void r03(String p0,String p1,Map p2);
    void registerCallback(IRemoteServiceCallback p0);
    void registerCallback03(IRemoteServiceCallback p0,String p1,Map p2);
    String test();
    void unregisterCallback(IRemoteServiceCallback p0);
}

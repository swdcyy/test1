package com.yxcorp.gifshow.OnlineSystraceManager;
import com.yxcorp.gifshow.OnlineSystraceManager$KeepPushPerformanceModel;
import java.lang.String;
import android.content.Context;
import java.lang.Boolean;
import com.yxcorp.gifshow.OnlineSystraceManager$OnlineSystraceConfigModel;

public interface abstract OnlineSystraceManager	// class@001302
{

    OnlineSystraceManager$KeepPushPerformanceModel a();
    String b();
    void c();
    void d(String p0);
    Boolean e(Context p0,long p1);
    void f();
    void g();
    String getConfig();
    Boolean h(long p0);
    void i(OnlineSystraceManager$KeepPushPerformanceModel p0);
    Boolean init();
    void j(String p0,String p1,int p2,String p3);
    Boolean k(Context p0,Boolean p1,Boolean p2);
    void l(OnlineSystraceManager$OnlineSystraceConfigModel p0);
    Boolean m();
    OnlineSystraceManager$OnlineSystraceConfigModel n();
}

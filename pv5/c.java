package pv5.c;
import tkd.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import ov5.e;
import com.kwai.feature.api.social.login.model.LoginParams;
import android.content.Context;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import ou5.a;
import android.content.ComponentName;
import java.util.List;
import com.kwai.feature.api.social.login.model.SwitchAccountModel;
import brd.t;
import android.app.Activity;
import erd.g;
import ov5.a;

public interface abstract c implements b	// class@002201
{

    void HF();
    void He(GifshowActivity p0,String p1);
    void Js(GifshowActivity p0);
    void P30(GifshowActivity p0,e p1,String p2,LoginParams p3,String p4);
    boolean Uu(Context p0);
    long Vs();
    void WU(GifshowActivity p0,int p1,String p2,e p3);
    void XA(RequestTiming p0);
    void f10(GifshowActivity p0,String p1,String p2,String p3);
    void fp(GifshowActivity p0,String p1,String p2,String p3,a p4);
    ComponentName getCountryCodeActivityName();
    List k6();
    t mi(SwitchAccountModel p0,int p1);
    void uA(Activity p0,g p1);
    void wX(a p0);
    void xI(a p0);
}

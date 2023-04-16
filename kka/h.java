package kka.h;
import java.lang.String;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import brd.t;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import android.content.Context;
import java.util.List;
import java.util.Map;

public interface abstract h	// class@001c12
{

    boolean a();
    String b();
    String c();
    boolean d(GifshowActivity p0,BaseFeed p1,boolean p2,String p3,String p4);
    void e(long p0,RequestTiming p1);
    boolean f(QPhoto p0,Activity p1);
    t g(RequestTiming p0);
    boolean h(boolean p0,Activity p1,BaseFeed p2);
    boolean i(ClientContent$PhotoPackage p0,Activity p1);
    void j(RequestTiming p0);
    void k(RequestTiming p0);
    boolean l();
    String m();
    boolean n(BaseFeed p0);
    String o();
    String p();
    List q(Context p0);
    t r(Map p0,RequestTiming p1);
    int s();
}

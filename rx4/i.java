package rx4.i;
import tkd.a;
import sx4.f;
import android.content.Context;
import java.lang.String;
import android.view.ViewGroup;
import brd.a0;
import java.lang.Throwable;
import tx4.w;
import sx4.d;
import java.util.List;
import tx4.f;
import android.graphics.drawable.BitmapDrawable;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;
import tkd.b;
import android.app.Activity;
import rx4.a;
import android.widget.TextView;

public interface abstract i implements a, f	// class@0030f9
{

    a0 Ca(Context p0,boolean p1,String p2,ViewGroup p3);
    long Hq();
    void Jj(Throwable p0,w p1,String p2);
    boolean LE(String p0,String p1);
    d O5(Context p0,boolean p1,String p2,ViewGroup p3);
    void Oz(List p0,boolean p1,f p2);
    void aB(Throwable p0,int p1);
    int aS();
    BitmapDrawable b40(String p0);
    JSONObject cy(String p0,String p1);
    long d5();
    void ef(String p0,HashMap p1,String[] p2);
    boolean ei();
    void iD(boolean p0);
    boolean ih();
    boolean isPluginMode();
    String j50();
    long k3();
    boolean k4();
    String nr();
    void pf(String p0,HashMap p1,String[] p2);
    Map q6();
    void sJ(String p0,Throwable p1,HashMap p2,String[] p3);
    void setImpl(b p0);
    void vZ(String p0,HashMap p1,String[] p2);
    int vs(String p0,String p1,String p2);
    void wZ(String p0,int p1,boolean p2,f p3);
    a x40(Activity p0,ViewGroup p1,String p2,String p3);
    long yO();
    void yw(TextView p0,String p1,String p2,String p3,String p4);
}

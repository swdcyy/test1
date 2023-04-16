package wx4.a;
import wx4.a$a;
import wx4.a$b;
import android.view.View;

public interface abstract a	// class@0036df
{
    public static final a$a S0;

    static {
       a.S0 = a$a.a;
    }
    void a(a$b p0);
    void b(a$b p0);
    View getView();
    void setAspectRatio(int p0);
    void setVideoRotation(int p0);
    void setVideoSampleAspectRatio(int p0,int p1);
    void setVideoSize(int p0,int p1);
    boolean shouldWaitForResize();
}

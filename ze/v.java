package ze.v;
import com.facebook.react.bridge.ReactContext;
import android.os.Bundle;
import java.lang.String;
import android.view.ViewGroup;

public interface abstract v	// class@00321c
{

    void a(ReactContext p0);
    void b(int p0);
    void c();
    Bundle getAppProperties();
    int getAttachType();
    int getHeightMeasureSpec();
    String getInitialUITemplate();
    String getJSModuleName();
    ViewGroup getRootViewGroup();
    int getRootViewTag();
    String getSurfaceID();
    int getUIManagerType();
    int getWidthMeasureSpec();
    void setAttachType(int p0);
    void setRootViewTag(int p0);
    void setShouldLogContentAppeared(boolean p0);
}

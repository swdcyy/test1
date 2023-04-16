package jf.s;
import android.view.View;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;

public interface abstract s	// class@00240b
{

    void setAnimated(View p0,boolean p1);
    void setAnimationType(View p0,String p1);
    void setHardwareAccelerated(View p0,boolean p1);
    void setIdentifier(View p0,int p1);
    void setPresentationStyle(View p0,String p1);
    void setStatusBarTranslucent(View p0,boolean p1);
    void setSupportedOrientations(View p0,ReadableArray p1);
    void setTransparent(View p0,boolean p1);
}

package jf.y;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Integer;
import java.lang.String;

public interface abstract y	// class@002411
{

    void setDisabled(View p0,boolean p1);
    void setEnabled(View p0,boolean p1);
    void setMaximumTrackImage(View p0,ReadableMap p1);
    void setMaximumTrackTintColor(View p0,Integer p1);
    void setMaximumValue(View p0,double p1);
    void setMinimumTrackImage(View p0,ReadableMap p1);
    void setMinimumTrackTintColor(View p0,Integer p1);
    void setMinimumValue(View p0,double p1);
    void setStep(View p0,double p1);
    void setTestID(View p0,String p1);
    void setThumbImage(View p0,ReadableMap p1);
    void setThumbTintColor(View p0,Integer p1);
    void setTrackImage(View p0,ReadableMap p1);
    void setValue(View p0,double p1);
}

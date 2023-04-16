package ze.b;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;

public interface abstract b	// class@0031ed
{

    void setAccessibilityActions(View p0,ReadableArray p1);
    void setAccessibilityHint(View p0,String p1);
    void setAccessibilityLabel(View p0,String p1);
    void setAccessibilityLiveRegion(View p0,String p1);
    void setAccessibilityRole(View p0,String p1);
    void setBackgroundColor(View p0,int p1);
    void setBorderBottomLeftRadius(View p0,float p1);
    void setBorderBottomRightRadius(View p0,float p1);
    void setBorderRadius(View p0,float p1);
    void setBorderTopLeftRadius(View p0,float p1);
    void setBorderTopRightRadius(View p0,float p1);
    void setElevation(View p0,float p1);
    void setImportantForAccessibility(View p0,String p1);
    void setNativeId(View p0,String p1);
    void setOpacity(View p0,float p1);
    void setRenderToHardwareTexture(View p0,boolean p1);
    void setRotation(View p0,float p1);
    void setScaleX(View p0,float p1);
    void setScaleY(View p0,float p1);
    void setTestId(View p0,String p1);
    void setTransform(View p0,ReadableArray p1);
    void setTranslateX(View p0,float p1);
    void setTranslateY(View p0,float p1);
    void setViewState(View p0,ReadableMap p1);
    void setZIndex(View p0,float p1);
}

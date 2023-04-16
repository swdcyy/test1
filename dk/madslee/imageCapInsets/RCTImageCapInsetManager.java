package dk.madslee.imageCapInsets.RCTImageCapInsetManager;
import com.facebook.react.uimanager.SimpleViewManager;
import ze.n0;
import android.view.View;
import dk.madslee.imageCapInsets.RCTImageCapInsetView;
import android.content.Context;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import android.graphics.Rect;

public class RCTImageCapInsetManager extends SimpleViewManager	// class@000ccd
{

    public void RCTImageCapInsetManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public RCTImageCapInsetView createViewInstance(n0 p0){
       return new RCTImageCapInsetView(p0);
    }
    public String getName(){
       return "RCTImageCapInset";
    }
    public void setCapInsets(RCTImageCapInsetView p0,ReadableMap p1){
       String str = "top";
       int i = 0;
       int intx = (p1.hasKey(str))? p1.getInt(str): 0;
       String str1 = "left";
       int intx1 = (p1.hasKey(str1))? p1.getInt(str1): 0;
       String str2 = "right";
       int intx2 = (p1.hasKey(str2))? p1.getInt(str2): 0;
       if (p1.hasKey("bottom")) {
          i = p1.getInt("bottom");
       }
       p0.setCapInsets(new Rect(intx1, intx, intx2, i));
       return;
    }
    public void setSource(RCTImageCapInsetView p0,ReadableMap p1){
       p0.setSource(p1.getString("uri"));
    }
}

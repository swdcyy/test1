package com.swmansion.rnscreens.ScreenStackHeaderSubviewManager;
import com.facebook.react.views.view.ReactViewManager;
import ze.n0;
import android.view.View;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.rnscreens.ScreenStackHeaderSubview;
import com.facebook.react.bridge.ReactContext;
import java.lang.String;
import java.lang.Object;
import com.swmansion.rnscreens.ScreenStackHeaderSubview$Type;

public class ScreenStackHeaderSubviewManager extends ReactViewManager	// class@000cb8
{

    public void ScreenStackHeaderSubviewManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReactViewGroup createViewInstance(n0 p0){
       return new ScreenStackHeaderSubview(p0);
    }
    public String getName(){
       return "RNSScreenStackHeaderSubview";
    }
    public void setType(ScreenStackHeaderSubview p0,String p1){
       if (("left").equals(p1)) {
          p0.setType(ScreenStackHeaderSubview$Type.LEFT);
       }else if(("center").equals(p1)){
          p0.setType(ScreenStackHeaderSubview$Type.CENTER);
       }else if(("right").equals(p1)){
          p0.setType(ScreenStackHeaderSubview$Type.RIGHT);
       }else if(("back").equals(p1)){
          p0.setType(ScreenStackHeaderSubview$Type.BACK);
       }
       return;
    }
}

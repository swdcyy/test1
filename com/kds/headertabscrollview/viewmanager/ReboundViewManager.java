package com.kds.headertabscrollview.viewmanager.ReboundViewManager;
import com.facebook.react.uimanager.SimpleViewManager;
import ze.n0;
import android.view.View;
import com.kds.headertabscrollview.layout.ReboundView;
import android.content.Context;
import java.lang.String;

public class ReboundViewManager extends SimpleViewManager	// class@000738
{

    public void ReboundViewManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public ReboundView createViewInstance(n0 p0){
       return new ReboundView(p0);
    }
    public String getName(){
       return "ReboundView";
    }
}

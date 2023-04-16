package com.kds.headertabscrollview.viewmanager.LinearLayoutViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import ze.n0;
import android.view.View;
import com.kds.headertabscrollview.layout.SimpleLinearLayout;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;

public final class LinearLayoutViewManager extends ViewGroupManager	// class@000735
{

    public void LinearLayoutViewManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public SimpleLinearLayout createViewInstance(n0 p0){
       a.q(p0, "reactContext");
       return new SimpleLinearLayout(p0);
    }
    public String getName(){
       return "LinearLayout";
    }
}

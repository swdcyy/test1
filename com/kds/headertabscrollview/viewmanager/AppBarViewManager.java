package com.kds.headertabscrollview.viewmanager.AppBarViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import com.kds.headertabscrollview.viewmanager.AppBarViewManager$a;
import nsd.u;
import ze.n0;
import android.view.View;
import com.kds.headertabscrollview.layout.AppBarView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.content.Context;

public final class AppBarViewManager extends ViewGroupManager	// class@000733
{
    public static final AppBarViewManager$a Companion;

    static {
       AppBarViewManager.Companion = new AppBarViewManager$a(null);
    }
    public void AppBarViewManager(){
       super();
    }
    public View createViewInstance(n0 p0){
       return this.createViewInstance(p0);
    }
    public AppBarView createViewInstance(n0 p0){
       a.q(p0, "reactContext");
       return new AppBarView(p0);
    }
    public String getName(){
       return "AppBarLayout";
    }
    public final void setHeaderScrollFlag(AppBarView p0,int p1){
       a.q(p0, "view");
       p0.setHeaderScrollFlag(p1);
    }
}

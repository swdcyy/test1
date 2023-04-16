package com.kds.headertabscrollview.nativemodule.CoordinatorModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.kds.headertabscrollview.nativemodule.CoordinatorModule$a;
import nsd.u;
import com.facebook.react.bridge.ReadableMap;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import com.kds.headertabscrollview.animation.CoordinatorAnimation;
import java.util.Objects;
import ff.c;
import in.a;
import com.facebook.react.bridge.Callback;

public final class CoordinatorModule extends ReactContextBaseJavaModule	// class@000731
{
    public static final CoordinatorModule$a Companion;

    static {
       CoordinatorModule.Companion = new CoordinatorModule$a(null);
    }
    public void CoordinatorModule(){
       super();
    }
    public final void configureNext(ReadableMap p0){
       StringBuilder str = "configureNext: config="+p0;
       CoordinatorAnimation d = CoordinatorAnimation.d;
       Objects.requireNonNull(d);
       if (!CoordinatorAnimation.b) {
       }else {
          d.b().d(p0, a.a);
       }
       return;
    }
    public String getName(){
       return "CoordinatorModule";
    }
    public final void setLayoutAnimationEnabled(boolean p0){
       Objects.requireNonNull(CoordinatorAnimation.d);
       CoordinatorAnimation.b = p0;
    }
}

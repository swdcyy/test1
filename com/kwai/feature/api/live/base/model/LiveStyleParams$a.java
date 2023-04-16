package com.kwai.feature.api.live.base.model.LiveStyleParams$a;
import java.lang.Object;
import com.kwai.feature.api.live.base.model.LiveStyleParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.utility.SystemUtil;
import android.os.Build$VERSION;

public class LiveStyleParams$a	// class@000f92
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    public void LiveStyleParams$a(){
       super();
       this.b = true;
    }
    public LiveStyleParams a(){
       LiveStyleParams obj = PatchProxy.apply(null, this, LiveStyleParams$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveStyleParams();
       obj.mEnableShrinkAnimation = this.a;
       obj.mShouldAdaptFullscreen = this.b;
       obj.mIsEnableExitShrink = this.c;
       obj.mEnableBizLayoutFadeInAnimation = this.d;
       obj.mIsWindowTranslucent = this.e;
       if (this.f != null && Build$VERSION.SDK_INT != 26) {
          obj.mIsSeamlessEnter = true;
          obj.mIsWindowTranslucent = true;
          obj.mEnableBizLayoutFadeInAnimation = true;
          obj.mShouldAdaptFullscreen = true;
       }
       return obj;
    }
    public LiveStyleParams$a b(boolean p0){
       this.d = p0;
       return this;
    }
    public LiveStyleParams$a c(boolean p0){
       this.c = p0;
       return this;
    }
    public LiveStyleParams$a d(boolean p0){
       this.a = p0;
       return this;
    }
    public LiveStyleParams$a e(boolean p0){
       this.f = p0;
       return this;
    }
    public LiveStyleParams$a f(boolean p0){
       this.b = p0;
       return this;
    }
}

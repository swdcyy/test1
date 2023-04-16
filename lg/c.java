package lg.c;
import lg.b;
import com.facebook.yoga.YogaNative;
import java.lang.IllegalStateException;
import java.lang.String;
import com.facebook.yoga.YogaLogger;
import com.facebook.yoga.YogaExperimentalFeature;

public abstract class c extends b	// class@002552
{
    public long b;
    public YogaLogger c;

    public void c(){
       super(YogaNative.jni_YGConfigNewJNI());
    }
    public void c(long p0){
       super();
       if (!p0) {
          throw new IllegalStateException("Failed to allocate native memory");
       }
       this.b = p0;
       return;
    }
    public void c(boolean p0){
       super(YogaNative.jni_YGConfigNewJNI());
    }
    public YogaLogger a(){
       return this.c;
    }
    public long b(){
       return this.b;
    }
    public void c(YogaExperimentalFeature p0,boolean p1){
       YogaNative.jni_YGConfigSetExperimentalFeatureEnabledJNI(this.b, p0.intValue(), p1);
    }
    public void d(YogaLogger p0){
       this.c = p0;
       YogaNative.jni_YGConfigSetLoggerJNI(this.b, p0);
    }
    public void e(float p0){
       YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.b, p0);
    }
    public void f(boolean p0){
       YogaNative.jni_YGConfigSetPrintTreeFlagJNI(this.b, p0);
    }
    public void g(boolean p0){
       YogaNative.jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviourJNI(this.b, p0);
    }
    public void h(boolean p0){
       YogaNative.jni_YGConfigSetUseLegacyStretchBehaviourJNI(this.b, p0);
    }
    public void i(boolean p0){
       YogaNative.jni_YGConfigSetUseWebDefaultsJNI(this.b, p0);
    }
}

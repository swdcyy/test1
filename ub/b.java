package ub.b;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import android.graphics.drawable.Animatable;

public interface abstract b	// class@002d84
{

    void onFailure(String p0,Throwable p1);
    void onFinalImageSet(String p0,Object p1,Animatable p2);
    void onIntermediateImageFailed(String p0,Throwable p1);
    void onIntermediateImageSet(String p0,Object p1);
    void onRelease(String p0);
    void onSubmit(String p0,Object p1);
}

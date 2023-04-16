package com.facebook.fresco.ui.common.b;
import java.lang.String;
import java.lang.Throwable;
import com.facebook.fresco.ui.common.b$a;
import java.lang.Object;

public interface abstract b	// class@0010df
{

    void onFailure(String p0,Throwable p1,b$a p2);
    void onFinalImageSet(String p0,Object p1,b$a p2);
    void onIntermediateImageFailed(String p0);
    void onIntermediateImageSet(String p0,Object p1);
    void onRelease(String p0,b$a p1);
    void onSubmit(String p0,Object p1,b$a p2);
}

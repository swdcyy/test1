package oc.b;
import oc.c;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;

public interface abstract b	// class@001fff
{

    void dispose();
    boolean doesRenderSupportScaling();
    int getDuration();
    c getFrame(int p0);
    int getFrameCount();
    int[] getFrameDurations();
    AnimatedDrawableFrameInfo getFrameInfo(int p0);
    int getHeight();
    int getLoopCount();
    int getSizeInBytes();
    int getWidth();
}

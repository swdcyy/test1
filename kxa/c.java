package kxa.c;
import kxa.f;
import kxa.i;
import kxa.c$a;
import android.view.GestureDetector$OnDoubleTapListener;
import kxa.e;
import android.view.View$OnLongClickListener;
import kxa.g;

public interface abstract c	// class@00341f
{

    void d(int p0,int p1);
    void e(float p0,boolean p1);
    void g(float p0,float p1,float p2,boolean p3);
    float getMaximumScale();
    float getMediumScale();
    float getMinimumScale();
    f getOnPhotoTapListener();
    i getOnViewTapListener();
    float getScale();
    void setAllowParentInterceptOnEdge(boolean p0);
    void setBoundsProvider(c$a p0);
    void setMaximumScale(float p0);
    void setMediumScale(float p0);
    void setMinimumScale(float p0);
    void setOnDoubleTapListener(GestureDetector$OnDoubleTapListener p0);
    void setOnImageDragListener(e p0);
    void setOnLongClickListener(View$OnLongClickListener p0);
    void setOnPhotoTapListener(f p0);
    void setOnScaleChangeListener(g p0);
    void setOnViewTapListener(i p0);
    void setOrientation(int p0);
    void setScale(float p0);
    void setZoomTransitionDuration(long p0);
}

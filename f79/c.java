package f79.c;
import f79.d;
import f79.g;
import f79.c$a;
import android.view.GestureDetector$OnDoubleTapListener;
import android.view.View$OnLongClickListener;
import f79.e;

public interface abstract c	// class@0022d7
{

    void d(int p0,int p1);
    void e(float p0,boolean p1);
    void g(float p0,float p1,float p2,boolean p3);
    float getMaximumScale();
    float getMediumScale();
    float getMinimumScale();
    d getOnPhotoTapListener();
    g getOnViewTapListener();
    float getScale();
    void setAllowParentInterceptOnEdge(boolean p0);
    void setBoundsProvider(c$a p0);
    void setMaximumScale(float p0);
    void setMediumScale(float p0);
    void setMinimumScale(float p0);
    void setOnDoubleTapListener(GestureDetector$OnDoubleTapListener p0);
    void setOnLongClickListener(View$OnLongClickListener p0);
    void setOnPhotoTapListener(d p0);
    void setOnScaleChangeListener(e p0);
    void setOnViewTapListener(g p0);
    void setOrientation(int p0);
    void setScale(float p0);
    void setZoomTransitionDuration(long p0);
}

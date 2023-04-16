package oc.c;
import android.graphics.Bitmap;

public interface abstract c	// class@002000
{

    void dispose();
    int getDurationMs();
    int getHeight();
    int getWidth();
    int getXOffset();
    int getYOffset();
    void renderFrame(int p0,int p1,Bitmap p2);
}

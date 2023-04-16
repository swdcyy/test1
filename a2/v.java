package a2.v;
import a2.x;
import android.view.View;

public interface abstract v implements x	// class@0000c2
{

    void onNestedPreScroll(View p0,int p1,int p2,int[] p3,int p4);
    void onNestedScroll(View p0,int p1,int p2,int p3,int p4,int p5);
    void onNestedScrollAccepted(View p0,View p1,int p2,int p3);
    boolean onStartNestedScroll(View p0,View p1,int p2,int p3);
    void onStopNestedScroll(View p0,int p1);
}

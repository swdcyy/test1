package a2.x;
import android.view.View;

public interface abstract x	// class@0000c4
{

    int getNestedScrollAxes();
    boolean onNestedFling(View p0,float p1,float p2,boolean p3);
    boolean onNestedPreFling(View p0,float p1,float p2);
    void onNestedPreScroll(View p0,int p1,int p2,int[] p3);
    void onNestedScroll(View p0,int p1,int p2,int p3,int p4);
    void onNestedScrollAccepted(View p0,View p1,int p2);
    boolean onStartNestedScroll(View p0,View p1,int p2);
    void onStopNestedScroll(View p0);
}

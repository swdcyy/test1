package a2.r;
import a2.t;

public interface abstract r implements t	// class@0000a4
{

    boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3,int p4);
    boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4,int p5);
    boolean hasNestedScrollingParent(int p0);
    boolean startNestedScroll(int p0,int p1);
    void stopNestedScroll(int p0);
}

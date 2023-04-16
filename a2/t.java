package a2.t;

public interface abstract t	// class@0000aa
{

    boolean dispatchNestedFling(float p0,float p1,boolean p2);
    boolean dispatchNestedPreFling(float p0,float p1);
    boolean dispatchNestedPreScroll(int p0,int p1,int[] p2,int[] p3);
    boolean dispatchNestedScroll(int p0,int p1,int p2,int p3,int[] p4);
    boolean hasNestedScrollingParent();
    boolean isNestedScrollingEnabled();
    void setNestedScrollingEnabled(boolean p0);
    boolean startNestedScroll(int p0);
    void stopNestedScroll();
}

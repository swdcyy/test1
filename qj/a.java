package qj.a;
import android.view.View;
import java.util.List;
import qj.b;

public interface abstract a	// class@0029ea
{

    View A(int p0);
    int B(int p0,int p1,int p2);
    View D(int p0);
    int F(int p0,int p1,int p2);
    void I(int p0,View p1);
    boolean M();
    void addView(View p0);
    void addView(View p0,int p1);
    int getAlignContent();
    int getAlignItems();
    int getFlexDirection();
    int getFlexItemCount();
    List getFlexLines();
    List getFlexLinesInternal();
    int getFlexWrap();
    int getJustifyContent();
    int getLargestMainSize();
    int getMaxLine();
    int getPaddingBottom();
    int getPaddingEnd();
    int getPaddingLeft();
    int getPaddingRight();
    int getPaddingStart();
    int getPaddingTop();
    int getSumOfCrossSize();
    void j(b p0);
    int l(View p0);
    void o(View p0,int p1,int p2,b p3);
    int p(View p0,int p1,int p2);
    void removeAllViews();
    void removeViewAt(int p0);
    void setAlignContent(int p0);
    void setAlignItems(int p0);
    void setFlexDirection(int p0);
    void setFlexLines(List p0);
    void setFlexWrap(int p0);
    void setJustifyContent(int p0);
    void setMaxLine(int p0);
}

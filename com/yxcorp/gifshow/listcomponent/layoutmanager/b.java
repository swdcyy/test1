package com.yxcorp.gifshow.listcomponent.layoutmanager.b;
import android.view.View;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager$f;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView;
import w0b.f;
import com.yxcorp.gifshow.listcomponent.layoutmanager.a;

public interface abstract b	// class@001a83
{

    void A0(View p0,boolean p1);
    int B0(int p0,int p1,boolean p2);
    void C0(VirtualLayoutManager$f p0,View p1,int p2);
    int c();
    RecyclerView$ViewHolder d(View p0);
    View findViewByPosition(int p0);
    View getChildAt(int p0);
    int getChildCount();
    int getContentHeight();
    int getContentWidth();
    int getDecoratedBottom(View p0);
    int getDecoratedLeft(View p0);
    int getDecoratedRight(View p0);
    int getDecoratedTop(View p0);
    int getOrientation();
    int getPaddingBottom();
    int getPaddingLeft();
    int getPaddingRight();
    int getPaddingTop();
    int getPosition(View p0);
    boolean getReverseLayout();
    RecyclerView h0();
    int i0();
    boolean j0(View p0);
    void k0(View p0);
    f l0();
    void m0(View p0,int p1);
    void measureChild(View p0,int p1,int p2);
    void measureChildWithMargins(View p0,int p1,int p2);
    void n0(View p0);
    void o0(View p0,int p1,int p2,int p3,int p4);
    f p0();
    void q0(View p0);
    void r0(View p0);
    View s0();
    a t0(int p0);
    void u0(View p0);
    boolean v0();
    void w0(View p0,int p1,int p2,int p3,int p4);
    boolean x0();
    void y0(VirtualLayoutManager$f p0,View p1);
    void z0(View p0,boolean p1);
}

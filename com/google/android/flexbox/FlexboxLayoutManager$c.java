package com.google.android.flexbox.FlexboxLayoutManager$c;
import java.lang.Object;
import com.google.android.flexbox.FlexboxLayoutManager$a;
import androidx.recyclerview.widget.RecyclerView$y;
import java.util.List;
import java.lang.String;
import java.lang.StringBuilder;

public class FlexboxLayoutManager$c	// class@001605
{
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;

    public void FlexboxLayoutManager$c(){
       super();
       this.h = 1;
       this.i = 1;
    }
    public void FlexboxLayoutManager$c(FlexboxLayoutManager$a p0){
       super();
    }
    public boolean a(RecyclerView$y p0,List p1){
       boolean b;
       FlexboxLayoutManager$c td = this.d;
       if (td >= null && td < p0.c()) {
          FlexboxLayoutManager$c tc = this.c;
          if (tc >= null && tc < p1.size()) {
             b = true;
          label_0017 :
             return b;
          }
       }
       b = false;
       goto label_0017 ;
    }
    public String toString(){
       return "LayoutState{mAvailable="+this.a+", mFlexLinePosition="+this.c+", mPosition="+this.d+", mOffset="+this.e+", mScrollingOffset="+this.f+", mLastScrollDelta="+this.g+", mItemDirection="+this.h+", mLayoutDirection="+this.i+'}';
    }
}

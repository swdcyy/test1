package com.yxcorp.gifshow.widget.MultiLineEllipsizeTextView$b;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class MultiLineEllipsizeTextView$b	// class@001885
{
    public final Comparable a;
    public final Comparable b;

    public void MultiLineEllipsizeTextView$b(Comparable p0,Comparable p1){
       super();
       this.a = p0;
       this.b = p1;
       if (p0.compareTo(p1) <= 0) {
          return;
       }
       throw new IllegalArgumentException("lower must be less than or equal to upper");
    }
}

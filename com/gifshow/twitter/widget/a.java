package com.gifshow.twitter.widget.a;
import java.util.Comparator;
import com.gifshow.twitter.widget.Extractor;
import java.lang.Object;
import com.gifshow.twitter.widget.Extractor$Entity;

public class a implements Comparator	// class@0015fa
{
    public final Extractor b;

    public void a(Extractor p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       return (p0.a - p1.a);
    }
}

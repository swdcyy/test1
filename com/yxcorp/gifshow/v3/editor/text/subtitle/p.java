package com.yxcorp.gifshow.v3.editor.text.subtitle.p;
import java.util.Comparator;
import java.lang.Object;
import com.yxcorp.gifshow.widget.adv.model.a;
import java.lang.Double;

public final class p implements Comparator	// class@0014a5
{
    public static final p b;

    static {
       p.b = new p();
    }
    public void p(){
       super();
    }
    public final int compare(Object p0,Object p1){
       return Double.compare(p0.h(), p1.h());
    }
}

package com.kwai.library.widget.specific.misc.CleanUpView$b;
import android.util.Property;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.kwai.library.widget.specific.misc.CleanUpView;
import java.lang.Integer;
import android.view.View;

public final class CleanUpView$b extends Property	// class@000a04
{

    public void CleanUpView$b(Class p0,String p1){
       super(p0, null);
    }
    public Object get(Object p0){
       return Integer.valueOf(p0.l);
    }
    public void set(Object p0,Object p1){
       p0.l = p1.intValue();
       p0.invalidate();
    }
}

package com.kwai.library.widget.refresh.ShootRefreshView$b;
import android.util.Property;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import com.kwai.library.widget.refresh.ShootRefreshView;
import java.lang.Float;
import android.view.View;

public final class ShootRefreshView$b extends Property	// class@0009d0
{

    public void ShootRefreshView$b(Class p0,String p1){
       super(p0, null);
    }
    public Object get(Object p0){
       return Float.valueOf(p0.m);
    }
    public void set(Object p0,Object p1){
       p0.m = p1.floatValue();
       p0.invalidate();
    }
}

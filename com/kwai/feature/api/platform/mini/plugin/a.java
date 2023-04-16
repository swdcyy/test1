package com.kwai.feature.api.platform.mini.plugin.a;
import msd.l;
import java.lang.Object;
import com.mini.widget.menu.MiniMenuItem;
import java.lang.String;
import java.lang.Boolean;

public final class a implements l	// class@001071
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object invoke(Object p0){
       return Boolean.valueOf(("favorite").equalsIgnoreCase(p0.d));
    }
}

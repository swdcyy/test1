package com.yxcorp.gifshow.permission.c;
import w07.l;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;

public final class c implements l	// class@000ec6
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final void apply(Object p0){
       p0 = p0.z().findViewById(R.id.content);
       if (p0 != null) {
          p0.setGravity(17);
       }
       return;
    }
}

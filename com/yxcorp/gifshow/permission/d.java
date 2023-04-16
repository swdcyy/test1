package com.yxcorp.gifshow.permission.d;
import w07.l;
import java.lang.Object;
import u07.t;
import android.view.View;
import com.kwai.library.widget.popup.common.c;
import android.widget.TextView;

public final class d implements l	// class@000ec7
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
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

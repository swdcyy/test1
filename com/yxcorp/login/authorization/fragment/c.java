package com.yxcorp.login.authorization.fragment.c;
import lnc.c3$a;
import java.lang.Object;
import android.view.Window;
import com.yxcorp.login.authorization.fragment.HalfScreenAuthLandscapeFragment;
import android.view.WindowManager$LayoutParams;

public final class c implements c3$a	// class@001a37
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final void apply(Object p0){
       WindowManager$LayoutParams attributes = p0.getAttributes();
       attributes.width = -1;
       attributes.height = -1;
       p0.setAttributes(attributes);
    }
}

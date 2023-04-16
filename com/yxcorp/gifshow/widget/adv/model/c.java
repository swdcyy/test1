package com.yxcorp.gifshow.widget.adv.model.c;
import s16.a$a;
import java.lang.Object;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;
import com.yxcorp.gifshow.widget.adv.model.f;

public final class c implements a$a	// class@00192b
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final boolean a(Object p0,Object p1){
       boolean b = true;
       if (p0 == p1) {
       }else if(p0 != null && (p1 != null && !p0.id() - p1.id())){
          b = false;
       }
       return b;
    }
}

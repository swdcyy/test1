package com.yxcorp.gifshow.widget.adv.model.d;
import s16.a$a;
import java.lang.Object;
import com.kwai.video.minecraft.model.nano.Minecraft$VisualEffectParam;
import com.yxcorp.gifshow.widget.adv.model.f;

public final class d implements a$a	// class@00192c
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
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

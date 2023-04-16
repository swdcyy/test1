package com.yxcorp.gifshow.widget.adv.model.b;
import s16.a$a;
import java.lang.Object;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.yxcorp.gifshow.widget.adv.model.f;

public final class b implements a$a	// class@00192a
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final boolean a(Object p0,Object p1){
       boolean b = true;
       if (p0 == p1) {
       }else if(p0 != null && (p1 != null && !p0.assetId() - p1.assetId())){
          b = false;
       }
       return b;
    }
}

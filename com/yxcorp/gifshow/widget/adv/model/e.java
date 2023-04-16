package com.yxcorp.gifshow.widget.adv.model.e;
import s16.a$b;
import java.lang.Object;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import com.yxcorp.gifshow.widget.adv.model.f;
import java.lang.String;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import wba.b;

public final class e implements a$b	// class@00192d
{
    public static final e a;

    static {
       e.a = new e();
    }
    public void e(){
       super();
    }
    public final boolean a(Object p0,Object p1){
       boolean b = false;
       if (p0 != null && (TextUtils.x(p1.opaque()) || (!TextUtils.x(p0.opaque()) && b.o(p1.opaque()) < b.o(p0.opaque())))) {
          b = true;
       }
    label_0031 :
       return b;
    }
}

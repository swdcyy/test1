package com.kwai.component.photo.detail.slide.e;
import ok.x;
import java.lang.Object;
import le5.f;
import java.lang.Float;
import java.lang.String;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;

public final class e implements x	// class@000a51
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final Object get(){
       Float uFloat = Float.valueOf(0x3f800000);
       if (f.q()) {
          uFloat = f.b("slideIconTransparent", Float.class, uFloat);
       }
       return uFloat;
    }
}

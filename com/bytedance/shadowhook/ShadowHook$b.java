package com.bytedance.shadowhook.ShadowHook$b;
import java.lang.Object;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.shadowhook.ShadowHook$a;

public class ShadowHook$b	// class@000f17
{
    public ShadowHook$c a;
    public int b;
    public boolean c;

    public void ShadowHook$b(){
       super();
       this.a = ShadowHook.d;
       this.b = ShadowHook.e;
       this.c = false;
    }
    public ShadowHook$a a(){
       ShadowHook$a uoa = new ShadowHook$a();
       uoa.a = this.a;
       uoa.b = this.b;
       uoa.c = this.c;
       return uoa;
    }
}

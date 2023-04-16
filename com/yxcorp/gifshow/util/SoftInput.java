package com.yxcorp.gifshow.util.SoftInput;
import com.yxcorp.gifshow.util.SoftInput$hideSoftInputObserver$1;
import java.lang.Object;

public final class SoftInput	// class@001f30
{
    public static final LifecycleEventObserver a;
    public static boolean b;
    public static final SoftInput c;

    static {
       SoftInput.c = new SoftInput();
       SoftInput.a = SoftInput$hideSoftInputObserver$1.b;
    }
    public void SoftInput(){
       super();
    }
    public final boolean a(){
       return SoftInput.b;
    }
}

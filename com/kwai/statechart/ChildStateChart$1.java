package com.kwai.statechart.ChildStateChart$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ut7.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalStateException;

public final class ChildStateChart$1 extends Lambda implements a	// class@0018e0
{
    public static final ChildStateChart$1 INSTANCE;

    static {
       ChildStateChart$1.INSTANCE = new ChildStateChart$1();
    }
    public void ChildStateChart$1(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, ChildStateChart$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       throw new IllegalStateException("bug! ChildStateChart won\'t use ActionQueue");
    }
}

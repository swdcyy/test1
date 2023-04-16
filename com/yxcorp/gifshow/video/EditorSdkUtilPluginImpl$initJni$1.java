package com.yxcorp.gifshow.video.EditorSdkUtilPluginImpl$initJni$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ekd.v0;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import com.kwai.robust.PatchProxy;

public final class EditorSdkUtilPluginImpl$initJni$1 extends FunctionReferenceImpl implements l	// class@001681
{
    public static final EditorSdkUtilPluginImpl$initJni$1 INSTANCE;

    static {
       EditorSdkUtilPluginImpl$initJni$1.INSTANCE = new EditorSdkUtilPluginImpl$initJni$1();
    }
    public void EditorSdkUtilPluginImpl$initJni$1(){
       super(1, v0.class, "loadLibrary", "loadLibrary\(Ljava/lang/String;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       boolean b = PatchProxy.applyVoidOneRefs(p0, this, EditorSdkUtilPluginImpl$initJni$1.class, "1");
       if (b) {
          return;
       }
       b.b(p0);
       return;
    }
}

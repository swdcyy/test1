package com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import java.io.Serializable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.content.Intent;

public final class SerializableHook	// class@000e5c
{
    public static ClassLoader sClassLoader;

    public void SerializableHook(){
       super();
    }
    public static Serializable getSerializable(Bundle p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SerializableHook.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getSerializable(p1);
    }
    public static Serializable getSerializableExtra(Intent p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, SerializableHook.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getSerializableExtra(p1);
    }
    public static Intent putExtra(Intent p0,String p1,Serializable p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, SerializableHook.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.putExtra(p1, p2);
    }
    public static void putSerializable(Bundle p0,String p1,Serializable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, SerializableHook.class, "3")) {
          return;
       }
       p0.putSerializable(p1, p2);
       return;
    }
}

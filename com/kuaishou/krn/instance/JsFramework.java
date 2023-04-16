package com.kuaishou.krn.instance.JsFramework;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class JsFramework extends Enum	// class@0008bd
{
    public final String bundleId;
    public final String presetVersion;
    public final int presetVersionCode;
    public static final JsFramework[] $VALUES;
    public static final JsFramework REACT;
    public static final JsFramework VUE;

    static {
       JsFramework jsFramework;
       JsFramework[] jsFrameworkA = new JsFramework[]{v7,jsFramework};
       jsFramework = new JsFramework("REACT", 0, "react.platform", "0.0.10", 103);
       JsFramework.REACT = v7;
       JsFramework jsFramework1 = new JsFramework("VUE", 1, "vue.platform", "UNKNOWN_VERSION", -1);
       JsFramework.VUE = jsFramework;
       JsFramework.$VALUES = jsFrameworkA;
    }
    public void JsFramework(String p0,int p1,String p2,String p3,int p4){
       super(p0, p1);
       this.bundleId = p2;
       this.presetVersion = p3;
       this.presetVersionCode = p4;
    }
    public static JsFramework valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, JsFramework.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(JsFramework.class, p0);
    }
    public static JsFramework[] values(){
       Object obj = PatchProxy.apply(null, null, JsFramework.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return JsFramework.$VALUES.clone();
    }
    public final String getBundleId(){
       return this.bundleId;
    }
    public final String getPresetVersion(){
       return this.presetVersion;
    }
    public final int getPresetVersionCode(){
       return this.presetVersionCode;
    }
}

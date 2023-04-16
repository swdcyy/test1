package com.yxcorp.gifshow.easteregg.manager.ConditionConfigManager$prepare$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import z9a.a;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import daa.m;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public final class ConditionConfigManager$prepare$2 extends FunctionReferenceImpl implements l	// class@001ad3
{
    public static final ConditionConfigManager$prepare$2 INSTANCE;

    static {
       ConditionConfigManager$prepare$2.INSTANCE = new ConditionConfigManager$prepare$2();
    }
    public void ConditionConfigManager$prepare$2(){
       super(1, a.class, "save", "save\(Lcom/yxcorp/gifshow/easteregg/model/TriggerConditionConfigs;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(m p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConditionConfigManager$prepare$2.class, "1")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString(b.d("user")+"Conditions", b.e(p0.conditions));
       g.a(uEditor);
       return;
    }
}

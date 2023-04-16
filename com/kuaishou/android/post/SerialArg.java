package com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.PostPageArg;
import java.lang.String;
import com.kuaishou.android.post.PostArguments;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.content.Intent;
import java.io.Serializable;
import ekd.j0;
import android.os.Bundle;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class SerialArg extends PostPageArg	// class@000ea7
{

    public void SerialArg(String p0,String p1,PostArguments p2){
       a.p(p0, "intentKey");
       a.p(p2, "postArguments");
       super(p0, p1, p2, false, 8, null);
    }
    public void readFromStr(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SerialArg.class, "5")) {
          return;
       }
       a.p(p0, "v");
       PostUtils.D("PostArgType", "readFromStr\(\)", new IllegalArgumentException(this.getIntentKey()+" do not support this "));
       return;
    }
    public void readIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SerialArg.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       this.setValue(j0.e(p0, this.getIntentKey()));
       return;
    }
    public void readScheme(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SerialArg.class, "2")) {
          return;
       }
       a.p(p0, "intent");
       return;
    }
    public void writeBundle(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SerialArg.class, "4")) {
          return;
       }
       a.p(p0, "bundle");
       if (this.getValue() != null) {
          Object value = this.getValue();
          a.m(value);
          SerializableHook.putSerializable(p0, this.getIntentKey(), value);
       }
       return;
    }
    public void writeIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SerialArg.class, "3")) {
          return;
       }
       a.p(p0, "intent");
       if (this.getValue() != null) {
          SerializableHook.putExtra(p0, this.getIntentKey(), this.getValue());
       }
       return;
    }
}

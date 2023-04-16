package com.kuaishou.android.post.IntArg;
import com.kuaishou.android.post.PostPageArg;
import java.lang.String;
import com.kuaishou.android.post.PostArguments;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import android.os.Bundle;
import java.lang.Number;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class IntArg extends PostPageArg	// class@000ea0
{

    public void IntArg(String p0,String p1,PostArguments p2,boolean p3){
       a.p(p0, "intentKey");
       a.p(p2, "postArguments");
       super(p0, p1, p2, p3);
    }
    public void IntArg(String p0,String p1,PostArguments p2,boolean p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = false;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public void readFromStr(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntArg.class, "5")) {
          return;
       }
       try{
          a.p(p0, "v");
          this.setValue(Integer.valueOf(Integer.parseInt(p0)));
       }catch(java.lang.NumberFormatException e3){
          PostUtils.D("PostArgType", "readFromStr\(\) "+this.getIntentKey(), e3);
       }
       return;
    }
    public void readIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntArg.class, "1")) {
          return;
       }
       String str = "intent";
       try{
          a.p(p0, str);
          this.setValue(Integer.valueOf(p0.getIntExtra(this.getIntentKey(), 0)));
       }catch(java.lang.ClassCastException e3){
          PostUtils.D("PostArgType", "readIntent\(\) "+this.getIntentKey(), e3);
       }
       return;
    }
    public void readScheme(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntArg.class, "2")) {
          return;
       }
       a.p(p0, "intent");
       String str = x0.a(p0.getData(), this.getSchemeJsKey());
       if (str != null) {
          try{
             this.setValue(Integer.valueOf(Integer.parseInt(str)));
          }catch(java.lang.NumberFormatException e0){
             PostUtils.D("PostArgType", "PostPageArg key="+this.getSchemeJsKey()+" read str="+str, e0);
          }
       }
    }
    public void writeBundle(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntArg.class, "4")) {
          return;
       }
       a.p(p0, "bundle");
       if (this.getValue() != null) {
          Object value = this.getValue();
          a.m(value);
          p0.putInt(this.getIntentKey(), value.intValue());
       }
       return;
    }
    public void writeIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IntArg.class, "3")) {
          return;
       }
       a.p(p0, "intent");
       if (this.getValue() != null) {
          SerializableHook.putExtra(p0, this.getIntentKey(), this.getValue());
       }
       return;
    }
}

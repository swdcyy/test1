package com.kuaishou.android.post.BoolArg;
import com.kuaishou.android.post.PostPageArg;
import java.lang.String;
import com.kuaishou.android.post.PostArguments;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.content.Intent;
import ekd.j0;
import android.net.Uri;
import ekd.x0;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class BoolArg extends PostPageArg	// class@000e9b
{

    public void BoolArg(String p0,String p1,PostArguments p2){
       a.p(p0, "intentKey");
       a.p(p2, "postArguments");
       super(p0, p1, p2, false, 8, null);
    }
    public void readFromStr(String p0){
       Boolean fALSE;
       if (PatchProxy.applyVoidOneRefs(p0, this, BoolArg.class, "5")) {
          return;
       }
       a.p(p0, "v");
       String str = p0.toLowerCase();
       a.o(str, "\(this as java.lang.String\).toLowerCase\(\)");
       int i = str.hashCode();
       if (i != 48) {
          if (i != 49) {
             if (i != 0x36758e) {
                if (i == 0x5cb1923 && str.equals("false")) {
                   fALSE = Boolean.FALSE;
                }else {
                label_005c :
                   PostUtils.D("PostArgType", "readFromStr\(\) BooleanPageArgInfo", new IllegalArgumentException("not support boolean for "+this.getIntentKey()+'='+p0));
                   fALSE = Boolean.FALSE;
                }
             }else if(str.equals("true")){
                fALSE = Boolean.TRUE;
             }else {
                goto label_005c ;
             }
          }else if(str.equals("1")){
             fALSE = Boolean.TRUE;
          }else {
             goto label_005c ;
          }
       }else if(str.equals("0")){
          fALSE = Boolean.FALSE;
       }else {
          goto label_005c ;
       }
       this.setValue(fALSE);
       return;
    }
    public void readIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BoolArg.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       this.setValue(Boolean.valueOf(j0.a(p0, this.getIntentKey(), false)));
       return;
    }
    public void readScheme(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BoolArg.class, "2")) {
          return;
       }
       a.p(p0, "intent");
       String str = x0.a(p0.getData(), this.getSchemeJsKey());
       if (str != null) {
          this.setValue(Boolean.valueOf(Boolean.parseBoolean(str)));
       }
       return;
    }
    public void writeBundle(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BoolArg.class, "4")) {
          return;
       }
       a.p(p0, "bundle");
       if (this.getValue() != null) {
          Object value = this.getValue();
          a.m(value);
          p0.putBoolean(this.getIntentKey(), value.booleanValue());
       }
       return;
    }
    public void writeIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BoolArg.class, "3")) {
          return;
       }
       a.p(p0, "intent");
       if (this.getValue() != null) {
          SerializableHook.putExtra(p0, this.getIntentKey(), this.getValue());
       }
       return;
    }
}

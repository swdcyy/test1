package com.kuaishou.android.post.StrArg;
import com.kuaishou.android.post.PostPageArg;
import java.lang.String;
import com.kuaishou.android.post.PostArguments;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import ekd.j0;
import android.net.Uri;
import ekd.x0;
import android.os.Bundle;

public class StrArg extends PostPageArg	// class@000eab
{

    public void StrArg(String p0,String p1,PostArguments p2,boolean p3){
       a.p(p0, "intentKey");
       a.p(p2, "postArguments");
       super(p0, p1, p2, p3);
    }
    public void StrArg(String p0,String p1,PostArguments p2,boolean p3,int p4,u p5){
       if (p4 & 0x08) {
          p3 = false;
       }
       super(p0, p1, p2, p3);
       return;
    }
    public void readFromStr(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StrArg.class, "5")) {
          return;
       }
       a.p(p0, "v");
       this.setValue(p0);
       return;
    }
    public void readIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StrArg.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       this.setValue(j0.f(p0, this.getIntentKey()));
       return;
    }
    public void readScheme(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StrArg.class, "2")) {
          return;
       }
       a.p(p0, "intent");
       String str = x0.a(p0.getData(), this.getSchemeJsKey());
       if (str != null) {
          this.setValue(str);
       }
       return;
    }
    public void writeBundle(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StrArg.class, "4")) {
          return;
       }
       a.p(p0, "bundle");
       if (this.getValue() != null) {
          Object value = this.getValue();
          a.m(value);
          p0.putString(this.getIntentKey(), value);
       }
       return;
    }
    public void writeIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StrArg.class, "3")) {
          return;
       }
       a.p(p0, "intent");
       if (this.getValue() != null) {
          p0.putExtra(this.getIntentKey(), this.getValue());
       }
       return;
    }
}

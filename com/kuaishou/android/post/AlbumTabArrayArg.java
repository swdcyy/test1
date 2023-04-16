package com.kuaishou.android.post.AlbumTabArrayArg;
import com.kuaishou.android.post.PostPageArg;
import java.lang.String;
import com.kuaishou.android.post.PostArguments;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o79.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import lnc.p3;
import java.lang.StringBuilder;
import java.util.Arrays;
import q87.c;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;
import android.os.Bundle;

public final class AlbumTabArrayArg extends PostPageArg	// class@000e9a
{

    public void AlbumTabArrayArg(String p0,String p1,PostArguments p2){
       a.p(p0, "intentKey");
       a.p(p2, "postArguments");
       super(p0, p1, p2, false, 8, null);
    }
    public void readFromStr(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumTabArrayArg.class, "5")) {
          return;
       }
       a.p(p0, "v");
       String str = "video";
       int i = 0;
       if (a.g(str, p0)) {
          this.setValue(a.d);
       }else {
          String str1 = "image";
          if (a.g(str1, p0)) {
             this.setValue(a.c);
          }else {
             int i1 = 2;
             if (StringsKt__StringsKt.O2(p0, str, i, i1, null) && StringsKt__StringsKt.O2(p0, str1, i, i1, null)) {
                this.setValue(a.b);
             }else if(a.g("all", p0)){
                this.setValue(a.a);
             }else if(a.g("mix", p0)){
                this.setValue(a.e);
             }
          }
       }
       Object[] objArray = new Object[i];
       p3.D().w("PostArgType", "IntArrayArg readFromStr\(\) v="+p0+" value="+Arrays.toString(this.getValue()), objArray);
       return;
    }
    public void readIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumTabArrayArg.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       this.setValue(p0.getIntArrayExtra(this.getIntentKey()));
       Object[] objArray = new Object[0];
       p3.D().w("PostArgType", "readIntent\(\) "+this.getIntentKey()+' '+Arrays.toString(this.getValue()), objArray);
       return;
    }
    public void readScheme(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumTabArrayArg.class, "2")) {
          return;
       }
       a.p(p0, "intent");
       String str = x0.a(p0.getData(), this.getSchemeJsKey());
       int i = (str == null || !str.length())? 1: 0;
       if (i) {
          return;
       }else {
          this.readFromStr(str);
          return;
       }
    }
    public void writeBundle(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumTabArrayArg.class, "4")) {
          return;
       }
       a.p(p0, "bundle");
       if (this.getValue() != null) {
          p0.putIntArray(this.getIntentKey(), this.getValue());
       }
       return;
    }
    public void writeIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AlbumTabArrayArg.class, "3")) {
          return;
       }
       a.p(p0, "intent");
       if (this.getValue() != null) {
          Object[] objArray = new Object[0];
          p3.D().w("PostArgType", "writeIntent\(\) "+this.getIntentKey()+' '+Arrays.toString(this.getValue()), objArray);
          p0.putExtra(this.getIntentKey(), this.getValue());
       }
       return;
    }
}

package com.kuaishou.merchant.basic.activity.plugin.MakeActivityHalfScreenPlugin$a;
import java.lang.Object;
import nsd.u;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.net.Uri;
import ekd.x0;
import java.lang.Integer;
import zsd.t;
import java.lang.Boolean;
import android.os.Parcelable;

public final class MakeActivityHalfScreenPlugin$a	// class@0015a9
{

    public void MakeActivityHalfScreenPlugin$a(){
       super();
    }
    public void MakeActivityHalfScreenPlugin$a(u p0){
       super();
    }
    public final int a(Intent p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, MakeActivityHalfScreenPlugin$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          return 0;
       }
       Uri uri = this.c(p0);
       if (uri != null) {
          String str = x0.a(uri, "absoluteHeight");
          if (str != null) {
             Integer integer = t.X0(str);
             if (integer != null) {
                i = integer.intValue();
             label_0031 :
                if (i <= 0) {
                   i = p0.getIntExtra("absoluteHeight", 0);
                }
                return i;
             }
          }
       }
       i = 0;
       goto label_0031 ;
    }
    public final boolean b(Intent p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, MakeActivityHalfScreenPlugin$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       Uri uri = this.c(p0);
       if (uri != null) {
          String str = x0.a(uri, "isHalf");
          Integer integer = (str != null)? t.X0(str): null;
          b = true;
          if (integer != null && integer.intValue() == b) {
          label_0037 :
             if (!b) {
                b = p0.getBooleanExtra("isHalf", false);
             }
             return b;
          }
       }
    label_0036 :
       b = false;
       goto label_0037 ;
    }
    public final Uri c(Intent p0){
       Uri obj = PatchProxy.applyOneRefs(p0, this, MakeActivityHalfScreenPlugin$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.getData();
       if (obj == null) {
          Parcelable parcelable = p0.getParcelableExtra("uri_data");
       }
       return obj;
    }
}

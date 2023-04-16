package com.yxcorp.gifshow.camera.record.photo.o$a;
import com.yxcorp.gifshow.fragment.d;
import com.yxcorp.gifshow.camera.record.photo.o;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import com.yxcorp.gifshow.camera.record.photo.p;
import com.yxcorp.utility.AsyncTask;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.photo.p$d;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.app.Activity;
import lnc.a1;
import android.content.Intent;
import android.net.Uri;
import ekd.w0;

public class o$a extends d	// class@000ef3
{
    public final o y;

    public void o$a(o p0,FragmentActivity p1){
       this.y = p0;
       super(p1);
    }
    public Object b(Object[] p0){
       Void void = PatchProxy.applyOneRefs(p0, this, o$a.class, "1");
       if (void != PatchProxyResult.class) {
       }else {
          o$a ty = this.y;
          void = ty.c.p(ty.b);
       }
       return void;
    }
    public void i(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "3")) {
       }else {
          super.i(p0);
          Object[] objArray = new Object[0];
          a.D().w(this.y.c.a, "handleSendImage onCancelled", objArray);
          this.y.c.e.K0();
       }
       return;
    }
    public void j(Object p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, o$a.class, "2")) {
       }else {
          super.j(p0);
          int i = 0;
          if (!a1.i(this.y.c.d())) {
             objArray = new Object[i];
             a.D().w(this.y.c.a, "handleSendImage activity not available", objArray);
          }else {
             p0 = this.y.b;
             if (p0 != null && p0.exists()) {
                objArray = new Object[i];
                a.D().w(this.y.c.a, "handleSendImage success", objArray);
                p0 = new Intent();
                p0.setData(w0.f(this.y.b.getAbsolutePath()));
                this.y.c.d().setResult(-1, p0);
                this.y.c.d().finish();
             }else {
                this.y.c.g();
             }
          }
       }
       return;
    }
}

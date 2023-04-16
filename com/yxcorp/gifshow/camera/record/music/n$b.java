package com.yxcorp.gifshow.camera.record.music.n$b;
import com.yxcorp.gifshow.fragment.d;
import com.yxcorp.gifshow.camera.record.music.n;
import androidx.fragment.app.FragmentActivity;
import com.kuaishou.android.model.music.Music;
import android.content.Intent;
import java.lang.Object;
import java.lang.Void;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Exception;
import com.yxcorp.gifshow.camera.record.music.g;
import com.yxcorp.gifshow.camera.record.music.g$a;
import com.yxcorp.gifshow.camera.record.music.n$d;
import java.io.File;
import android.net.Uri;
import com.yxcorp.gifshow.media.util.c;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.feature.post.api.music.data.MusicSource;
import com.kuaishou.android.model.music.MusicType;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import j8c.a;
import w46.b;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import q87.c;

public class n$b extends d	// class@000e87
{
    public final Intent A;
    public final boolean B;
    public final n C;
    public int y;
    public final Music z;

    public void n$b(n p0,FragmentActivity p1,boolean p2,Music p3,Intent p4,boolean p5){
       this.C = p0;
       this.z = p3;
       this.A = p4;
       this.B = p5;
       super(p1, p2);
    }
    public Object b(Object[] p0){
       n$b tz1;
       p0 = PatchProxy.applyOneRefs(p0, this, n$b.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          try{
             n$b tz = this.z;
             if (tz != null) {
                g$a e = g.e;
                e.g(this.A, tz);
                e.f(this.A, this.z);
                n$d uod = e.h(this.A, this.z);
                if (uod != null) {
                   tz1 = this.C;
                   tz1.k1 = uod.b;
                   tz1.M = uod.a;
                }
                this.y = c.i(new File(this.A.getData().getPath()).getAbsolutePath());
             }
             Throwable throwable = null;
          }catch(java.lang.Exception e5){
             ExceptionHandler.handleCaughtException(new Exception("Download music resources failed", e5));
             tz1 = this.z;
             if (tz1 != null && this.C.L != MusicSource.MAGIC_FACE) {
                int i = 0x7f110668;
                int i1 = (tz1.mType == MusicType.SOUNDTRACK)? 0x7f100de6: 0x7f100de2;
                i.d(i, a1.p(i1));
             }
             a.D().e("MusicView", "Download music resources failed", e5);
          }
       }
       return p0;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, n$b.class, "3")) {
          return;
       }
       super.h();
       this.C.F2(false);
       return;
    }
    public void j(Object p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, n$b.class, "2")) {
       }else {
          super.j(p0);
          String str = "MusicView";
          int i = 0;
          if (this.C.e.isFinishing()) {
             objArray = new Object[i];
             a.D().w(str, "Activity is finishing", objArray);
          }else {
             this.C.F2(i);
             if (p0 == null) {
                p0.U = (long)this.y;
                objArray = new Object[i];
                a.D().w(str, "handleMusicIntent, enterMusicMode", objArray);
                this.C.i2(this.A, this.B, i);
             }
          }
       }
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, n$b.class, "4")) {
          return;
       }
       if (this.C.L != MusicSource.MAGIC_FACE) {
          super.k();
       }
       return;
    }
}

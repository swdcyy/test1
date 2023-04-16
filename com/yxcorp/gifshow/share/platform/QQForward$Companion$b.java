package com.yxcorp.gifshow.share.platform.QQForward$Companion$b;
import mhc.x;
import com.yxcorp.gifshow.share.platform.QQForward$Companion;
import java.lang.Object;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.share.KwaiOperator;
import android.content.Context;
import com.yxcorp.gifshow.share.KwaiOperator$a;
import dz6.a;

public final class QQForward$Companion$b implements x	// class@001c0b
{
    public final KwaiOp b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;
    public final int m;
    public final QQForward$Companion n;

    public void QQForward$Companion$b(QQForward$Companion p0){
       this.n = p0;
       super();
       this.b = KwaiOp.FORWARD_QZONE;
       this.c = "qz";
       this.d = 3;
       this.e = 4;
       this.h = "qzone";
       this.i = "share_qzone";
       this.j = "qz";
       this.k = 0x7f1040c2;
       this.l = 0x7f081fd5;
       this.m = 5;
    }
    public int C0(){
       return this.e;
    }
    public String E0(){
       return this.c;
    }
    public KwaiOp H0(){
       return this.b;
    }
    public boolean K(){
       Object obj = PatchProxy.apply(null, this, QQForward$Companion$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(KwaiOperator.q.b());
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, QQForward$Companion$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public int e(){
       return this.k;
    }
    public String f0(){
       return this.j;
    }
    public int g(){
       return this.m;
    }
    public boolean getAddWatermark(){
       return this.g;
    }
    public String getPackageName(){
       return "com.tencent.mobileqq";
    }
    public String getText(){
       Object obj = PatchProxy.apply(null, this, QQForward$Companion$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "";
    }
    public int k(){
       return this.l;
    }
    public int l0(){
       return this.d;
    }
    public boolean m0(){
       return this.f;
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, QQForward$Companion$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "";
    }
    public String v(){
       return this.h;
    }
    public boolean v0(){
       Object obj = PatchProxy.apply(null, this, QQForward$Companion$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public String y0(){
       return this.i;
    }
}

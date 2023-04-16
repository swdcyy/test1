package com.yxcorp.gifshow.share.platform.QQForward$Companion$a;
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

public final class QQForward$Companion$a implements x	// class@001c0a
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

    public void QQForward$Companion$a(QQForward$Companion p0){
       this.n = p0;
       super();
       this.b = KwaiOp.FORWARD_QQ;
       this.c = "qq2.0";
       this.d = 6;
       this.e = 4;
       this.h = "qq2.0";
       this.i = "share_qqms";
       this.j = "qq";
       this.k = 0x7f10409f;
       this.l = 0x7f081fd3;
       this.m = 4;
    }
    public int C0(){
       return this.d;
    }
    public String E0(){
       return this.c;
    }
    public KwaiOp H0(){
       return this.b;
    }
    public boolean K(){
       Object obj = PatchProxy.apply(null, this, QQForward$Companion$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.b(KwaiOperator.q.b(), true);
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, QQForward$Companion$a.class, "3");
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
       Object obj = PatchProxy.apply(null, this, QQForward$Companion$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "";
    }
    public int k(){
       return this.l;
    }
    public int l0(){
       return this.e;
    }
    public boolean m0(){
       return this.f;
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, QQForward$Companion$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "";
    }
    public String v(){
       return this.h;
    }
    public boolean v0(){
       Object obj = PatchProxy.apply(null, this, QQForward$Companion$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public String y0(){
       return this.i;
    }
}

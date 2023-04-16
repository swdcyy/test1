package mhc.v;
import mhc.x;
import mhc.p1;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import kotlin.jvm.internal.a;
import oic.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.plugin.impl.SharePlugin.KwaiOp;
import java.lang.Boolean;
import com.yxcorp.gifshow.share.OperationModel;
import com.yxcorp.gifshow.model.SharePlatformData;
import mhc.o1;
import com.yxcorp.gifshow.model.SharePlatformData$ShareConfig;
import mhc.i2;
import com.yxcorp.gifshow.share.platform.QQForward;
import com.yxcorp.gifshow.share.platform.QQForward$Companion;

public abstract class v implements x, p1	// class@0035bf
{
    public final x b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final boolean g;

    public void v(x p0){
       super(p0, 0, 0, null, null, false, 62, null);
    }
    public void v(x p0,int p1,int p2,String p3,String p4,boolean p5,int p6,u p7){
       if (p6 & 0x02) {
          p1 = p0.e();
       }
       if (p6 & 0x04) {
          p2 = p0.k();
       }
       p4 = null;
       p3 = (p6 & 0x08)? p0.getText(): p4;
       if (p6 & 0x10) {
          p4 = p0.o();
       }
       if (p6 & 0x20) {
          p5 = false;
       }
       a.p(p0, "forward");
       a.p(p3, "text");
       a.p(p4, "iconUri");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       return;
    }
    public boolean B(){
       return (this instanceof f ^ 0x01);
    }
    public int C(){
       return 0;
    }
    public int C0(){
       Object obj = PatchProxy.apply(null, this, v.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.C0();
    }
    public boolean E(){
       return this instanceof f;
    }
    public String E0(){
       Object obj = PatchProxy.apply(null, this, v.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.E0();
    }
    public KwaiOp H0(){
       Object obj = PatchProxy.apply(null, this, v.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.H0();
    }
    public boolean K(){
       Object obj = PatchProxy.apply(null, this, v.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.K();
    }
    public final KwaiOp M(){
       Object obj = PatchProxy.apply(null, this, v.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.H0();
    }
    public boolean Q0(OperationModel p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       v ov = v.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, ov, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "model");
       Object obj1 = PatchProxy.apply(null, this, ov, "4");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): this.getForward().K();
       boolean b1 = (b && p0.a(this.H0()))? true: false;
       return b1;
    }
    public final SharePlatformData R0(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return p0.j(this.getForward());
    }
    public abstract int S0();
    public boolean Y(){
       return o1.a(this);
    }
    public final SharePlatformData$ShareConfig a(OperationModel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, v.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "model");
       return p0.c(this.getForward());
    }
    public boolean d(){
       return this.g;
    }
    public int e(){
       return this.c;
    }
    public String f0(){
       Object obj = PatchProxy.apply(null, this, v.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.f0();
    }
    public int g(){
       Object obj = PatchProxy.apply(null, this, v.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.g();
    }
    public boolean getAddWatermark(){
       Object obj = PatchProxy.apply(null, this, v.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.getAddWatermark();
    }
    public String getContent(){
       Object obj = PatchProxy.apply(null, this, v.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "";
    }
    public x getForward(){
       return this.b;
    }
    public String getPackageName(){
       Object obj = PatchProxy.apply(null, this, v.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getPackageName();
    }
    public x getPlatform(){
       Object obj = PatchProxy.apply(null, this, v.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getForward();
    }
    public String getText(){
       return this.e;
    }
    public i2 j0(OperationModel p0){
       int i2;
       SharePlatformData sharePlatfor;
       SharePlatformData$ShareConfig shareConfig2;
       SharePlatformData sharePlatfor1;
       Object obj = this;
       SharePlatformData obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       v ov = v.class;
       Object obj2 = PatchProxy.applyOneRefs(obj1, obj, ov, "5");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       x forward = this.getForward();
       int i = this.S0();
       SharePlatformData obj3 = PatchProxy.applyOneRefs(obj1, obj, ov, "3");
       if (obj3 != patchProxyRe) {
          int i1 = obj3.intValue();
       label_002b :
          i2 = i1;
       }else if(obj1 == null){
          if (this.S0() == 7) {
             i2 = 8;
          }else {
             obj3 = this.R0(p0);
             SharePlatformData mShareMethod = obj3.mShareMethod;
             if (mShareMethod != null) {
                switch (mShareMethod.hashCode()){
                    case 0xd5d1ba4d:
                      if (mShareMethod.equals("miniprogram")) {
                         QQForward$Companion m0 = QQForward.m0;
                         if ((m0.c().v()).equals(obj3.mSharePlatform) || (m0.d().v()).equals(obj3.mSharePlatform)) {
                            m0 = 9;
                            goto label_002b ;
                         }else {
                            m0 = 1;
                            goto label_002b ;
                         }
                      }
                      break;
                    case 0xdd905cfe:
                      if (mShareMethod.equals("picture")) {
                      label_0090 :
                         i2 = 6;
                      }
                      break;
                    case 3277:
                      if (mShareMethod.equals("h5")) {
                         i2 = 3;
                      }
                      break;
                    case 0x2e7b10:
                      if (mShareMethod.equals("card")) {
                         i2 = 4;
                      }
                      break;
                    case 0x5faa95b:
                      if (mShareMethod.equals("image")) {
                         goto label_0090 ;
                      }
                      break;
                    case 0x696b9f9:
                      if (mShareMethod.equals("token")) {
                         i2 = 2;
                      }
                      break;
                    case 0x551ac888:
                      if (mShareMethod.equals("download")) {
                         i2 = 5;
                      }
                      break;
                    default:
                }
             }
          }
       }
       i2 = 0;
       SharePlatformData$ShareConfig shareConfig = (obj1 != null)? obj1.c(this.getForward()): null;
       if (obj1 != null) {
          obj3 = obj1.j(this.getForward());
          if (obj3 != null) {
             sharePlatfor = obj3.mShareMode;
          label_00e3 :
             if (obj1 != null) {
                SharePlatformData$ShareConfig shareConfig1 = obj1.c(this.getForward());
                if (shareConfig1 != null) {
                   shareConfig2 = shareConfig1.mShareUrl;
                label_00f4 :
                   if (obj1 != null) {
                      obj1 = obj1.j(this.getForward());
                      if (obj1 != null) {
                         sharePlatfor1 = obj1.mShareId;
                      label_0105 :
                         i2 oi2 = new i2(forward, i, i2, shareConfig, sharePlatfor, shareConfig2, sharePlatfor1, null, null, 384, null);
                         return obj2;
                      }
                   }
                   sharePlatfor1 = null;
                   goto label_0105 ;
                }
             }
             shareConfig2 = null;
             goto label_00f4 ;
          }
       }
       sharePlatfor = null;
       goto label_00e3 ;
    }
    public int k(){
       return this.d;
    }
    public int l0(){
       Object obj = PatchProxy.apply(null, this, v.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.l0();
    }
    public boolean m0(){
       Object obj = PatchProxy.apply(null, this, v.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.m0();
    }
    public String o(){
       return this.f;
    }
    public String v(){
       Object obj = PatchProxy.apply(null, this, v.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.v();
    }
    public boolean v0(){
       Object obj = PatchProxy.apply(null, this, v.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.v0();
    }
    public String y0(){
       Object obj = PatchProxy.apply(null, this, v.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.y0();
    }
}

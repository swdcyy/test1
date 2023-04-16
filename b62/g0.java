package b62.g0;
import y8c.g;
import u52.t;
import j62.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.conditionredpacket.model.LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser;
import g9c.a;
import java.util.List;
import y8c.f$b;
import b62.z;
import java.lang.Number;
import android.view.ViewGroup;
import y8c.f;
import android.view.View;
import i2b.a;
import b62.h0;
import ml8.c;
import b62.i0;

public class g0 extends g	// class@00033c
{
    public a A;
    public String B;
    public m w;
    public boolean x;
    public boolean y;
    public t z;

    public void g0(t p0,a p1,boolean p2,boolean p3,String p4){
       super();
       this.z = p0;
       this.A = p1;
       this.x = p2;
       this.y = p3;
       this.B = p4;
    }
    public Object N0(int p0){
       a obj;
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og0, "4");
          if (obj != PatchProxyResult.class) {
          }else if(this.x != null && p0 < this.e.size()){
             obj = this.e.get(p0);
          }else if(this.x != null){
             obj = new LiveConditionRedPacketLotteryResultResponse$LiveConditionRedPacketLuckyUser();
          }else {
             obj = this.e;
             obj = obj.get((p0 % obj.size()));
          }
       }else {
          goto label_0019 ;
       }
       return obj;
    }
    public f$b d1(f$b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       z oz = new z(p0, this.z, this.A, this.x, this.B);
       return obj;
    }
    public int f0(int p0){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og0, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (this.x != null && (this.y != null && p0 == this.e.size())) {
          return 1;
       }else {
          return 0;
       }
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, g0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.x == null) {
          return Integer.MAX_VALUE;
       }
       return (this.e.size() + this.y);
    }
    public f h1(ViewGroup p0,int p1){
       g0 og0 = g0.class;
       if (PatchProxy.isSupport(og0)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, og0, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       boolean b = false;
       if (!p1) {
          return new f(a.k(p0, 0x7f0d0aca, b), new h0());
       }else {
          return new f(a.k(p0, 0x7f0d0ac1, b), new i0());
       }
    }
}

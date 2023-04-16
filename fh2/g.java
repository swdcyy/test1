package fh2.g;
import xw1.b;
import lp3.a;
import ng2.s;
import zw1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mt5.a;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import java.lang.Long;
import java.lang.Integer;
import xw1.a;
import java.lang.Number;
import java.lang.Boolean;
import com.kwai.feature.api.live.service.show.redpacket.redpacket.model.RedPacket;
import java.util.List;
import zw1.b;

public class g extends a implements b	// class@002961
{
    public final s d;

    public void g(s p0){
       super();
       this.d = p0;
    }
    public void J4(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "15")) {
          return;
       }
       g td = this.d;
       if (td == null) {
          return;
       }
       td.J4(p0);
       return;
    }
    public a O2(){
       g obj = PatchProxy.apply(null, this, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          return null;
       }
       return obj.O2();
    }
    public void R1(View p0,long p1,int p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), this, g.class, "4")) {
          return;
       }
       g td = this.d;
       if (td == null) {
          return;
       }
       td.R1(p0, p1, p2);
       return;
    }
    public void S3(View p0,long p1,int p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), this, g.class, "7")) {
          return;
       }
       g td = this.d;
       if (td == null) {
          return;
       }
       td.S3(p0, p1, p2);
       return;
    }
    public void T5(View p0,long p1,int p2,a p3,String p4){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, this, og, "6")) {
             return;
          }
       }
       g td = this.d;
       if (td == null) {
          return;
       }else {
          td.T5(p0, p1, p2, p3, p4);
          return;
       }
    }
    public void V5(View p0,long p1,int p2,a p3){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidFourRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), p3, this, g.class, "5")) {
          return;
       }
       g td = this.d;
       if (td == null) {
          return;
       }
       td.V5(p0, p1, p2, p3);
       return;
    }
    public int Y1(){
       g obj = PatchProxy.apply(null, this, g.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d;
       if (obj == null) {
          return 0;
       }
       return obj.Y1();
    }
    public void Z1(){
       if (PatchProxy.applyVoid(null, this, g.class, "17")) {
          return;
       }
       g td = this.d;
       if (td == null) {
          return;
       }
       td.Z1();
       return;
    }
    public void e4(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "16")) {
          return;
       }
       g td = this.d;
       if (td == null) {
          return;
       }
       td.e4(p0);
       return;
    }
    public boolean f4(View p0){
       g obj = PatchProxy.applyOneRefs(p0, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = (obj != null && obj.f4(p0))? true: false;
       return b;
    }
    public void h2(){
       if (PatchProxy.applyVoid(null, this, g.class, "3")) {
          return;
       }
       g td = this.d;
       if (td == null) {
          return;
       }
       td.h2();
       return;
    }
    public boolean i4(){
       g obj = PatchProxy.apply(null, this, g.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.d;
       boolean b = (obj != null && obj.i4())? true: false;
       return b;
    }
    public List n4(RedPacket p0){
       g obj = PatchProxy.applyOneRefs(p0, this, g.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          return null;
       }
       return obj.n4(p0);
    }
    public void o2(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "2")) {
          return;
       }
       g td = this.d;
       if (td == null) {
          return;
       }
       td.o2(p0);
       return;
    }
    public void q3(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "12")) {
          return;
       }
       g td = this.d;
       if (td == null) {
          return;
       }
       td.q3(p0);
       return;
    }
    public View w3(){
       g obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj == null) {
          return null;
       }
       return obj.w3();
    }
    public void y3(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, g.class, "11")) {
          return;
       }
       g td = this.d;
       if (td == null) {
          return;
       }
       td.y3(p0, p1);
       return;
    }
}

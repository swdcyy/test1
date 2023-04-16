package dw2.j$d;
import gp2.q;
import dw2.j;
import java.lang.Object;
import op2.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import dw2.i$b;
import dw2.i;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import yh3.a;
import java.lang.Boolean;
import dw2.i$c;
import dw2.i$a;
import dw2.i$d;
import com.kuaishou.live.core.voiceparty.core.shared.theater.TheaterDisplayMode;
import op2.j;
import op2.i;
import com.kwai.video.waynelive.quality.LiveQualityItem;
import java.util.List;

public final class j$d implements q	// class@0025bf
{
    public final j b;

    public void j$d(j p0){
       this.b = p0;
       super();
    }
    public void B(int p0,f p1){
       if (PatchProxy.isSupport(j$d.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, j$d.class, "3")) {
          return;
       }
       a.p(p1, "info");
       this.b.w0(i$b.d);
       j$d tb = this.b;
       tb.r0(tb.v0()).setValue(Boolean.FALSE);
       return;
    }
    public void P(f p0){
       i$b d;
       if (PatchProxy.applyVoidOneRefs(p0, this, j$d.class, "1")) {
          return;
       }
       a.p(p0, "info");
       j$d tb = this.b;
       tb.r0(tb.v0()).setValue(Boolean.valueOf(p0.i()));
       j$d tb1 = this.b;
       if (tb1.u0().getValue() instanceof i$c) {
          d = i$b.d;
          tb1.r0(tb1.u0()).setValue(d);
          if (a.g(tb1.b, d) ^ 0x01) {
             tb1.w0(tb1.b);
             tb1.b = d;
          }
       }
       if (tb1.b instanceof i$c) {
          tb1.b = i$b.d;
       }
       tb1 = this.b;
       if (tb1.u0().getValue() instanceof i$a) {
          d = i$b.d;
          tb1.r0(tb1.u0()).setValue(d);
          if (a.g(tb1.b, d) ^ 0x01) {
             tb1.w0(tb1.b);
             tb1.b = d;
          }
       }
       if (tb1.b instanceof i$a) {
          tb1.b = i$b.d;
       }
       return;
    }
    public void W(){
       if (PatchProxy.applyVoid(null, this, j$d.class, "6")) {
          return;
       }
       this.b.w0(i$d.d);
       return;
    }
    public void e0(){
       if (PatchProxy.applyVoid(null, this, j$d.class, "7")) {
          return;
       }
       j$d tb = this.b;
       if (tb.u0().getValue() instanceof i$a) {
          i$b d = i$b.d;
          tb.r0(tb.u0()).setValue(d);
          if (a.g(tb.b, d) ^ 0x01) {
             tb.w0(tb.b);
             tb.b = d;
          }
       }
       if (tb.b instanceof i$a) {
          tb.b = i$b.d;
       }
       return;
    }
    public void k(TheaterDisplayMode p0){
       i.a(this, p0);
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, j$d.class, "4")) {
          return;
       }
       this.b.w0(i$c.d);
       return;
    }
    public void onProgress(long p0,long p1){
       i.f(this, p0, p1);
    }
    public void onResume(){
       i$b d;
       if (PatchProxy.applyVoid(null, this, j$d.class, "5")) {
          return;
       }
       j$d tb = this.b;
       if (tb.u0().getValue() instanceof i$c) {
          d = i$b.d;
          tb.r0(tb.u0()).setValue(d);
          if (a.g(tb.b, d) ^ 0x01) {
             tb.w0(tb.b);
             tb.b = d;
          }
       }
       if (tb.b instanceof i$c) {
          tb.b = i$b.d;
       }
       tb = this.b;
       if (tb.u0().getValue() instanceof i$a) {
          d = i$b.d;
          tb.r0(tb.u0()).setValue(d);
          if (a.g(tb.b, d) ^ 0x01) {
             tb.w0(tb.b);
             tb.b = d;
          }
       }
       if (tb.b instanceof i$a) {
          tb.b = i$b.d;
       }
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, j$d.class, "2")) {
          return;
       }
       this.b.w0(i$a.d);
       return;
    }
    public void y(LiveQualityItem p0,List p1){
       i.g(this, p0, p1);
    }
}

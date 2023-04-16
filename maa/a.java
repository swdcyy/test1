package maa.a;
import nba.a;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.io.File;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.FineTuningParam;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Asset$b;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.FineTuningParam$b;
import naa.a;
import java.lang.Integer;
import java.lang.Boolean;
import laa.e;
import maa.b;
import com.yxcorp.gifshow.edit.draft.model.c$a;
import saa.a;
import xaa.a;

public class a extends c implements a	// class@002f9e
{

    public void a(File p0,List p1,c p2){
       super(p0, p1, p2);
    }
    public boolean B(){
       return false;
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "2")) {
          return;
       }
       if (this.v().getFineTuningParam() != null) {
          Asset$b uob = this.k();
          uob.getFineTuningParam();
          if (PatchProxy.applyOneRefs(uob, objArray, DraftUtils.class, "71") != PatchProxyResult.class) {
          }else {
             FineTuningParam$b uob1 = uob.getFineTuningParam().toBuilder();
             uob1.a((uob1.instance.getBrightness() * 100.00f));
             uob1.d((uob1.instance.getContrast() * 100.00f));
             uob1.e((uob1.instance.getSaturation() * 100.00f));
             uob1.f((uob1.instance.getSharpen() * 100.00f));
             uob1.c((uob1.instance.getColorTemperature() * 100.00f));
             uob.l(uob1.build());
          }
       }
       return;
    }
    public a f0(int p0,boolean p1){
       b obj;
       a uoa1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoa, "4");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       b uob = this.w(p0);
       if (uob == null) {
          uoa1 = null;
       }else {
          obj = b.class;
          if (PatchProxy.isSupport(obj)) {
             Object obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(p1), uob, obj, "11");
             if (obj1 != patchProxyRe) {
                uoa1 = obj1;
             }
          }
          if (uob.g == null && (uob.h().getBeautyCount() || p1)) {
             a uoa2 = new a(uob.i(), uob.h().getBeautyList(), uob.c);
             uob.g = uoa2;
             uoa2.b0(uob.n());
             uob.o().add(uob.g);
          }
          uoa1 = uob.g;
       }
       return uoa1;
    }
    public a g0(int p0,boolean p1){
       b obj;
       a uoa1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoa, "5");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       b uob = this.w(p0);
       if (uob == null) {
          uoa1 = null;
       }else {
          obj = b.class;
          if (PatchProxy.isSupport(obj)) {
             Object obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(p1), uob, obj, "12");
             if (obj1 != patchProxyRe) {
                uoa1 = obj1;
             }
          }
          if (uob.h == null && (uob.h().getColorFilterCount() || p1)) {
             a uoa2 = new a(uob.i(), uob.h().getColorFilterList(), uob.c);
             uob.h = uoa2;
             uoa2.b0(uob.n());
             uob.o().add(uob.h);
          }
          uoa1 = uob.h;
       }
       return uoa1;
    }
    public a h0(int p0,boolean p1){
       b obj;
       a uoa1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uoa, "3");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       b uob = this.w(p0);
       if (uob == null) {
          uoa1 = null;
       }else {
          obj = b.class;
          if (PatchProxy.isSupport(obj)) {
             Object obj1 = PatchProxy.applyOneRefs(Boolean.valueOf(p1), uob, obj, "10");
             if (obj1 != patchProxyRe) {
                uoa1 = obj1;
             }
          }
          if (uob.f == null && (uob.h().getMakeupCount() || p1)) {
             a uoa2 = new a(uob.i(), uob.h().getMakeupList(), uob.c);
             uob.f = uoa2;
             uoa2.b0(uob.n());
             uob.o().add(uob.f);
          }
          uoa1 = uob.f;
       }
       return uoa1;
    }
    public e i(GeneratedMessageLite p0){
       b uob = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          uob = new b(this.q(), p0, this.c);
       }
       return uob;
    }
    public String r(){
       return "asset";
    }
}

package lw8.a;
import br8.b;
import y8c.g;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import g9c.a;
import com.yxcorp.gifshow.model.ContactTargetItem;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import i2b.a;
import lw8.a$b;
import y8c.f;
import lw8.a$a;
import ml8.c;
import java.util.Map;
import java.lang.Long;
import lw8.b;
import java.util.Objects;
import android.widget.TextView;
import java.lang.CharSequence;

public final class a extends g implements b	// class@002dc3
{
    public boolean A;
    public final int B;
    public b w;
    public final HashMap x;
    public String y;
    public String z;

    public void a(int p0){
       super();
       this.B = p0;
       this.x = new HashMap();
       this.z = "";
    }
    public long E(int p0){
       ContactTargetItem obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       ContactTargetItem uContactTarg = this.N0(p0);
       obj = (uContactTarg != null)? uContactTarg.mSection: null;
       if (obj != null && uContactTarg.mFirstLetter != null) {
          uContactTarg = uContactTarg.mSection;
          a.o(uContactTarg, "model.mSection");
          return this.r1(uContactTarg);
       }else {
          a ty = this.y;
          if (ty != null) {
             return this.r1(ty);
          }else {
             return -1;
          }
       }
    }
    public RecyclerView$ViewHolder d(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "parent");
       return new a$b(a.i(p0, 0x7f0d1286), a.i(p0, 0x7f0d1286));
    }
    public int f0(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       ContactTargetItem uContactTarg = this.N0(p0);
       uContactTarg = (uContactTarg != null)? uContactTarg.mType: 0;
       return uContactTarg;
    }
    public f h1(ViewGroup p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d1287), new a$a(this));
    }
    public final long r1(String p0){
       a obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.x;
       Long longx = obj.get(p0);
       if (longx == null) {
          longx = Long.valueOf((long)this.x.size());
          obj.put(p0, longx);
       }
       return longx.longValue();
    }
    public final b s1(){
       return this.w;
    }
    public void t(RecyclerView$ViewHolder p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "5")) {
          return;
       }
       a.p(p0, "viewHolder");
       p0 = p0.itemView;
       Objects.requireNonNull(p0, "null cannot be cast to non-null type android.widget.TextView");
       ContactTargetItem uContactTarg = this.N0(p1);
       if (uContactTarg != null) {
          uContactTarg = uContactTarg.mFirstLetter;
          if (uContactTarg != null) {
          label_0032 :
             p0.setText(uContactTarg);
             return;
          }
       }
       a ty = this.y;
       goto label_0032 ;
    }
    public final void t1(b p0){
       this.w = p0;
    }
    public final a u1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "keyWord");
       this.z = p0;
       return this;
    }
    public final void v1(boolean p0){
       this.A = p0;
    }
}

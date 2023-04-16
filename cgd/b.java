package cgd.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import cgd.b$d;
import cgd.b$c;
import java.util.ArrayList;
import java.util.HashSet;
import cgd.b$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import bgd.a;
import com.kwai.framework.cache.a;
import java.lang.Boolean;
import java.util.Map;
import v56.g;
import java.lang.Integer;
import java.util.Set;
import cgd.b$b;
import java.util.List;
import java.util.Objects;
import java.lang.CharSequence;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import java.lang.StringBuilder;
import android.widget.FrameLayout;
import android.widget.Space;
import android.view.View;
import com.kwai.library.widget.button.SlipSwitchButton;
import cgd.c;
import android.view.View$OnClickListener;
import android.widget.Button;
import cgd.a;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup;
import i2b.a;
import android.view.ViewGroup$LayoutParams;

public class b extends RecyclerView$Adapter	// class@000322
{
    public final String e;
    public final int f;
    public final List g;
    public final b$d h;
    public final b$c i;
    public final Set j;
    public final View$OnClickListener k;

    public void b(b$d p0,b$c p1){
       super();
       this.e = "CacheDetailAdapter";
       this.f = 999;
       this.g = new ArrayList();
       this.j = new HashSet();
       this.k = new b$a(this);
       this.h = p0;
       this.i = p1;
    }
    public static String J0(long p0){
       Object[] obj;
       String str;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, uob, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       float f = 1024.00f;
       float f1 = (float)p0 / f;
       if (f1 - 0x49800000 > 0) {
          obj = new Object[]{Float.valueOf(((f1 / f) / f))};
          str = String.format("%.2fGB", obj);
       }else if(f1 - f > 0){
          obj = new Object[]{Float.valueOf((f1 / f))};
          str = String.format("%.2fMB", obj);
       }else {
          Object[] objArray = new Object[]{Float.valueOf(f1)};
          str = String.format("%.2fKB", objArray);
       }
       return str;
    }
    public a K0(String p0,Long p1,Long p2){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = PatchProxy.applyOneRefs(p0, null, a.class, "22");
       int i = 1;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          Map o = a.o;
          b = (o.get(p0) != null && (o.get(p0).intValue() & g.d()))? true: false;
       }
       a uoa = new a(p0, p1.longValue(), true, p2.longValue(), b);
       if (b && p1.longValue() - p2.longValue() < 0) {
          Object[] objArray = new Object[]{p0,p1,p2};
          String.format("init Adapter error! %s cache size\( %d \) is smaller than predownload size\( %d \) when predownload can clear! ", objArray);
          obj.f((p1.longValue() + p2.longValue()));
       }
       return obj;
    }
    public boolean L0(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.j.contains(p0);
    }
    public boolean M0(long p0){
       Object[] obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 1;
       if (p0 - null > 0) {
          obj = new Object[i];
          obj[0] = Float.valueOf(((float)p0 / 1024.00f));
          if (!(String.format("%.2f", obj)).equals("0.00")) {
          label_0041 :
             return i;
          }
       }
       i = false;
       goto label_0041 ;
    }
    public void N0(b$b p0,int p1){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "8")) {
          return;
       }
       a uoa = this.g.get(p1);
       Objects.requireNonNull(p0);
       b$b uob1 = b$b.class;
       if (!PatchProxy.isSupport(uob1) || !PatchProxy.applyVoidTwoRefs(uoa, Integer.valueOf(p1), p0, uob1, "2")) {
          String str = uoa.c();
          p0.c.setText(str);
          p0.d.setText(b.J0(uoa.d()));
          b = true;
          if (uoa.a()) {
             p0.a.setChecked(b);
             p0.a.setButtonDrawable(R.drawable.arg_RES_7f082547);
          }else {
             p0.a.setChecked(false);
             p0.a.setButtonDrawable(R.drawable.arg_RES_7f082546);
          }
          p0.a.setClickable(false);
          p0.k.setTag(Integer.valueOf(p1));
          if (p0.n.L0(str)) {
             String str1 = a.d(str, false);
             String str2 = a.d(str, b);
             if (p0.n.M0(uoa.e())) {
                Object[] objArray = new Object[b];
                objArray[0] = b.J0(uoa.e());
                str1 = String.format(str1+"\(%s\)", objArray);
             }
             p0.e.setText(str1);
             p0.f.setText(str2);
             p0.l.setVisibility(false);
             p0.i.setVisibility(false);
             p0.m.setClickable(false);
             p0.m.setSwitch(uoa.b());
             p0.b.setOnClickListener(new c(p0, uoa, p1, str));
          }else {
             String str3 = uoa.c();
             if (PatchProxy.isSupport(uob1)) {
                List obj = PatchProxy.applyTwoRefs(str3, Integer.valueOf(p1), p0, uob1, "4");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                label_0107 :
                   obj = a.n;
                   if (obj.contains(str3)) {
                      int i = p1 + 1;
                      if (p0.n.g.size() <= i || obj.contains(p0.n.g.get(i).c())) {
                      }
                   }else {
                   }
                }
             }else {
                goto label_0107 ;
             }
             if (b) {
                p0.g.setVisibility(false);
             }
          }
       }
       return;
    }
    public void O0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       Collections.sort(p0, a.b);
       return;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.g.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       this.N0(p0, p1);
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, b.class, "9")) {
          if (p2 == null || !p2.size()) {
             this.N0(p0, p1);
          }else {
             a uoa = this.g.get(p1);
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoidOneRefs(uoa, p0, b$b.class, "1")) {
                p0.d.setText(b.J0(uoa.d()));
                b i = p0.n.i;
                if (i != null) {
                   i.a();
                }
             }
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       b$b uob1;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          uob1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "7");
          if (uob1 != PatchProxyResult.class) {
          label_0033 :
             return uob1;
          }
       }
       View view = a.i(p0, R.layout.arg_RES_7f0d01ab);
       view.setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
       uob1 = new b$b(this, view);
       uob1.setIsRecyclable(false);
       goto label_0033 ;
    }
}

package fgd.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import fgd.g;
import fgd.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Iterator;
import java.util.List;
import bgd.a;
import java.lang.Integer;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Button;
import lnc.a1;
import java.lang.CharSequence;
import android.widget.LinearLayout;
import cgd.b;
import android.widget.TextView;
import android.app.Activity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import k2b.e0;
import k2b.u1;
import ekd.m1;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.yxcorp.widget.selector.view.SelectShapeButton;
import fgd.c;
import android.view.View$OnClickListener;
import android.content.Context;
import android.content.res.ColorStateList;
import androidx.core.content.ContextCompat;
import bld.b;
import com.yxcorp.widget.KwaiRadiusStyles;
import bld.c;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import fgd.b;
import fgd.a;
import cgd.b$d;
import cgd.b$c;
import java.util.Map;
import com.yxcorp.plugin.setting.cache.CachePreferenceUtils;
import v56.g;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Long;
import java.util.Collection;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class k extends PresenterV2	// class@000e2a
{
    public final b$d A;
    public final b$c B;
    public RecyclerView p;
    public SelectShapeButton q;
    public TextView r;
    public SelectShapeButton s;
    public LinearLayout t;
    public b u;
    public LinearLayoutManager v;
    public b w;
    public List x;
    public final List y;
    public final AtomicBoolean z;
    public static final Object C;

    static {
       k.C = new Object();
    }
    public void k(){
       super();
       this.w = null;
       this.x = new ArrayList();
       this.y = new ArrayList();
       this.z = new AtomicBoolean(true);
       this.A = new g(this);
       this.B = new f(this);
    }
    public void E8(){
       PatchProxy.applyVoid(null, this, k.class, "3");
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       k tw = this.w;
       if (tw != null) {
          tw.dispose();
       }
       return;
    }
    public final long P8(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, ok, "7");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       long l = 0;
       Iterator iterator = this.x.iterator();
       while (iterator.hasNext()) {
          a uoa = iterator.next();
          if (p0 || uoa.a()) {
             l = l + uoa.d();
          }
       }
       return l;
    }
    public final void R8(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ok, "5")) {
          return;
       }
       View view = this.v.findViewByPosition(p0);
       a uoa = this.x.get(p0);
       if (view != null) {
          CheckBox uCheckBox = view.findViewById(R.id.cache_detail_item_checkbox);
          if (uoa.a()) {
             uCheckBox.setChecked(false);
             uCheckBox.setButtonDrawable(R.drawable.arg_RES_7f082546);
          }else {
             uCheckBox.setChecked(1);
             uCheckBox.setButtonDrawable(R.drawable.arg_RES_7f082547);
          }
       }
       uoa.c = uoa.a() ^ 1;
       return;
    }
    public final void S8(){
       boolean b;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "10")) {
          return;
       }
       String str = "0.00MB";
       int i = 0x7f104601;
       if (!this.x.size()) {
          this.q.setEnabled(false);
          this.s.setEnabled(false);
          this.s.setText(a1.p(i));
          this.t.setVisibility(false);
       }else if(!this.P8(false)){
          this.q.setEnabled(false);
          this.s.setEnabled(1);
       }else {
          str = b.J0(this.P8(false));
          this.q.setEnabled(1);
       }
       Iterator obj = PatchProxy.apply(objArray, this, ok, "8");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.x.iterator();
          while (true) {
             if (obj.hasNext()) {
                if (!obj.next().a()) {
                   b = false;
                }
             }else {
                b = true;
             }
          }
       }
       if (b) {
          this.s.setText(a1.p(R.string.arg_RES_7f1004c1));
          this.s.setSelected(1);
       }else {
          this.s.setSelected(false);
          this.s.setText(a1.p(i));
       }
       Object[] objArray1 = new Object[]{str};
       this.r.setText(String.format((a1.p(R.string.arg_RES_7f100466)).replace('@', 's'), objArray1));
       return;
    }
    public final void V8(Activity p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k.class, "12")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = p1;
       uElementPack.params = p2;
       uElementPack.type = 13;
       u1.B(new ClickMetaData().setLogPage(p0.N2()).setElementPackage(uElementPack));
       return;
    }
    public void doBindView(View p0){
       k ok = k.class;
       String str = "2";
       if (PatchProxy.applyVoidOneRefs(p0, this, ok, str)) {
          return;
       }
       KwaiActionBar kwaiActionBa = m1.f(p0, R.id.clear_title_root);
       kwaiActionBa.i(R.drawable.arg_RES_7f0819d9);
       kwaiActionBa.r(a1.p(R.string.arg_RES_7f100463));
       this.q = m1.f(p0, 0x7f0a05f2);
       this.r = m1.f(p0, 0x7f0a05f1);
       this.s = m1.f(p0, 0x7f0a05f8);
       this.t = m1.f(p0, 0x7f0a0d12);
       this.q.setOnClickListener(new c(this));
       this.q.setTextColor(ContextCompat.getColorStateList(this.getContext(), R.color.arg_RES_7f060137));
       b uob = new b();
       b uob1 = new b();
       uob1.v(a1.a(R.color.arg_RES_7f061b2b));
       KwaiRadiusStyles fULL = KwaiRadiusStyles.FULL;
       uob1.g(fULL);
       uob.o(uob1.a());
       uob1 = new b();
       uob1.v(a1.a(R.color.arg_RES_7f061b2b));
       uob1.g(fULL);
       uob.z(uob1.a());
       uob1 = new b();
       uob1.v(a1.a(R.color.arg_RES_7f061b29));
       uob1.g(fULL);
       uob.A(uob1.a());
       this.q.setBackgroundDrawable(uob.a());
       this.p = m1.f(p0, 0x7f0a073d);
       m1.a(p0, new b(this), R.id.left_btn);
       this.s.setOnClickListener(new a(this));
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, ok, "6")) {
          b uob2 = new b(this.A, this.B);
          this.u = uob2;
          Map map = CachePreferenceUtils.a();
          HashMap hashMap = PatchProxy.apply(objArray, objArray, CachePreferenceUtils.class, str);
          if (hashMap != patchProxyRe) {
          }else {
             Type a = CachePreferenceUtils.a;
             String str1 = g.a.getString("PreDownloadCacheMap", "null");
             if (str1 != null && str1 != "") {
                objArray = b.a(str1, a);
             }
             if (objArray == null) {
                hashMap = new HashMap();
             }else {
                hashMap = objArray;
             }
          }
          b uob3 = b.class;
          uob1 = PatchProxy.applyTwoRefs(map, hashMap, uob2, uob3, "1");
          if (uob1 != patchProxyRe) {
          }else {
             Objects.toString(map);
             Objects.toString(hashMap);
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = map.entrySet().iterator();
             long l = 0;
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                if (uob2.M0(uEntry.getValue().longValue()) || hashMap.containsKey(uEntry.getKey())) {
                   String key = uEntry.getKey();
                   Long value = uEntry.getValue();
                   Long obj = PatchProxy.applyTwoRefs(hashMap, key, uob2, uob3, "5");
                   if (obj != patchProxyRe) {
                      l = obj.longValue();
                   }else {
                      obj = hashMap.get(key);
                      if (obj != null) {
                         l = obj.longValue();
                      }
                   }
                   uArrayList.add(uob2.K0(key, value, Long.valueOf(l)));
                }
             }
             Iterator iterator1 = hashMap.entrySet().iterator();
             while (iterator1.hasNext()) {
                Map$Entry uEntry1 = iterator1.next();
                String key1 = uEntry1.getKey();
                if (!map.containsKey(key1)) {
                   uArrayList.add(uob2.K0(key1, Long.valueOf(l), uEntry1.getValue()));
                }
                uob2.j.add(key1);
             }
             uob2.O0(uArrayList);
             uob2.g.clear();
             uob2.g.addAll(uArrayList);
             uob1 = uob2.g;
          }
          this.x = uob1;
          this.S8();
       }
       LinearLayoutManager linearLayout = new LinearLayoutManager(this.getContext());
       this.v = linearLayout;
       this.p.setLayoutManager(linearLayout);
       this.p.setAdapter(this.u);
       return;
    }
    public void j8(){
       PatchProxy.applyVoid(null, this, k.class, "1");
    }
}

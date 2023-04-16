package com.yxcorp.gifshow.homepage.kcube.KCubeStripViewPager$a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d$b;
import h3.a;
import com.yxcorp.gifshow.homepage.kcube.KCubeStripViewPager;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.homepage.kcube.n;
import wq6.c;
import wq6.f;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import wq6.h;
import wq6.g;
import java.util.Map;
import tra.b;
import java.lang.StringBuilder;
import java.util.List;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import q87.c;
import java.lang.Number;
import com.kwai.kcube.TabIdentifier;
import on5.n;
import android.view.View;
import ok.k;
import com.kwai.library.widget.textview.IconifyRadioButtonNew;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import com.kwai.library.widget.textview.IconifyTextViewNew;
import android.content.res.ColorStateList;
import androidx.core.content.ContextCompat;
import android.graphics.Typeface;
import android.text.TextPaint;
import wn5.b;
import java.lang.CharSequence;

public class KCubeStripViewPager$a extends a implements PagerSlidingTabStrip$d$b	// class@0016e7
{
    public Map d;
    public List e;
    public final KCubeStripViewPager f;

    public void KCubeStripViewPager$a(KCubeStripViewPager p0){
       this.f = p0;
       super();
       this.d = new HashMap();
       if (PatchProxy.applyVoid(null, this, KCubeStripViewPager$a.class, "1")) {
       }else {
          this.z();
          p0.b.v(new n(this));
       }
       return;
    }
    public PagerSlidingTabStrip$d b(int p0){
       h obj;
       KCubeStripViewPager$a uoa = KCubeStripViewPager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.f.b.U(p0);
       PagerSlidingTabStrip$d uod = this.d.get(obj);
       if (uod == null) {
          b.C().e("KCubeHomeStripViewPager", "tabStrip of "+obj+" is null, tab position : "+p0+", current kcube tab list : "+this.f.b.getChildren()+", before kcube tab list : "+this.e, new IllegalStateException());
       }
       return uod;
    }
    public int c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KCubeStripViewPager$a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.b.P(n.a(p0));
    }
    public String d(int p0){
       KCubeStripViewPager$a uoa = KCubeStripViewPager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return n.e(this.f.b.U(p0).M2());
    }
    public PagerSlidingTabStrip$d e(String p0){
       h obj = PatchProxy.applyOneRefs(p0, this, KCubeStripViewPager$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f.b.H(n.a(p0));
       PagerSlidingTabStrip$d uod = this.d.get(obj);
       if (uod == null) {
          Object[] objArray = new Object[0];
          b.C().t("KCubeHomeStripViewPager", "tabStrip of "+obj+" is null, tab id : "+p0+", current kcube tab list : "+this.f.b.getChildren()+", before kcube tab list : "+this.e, objArray);
       }
       return uod;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, KCubeStripViewPager$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.size();
    }
    public boolean p(View p0,Object p1){
       return false;
    }
    public void z(){
       Object[] objArray1;
       if (PatchProxy.applyVoid(null, this, KCubeStripViewPager$a.class, "2")) {
          return;
       }
       List children = this.f.b.getChildren();
       if (k.a(this.e, children)) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("KCubeHomeStripViewPager", "refreshData old list : "+this.e+" new list : "+children, objArray);
       HashMap hashMap = new HashMap();
       for (int i = 0; i < children.size(); i = i + 1) {
          h oh = children.get(i);
          PagerSlidingTabStrip$d uod = this.d.get(oh);
          if (uod == null) {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             IconifyRadioButtonNew obj = PatchProxy.applyOneRefs(oh, this, KCubeStripViewPager$a.class, "3");
             if (obj != patchProxyRe) {
                uod = obj;
             }else {
                obj = PatchProxy.apply(null, this, KCubeStripViewPager$a.class, "4");
                if (obj != patchProxyRe) {
                }else {
                   obj = new IconifyRadioButtonNew(this.f.getContext());
                   obj.setLayoutParams(new ViewGroup$LayoutParams(-2, a1.d(R.dimen.arg_RES_7f070fdf)));
                   obj.setTextSize((float)a1.d(R.dimen.arg_RES_7f070f71));
                   obj.setAutoTextSize(0);
                   obj.setTextColor(ContextCompat.getColorStateList(this.f.getContext(), R.color.arg_RES_7f061f54));
                   obj.k((float)a1.e(0x3fc00000));
                   obj.j(ContextCompat.getColor(this.f.getContext(), R.color.arg_RES_7f06008d));
                   obj.setTriangleRadius((float)a1.e(0x3f800000));
                   obj.setTypeface(Typeface.defaultFromStyle(0));
                   obj.getTextPaint().setFakeBoldText(true);
                }
                b uob = oh.q("KEY_TAB_NAME_DEST");
                obj.setText(uob.c());
                obj.setContentDescription(uob.c());
                obj.setTag(oh.M2().getType());
                uod = new PagerSlidingTabStrip$d(oh.M2().getType(), obj);
             }
             objArray1 = new Object[0];
             b.C().w("KCubeHomeStripViewPager", "create tabStrip of "+oh, objArray1);
          }else {
             objArray1 = new Object[0];
             b.C().w("KCubeHomeStripViewPager", "reuse tabStrip of "+oh, objArray1);
          }
          hashMap.put(oh, uod);
       }
       this.d = hashMap;
       this.e = children;
       return;
    }
}

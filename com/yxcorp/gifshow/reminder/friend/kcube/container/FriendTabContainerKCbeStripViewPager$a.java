package com.yxcorp.gifshow.reminder.friend.kcube.container.FriendTabContainerKCbeStripViewPager$a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d$b;
import h3.a;
import com.yxcorp.gifshow.reminder.friend.kcube.container.FriendTabContainerKCbeStripViewPager;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import wq6.g;
import ok.k;
import zcc.o;
import java.lang.StringBuilder;
import q87.c;
import wq6.h;
import java.util.Map;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import ekd.p1;
import com.kwai.library.widget.textview.KwaiIconifyRadioButtonNew;
import android.text.TextPaint;
import wn5.b;
import java.lang.CharSequence;
import com.kwai.library.widget.textview.KwaiIconifyTextViewNew;
import lnc.a1;
import android.graphics.Typeface;
import com.kwai.kcube.TabIdentifier;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.lang.Number;
import on5.n;
import com.yxcorp.gifshow.reminder.friend.kcube.container.FriendTabContainerKCbeStripViewPager$a$a;
import wq6.c;
import wq6.f;

public class FriendTabContainerKCbeStripViewPager$a extends a implements PagerSlidingTabStrip$d$b	// class@001aab
{
    public Map d;
    public List e;
    public final FriendTabContainerKCbeStripViewPager f;

    public void FriendTabContainerKCbeStripViewPager$a(FriendTabContainerKCbeStripViewPager p0){
       this.f = p0;
       super();
       this.d = new HashMap();
       this.z();
    }
    public void A(){
       Object[] objArray1;
       FriendTabContainerKCbeStripViewPager$a uoa = FriendTabContainerKCbeStripViewPager$a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "2")) {
          return;
       }
       List children = this.f.b.getChildren();
       if (k.a(this.e, children)) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("KCubeHomeStripViewPager", "refreshData old list : "+this.e+" new list : "+children, objArray);
       HashMap hashMap = new HashMap();
       for (int i = 0; i < children.size(); i = i + 1) {
          h oh = children.get(i);
          PagerSlidingTabStrip$d uod = this.d.get(oh);
          if (uod == null) {
             uod = PatchProxy.applyOneRefs(oh, this, uoa, "3");
             if (uod != PatchProxyResult.class) {
             }else {
                KwaiIconifyRadioButtonNew kwaiIconifyR = p1.g(this.f.getContext(), R.layout.arg_RES_7f0d0538);
                kwaiIconifyR.getTextPaint().setFakeBoldText(true);
                b uob = oh.q("KEY_TAB_NAME_DEST");
                kwaiIconifyR.setContentText(uob.c());
                kwaiIconifyR.setContentDescription(uob.c());
                kwaiIconifyR.d();
                kwaiIconifyR.setContentTextColor(a1.a(R.color.arg_RES_7f061f86));
                kwaiIconifyR.setTypeface(Typeface.DEFAULT);
                kwaiIconifyR.setTag(oh.M2().getType());
                PagerSlidingTabStrip$d uod1 = new PagerSlidingTabStrip$d(oh.M2().getType(), kwaiIconifyR);
                uod1.g(0);
                uod = uod1;
             }
             objArray1 = new Object[0];
             o.C().w("KCubeHomeStripViewPager", "create tabStrip of "+oh, objArray1);
          }else {
             objArray1 = new Object[0];
             o.C().w("KCubeHomeStripViewPager", "reuse tabStrip of "+oh, objArray1);
          }
          hashMap.put(oh, uod);
       }
       this.d = hashMap;
       this.e = children;
       FriendTabContainerKCbeStripViewPager d = this.f.d;
       if (d != null) {
          d.q();
       }
       return;
    }
    public PagerSlidingTabStrip$d b(int p0){
       h obj;
       FriendTabContainerKCbeStripViewPager$a uoa = FriendTabContainerKCbeStripViewPager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.f.b.U(p0);
       PagerSlidingTabStrip$d uod = this.d.get(obj);
       if (uod == null) {
          o.C().e("KCubeHomeStripViewPager", "tabStrip of "+obj+" is null, tab position : "+p0+", current kcube tab list : "+this.f.b.getChildren()+", before kcube tab list : "+this.e, new IllegalStateException());
       }
       return uod;
    }
    public int c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FriendTabContainerKCbeStripViewPager$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.b.P(n.a(p0));
    }
    public String d(int p0){
       FriendTabContainerKCbeStripViewPager$a uoa = FriendTabContainerKCbeStripViewPager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return n.e(this.f.b.U(p0).M2());
    }
    public PagerSlidingTabStrip$d e(String p0){
       h obj = PatchProxy.applyOneRefs(p0, this, FriendTabContainerKCbeStripViewPager$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f.b.H(n.a(p0));
       PagerSlidingTabStrip$d uod = this.d.get(obj);
       if (uod == null) {
          Object[] objArray = new Object[0];
          o.C().t("KCubeHomeStripViewPager", "tabStrip of "+obj+" is null, tab id : "+p0+", current kcube tab list : "+this.f.b.getChildren()+", before kcube tab list : "+this.e, objArray);
       }
       return uod;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, FriendTabContainerKCbeStripViewPager$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.size();
    }
    public boolean p(View p0,Object p1){
       return false;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, FriendTabContainerKCbeStripViewPager$a.class, "1")) {
          return;
       }
       this.A();
       this.f.b.v(new FriendTabContainerKCbeStripViewPager$a$a(this));
       return;
    }
}

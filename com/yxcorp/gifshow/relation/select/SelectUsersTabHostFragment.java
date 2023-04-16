package com.yxcorp.gifshow.relation.select.SelectUsersTabHostFragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.lang.String;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.gifshow.relation.select.SelectUsersTabHostFragment$c;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.relation.select.model.SelectUsersTabData;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.yxcorp.gifshow.relation.select.SelectUsersTabHostFragment$b;
import com.yxcorp.gifshow.relation.select.SelectUsersFragment;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.TextView;
import lnc.a1;
import rbc.a;
import ubc.b;
import com.yxcorp.gifshow.relation.select.model.SelectUsersConfigParams;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.relation.select.SelectUsersTabHostFragment$a;
import androidx.viewpager.widget.ViewPager$i;

public class SelectUsersTabHostFragment extends TabHostFragment	// class@00198b
{
    public SelectUsersTabHostFragment$c B;
    public boolean C;
    public b D;
    public View E;
    public a F;
    public boolean G;

    public void SelectUsersTabHostFragment(){
       super();
       this.G = true;
    }
    public static PagerSlidingTabStrip$d Qh(int p0,String p1){
       PagerSlidingTabStrip$d obj;
       if (PatchProxy.isSupport(SelectUsersTabHostFragment.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, SelectUsersTabHostFragment.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PagerSlidingTabStrip$d(p0+"");
       obj.k(p1);
       return obj;
    }
    public void Rh(){
       if (PatchProxy.applyVoid(null, this, SelectUsersTabHostFragment.class, "7")) {
          return;
       }
       this.C = true;
       this.Sh().b.onNext(Boolean.TRUE);
       return;
    }
    public SelectUsersTabHostFragment$c Sh(){
       Object obj = PatchProxy.apply(null, this, SelectUsersTabHostFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.B == null) {
          this.B = new SelectUsersTabHostFragment$c();
       }
       return this.B;
    }
    public final b Th(SelectUsersTabData p0){
       Bundle uBundle1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, SelectUsersTabHostFragment.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       PagerSlidingTabStrip$d uod = SelectUsersTabHostFragment.Qh(p0.tabType, p0.tabTitle);
       Bundle uBundle = PatchProxy.applyOneRefs(p0, this, SelectUsersTabHostFragment.class, "6");
       if (uBundle != patchProxyRe) {
       }else if(this.getArguments() != null){
          uBundle1 = new Bundle(this.getArguments());
       }else {
          uBundle1 = new Bundle();
       }
       uBundle = uBundle1;
       SerializableHook.putSerializable(uBundle, "key_select_tab_data", p0);
       SerializableHook.putSerializable(uBundle, "key_select_is_multi_select", Boolean.valueOf(this.C));
       return new SelectUsersTabHostFragment$b(this, uod, SelectUsersFragment.class, uBundle);
    }
    public void Uh(int p0){
       if (PatchProxy.isSupport(SelectUsersTabHostFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SelectUsersTabHostFragment.class, "2")) {
          return;
       }
       PagerSlidingTabStrip pagerSliding = this.zh();
       int i = 0;
       while (i < pagerSliding.getTabsContainer().getChildCount()) {
          TextView childAt = pagerSliding.getTabsContainer().getChildAt(i);
          if (i == p0) {
             childAt.setTextColor(a1.a(R.color.arg_RES_7f061642));
             childAt.setSelected(true);
             childAt.invalidate();
          }else {
             childAt.setTextColor(a1.a(R.color.arg_RES_7f061673));
             childAt.setSelected(false);
             childAt.invalidate();
          }
          i = i + 1;
       }
       return;
    }
    public void Vh(a p0){
       this.F = p0;
    }
    public void Wh(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectUsersTabHostFragment.class, "8")) {
          return;
       }
       this.Sh().c.onNext(p0);
       return;
    }
    public void Xh(SelectUsersConfigParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectUsersTabHostFragment.class, "9")) {
          return;
       }
       this.C = p0.isMultiSelect();
       if (!p0.getTabList().size()) {
          return;
       }
       ArrayList uArrayList = new ArrayList(p0.getTabList());
       ArrayList uArrayList1 = new ArrayList();
       SelectUsersTabHostFragment tD = this.D;
       if (tD != null) {
          tD.e(SelectUsersTabHostFragment.Qh(p0.getTabList().get(0).tabType, p0.getTabList().get(0).tabTitle));
          uArrayList1.add(this.D);
       }
       p0.G = uArrayList.get(0);
       uArrayList.remove(0);
       Iterator iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          uArrayList1.add(this.Th(iterator.next()));
       }
       this.Kh(uArrayList1);
       this.Nh((uArrayList1.size() - 1));
       if (uArrayList1.size() > 1) {
          SelectUsersTabHostFragment tE = this.E;
          if (tE != null) {
             tE.setVisibility(0);
          }
       }
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d14af;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SelectUsersTabHostFragment.class, "1")) {
          return;
       }
       this.Mh(0);
       this.Lh("0");
       super.onViewCreated(p0, p1);
       this.t.setTabGravity(17);
       this.E = p0.findViewById(0x7f0a3c8b);
       this.t.A(0, 1);
       this.t.setOnPageChangeListener(new SelectUsersTabHostFragment$a(this));
       return;
    }
    public List wh(){
       ArrayList obj = PatchProxy.apply(null, this, SelectUsersTabHostFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       b uob = this.Th(new SelectUsersTabData());
       this.D = uob;
       obj.add(uob);
       return obj;
    }
}

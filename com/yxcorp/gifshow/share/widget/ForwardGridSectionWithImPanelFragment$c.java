package com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment$c;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$d;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import uo7.i0;
import android.view.View;
import com.kwai.sharelib.model.ShareInitResponse$ThemeItemElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import com.yxcorp.gifshow.share.im.ImSharePanelElement;
import android.widget.CheckBox;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import uo7.k0;
import gic.g;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.kwai.feature.api.social.message.imshare.model.IMShareTarget;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionWithImPanelFragment$d;
import com.smile.gifmaker.mvps.utils.observable.ObservableList;
import java.lang.Number;

public class ForwardGridSectionWithImPanelFragment$c extends ForwardGridSectionFragment$d	// class@001ce0
{
    public final ForwardGridSectionWithImPanelFragment d;

    public void ForwardGridSectionWithImPanelFragment$c(ForwardGridSectionWithImPanelFragment p0,ForwardGridSectionWithImPanelFragment p1){
       this.d = p0;
       super(p1);
    }
    public void b(i0 p0,View p1,int p2,int p3,int p4,ShareInitResponse$ThemeItemElement p5){
       List list;
       ForwardGridSectionWithImPanelFragment$c uoc = ForwardGridSectionWithImPanelFragment$c.class;
       int i = 1;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
             return;
          }
       }
       if (p2 == i) {
          if (this.d.Z0 != null) {
             super.b(p0, p1, p2, p3, p4, p5);
             p1.findViewById(R.id.checkbox).setVisibility(0);
             if (p0.a() instanceof ImSharePanelElement && p0.a().isMoreBtn()) {
                p1.findViewById(R.id.checkbox).setVisibility(4);
             }
             CheckBox uCheckBox = p1.findViewById(R.id.checkbox);
             ForwardGridSectionWithImPanelFragment$c td = this.d;
             Objects.requireNonNull(td);
             g obj = PatchProxy.applyOneRefs(p0, td, ForwardGridSectionWithImPanelFragment.class, "16");
             if (obj != PatchProxyResult.class) {
                i = obj.booleanValue();
             }else {
                obj = null;
                if (p0 instanceof k0) {
                   k0 ok0 = p0;
                   if (ok0.b() instanceof g) {
                      list = ok0.b().c();
                   }else if(p0 instanceof g){
                      list = p0.c();
                   }
                }else {
                   goto label_00a4 ;
                }
                if (!q.f(list)) {
                   Object obj1 = list.get(0);
                   if (!obj1 instanceof IMShareTarget || !td.Y0.d.contains(obj1)) {
                   }
                }
             }
             uCheckBox.setChecked(i);
             if (ForwardGridSectionWithImPanelFragment.ji(p0)) {
                p1.findViewById(R.id.avatar_ring).setVisibility(0);
             }else {
                p1.findViewById(R.id.avatar_ring).setVisibility(4);
             }
             p1.findViewById(R.id.rtc_label).setVisibility(4);
             p1.findViewById(R.id.online_badge).setVisibility(4);
          }else {
             p1.findViewById(R.id.checkbox).setVisibility(4);
             super.b(p0, p1, p2, p3, p4, p5);
             if (ForwardGridSectionWithImPanelFragment.ji(p0)) {
                p1.findViewById(R.id.avatar_ring).setVisibility(0);
                p1.findViewById(R.id.rtc_label).setVisibility(0);
                p1.findViewById(R.id.online_badge).setVisibility(4);
             }else {
                p1.findViewById(R.id.avatar_ring).setVisibility(4);
                p1.findViewById(R.id.rtc_label).setVisibility(4);
             }
          }
       }else {
          super.b(p0, p1, p2, p3, p4, p5);
       }
       return;
    }
    public int i(int p0){
       ForwardGridSectionWithImPanelFragment$c uoc = ForwardGridSectionWithImPanelFragment$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0 == 1) {
          return 0x7f0d0614;
       }else {
          return super.i(p0);
       }
    }
}

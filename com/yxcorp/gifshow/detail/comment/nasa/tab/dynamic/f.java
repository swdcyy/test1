package com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.f;
import com.kwai.component.tabs.panel.h$b;
import com.kwai.component.tabs.panel.h;
import com.kuaishou.android.model.mix.DynamicTabInfo;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.CharSequence;
import ix9.g;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.entity.QPhoto;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.tabs.panel.TabsPanelHostFragment;

public class f extends h$b	// class@001391
{
    public QPhoto w;
    public TabsPanelHostFragment x;
    public DynamicTabInfo y;

    public void f(h p0,DynamicTabInfo p1){
       super(p0);
       this.y = p1;
    }
    public void E8(){
       f uof = f.class;
       if (PatchProxy.applyVoid(null, this, uof, "2")) {
          return;
       }
       super.E8();
       if (!PatchProxy.applyVoid(null, this, uof, "3")) {
          this.W8((long)this.y.mTitleSubCount.intValue(), this.y.mTabName);
       }
       this.Y8(new g(this));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       super.j8();
       this.w = this.q8(QPhoto.class);
       this.x = this.q8(TabsPanelHostFragment.class);
       return;
    }
}

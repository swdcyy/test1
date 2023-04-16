package com.yxcorp.gifshow.growth.home.pymk.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.growth.home.pymk.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vna.w;
import android.view.View$OnClickListener;
import android.widget.Button;
import com.yxcorp.gifshow.growth.home.pymk.h;
import vna.u;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.framework.model.user.User;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import vna.t;
import androidx.viewpager2.widget.ViewPager2;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.entity.RecommendUserWrapper;
import android.view.View;
import ekd.m1;
import android.view.ViewGroup;
import com.yxcorp.widget.selector.view.SelectShapeButton;
import android.text.TextPaint;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import vna.b;
import io.reactivex.subjects.PublishSubject;

public class i extends PresenterV2	// class@0013a7
{
    public b p;
    public PublishSubject q;
    public PublishSubject r;
    public SelectShapeButton s;
    public Button t;
    public ViewPager2 u;
    public RecyclerView v;
    public BaseFragment w;
    public FollowHelper$a x;

    public void i(){
       super();
       this.x = g.a;
    }
    public void E8(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "5")) {
          i ts = this.s;
          if (ts != null) {
             ts.setOnClickListener(new w(this));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "6") && this.t != null) {
          this.R8();
          this.t.setOnClickListener(new h(this));
       }
       this.X7(this.q.subscribe(new u(this)));
       return;
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, i.class, "4");
    }
    public final User P8(){
       Object[] objArray = null;
       t obj = PatchProxy.apply(objArray, this, i.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.v.getAdapter();
       if (obj != null) {
          RecommendUserWrapper recommendUse = obj.r1(this.u.getCurrentItem());
          if (recommendUse != null) {
             objArray = recommendUse.mUser;
          }
       }
       return objArray;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, i.class, "8")) {
          return;
       }
       User user = this.P8();
       if (user != null && this.t != null) {
          if (user.isFollowingOrFollowRequesting()) {
             this.t.setSelected(true);
             this.t.setText(R.string.arg_RES_7f101021);
          }else {
             this.t.setSelected(false);
             this.t.setText(R.string.arg_RES_7f100f8f);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       ViewPager2 viewPager2 = m1.f(p0, R.id.video_recycler_view);
       this.u = viewPager2;
       this.v = viewPager2.getChildAt(0);
       this.s = m1.f(p0, 0x7f0a348f);
       this.t = m1.f(p0, 0x7f0a3490);
       i ts = this.s;
       if (ts != null) {
          ts.getPaint().setFakeBoldText(true);
       }
       ts = this.t;
       if (ts != null) {
          ts.getPaint().setFakeBoldText(true);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.w = this.s8(BaseFragment.class);
       this.p = this.q8(b.class);
       this.q = this.r8("FOLLOW_STATUS_CHANGE");
       this.r = this.r8("CHANGE_TO_NEXT_USER");
       return;
    }
}

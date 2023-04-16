package etb.d0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxTextOnlyItem;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import com.yxcorp.utility.n;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import etb.c0;
import erd.o;
import t45.d;
import brd.z;
import etb.b0;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import ekd.m1;
import com.yxcorp.gifshow.widget.MultiLineEllipsizeTextView;
import android.text.method.MovementMethod;
import android.text.method.LinkMovementMethod;
import etb.a0;
import android.view.View$OnClickListener;
import ctb.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Boolean;

public class d0 extends PresenterV2	// class@0027ee
{
    public View A;
    public a p;
    public NoticeBoxTextOnlyItem q;
    public RecyclerFragment r;
    public boolean s;
    public TextView t;
    public TextView u;
    public MultiLineEllipsizeTextView v;
    public View w;
    public View x;
    public View y;
    public View z;

    public void d0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "3")) {
          return;
       }
       this.v.setText(this.q.mContentSpannable);
       this.u.setText(this.q.mTime);
       this.t.setText(this.q.mTitle);
       d0 tt = this.t;
       int i = 8;
       int i1 = 0;
       int i2 = (TextUtils.x(this.q.mTitle))? 8: 0;
       tt.setVisibility(i2);
       this.P8();
       if (!TextUtils.x(this.q.mLinkUrl)) {
          i = 0;
       }
       View[] viewArray = new View[]{this.y,this.z,this.A};
       n.Z(i, viewArray);
       this.X7(this.q.observable().map(c0.b).distinctUntilChanged().observeOn(d.a).subscribe(new b0(this), Functions.d()));
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "5")) {
          return;
       }
       d0 tq = this.q;
       if (tq.mUnread != null && this.s == null) {
          if (TextUtils.x(tq.mTitle)) {
             this.x.setVisibility(0);
             this.w.setVisibility(8);
          }else {
             this.x.setVisibility(8);
             this.w.setVisibility(0);
          }
       }else {
          this.w.setVisibility(8);
          this.x.setVisibility(8);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d0.class, "1")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a2e3c);
       this.w = m1.f(p0, 0x7f0a2e39);
       this.x = m1.f(p0, 0x7f0a2e3a);
       this.u = m1.f(p0, 0x7f0a2e3f);
       this.v = m1.f(p0, 0x7f0a2e35);
       this.y = m1.f(p0, 0x7f0a2e38);
       this.z = m1.f(p0, 0x7f0a2e37);
       this.A = m1.f(p0, 0x7f0a2e13);
       this.v.setLinksClickable(true);
       this.v.setMovementMethod(LinkMovementMethod.getInstance());
       this.v.setHighlightColor(0);
       this.v.setClickable(0);
       this.v.setLongClickable(0);
       m1.a(p0, new a0(this), R.id.notice_box_item_detail_container);
       this.v.setMaxLines(3);
       d0 tv = this.v;
       tv.w = "...";
       tv.x = 0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d0.class, "2")) {
          return;
       }
       this.p = this.q8(a.class);
       this.q = this.q8(NoticeBoxTextOnlyItem.class);
       this.r = this.r8("NOTICE_BOX_FRAGMENT");
       this.s = this.r8("KEY_NOTICE_BOX_IS_UP_SCROLL_LOAD_MORE").booleanValue();
       return;
    }
}

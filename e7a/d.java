package e7a.d;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import e7a.d$a;
import nsd.u;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import crd.a;
import e7a.d$b;
import e7a.d$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import android.widget.TextView;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.danmaku.model.DanmakuInfo;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import nm5.e;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import bz6.c;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.utility.n;
import qrd.l1;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnLongClickListener;
import e7a.i;
import java.util.Map;
import java.util.HashMap;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import de5.a;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class d extends PresenterV2 implements g	// class@002084
{
    public View$OnLongClickListener A;
    public final d$c B;
    public PublishSubject p;
    public a q;
    public BaseFragment r;
    public QPhoto s;
    public NasaBizParam t;
    public TextView u;
    public SlidePlayViewModel v;
    public PhotoDetailParam w;
    public boolean x;
    public int y;
    public a z;
    public static final d$a C;

    static {
       d.C = new d$a(null);
    }
    public void d(){
       super();
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.p = publishSubje;
       this.z = new a();
       this.A = new d$b(this);
       this.B = new d$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "7")) {
          return;
       }
       d tr = this.r;
       String str = "mFragment";
       if (tr == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tr.getParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment.parentFragment\)");
       this.v = slidePlayVie;
       if (slidePlayVie == null) {
          a.S("mSlidePlayViewModel");
       }
       d tr1 = this.r;
       if (tr1 == null) {
          a.S(str);
       }
       slidePlayVie.P(tr1, this.B);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       d tu = this.u;
       if (tu != null) {
          tu.setVisibility(8);
       }
       tu = this.u;
       if (tu != null) {
          tu.setOnClickListener(null);
       }
       return;
    }
    public final DanmakuInfo P8(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       CommonMeta uCommonMeta = r1.w0(p0.mEntity);
       a.o(uCommonMeta, "FeedExt.getCommonMeta\(qPhoto.mEntity\)");
       return e.a(uCommonMeta);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       a.p(p0, "rootView");
       if (this.u == null) {
          TextView textView = new TextView(this.getContext());
          textView.setTextColor(0xffff0000);
          textView.setTextSize(14.00f);
          textView.setSingleLine(false);
          ViewGroup$MarginLayoutParams marginLayout = c.a.b(p0, -2, -2);
          marginLayout.topMargin = n.c(textView.getContext(), 310.00f);
          p0.addView(textView, marginLayout);
          textView.setOnLongClickListener(this.A);
          this.u = textView;
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new i());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.w = this.q8(PhotoDetailParam.class);
       this.q = this.s8(a.class);
       this.t = this.s8(NasaBizParam.class);
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.r = obj;
       this.s = this.q8(QPhoto.class);
       return;
    }
}

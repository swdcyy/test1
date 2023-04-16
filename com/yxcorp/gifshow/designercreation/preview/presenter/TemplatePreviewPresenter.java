package com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$pageList$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$dataSource$2;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$supportFragmentManager$2;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$controller$2;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$b;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$defaultLogPage$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ew6.a;
import com.yxcorp.gifshow.designercreation.pagelist.ProfileCreationTemplatePageList;
import java.util.List;
import qvb.a;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.designercreation.model.KwaiTemplate;
import bw6.a;
import android.content.Context;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.utility.SystemUtil;
import android.widget.TextView;
import nw9.a;
import java.lang.Runnable;
import android.view.View;
import com.yxcorp.gifshow.designercreation.logger.CreationReporter;
import k2b.e0;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import yw6.j;
import nw6.f;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.designercreation.preview.fragment.ItemPreviewFragment;
import com.yxcorp.gifshow.designercreation.logger.TemplateDefaultLogPage;
import ekd.m1;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$c;
import androidx.viewpager.widget.ViewPager$i;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$d;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$e;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.yxcorp.utility.n;

public final class TemplatePreviewPresenter extends PresenterV2	// class@00131a
{
    public final p A;
    public final p B;
    public final TemplatePreviewPresenter$b C;
    public final p D;
    public View p;
    public KwaiGrootViewPager q;
    public TextView r;
    public View s;
    public ImageView t;
    public View u;
    public String v;
    public KwaiTemplate w;
    public KwaiTemplate x;
    public final p y;
    public final p z;
    public static final TemplatePreviewPresenter$a E;

    static {
       TemplatePreviewPresenter.E = new TemplatePreviewPresenter$a(null);
    }
    public void TemplatePreviewPresenter(){
       super();
       this.v = "";
       this.y = s.c(new TemplatePreviewPresenter$pageList$2(this));
       this.z = s.c(new TemplatePreviewPresenter$dataSource$2(this));
       this.A = s.c(new TemplatePreviewPresenter$supportFragmentManager$2(this));
       this.B = s.c(new TemplatePreviewPresenter$controller$2(this));
       this.C = new TemplatePreviewPresenter$b(this);
       this.D = s.c(new TemplatePreviewPresenter$defaultLogPage$2(this));
    }
    public void E8(){
       Object[] objArray1;
       int i;
       CreationReporter b1;
       e0 uoe0;
       CharSequence text;
       TemplatePreviewPresenter templatePrev = TemplatePreviewPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, templatePrev, "7")) {
          return;
       }
       a uoa = this.P8();
       List items = this.V8().getItems();
       a.o(items, "pageList.items");
       Iterator iterator = items.iterator();
       while (true) {
          if (iterator.hasNext()) {
             objArray1 = iterator.next();
             String id = objArray1.getId();
             TemplatePreviewPresenter tw = this.w;
             String id1 = (tw != null)? tw.getId(): objArray;
             if (!a.g(id, id1)) {
                continue ;
             }
          }else {
             objArray1 = objArray;
          }
          uoa.e(objArray1);
          Context context = this.getContext();
          if (context != null) {
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             boolean b = a.g(qCurrentUser.getId(), this.v);
             TemplatePreviewPresenter tr = this.r;
             if (tr != null) {
                if (SystemUtil.M(context, "com.kwai.videoeditor")) {
                   i = (b)? 0x7f1031bd: 0x7f10138f;
                }else if(b){
                   i = 0x7f1031bc;
                }else {
                   i = 0x7f101386;
                }
                tr.setText(i);
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, templatePrev, "10")) {
             templatePrev = this.u;
             if (templatePrev != null) {
                templatePrev.post(new a(this));
             }
          }
          b1 = CreationReporter.b;
          uoe0 = this.S8();
          TemplatePreviewPresenter tr1 = this.r;
          if (tr1 != null) {
             text = tr1.getText();
             if (text != null) {
                break ;
             }
          }
          text = "";
          break ;
       }
       b1.c(uoe0, text);
       return;
    }
    public final a P8(){
       Object obj = PatchProxy.apply(null, this, TemplatePreviewPresenter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.B.getValue();
    }
    public final j R8(){
       Object obj = PatchProxy.apply(null, this, TemplatePreviewPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.getValue();
    }
    public final e0 S8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       TemplatePreviewPresenter templatePrev = TemplatePreviewPresenter.class;
       f obj = PatchProxy.apply(null, this, templatePrev, "9");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.P8().d("view_item_service");
       Fragment uFragment = (obj != null)? obj.b(): null;
       if (!uFragment instanceof ItemPreviewFragment) {
          uFragment = null;
       }
       if (uFragment == null) {
          Object obj1 = PatchProxy.apply(null, this, templatePrev, "5");
          uFragment = (obj1 != patchProxyRe)? obj1: this.D.getValue();
       }
    label_0043 :
       return uFragment;
    }
    public final ProfileCreationTemplatePageList V8(){
       Object obj = PatchProxy.apply(null, this, TemplatePreviewPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y.getValue();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TemplatePreviewPresenter.class, "8")) {
          return;
       }
       KwaiGrootViewPager kwaiGrootVie = m1.f(p0, R.id.template_preview_view_pager);
       this.q = kwaiGrootVie;
       if (kwaiGrootVie != null) {
          kwaiGrootVie.b(new TemplatePreviewPresenter$c(this));
       }
       this.r = m1.f(p0, 0x7f0a10d4);
       View view = m1.f(p0, R.id.go_to_kuaiying_btn);
       this.s = view;
       if (view != null) {
          view.setOnClickListener(new TemplatePreviewPresenter$d(this));
       }
       this.t = m1.f(p0, 0x7f0a1686);
       view = m1.f(p0, R.id.left_btn);
       this.p = view;
       if (view != null) {
          view.setOnClickListener(new TemplatePreviewPresenter$e(this));
       }
       Context context = this.getContext();
       if (context != null) {
          TemplatePreviewPresenter tp = this.p;
          int i = 0;
          ViewGroup$LayoutParams layoutParams = (tp != null)? tp.getLayoutParams(): i;
          if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
             i = layoutParams;
          }
          if (i != null) {
             i.topMargin = n.A(context);
          }
       }
       this.u = m1.f(p0, 0x7f0a0492);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, TemplatePreviewPresenter.class, "6")) {
          return;
       }
       this.v = this.r8("CREATION_USER_ID");
       KwaiTemplate kwaiTemplate = this.r8("CREATION_TEMPLATE");
       this.w = kwaiTemplate;
       this.x = kwaiTemplate;
       return;
    }
}

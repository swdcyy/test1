package com.yxcorp.plugin.setting.stencil.SettingItemListStencilFragment;
import com.yxcorp.gifshow.settings.page.SettingItemListFragment;
import com.yxcorp.plugin.setting.stencil.SettingItemListStencilFragment$a;
import nsd.u;
import ehd.c;
import com.yxcorp.plugin.setting.stencil.config.SettingPage;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.i3;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import android.content.Context;
import com.yxcorp.gifshow.settings.stencil.entity.SettingPageStencil;
import java.util.List;
import jhc.i;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import fhd.i;
import fhd.a;
import fhd.b;
import fhd.f;
import jhc.d;
import jhc.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import jhc.c;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Collection;
import com.yxcorp.gifshow.settings.stencil.entity.SettingLocalizedString;
import com.yxcorp.gifshow.settings.page.SettingItemListArguments;
import com.yxcorp.gifshow.settings.page.SettingItemListFragment$setArguments$1;
import msd.a;
import java.util.Objects;
import ehd.b;
import java.lang.Runnable;
import ekd.k1;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.lang.IllegalArgumentException;
import java.util.HashMap;
import android.view.View;
import com.kwai.sdk.switchconfig.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import brd.t;
import vgd.a;
import io.reactivex.g;
import t45.d;
import brd.z;
import wgd.a;
import vgd.m;
import erd.o;
import vgd.n;
import erd.g;
import brd.w;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.x;
import vgd.h;
import vgd.i;
import vgd.j;
import vgd.k;
import vgd.l;
import erd.a;
import crd.b;
import com.yxcorp.plugin.setting.stencil.d;
import com.yxcorp.plugin.setting.stencil.a;
import vgd.b;
import vgd.c;
import vgd.d;
import vgd.e;
import vgd.f;
import vgd.g;
import com.yxcorp.gifshow.settings.page.SettingItemListFragment$setTitle$1;

public class SettingItemListStencilFragment extends SettingItemListFragment	// class@0008f2
{
    public SettingPage o;
    public final c p;
    public HashMap q;
    public static final SettingItemListStencilFragment$a r;

    static {
       SettingItemListStencilFragment.r = new SettingItemListStencilFragment$a(null);
    }
    public void SettingItemListStencilFragment(){
       super();
       this.p = new c();
    }
    public static final SettingPage gh(SettingItemListStencilFragment p0){
       p0 = p0.o;
       if (p0 == null) {
          a.S("page");
       }
       return p0;
    }
    public int M(){
       return 1;
    }
    public String getPageParams(){
       i3 obj = PatchProxy.apply(null, this, SettingItemListStencilFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i3.f();
       obj.a("setting_stencil", Boolean.TRUE);
       String str = obj.e();
       a.o(str, "JsonStringBuilder.newIns¡­il\", true\)\n      .build\(\)");
       return str;
    }
    public String getUrl(){
       SettingItemListStencilFragment obj = PatchProxy.apply(null, this, SettingItemListStencilFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       if (obj == null) {
          a.S("page");
       }
       return obj.getPageUrl();
    }
    public final String hh(SettingPage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SettingItemListStencilFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       return mE.getId()+"_setting_stencil_page_key_"+p0.getPageKey();
    }
    public final void ih(Context p0,SettingPageStencil p1){
       String str;
       SettingItemListStencilFragment to;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SettingItemListStencilFragment.class, "6")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       List list = PatchProxy.applyOneRefs(p1, this, SettingItemListStencilFragment.class, "7");
       Object obj = null;
       if (list != patchProxyRe) {
       }else if(p1 != null){
          i oi = PatchProxy.apply(obj, this, SettingItemListStencilFragment.class, "8");
          if (oi != patchProxyRe) {
          }else {
             Bundle arguments = this.getArguments();
             boolean booleanx = (arguments != null)? arguments.getBoolean("PARAMS_SHOW_DIVIDER"): false;
             oi = new i(new a(new b(new f())), booleanx);
          }
          SettingItemListStencilFragment to1 = this.o;
          if (to1 == null) {
             a.S("page");
          }
          list = oi.e(this, p1, to1.getPageKey());
       }else {
          list = CollectionsKt__CollectionsKt.E();
       }
       if (list.isEmpty() ^ 1) {
          obj = list;
       }
       SettingLocalizedString title = p1.getTitle();
       if (title != null) {
          str = title.getString();
          if (str != null) {
          label_008c :
             SettingItemListArguments settingItemL = new SettingItemListArguments(str, obj);
             if (!PatchProxy.applyVoidOneRefs(settingItemL, this, SettingItemListFragment.class, "5")) {
                a.p(settingItemL, "itemListArguments");
                this.fh(settingItemL, new SettingItemListFragment$setArguments$1(this));
             }
             SettingItemListStencilFragment tp = this.p;
             to = this.o;
             if (to == null) {
                a.S("page");
             }
             str = to.getPageKey();
             Objects.requireNonNull(tp);
             if (!PatchProxy.applyVoidOneRefs(str, tp, c.class, "1")) {
                a.p(str, "pageKey");
                if (tp.b == null) {
                   tp.b = true;
                   k1.r(new b(tp, str), 0);
                }
             }
             return;
          }
       }
       to = this.o;
       if (to == null) {
          a.S("page");
       }
       str = p0.getString(to.getTitleResource());
       a.o(str, "context.getString\(page.titleResource\)");
       goto label_008c ;
    }
    public String o(){
       SettingItemListStencilFragment obj = PatchProxy.apply(null, this, SettingItemListStencilFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       if (obj == null) {
          a.S("page");
       }
       return obj.getPage2();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SettingItemListStencilFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       SettingPage settingPage = null;
       Serializable serializable = (p0 != null)? SerializableHook.getSerializable(p0, "PARAMS_SETTING_PAGE"): settingPage;
       if (serializable instanceof SettingPage) {
          settingPage = serializable;
       }
       if (settingPage != null) {
          this.o = settingPage;
          return;
       }else {
          throw new IllegalArgumentException("Page must not be null.");
       }
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, SettingItemListStencilFragment.class, "14")) {
       }else {
          SettingItemListStencilFragment tq = this.q;
          if (tq != null) {
             tq.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       SettingItemListStencilFragment to;
       String str = "2";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SettingItemListStencilFragment.class, str)) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       Context context = p0.getContext();
       a.o(context, "context");
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       List list = null;
       if (!PatchProxy.applyVoidOneRefs(context, this, SettingItemListStencilFragment.class, "3")) {
          int i = 0x7f103667;
          if (!a.t().d("settingHomeNetworkRequestOnceEnable", false)) {
             if (!PatchProxy.applyVoidOneRefs(context, this, SettingItemListStencilFragment.class, "4")) {
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                objectRef.element = list;
                ProgressFragment progressFrag = new ProgressFragment();
                progressFrag.Ih(i);
                SettingItemListStencilFragment to1 = this.o;
                if (to1 == null) {
                   a.S("page");
                }
                t ot = PatchProxy.applyOneRefs(to1, this, SettingItemListStencilFragment.class, "5");
                if (ot != patchProxyRe) {
                }else {
                   ot = t.create(new a(this, to1)).subscribeOn(d.c).observeOn(d.a);
                   a.o(ot, "Observable.create<Settin¡­veOn\(KwaiSchedulers.MAIN\)");
                }
                to = this.o;
                if (to == null) {
                   a.S("page");
                }
                t.concat(ot, a.b(to).map(m.b).doOnNext(new n(this))).compose(this.Ug(FragmentEvent.DESTROY_VIEW)).doOnSubscribe(new h(this, progressFrag)).doOnNext(new i(progressFrag)).subscribe(new j(this, objectRef, context), new k(this, progressFrag, objectRef, context), new l(this));
             }
          }else {
             ProgressFragment progressFrag1 = new ProgressFragment();
             progressFrag1.Ih(i);
             d uod = d.b();
             SettingItemListStencilFragment to2 = this.o;
             if (to2 == null) {
                a.S("page");
             }
             Objects.requireNonNull(uod);
             t ot1 = PatchProxy.applyOneRefs(to2, uod, d.class, str);
             if (ot1 != patchProxyRe) {
             }else {
                ot1 = t.create(new a(uod, to2));
             }
             ot1.compose(this.Ug(FragmentEvent.DESTROY_VIEW)).doOnSubscribe(new b(this, progressFrag1)).doAfterNext(new c(progressFrag1)).doFinally(new d(progressFrag1)).subscribe(new e(this, context), new f(this), new g(this));
          }
       }
       to = this.o;
       if (to == null) {
          a.S("page");
       }
       String str1 = context.getString(to.getTitleResource());
       a.o(str1, "context.getString\(page.titleResource\)");
       if (!PatchProxy.applyVoidOneRefs(str1, this, SettingItemListFragment.class, "6")) {
          a.p(str1, "title");
          SettingItemListFragment tn = this.n;
          if (tn != null) {
             list = tn.getItems();
          }
          this.fh(new SettingItemListArguments(str1, list), new SettingItemListFragment$setTitle$1(this));
       }
       return;
    }
}

package com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchFragment;
import z4b.p;
import im8.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchFragment$a;
import nsd.u;
import io.reactivex.subjects.PublishSubject;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.view.View;
import com.yxcorp.utility.n;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import a5b.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import a5b.h$a;
import com.kwai.robust.PatchProxyResult;
import a5b.f;
import java.util.List;
import crd.b;
import lnc.b9;
import java.lang.Integer;
import brd.t;
import a5b.a;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchFragment$b;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchFragment$c;
import erd.g;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import com.yxcorp.gifshow.model.MagicEmoji;
import e5b.c;
import java.util.Objects;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.StringBuilder;
import j8c.b;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceAdapter;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import d5b.j;
import java.util.Map;
import java.util.HashMap;
import lnc.i3;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import a5b.i;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import w3b.l;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import a5b.i$a;
import android.widget.TextView;
import q5b.f;
import d5b.a;
import d5b.k;
import d5b.m;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.panel.MagicSearchBarPresenter;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import b5b.b;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment;
import l5b.d;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;

public final class MagicSearchFragment extends MagicFaceFragment implements p, g	// class@001c01
{
    public MagicSearchBarPresenter N;
    public PresenterV2 O;
    public final p P;
    public PublishSubject Q;
    public MagicSearchFragment R;
    public MagicEmojiFragment$Source S;
    public String T;
    public final PublishSubject U;
    public boolean U0;
    public a V;
    public b W;
    public KwaiLoadingView X;
    public TextView Y;
    public boolean Z;
    public static final MagicSearchFragment$a V0;

    static {
       MagicSearchFragment.V0 = new MagicSearchFragment$a(null);
    }
    public void MagicSearchFragment(){
       super();
       this.P = this;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.Q = publishSubje;
       this.R = this;
       publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create\(\)");
       this.U = publishSubje;
       this.U0 = true;
    }
    public final void Ah(boolean p0){
       MagicSearchFragment tY;
       if (PatchProxy.isSupport(MagicSearchFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, MagicSearchFragment.class, "27")) {
          return;
       }
       String str = "loadingView";
       if (p0) {
          tY = this.Y;
          if (tY == null) {
             a.S("emptyHintView");
          }
          n.Y(tY, 8, false);
          tY = this.X;
          if (tY == null) {
             a.S(str);
          }
          n.Y(tY, false, false);
          tY = this.X;
          if (tY == null) {
             a.S(str);
          }
          tY.h();
       }else {
          tY = this.X;
          if (tY == null) {
             a.S(str);
          }
          tY.i();
          tY = this.X;
          if (tY == null) {
             a.S(str);
          }
          n.Y(tY, 4, false);
       }
       return;
    }
    public final void Bh(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSearchFragment.class, "22")) {
          return;
       }
       a.p(p0, "result");
       if (!TextUtils.x(p0.a())) {
          if (p0.e()) {
             this.Dh(p0);
             return;
          }else {
             this.Dh(p0);
             this.Eh(p0, 0);
          }
       }else {
          this.Dh(h.e.a(""));
       }
       return;
    }
    public final h Ch(){
       h obj = PatchProxy.apply(null, this, MagicSearchFragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = f.d.a(this.o);
       if (obj != null) {
          return new h(obj.a(), obj.b(), null, obj.d());
       }
       return null;
    }
    public final void Dh(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSearchFragment.class, "25")) {
          return;
       }
       b9.a(this.W);
       if (!PatchProxy.applyVoidOneRefs(p0, this, MagicSearchFragment.class, "30")) {
          f.d.c(this.o, p0);
       }
       this.Ah(false);
       this.Q.onNext(p0);
       return;
    }
    public final void Eh(h p0,int p1){
       if (PatchProxy.isSupport(MagicSearchFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, MagicSearchFragment.class, "24")) {
          return;
       }
       b9.a(this.W);
       this.Ah(true);
       MagicSearchFragment tV = this.V;
       if (tV == null) {
          a.S("magicFaceSearchProvider");
       }
       this.W = tV.a(p0.a(), p1).subscribeOn(d.c).observeOn(d.a).subscribe(new MagicSearchFragment$b(this, p0), new MagicSearchFragment$c(this, p0));
       return;
    }
    public final void Fh(List p0,String p1,String p2){
       c a;
       MagicEmoji$MagicFace magicFace;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MagicSearchFragment.class, "17")) {
          return;
       }
       if (!q.f(this.t)) {
          this.fh(true);
       }
       if (this.t == null) {
          this.t = new ArrayList();
       }
       this.t.clear();
       if (!q.f(p0)) {
          a.m(p0);
          this.t.addAll(p0);
       }
       MagicFaceFragment tl = this.l;
       if (tl != null && tl.mId != null) {
          a = c.a;
          tl = this.t;
          a.o(tl, "mSupportMagicFaces");
          MagicEmoji mId = this.l.mId;
          a.o(mId, "mMagicEmoji.mId");
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidThreeRefs(tl, mId, p2, a, c.class, "2")) {
             a.p(tl, "magicFaceList");
             a.p(mId, "groupId");
             Iterator iterator1 = tl.iterator();
             int i = 0;
             while (iterator1.hasNext()) {
                MagicEmoji$MagicFace magicFace1 = iterator1.next();
                magicFace1.mSearchKeyword = p2;
                magicFace1.mGroupId = mId;
                int i1 = i + 1;
                magicFace1.mMagicEmojiIndex = i;
                i = i1;
             }
          }
       }
       if (this.C == null && this.s != null) {
          if (PatchProxy.applyVoidOneRefs(p1, this, MagicSearchFragment.class, "21") || (!TextUtils.x(p1) && !q.f(this.t))) {
             b.d("MagicSearchFragment", "markAutoClick id: "+p1);
             if (this.p == null || this.s == null) {
                b.d("MagicSearchFragment", "markAutoClick isLazyLoadRecyclerView, return");
             }else {
                String str = null;
                Iterator iterator = this.t.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      magicFace = iterator.next();
                      if (TextUtils.n(p1, magicFace.mId)) {
                         str = magicFace;
                      }
                   }
                   if (str == null) {
                      b.d("MagicSearchFragment", "markAutoClick, not found magicFace");
                   }else {
                      MagicFaceFragment ts = this.s;
                      a.o(ts, "mMagicFaceAdapter");
                      if (MagicEmoji$MagicFace.isMagicFaceEquals(str, ts.z1())) {
                         b.d("MagicSearchFragment", "markAutoClick, magicFace is selected");
                      }else {
                         b.d("MagicSearchFragment", "markAutoClick success");
                         tl = this.s;
                         a.o(tl, "mMagicFaceAdapter");
                         tl.N1(p1);
                      }
                   }
                }
             }
          }
          tl = this.s;
          a.o(tl, "mMagicFaceAdapter");
          tl.W0(this.t);
          this.s.k0();
          this.rh();
          this.fh(false);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicSearchFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MagicSearchFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MagicSearchFragment.class, new j());
       }else {
          obj.put(MagicSearchFragment.class, null);
       }
       return obj;
    }
    public int ih(){
       return 0x7f0d0edd;
    }
    public String kh(MagicEmoji$MagicFace p0){
       String str;
       i3 obj = PatchProxy.applyOneRefs(p0, this, MagicSearchFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "selectedMagicFace");
       obj = null;
       p0 = p0.mSearchKeyword;
       if (p0 != null) {
          obj = i3.f();
          obj.d("query_word", p0);
          str = obj.e();
       }
       return str;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, MagicSearchFragment.class, "14")) {
          return;
       }
       super.onDestroyView();
       MagicSearchFragment tO = this.O;
       if (tO == null) {
          a.S("presenters");
       }
       tO.destroy();
       tO = this.N;
       if (tO == null) {
          a.S("magicSearchBarPresenter");
       }
       tO.destroy();
       this.Z = false;
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       i$a a;
       View view;
       View view1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicSearchFragment.class, "13")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       MagicFaceFragment to = this.o;
       if (to != null) {
          a.o(to, "mMagicEmojiPageIdentify");
          this.T = to;
       }else {
          this.T = String.valueOf(this.hashCode());
       }
       to = this.n;
       a.o(to, "mSource");
       this.S = to;
       a = i.a;
       if (to == null) {
          a.S("magicSource");
       }
       MagicBusinessId magicBusines = l.d(to);
       a.o(magicBusines, "MagicFaceController.getE¡­iKeyBySource\(magicSource\)");
       this.V = a.a(magicBusines, this.jh());
       view = p0.findViewById(R.id.magic_search_loading_view);
       a.o(view, "view.findViewById\(R.id.magic_search_loading_view\)");
       this.X = view;
       view = p0.findViewById(R.id.tv_empty_magic_hint);
       a.o(view, "view.findViewById\(R.id.tv_empty_magic_hint\)");
       this.Y = view;
       if (f.a()) {
          MagicSearchFragment tY = this.Y;
          String str = "emptyHintView";
          if (tY == null) {
             a.S(str);
          }
          if (!TextUtils.x(tY.getText())) {
             tY = this.Y;
             if (tY == null) {
                a.S(str);
             }
             tY.setText(R.string.arg_RES_7f103176);
          }
       }
       this.Ah(false);
       PresenterV2 presenterV2 = new PresenterV2();
       this.O = presenterV2;
       presenterV2.U7(new a());
       MagicSearchFragment tO = this.O;
       String str1 = "presenters";
       if (tO == null) {
          a.S(str1);
       }
       tO.U7(new k());
       tO = this.O;
       if (tO == null) {
          a.S(str1);
       }
       tO.U7(new m());
       tO = this.O;
       if (tO == null) {
          a.S(str1);
       }
       tO.f(p0);
       tO = this.O;
       if (tO == null) {
          a.S(str1);
       }
       Object[] objArray = new Object[]{this};
       tO.i(objArray);
       objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, MagicSearchFragment.class, "28")) {
          h oh = this.Ch();
          if (oh != null) {
             this.Bh(oh);
          }
       }
       MagicSearchBarPresenter magicSearchB = new MagicSearchBarPresenter();
       this.N = magicSearchB;
       Object[] objArray1 = PatchProxy.apply(objArray, this, MagicSearchFragment.class, "26");
       if (objArray1 != PatchProxyResult.class) {
       }else {
          Fragment parentFragme = this.getParentFragment();
          if (parentFragme != null) {
             view1 = parentFragme.getView();
          }
          objArray1 = view1;
       }
       if (objArray1 != null) {
          p0 = objArray1;
       }
       magicSearchB.f(p0);
       MagicSearchFragment tN = this.N;
       if (tN == null) {
          a.S("magicSearchBarPresenter");
       }
       Object[] objArray2 = new Object[]{this};
       tN.i(objArray2);
       if (this.K0()) {
          this.u();
       }
       this.Z = true;
       return;
    }
    public void u(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicSearchFragment.class, "18")) {
          return;
       }
       String str = "MagicSearchFragment";
       b.d(str, "onPageSelect");
       MagicSearchFragment tU0 = this.U0;
       this.U0 = false;
       Objects.requireNonNull(f.d);
       if (f.a) {
          return;
       }
       h oh = this.Ch();
       if (oh != null && !TextUtils.x(oh.a())) {
          return;
       }
       MagicEmojiPageConfig magicEmojiPa = this.jh();
       if (magicEmojiPa != null && (!TextUtils.x(magicEmojiPa.mAutoSearchMagicWords) && tU0 != null)) {
          MagicEmojiPageConfig mAutoSearchM = magicEmojiPa.mAutoSearchMagicWords;
          a.o(mAutoSearchM, "it.mAutoSearchMagicWords");
          this.Eh(new h(mAutoSearchM, objArray, "", false), magicEmojiPa.mMagicAutoSearchSource);
          return;
       }else {
          b.d(str, "auto show search bar");
          this.U.onNext(new b(true, true));
          return;
       }
    }
    public void wh(boolean p0){
    }
    public void ya(h p0,boolean p1){
       int i;
       if (PatchProxy.isSupport(MagicSearchFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, MagicSearchFragment.class, "19")) {
          return;
       }
       Fragment parentFragme = this.getParentFragment();
       if (parentFragme instanceof MagicEmojiFragment) {
          if (p1) {
             Fragment uFragment = parentFragme;
             Objects.requireNonNull(uFragment);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             MagicEmojiFragment obj = PatchProxy.apply(null, uFragment, MagicEmojiFragment.class, "4");
             if (obj != patchProxyRe) {
                uFragment = obj.booleanValue();
             }else {
                obj = uFragment.d1;
                MagicEmojiFragment a1 = uFragment.a1;
                Objects.requireNonNull(obj);
                Object obj1 = PatchProxy.applyOneRefs(a1, obj, d.class, "1");
                if (obj1 != patchProxyRe) {
                   i = obj1.intValue();
                }else if(q.f(a1)){
                   i = -1;
                }else {
                   i = obj.a(a1, obj.b);
                }
                if (i >= 0 && i < uFragment.a1.size()) {
                   uFragment.Jh(i);
                   uFragment = true;
                }else {
                   uFragment = false;
                }
             }
             if (uFragment) {
                return;
             }
          }
          MagicFaceFragment tl = this.l;
          if (tl != null) {
             MagicEmoji mId = tl.mId;
             Objects.requireNonNull(parentFragme);
             if (!PatchProxy.applyVoidOneRefs(mId, parentFragme, MagicEmojiFragment.class, "5")) {
                parentFragme.d1.d(mId);
             }
          }
       }
    label_008f :
       if (p0 != null) {
          this.Bh(p0);
       }
       return;
    }
    public void yh(boolean p0){
    }
    public void zh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicSearchFragment.class, "15")) {
          return;
       }
       if (this.t == null) {
          this.Fh(new ArrayList(), objArray, objArray);
       }
       if (this.Z != null) {
          h oh = this.Ch();
          if (oh != null && oh.e()) {
             this.Dh(oh);
          }
       }
       return;
    }
}

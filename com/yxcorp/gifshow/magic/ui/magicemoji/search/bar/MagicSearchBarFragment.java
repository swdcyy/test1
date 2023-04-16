package com.yxcorp.gifshow.magic.ui.magicemoji.search.bar.MagicSearchBarFragment;
import ml8.d;
import im8.g;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.bar.MagicSearchBarFragment$a;
import nsd.u;
import e5b.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.bar.MagicSearchBarFragment$d;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import q5b.f;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.bar.MagicSearchBarFragment$c;
import android.view.View$OnClickListener;
import com.kwai.robust.PatchProxyResult;
import z4b.h;
import java.util.Map;
import java.util.HashMap;
import java.lang.CharSequence;
import z4b.p;
import android.os.Bundle;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.DialogFragment;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import java.util.Objects;
import j8c.b;
import android.view.View$OnLayoutChangeListener;
import java.lang.Runnable;
import android.os.Handler;
import java.lang.Boolean;
import msd.l;
import qrd.l1;
import a5b.g;
import crd.b;
import lnc.b9;
import ekd.k1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.plugin.magicemoji.MagicEmojiPageConfig;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment$Source;
import a5b.i;
import com.yxcorp.gifshow.magic.data.repo.MagicBusinessId;
import w3b.l;
import a5b.a;
import a5b.i$a;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.bar.MagicSearchBarFragment$onViewCreated$1;
import a2.i0;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import z4b.j;
import z4b.m;
import z4b.o;
import z4b.a;
import a5b.f;
import a5b.h;
import java.util.List;
import a5b.h$a;
import com.yxcorp.utility.TextUtils;

public final class MagicSearchBarFragment extends BaseEditorFragment implements d, g	// class@001bf6
{
    public g V0;
    public MagicEmojiFragment$Source W0;
    public l X0;
    public p Y0;
    public View Z0;
    public EditText a1;
    public final a b1;
    public PresenterV2 c1;
    public View d1;
    public boolean e1;
    public String f1;
    public MagicEmojiPageConfig g1;
    public final MagicSearchBarFragment$b h1;
    public static final String i1;
    public static final String j1;
    public static final MagicSearchBarFragment$a k1;

    static {
       MagicSearchBarFragment.k1 = new MagicSearchBarFragment$a(null);
       MagicSearchBarFragment.i1 = "MagicSearchBarFragment";
       MagicSearchBarFragment.j1 = "MagicSearchBarFragment";
    }
    public void MagicSearchBarFragment(){
       super();
       this.b1 = new a();
       this.h1 = new MagicSearchBarFragment$d(this);
    }
    public int Dh(){
       return 0x7f110215;
    }
    public EmojiEditText Kh(){
       return null;
    }
    public void cancel(){
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSearchBarFragment.class, "5")) {
          return;
       }
       View view = null;
       View view1 = (p0 != null)? p0.findViewById(R.id.search_et_layout): view;
       this.Z0 = view1;
       EditText uEditText = (p0 != null)? p0.findViewById(R.id.magic_search_bar_et): view;
       this.a1 = uEditText;
       if (f.a()) {
          MagicSearchBarFragment ta1 = this.a1;
          if (ta1 != null) {
             a.m(ta1);
             ta1.setHint(R.string.arg_RES_7f103164);
          }
       }
       if (p0 != null) {
          view = p0.findViewById(R.id.touch_view);
       }
       this.d1 = view;
       if (view != null) {
          view.setOnClickListener(new MagicSearchBarFragment$c(this));
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicSearchBarFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MagicSearchBarFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MagicSearchBarFragment.class, new h());
       }else {
          obj.put(MagicSearchBarFragment.class, null);
       }
       return obj;
    }
    public void hi(CharSequence p0){
    }
    public final p ii(){
       return this.Y0;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSearchBarFragment.class, "6")) {
          return;
       }
       super.onCreate(p0);
       this.setStyle(1, R.style.arg_RES_7f110363);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MagicSearchBarFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       a.o(uDialog, "super.onCreateDialog\(savedInstanceState\)");
       this.setCancelable(false);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, MagicSearchBarFragment.class, "7");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d0edb, p1, false);
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicSearchBarFragment.class, "12")) {
          return;
       }
       super.onDestroyView();
       MagicSearchBarFragment tb1 = this.b1;
       Objects.requireNonNull(tb1);
       a uoa = a.class;
       if (!PatchProxy.applyVoid(objArray, tb1, uoa, "1")) {
          if (!PatchProxy.applyVoid(objArray, tb1, uoa, "3")) {
             b.a("InputKeyboardListener", "stopKeyBoardListener");
             uoa = tb1.a;
             if (uoa != null) {
                uoa.removeOnLayoutChangeListener(tb1.h);
             }
             tb1.f.removeCallbacks(tb1.g);
          }
          tb1.c = objArray;
          tb1.a = objArray;
          tb1.b = objArray;
       }
       tb1 = this.X0;
       if (tb1 != null) {
          l1 ol1 = tb1.invoke(Boolean.FALSE);
       }
       tb1 = this.V0;
       if (tb1 == null) {
          a.S("magicSearchDataManager");
       }
       Objects.requireNonNull(tb1);
       if (!PatchProxy.applyVoid(objArray, tb1, g.class, "1")) {
          b9.a(tb1.d);
          k1.n("MagicSearchDataManager");
       }
       tb1 = this.c1;
       if (tb1 == null) {
          a.S("presenter");
       }
       tb1.unbind();
       tb1 = this.c1;
       if (tb1 == null) {
          a.S("presenter");
       }
       tb1.destroy();
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicSearchBarFragment.class, "10")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, MagicSearchBarFragment.class, "14")) {
          MagicSearchBarFragment ta1 = this.a1;
          if (ta1 != null) {
             Context context = this.getContext();
             if (context != null) {
                MagicSearchBarFragment ta11 = this.a1;
                if (ta11 != null) {
                   ta11.requestFocus();
                }
                n.b0(context, ta1, true);
             }
          }
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, MagicSearchBarFragment.class, "11")) {
          return;
       }
       super.onStop();
       this.dismissAllowingStateLoss();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       i$a a;
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicSearchBarFragment.class, "9")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       p1 = this.getArguments();
       a.m(p1);
       boolean b = false;
       this.e1 = p1.getBoolean("magic_search_bar_is_auto_show", b);
       p1 = this.getArguments();
       a.m(p1);
       this.g1 = p1.get("magic_emoji_page_config");
       p1 = this.getArguments();
       a.m(p1);
       p1 = p1.get("magic_source");
       Objects.requireNonNull(p1, "null cannot be cast to non-null type com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment.Source");
       this.W0 = p1;
       p1 = this.getArguments();
       a.m(p1);
       this.f1 = p1.get("magic_page_id");
       a = i.a;
       MagicSearchBarFragment tW0 = this.W0;
       if (tW0 == null) {
          a.S("magicSource");
       }
       MagicBusinessId magicBusines = l.d(tW0);
       a.o(magicBusines, "MagicFaceController.getE¡­iKeyBySource\(magicSource\)");
       this.V0 = new g(a.a(magicBusines, this.g1));
       MagicSearchBarFragment tX0 = this.X0;
       if (tX0 != null) {
          l1 ol1 = tX0.invoke(Boolean.TRUE);
       }
       tX0 = this.b1;
       tX0.c = this.getActivity();
       tX0.a = this.Z0;
       tX0.d = this.getDialog();
       tX0.b = new MagicSearchBarFragment$onViewCreated$1(this);
       tX0 = this.b1;
       Objects.requireNonNull(tX0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tX0, a.class, "2")) {
          str = "InputKeyboardListener";
          b.a(str, "initKeyBoardListener");
          tX0.e = true;
          a a1 = tX0.a;
          if (a1 != null) {
             if (i0.Y(a1)) {
                b.a(str, "inputView is laid out");
                tX0.a();
             }else {
                b.a(str, "inputView addOnGlobalLayoutListener");
                a a2 = tX0.a;
                if (a2 != null) {
                   ViewTreeObserver viewTreeObse = a2.getViewTreeObserver();
                   if (viewTreeObse != null) {
                      viewTreeObse.addOnGlobalLayoutListener(tX0.i);
                   }
                }
             }
          }
       }
       PresenterV2 presenterV2 = new PresenterV2();
       this.c1 = presenterV2;
       presenterV2.U7(new j());
       tX0 = this.c1;
       str = "presenter";
       if (tX0 == null) {
          a.S(str);
       }
       tX0.U7(new m());
       tX0 = this.c1;
       if (tX0 == null) {
          a.S(str);
       }
       tX0.U7(new o());
       tX0 = this.c1;
       if (tX0 == null) {
          a.S(str);
       }
       tX0.U7(new a());
       tX0 = this.c1;
       if (tX0 == null) {
          a.S(str);
       }
       tX0.f(p0);
       MagicSearchBarFragment tc1 = this.c1;
       if (tc1 == null) {
          a.S(str);
       }
       Object[] objArray1 = new Object[]{this};
       tc1.i(objArray1);
       if (!PatchProxy.applyVoid(objArray, this, MagicSearchBarFragment.class, "15")) {
          h oh = f.d.a(this.f1);
          if (oh != null) {
             objArray = new h(oh.a(), oh.b(), objArray, oh.d());
          }
          if (objArray == null) {
             objArray = h.e.a("");
          }
          tc1 = this.V0;
          if (tc1 == null) {
             a.S("magicSearchDataManager");
          }
          a.m(objArray);
          Objects.requireNonNull(tc1);
          if (!PatchProxy.applyVoidOneRefs(objArray, tc1, g.class, "5")) {
             a.p(objArray, "result");
             if (!TextUtils.x(objArray.a()) && objArray.e()) {
                tc1.a = objArray.a();
                tc1.b = objArray;
                tc1.d(1);
                tc1.c(1);
             }else {
                tc1.f(objArray.a(), 1);
             }
          }
       }
       return;
    }
}

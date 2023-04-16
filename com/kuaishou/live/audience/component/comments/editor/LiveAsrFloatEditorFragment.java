package com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment;
import ey0.a;
import im8.g;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment$b;
import com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment$c;
import com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment$d;
import com.yxcorp.gifshow.widget.EmojiEditText;
import z1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import java.lang.CharSequence;
import e17.i;
import android.view.View;
import android.widget.GridView;
import java.util.Iterator;
import java.util.Set;
import zx0.a;
import androidx.fragment.app.Fragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import android.widget.EditText;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g$a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import zx0.t;
import java.util.Map;
import java.util.HashMap;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Runnable;
import android.view.View$OnClickListener;
import java.lang.Number;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import tkd.b;
import tkd.d;
import wu5.a;
import androidx.fragment.app.FragmentActivity;
import zx0.f;
import android.app.Activity;
import n3d.a;
import java.lang.Integer;
import com.kuaishou.live.audience.component.comments.editor.g;
import java.util.List;
import java.util.ArrayList;
import com.kuaishou.live.audience.component.comments.editor.asr.b;
import dy0.a;
import java.lang.IndexOutOfBoundsException;
import lnc.c0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.view.ViewGroup;
import android.os.Bundle;
import android.os.Build;
import ekd.i;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import android.view.LayoutInflater;
import android.content.Context;
import i2b.a;
import android.view.ViewConfiguration;
import zx0.m;
import android.text.TextUtils;
import android.widget.Button;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import zx0.n;
import android.widget.TextView$OnEditorActionListener;
import android.view.ViewTreeObserver;
import zx0.o;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import android.text.TextWatcher;
import zx0.c;
import android.text.InputFilter;
import java.util.Arrays;
import android.text.InputFilter$LengthFilter;
import android.widget.Scroller;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.Collection;
import ekd.q;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.view.ViewParent;
import android.widget.LinearLayout;
import zx0.d;
import android.view.View$OnLayoutChangeListener;
import com.kwai.feature.component.commonfragment.baseeditor.f;
import zx0.p;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$b;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import zx0.q;
import android.view.View$OnTouchListener;
import android.widget.ImageButton;
import zx0.r;
import cw9.c;
import zx0.j;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import ey0.b;
import zx0.b;
import zx0.k;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import android.graphics.drawable.Drawable;
import zx0.l;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.l;
import brd.t;
import t45.d;
import brd.z;
import zx0.g;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.DialogInterface;
import androidx.fragment.app.KwaiDialogFragment;
import android.widget.ListAdapter;
import rnc.i$a;
import zx0.e;
import android.widget.AdapterView$OnItemClickListener;
import java.lang.Exception;
import com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment$f;
import pf1.f;
import ay0.h;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import zx0.i;
import e93.f;
import com.kuaishou.live.audience.component.comments.editor.LiveAsrFloatEditorFragment$a;
import zx0.h;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import ow0.a;

public class LiveAsrFloatEditorFragment extends BaseEditorFragment implements a, g	// class@000a96
{
    public a A1;
    public g B1;
    public LiveAsrFloatEditorFragment$f C1;
    public b D1;
    public final Set E1;
    public final LiveAsrFloatEditorFragment$e F1;
    public final View$OnLayoutChangeListener G1;
    public final Runnable H1;
    public final int[] V0;
    public EmojiEditText W0;
    public h X0;
    public a0 Y0;
    public View Z0;
    public View a1;
    public View b1;
    public View c1;
    public View d1;
    public View e1;
    public GridView f1;
    public RecyclerView g1;
    public View h1;
    public View i1;
    public ImageButton j1;
    public ImageButton k1;
    public View l1;
    public boolean m1;
    public int n1;
    public int o1;
    public int p1;
    public int q1;
    public int r1;
    public final Handler s1;
    public boolean t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;
    public boolean x1;
    public boolean y1;
    public View$OnLayoutChangeListener z1;
    public static final int I1;

    public void LiveAsrFloatEditorFragment(){
       super();
       int[] ointArray = new int[2];
       this.V0 = ointArray;
       this.s1 = new Handler(Looper.getMainLooper());
       this.v1 = false;
       this.w1 = false;
       this.x1 = false;
       this.E1 = new HashSet();
       this.F1 = new LiveAsrFloatEditorFragment$b(this);
       this.G1 = new LiveAsrFloatEditorFragment$c(this);
       this.H1 = new LiveAsrFloatEditorFragment$d(this);
    }
    public EmojiEditText Kh(){
       return this.W0;
    }
    public void O5(a p0){
       this.A1 = p0;
    }
    public boolean Rh(){
       BaseEditorFragment obj = PatchProxy.apply(null, this, LiveAsrFloatEditorFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.M;
       if (obj.mAtFriendMaxLimit != -1 && obj.mAtFriendMaxLimitToastResId > null) {
          BaseEditorFragment tM = this.M;
          if (this.ni(this.W0.getText()) > tM.mAtFriendMaxLimit) {
             i.a(R.style.arg_RES_7f110668, tM.mAtFriendMaxLimitToastResId);
             return true;
          }
       }
       return false;
    }
    public boolean Sh(){
       Object obj = PatchProxy.apply(null, this, LiveAsrFloatEditorFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b1.isEnabled();
    }
    public boolean Th(){
       LiveAsrFloatEditorFragment obj = PatchProxy.apply(null, this, LiveAsrFloatEditorFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f1;
       boolean b = false;
       if (obj == null) {
          return b;
       }
       if (this.t1 != null || !obj.getVisibility()) {
          b = true;
       }
       return b;
    }
    public void Uh(){
       if (PatchProxy.applyVoid(null, this, LiveAsrFloatEditorFragment.class, "39")) {
          return;
       }
       Iterator iterator = this.E1.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void Wa(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAsrFloatEditorFragment.class, "42")) {
          return;
       }
       if (this.isAdded()) {
          LiveAsrFloatEditorFragment tW0 = this.W0;
          if (tW0 != null) {
             tW0.h(p0);
             this.x1 = true;
          }
       }
       return;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, LiveAsrFloatEditorFragment.class, "22")) {
          return;
       }
       if (this.Lh() != null) {
          BaseEditorFragment$g$a og$a = new BaseEditorFragment$g$a();
          og$a.d(true);
          og$a.l(TextUtils.G(this.W0).toString());
          og$a.i(this.W0.j());
          this.Lh().a(og$a.a());
       }
       this.dismiss();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAsrFloatEditorFragment.class, "45");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new t();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, LiveAsrFloatEditorFragment.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(LiveAsrFloatEditorFragment.class, new t());
       }else {
          obj.put(LiveAsrFloatEditorFragment.class, null);
       }
       return obj;
    }
    public void gi(){
       if (PatchProxy.applyVoid(null, this, LiveAsrFloatEditorFragment.class, "24")) {
          return;
       }
       LiveAsrFloatEditorFragment tLiveAsrFloa = this.f1;
       boolean b = (tLiveAsrFloa != null && tLiveAsrFloa.getVisibility())? true: false;
       this.vi(b);
       return;
    }
    public void hi(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAsrFloatEditorFragment.class, "34")) {
          return;
       }
       if (this.isAdded()) {
          this.N = p0;
          this.W0.setText(p0);
       }
       return;
    }
    public void ii(){
       int i;
       if (PatchProxy.applyVoid(null, this, LiveAsrFloatEditorFragment.class, "23")) {
          return;
       }
       if (!QCurrentUser.me().isLogined() && this.H != null) {
          this.cancel();
          this.H.run();
          return;
       }else {
          BaseEditorFragment tE = this.E;
          if (tE != null) {
             tE.onClick(this.Z0.findViewById(R.id.at_button));
          }
          this.m1 = true;
          Editable text = this.W0.getText();
          Object obj = PatchProxy.applyOneRefs(text, this, LiveAsrFloatEditorFragment.class, "37");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(this.M.mAtFriendMaxLimit == -1){
             i = -1;
          }else if(TextUtils.x(text)){
             i = this.M.mAtFriendMaxLimit;
          }else {
             int i1 = this.M.mAtFriendMaxLimit - this.ni(text);
             i = (i1 < 0)? 0: i1;
          }
          d.a(0x6de3c81e).qE(this.getActivity(), new SelectUsersBundle().setBizId(this.M.mSelectUserBizId).setLimitNum(i).setLimitToast(this.M.mAtFriendMaxLimitToastResId), new f(this));
          this.getActivity().overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f0100f1);
          return;
       }
    }
    public final void ji(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveAsrFloatEditorFragment.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveAsrFloatEditorFragment.class, "16")) {
          return;
       }
       if (this.w1 != null) {
          this.w1 = false;
          return;
       }else {
          String str = "";
          String str1 = (p0 != null)? p0.toString(): str;
          if (str1.length() > 0 && p3 == 1) {
             str = str1.substring(p1, (p1 + 1));
          }
          if (("@").equals(str) || ("£À").equals(str)) {
             this.v1 = true;
             this.ii();
          }
          return;
       }
    }
    public g ki(){
       g obj = PatchProxy.apply(null, this, LiveAsrFloatEditorFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new g();
       obj.e = this;
       obj.f = this.X0;
       obj.g = this.F1;
       obj.d = this.M;
       return obj;
    }
    public List li(){
       ArrayList obj = PatchProxy.apply(null, this, LiveAsrFloatEditorFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(new b());
       obj.add(new a());
       return obj;
    }
    public void mi(){
       if (PatchProxy.applyVoid(null, this, LiveAsrFloatEditorFragment.class, "32")) {
          return;
       }
       boolean b = true;
       this.W0.setFocusable(b);
       this.W0.setFocusableInTouchMode(b);
       LiveAsrFloatEditorFragment tW0 = this.W0;
       try{
          tW0.requestFocus();
          if (this.W0.getText() != null) {
             tW0 = this.W0;
             tW0.setSelection(tW0.getText().length());
          }
       }catch(java.lang.IndexOutOfBoundsException e0){
          e0.printStackTrace();
       }
       return;
    }
    public final int ni(CharSequence p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, LiveAsrFloatEditorFragment.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (TextUtils.x(p0)) {
          return 0;
       }
       obj = new ArrayList();
       Matcher matcher = c0.a.matcher(p0);
       while (matcher.find()) {
          obj.add(matcher.group(0));
       }
       return obj.size();
    }
    public int oi(){
       Object obj = PatchProxy.apply(null, this, LiveAsrFloatEditorFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((this.g1.getHeight() + this.a1.getHeight()) + this.d1.getHeight());
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAsrFloatEditorFragment.class, "7")) {
          return;
       }
       super.onActivityCreated(p0);
       if (!PatchProxy.applyVoid(null, this, LiveAsrFloatEditorFragment.class, "6")) {
          String mODEL = Build.MODEL;
          if (!TextUtils.x(mODEL) && (mODEL.contains("vivo X21") && i.e(this.getActivity()))) {
             WindowManager$LayoutParams attributes = this.getDialog().getWindow().getAttributes();
             attributes.flags = attributes.flags & 0xfbff;
          }
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int this;
       View view;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAsrFloatEditorFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       Context context = p0.getContext();
       BaseEditorFragment$Arguments forceDayNigh = this.M.forceDayNightMode;
       if (forceDayNigh == 32 || forceDayNigh == 16) {
          p0 = p0.cloneInContext(this.Ih(context, forceDayNigh));
       }
       this.Z0 = a.g(p0, 0x7f0d09e3, p1, false);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveAsrFloatEditorFragment.class, "19")) {
          this.d1 = this.Z0.findViewById(0x7f0a0953);
          c uoc = 2;
          this.q1 = ViewConfiguration.get(this.getContext()).getScaledTouchSlop() * 2;
          BaseEditorFragment$Arguments mTheme = this.M.mTheme;
          int i = 0x7f0a0eb0;
          this = 0x7f0a0eb1;
          if (mTheme == 0x7f11013c || mTheme == 0x7f110144) {
             view = this.Z0.findViewById(this);
             this.b1 = view;
             view.setVisibility(false);
             this.Z0.findViewById(i).setVisibility(8);
          }else {
             this.b1 = this.Z0.findViewById(i);
             this.Z0.findViewById(this).setVisibility(8);
          }
          this.b1.setOnClickListener(new m(this));
          this.b1.setEnabled(this.M.mEnableEmpty);
          if (!TextUtils.isEmpty(this.M.mFinishButtonText)) {
             this.b1.setText(this.M.mFinishButtonText);
          }
          mTheme = this.M.mFinishButtonBackgroundResId;
          if (mTheme > null) {
             this.b1.setBackgroundResource(mTheme);
          }
          view = this.Z0.findViewById(R.id.finish_button_wrapper);
          this.i1 = view;
          float f = 10.00f;
          if (this.M.mFinishButtonLayoutGravityOnBottom != null && (view != null && view.getLayoutParams() instanceof LinearLayout$LayoutParams)) {
             view.gravity = 80;
             view.height = (a1.d(0x7f07023a) + (a1.e(f) * 2)) + a1.e(7.00f);
          }
       label_0116 :
          mTheme = this.M.mFinishButtonTextColorResId;
          if (mTheme > null) {
             this.b1.setTextColor(a1.a(mTheme));
          }
          EmojiEditText uEmojiEditTe = this.Z0.findViewById(R.id.editor);
          this.W0 = uEmojiEditTe;
          BaseEditorFragment$Arguments mImeOptions = this.M.mImeOptions;
          if (mImeOptions >= null) {
             uEmojiEditTe.setImeOptions((mImeOptions | 0x10000000));
          }
          this.W0.setOnEditorActionListener(new n(this));
          this.d1.getViewTreeObserver().addOnPreDrawListener(new o(this));
          KSTextDisplayHandler kSTextDispla = this.W0.getKSTextDisplayHandler();
          boolean i1 = (this.M.mEnableAtFriends != null)? 2: 0;
          int i2 = 1;
          kSTextDispla.o((i1 | i2));
          kSTextDispla = this.W0.getKSTextDisplayHandler();
          BaseEditorFragment tM = this.M;
          i1 = (tM != null && tM.mShowUserAlias != null)? true: false;
          kSTextDispla.p(i1);
          this.W0.addTextChangedListener(this);
          this.W0.setOnClickListener(new c(this));
          if (this.M.mTextLimit > null) {
             InputFilter[] inputFilterA = Arrays.copyOf(this.W0.getFilters(), (this.W0.getFilters().length + i2));
             inputFilterA[(inputFilterA.length - i2)] = new InputFilter$LengthFilter(this.M.mTextLimit);
             this.W0.setFilters(inputFilterA);
          }
          this.W0.setSingleLine(this.M.mSingleLine);
          this.W0.setInputType(this.M.mKeyboardType);
          if (this.M.mSingleLine == null) {
             this.W0.setMaxLines(6);
             this.W0.setScroller(new Scroller(this.getActivity()));
             this.W0.setVerticalScrollBarEnabled(false);
          }
          mTheme = this.M.mInputBackgroundResId;
          if (mTheme > null) {
             this.W0.setBackgroundResource(mTheme);
          }
          this.f1 = this.Z0.findViewById(0x7f0a0d0b);
          this.a1 = this.Z0.findViewById(0x7f0a0be0);
          this.e1 = this.Z0.findViewById(0x7f0a2eda);
          RecyclerView recyclerView = this.Z0.findViewById(R.id.hot_words);
          this.g1 = recyclerView;
          recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(), false, false));
          if (!q.f(this.M.mHotWords)) {
             if (!PatchProxy.applyVoid(objArray, this, LiveAsrFloatEditorFragment.class, "40") && (a1.i(this.getActivity()) && this.getActivity().getResources().getConfiguration().orientation == uoc)) {
                if (this.g1.getParent() instanceof LinearLayout) {
                   LinearLayout parent = this.g1.getParent();
                   parent.setGravity(80);
                   parent.setClipToPadding(false);
                }
                d uod = new d(this);
                this.z1 = uod;
                this.g1.addOnLayoutChangeListener(uod);
             }
          label_0286 :
             f uof = new f();
             uof.r1(new p(this));
             uof.W0(this.M.mHotWords);
             this.g1.setAdapter(uof);
             this.g1.setVisibility(false);
             this.a1.setVisibility(false);
          }else {
             this.g1.setVisibility(8);
             this.a1.setVisibility(8);
          }
          this.h1 = this.Z0.findViewById(0x7f0a1cc9);
          view = this.Z0.findViewById(R.id.placeholder);
          this.c1 = view;
          view.setOnTouchListener(new q(this));
          ImageButton imageButton = this.Z0.findViewById(R.id.emotion_button);
          this.j1 = imageButton;
          if (this.M.mEnableEmotion != null) {
             imageButton.setOnClickListener(new r(this));
          }else {
             imageButton.setVisibility(8);
             this.i1.setPadding(c.b(this.getResources(), R.dimen.arg_RES_7f070a7f), false, c.b(this.getResources(), R.dimen.arg_RES_7f070a7f), false);
          }
          imageButton = this.Z0.findViewById(R.id.asr_button);
          this.k1 = imageButton;
          if (this.M.mEnableAsr != null) {
             imageButton.setOnClickListener(new j(this));
          }else {
             imageButton.setVisibility(8);
          }
          view = this.Z0.findViewById(R.id.location_button);
          this.l1 = view;
          if (this.M.mEnableLocation != null) {
             b.a(this.Y0.Z2.a());
             this.l1.setVisibility(false);
             this.l1.setOnClickListener(new b(this));
          }else {
             view.setVisibility(8);
          }
          int i3 = 0x7f0a026f;
          if (this.M.mEnableAtFriends != null) {
             this.Z0.findViewById(i3).setOnClickListener(new k(this));
          }else {
             this.Z0.findViewById(i3).setVisibility(8);
             LiveAsrFloatEditorFragment tW0 = this.W0;
             tW0.setPadding((tW0.getPaddingLeft() + n.c(a.a().a(), f)), this.W0.getPaddingTop(), this.W0.getPaddingRight(), this.W0.getPaddingBottom());
          }
          i3 = 0x7f0a171b;
          if (this.M.mShowLeftBtn != null) {
             imageButton = this.Z0.findViewById(i3);
             imageButton.setVisibility(false);
             imageButton.setImageDrawable(this.K);
             imageButton.setOnClickListener(new l(this));
          }else {
             this.Z0.findViewById(i3).setVisibility(8);
          }
          BaseEditorFragment tN = this.N;
          if (tN != null) {
             this.w1 = ("@").equals(tN.toString());
             this.W0.setText(this.N);
             if (this.M.mShowKeyBoardFirst != null) {
                try{
                   this.W0.setSelection(this.N.length());
                }catch(java.lang.IndexOutOfBoundsException e8){
                   e8.printStackTrace();
                }
             }else {
                this.W0.setFocusable(false);
             }
          }
       }
    label_0401 :
       this.D1 = RxBus.f.f(l.class).observeOn(d.a).subscribe(new g(this));
       return this.Z0;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAsrFloatEditorFragment.class, "12")) {
          return;
       }
       super.onDestroyView();
       LiveAsrFloatEditorFragment tD1 = this.D1;
       if (tD1 != null) {
          tD1.dispose();
          this.D1 = objArray;
       }
       tD1 = this.z1;
       if (tD1 != null) {
          this.g1.removeOnLayoutChangeListener(tD1);
       }
       this.E1.clear();
       this.C1.unbind();
       this.C1.destroy();
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAsrFloatEditorFragment.class, "43")) {
          return;
       }
       super.onDismiss(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveAsrFloatEditorFragment.class, "44")) {
          this.W0.setOnEditorActionListener(objArray);
          this.W0.removeTextChangedListener(this);
          this.W0.setScroller(objArray);
          this.W0.setOnClickListener(objArray);
          this.W0.removeOnLayoutChangeListener(this.G1);
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, LiveAsrFloatEditorFragment.class, "9")) {
          return;
       }
       super.onResume();
       if (this.m1 != null) {
          this.m1 = false;
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveAsrFloatEditorFragment.class, "8")) {
          return;
       }
       super.onStart();
       BaseEditorFragment tM = this.M;
       if (tM.mShowEmojiFirst != null && tM.mEnableEmotion != null) {
          if (this.f1.getAdapter() == null) {
             this.f1.setAdapter(new i$a());
             this.f1.setOnItemClickListener(new e(this));
          }
          this.h1.setVisibility(8);
          this.i1.setVisibility(0);
          this.Q = true;
          this.ti(true);
       }else if(tM.mShowAsrFirst != null && tM.mEnableAsr != null){
          this.f1.setVisibility(8);
          this.i1.setVisibility(8);
          this.y1 = true;
          this.si(true);
          this.ri();
       }else {
          this.W0.requestFocus();
          this.P = true;
          n.b0(this.getActivity(), this.W0, true);
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveAsrFloatEditorFragment.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveAsrFloatEditorFragment.class, "14")) {
          return;
       }
       try{
          super.onTextChanged(p0, p1, p2, p3);
          boolean i = ((this.W0.getText().toString()).trim()).length();
          if (this.M.mEnableEmpty == null) {
             LiveAsrFloatEditorFragment tb1 = this.b1;
             i = (i > 0)? true: false;
             tb1.setEnabled(i);
          label_0048 :
             if (this.M.mSingleLine == null && !PatchProxy.applyVoid(null, this, LiveAsrFloatEditorFragment.class, "15")) {
                i = this.W0.getLineCount();
                this.n1 = i;
                if (i > 6) {
                   this.W0.setVerticalScrollBarEnabled(true);
                }else {
                   this.W0.setVerticalScrollBarEnabled(false);
                }
             }
             if (this.M.mEnableInputAt != null) {
                this.ji(p0, p1, p2, p3);
             }
          }else {
             goto label_0048 ;
          }
       }catch(java.lang.Exception e9){
          e9.printStackTrace();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAsrFloatEditorFragment.class, "10")) {
          return;
       }
       super.onViewCreated(p0, p1);
       g og = this.ki();
       this.B1 = og;
       this.C1 = new LiveAsrFloatEditorFragment$f(og);
       Iterator iterator = this.li().iterator();
       while (iterator.hasNext()) {
          this.C1.U7(iterator.next());
       }
       this.C1.f(p0);
       Object[] objArray = new Object[]{this.B1};
       this.C1.i(objArray);
       return;
    }
    public int pi(){
       Object obj = PatchProxy.apply(null, this, LiveAsrFloatEditorFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       float y = (!q.f(this.M.mHotWords))? this.g1.getY(): this.d1.getY();
       return (int)y;
    }
    public a0 qi(){
       return null;
    }
    public final void ri(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAsrFloatEditorFragment.class, "41")) {
          return;
       }
       if (this.qi() != null) {
          objArray = this.qi().Z2.a();
       }
       f.e(objArray, "UNKNOWN");
       return;
    }
    public void si(boolean p0){
       if (PatchProxy.isSupport(LiveAsrFloatEditorFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAsrFloatEditorFragment.class, "28")) {
          return;
       }
       LiveAsrFloatEditorFragment th1 = this.h1;
       int i = (p0)? 0: 8;
       th1.setVisibility(i);
       if (!this.isAdded()) {
          return;
       }else {
          this.wi(p0);
          if (!PatchProxy.applyVoid(null, this, LiveAsrFloatEditorFragment.class, "29")) {
             LiveAsrFloatEditorFragment tB1 = this.B1;
             if (tB1 != null) {
                g h = tB1.h;
                if (h != null) {
                   h.c();
                }
             }
          }
          return;
       }
    }
    public void ti(boolean p0){
       if (PatchProxy.isSupport(LiveAsrFloatEditorFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAsrFloatEditorFragment.class, "27")) {
          return;
       }
       if (p0 && (this.O != null && this.f1.getHeight() < this.O)) {
          this.f1.getLayoutParams().height = this.O;
       }
    label_0031 :
       LiveAsrFloatEditorFragment tLiveAsrFloa = this.f1;
       int i = (p0)? 0: 8;
       tLiveAsrFloa.setVisibility(i);
       if (!this.isAdded()) {
          return;
       }else {
          this.xi(p0);
          return;
       }
    }
    public void ui(boolean p0){
       boolean b;
       if (PatchProxy.isSupport(LiveAsrFloatEditorFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAsrFloatEditorFragment.class, "26")) {
          return;
       }
       try{
          b.c0(LiveLogTag.LIVE_ASR_INPUT, "toggleAsr", "show", Boolean.valueOf(p0));
          int i = 8;
          if (!this.f1.getVisibility()) {
             this.f1.setVisibility(i);
          }
          b = true;
          boolean b1 = false;
          if (p0) {
             n.F(this.getDialog().getWindow());
             this.u1 = b;
             this.t1 = b1;
             f.j("showHideAsrView", new i(this), 300);
             this.i1.setVisibility(i);
             this.ri();
          }else {
             this.si(b1);
             this.i1.setVisibility(b1);
             this.W0.requestFocus();
             if (!this.W0.hasFocus()) {
                this.mi();
                this.P = b;
                n.a0(this.getActivity(), this.W0, 10);
             }else {
                this.P = b;
                n.b0(this.getActivity(), this.W0, b1);
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void vi(boolean p0){
       boolean b;
       LiveAsrFloatEditorFragment liveAsrFloat;
       if (PatchProxy.isSupport(LiveAsrFloatEditorFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAsrFloatEditorFragment.class, "25")) {
          return;
       }
       try{
          b.c0(LiveLogTag.LIVE_ASR_INPUT, "toggleEmotion", "show", Boolean.valueOf(p0));
          b = true;
          int i = 0;
          if (!this.h1.getVisibility()) {
             this.h1.setVisibility(8);
             this.i1.setVisibility(i);
             liveAsrFloat = 1;
          }else {
             liveAsrFloat = null;
          }
          if (p0) {
             if (this.f1.getAdapter() == null) {
                this.f1.setAdapter(new i$a());
                this.f1.setOnItemClickListener(new LiveAsrFloatEditorFragment$a(this));
             }
             n.F(this.getDialog().getWindow());
             this.t1 = b;
             this.u1 = i;
             if (liveAsrFloat) {
                this.W0.requestFocus();
             }
             f.j("showHideEmojiView", new h(this), 300);
             if (!PatchProxy.applyVoid(null, this, LiveAsrFloatEditorFragment.class, "33")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.type = 3;
                uElementPack.name = "click_emoji";
                uElementPack.action = 1196;
                u1.u(b, uElementPack, new ClientContent$ContentPackage());
             }
          }else {
             this.ti(i);
             this.W0.requestFocus();
             if (!this.W0.hasFocus()) {
                this.mi();
                this.P = b;
                n.a0(this.getActivity(), this.W0, 10);
             }else {
                this.P = b;
                n.b0(this.getActivity(), this.W0, i);
             }
          }
          a.p(p0);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void wi(boolean p0){
       if (PatchProxy.isSupport(LiveAsrFloatEditorFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAsrFloatEditorFragment.class, "31")) {
          return;
       }
       LiveAsrFloatEditorFragment tk1 = this.k1;
       Resources resources = this.getResources();
       int i = (p0)? 0x7f0811c0: 0x7f0811bc;
       tk1.setImageDrawable(resources.getDrawable(i));
       if (p0) {
          this.xi(false);
       }
       return;
    }
    public void xi(boolean p0){
       if (PatchProxy.isSupport(LiveAsrFloatEditorFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LiveAsrFloatEditorFragment.class, "30")) {
          return;
       }
       LiveAsrFloatEditorFragment tj1 = this.j1;
       Resources resources = this.getResources();
       int i = (p0)? 0x7f0811c0: 0x7f0811bf;
       tj1.setImageDrawable(resources.getDrawable(i));
       if (p0) {
          this.wi(false);
       }
       return;
    }
}

package com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import android.os.Handler;
import android.os.Looper;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import ky5.e;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.view.View;
import java.lang.Boolean;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import java.lang.CharSequence;
import lnc.a1;
import e17.i;
import android.widget.GridView;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import android.widget.EditText;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g$a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$g;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import com.yxcorp.utility.n;
import android.widget.ListAdapter;
import rnc.i$a;
import com.kwai.feature.component.commonfragment.baseeditor.FloatEditorFragment$a;
import android.widget.AdapterView$OnItemClickListener;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$d;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.Runnable;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import ky5.i;
import android.app.Activity;
import n3d.a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$l;
import wkd.b;
import java.lang.Integer;
import android.text.TextUtils;
import e17.i$b;
import java.lang.IndexOutOfBoundsException;
import java.util.ArrayList;
import lnc.c0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import android.os.Bundle;
import android.os.Build;
import ekd.i;
import android.view.WindowManager$LayoutParams;
import android.view.LayoutInflater;
import i2b.a;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.appcompat.widget.AppCompatEditText;
import com.kwai.feature.component.commonfragment.baseeditor.a;
import android.widget.TextView$OnEditorActionListener;
import android.view.ViewTreeObserver;
import com.kwai.feature.component.commonfragment.baseeditor.b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.widget.KSTextDisplayHandler;
import android.text.TextWatcher;
import ky5.f;
import android.text.InputFilter;
import java.util.Arrays;
import android.text.InputFilter$LengthFilter;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.Collection;
import ekd.q;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.view.ViewParent;
import android.widget.LinearLayout;
import ky5.g;
import android.view.View$OnLayoutChangeListener;
import com.kwai.feature.component.commonfragment.baseeditor.f;
import com.kwai.feature.component.commonfragment.baseeditor.c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$b;
import java.util.List;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.feature.component.commonfragment.baseeditor.d;
import android.view.View$OnTouchListener;
import ky5.l;
import cw9.c;
import com.kwai.feature.component.commonfragment.baseeditor.e;
import o56.c;
import o56.a;
import android.app.Application;
import android.widget.ImageButton;
import android.graphics.drawable.Drawable;
import ky5.m;
import ky5.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.b5;
import ky5.n;
import ly5.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.l;
import brd.t;
import t45.d;
import brd.z;
import ky5.j;
import erd.g;
import crd.b;
import androidx.fragment.app.KwaiDialogFragment;
import ky5.h;
import java.lang.Exception;

public class FloatEditorFragment extends BaseEditorFragment	// class@0011f7
{
    public final int[] V0;
    public EmojiEditText W0;
    public View X0;
    public View Y0;
    public View Z0;
    public View a1;
    public View b1;
    public View c1;
    public FrameLayout d1;
    public View e1;
    public GridView f1;
    public RecyclerView g1;
    public View$OnLayoutChangeListener h1;
    public boolean i1;
    public int j1;
    public int k1;
    public int l1;
    public int m1;
    public Handler n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public final boolean r1;
    public b s1;
    public BaseEditorFragment$j t1;
    public View$OnClickListener u1;
    public static final int v1;

    public void FloatEditorFragment(){
       super();
       int[] ointArray = new int[2];
       this.V0 = ointArray;
       this.n1 = new Handler(Looper.getMainLooper());
       this.o1 = false;
       this.p1 = false;
       this.q1 = false;
       this.r1 = a.t().d("enableEditorAnimationOpt", false);
       this.u1 = new e(this);
    }
    public int Dh(){
       Object obj = PatchProxy.apply(null, this, FloatEditorFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.r1 != null)? 0x7f1103ca: 0x7f1103bf;
       return i;
    }
    public EmojiEditText Kh(){
       return this.W0;
    }
    public View Nh(){
       return this.f1;
    }
    public boolean Rh(){
       BaseEditorFragment obj = PatchProxy.apply(null, this, FloatEditorFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.M;
       if (obj.mAtFriendMaxLimit != -1 && obj.mAtFriendMaxLimitToastResId > null) {
          BaseEditorFragment tM = this.M;
          BaseEditorFragment$Arguments mAtFriendMax = tM.mAtFriendMaxLimit;
          if (this.mi(this.W0.getText()) > mAtFriendMax) {
             i.d(R.style.arg_RES_7f11066a, a1.q(tM.mAtFriendMaxLimitToastResId, mAtFriendMax));
             return true;
          }
       }
       return false;
    }
    public boolean Th(){
       FloatEditorFragment obj = PatchProxy.apply(null, this, FloatEditorFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f1;
       boolean b = (obj != null && !obj.getVisibility())? true: false;
       return b;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, FloatEditorFragment.class, "23")) {
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
    public void gi(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FloatEditorFragment.class, "25")) {
          return;
       }
       try{
          LinearLayout$LayoutParams layoutParams = this.a1.getLayoutParams();
          layoutParams.height = this.a1.getHeight();
          layoutParams.weight = 0;
          int height = this.getDialog().getWindow().getDecorView().getHeight();
          if (this.f1.getVisibility() != 8) {
             i$a uoa = 4;
             if (this.f1.getVisibility() == uoa) {
             label_008e :
                if (this.f1.getAdapter() == null) {
                   this.f1.setAdapter(new i$a());
                   this.f1.setOnItemClickListener(new FloatEditorFragment$a(this));
                }
                if ((layoutParams.height + this.f1.getLayoutParams().height) > height) {
                   layoutParams.height = layoutParams.height - this.f1.getLayoutParams().height;
                }
                n.F(this.getDialog().getWindow());
                if (!this.f1.getHeight() && this.O != null) {
                   this.f1.getLayoutParams().height = this.O;
                }
                this.f1.setVisibility(0);
                if (!PatchProxy.applyVoid(objArray, this, FloatEditorFragment.class, "27")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.type = 3;
                   uElementPack.name = "click_emoji";
                   uElementPack.action = 1196;
                   u1.u(1, uElementPack, new ClientContent$ContentPackage());
                }
                if (this.Mh() != null) {
                   this.Mh().a();
                }
             }else {
                BaseEditorFragment tO = this.O;
                if ((layoutParams.height + tO) > height) {
                   layoutParams.height = ((height - tO) - this.b1.getHeight()) - this.f1.getHeight();
                }
                this.f1.setVisibility(uoa);
                this.W0.requestFocus();
                if (!this.W0.hasFocus()) {
                   this.li();
                   this.P = true;
                   n.a0(this.getActivity(), this.W0, 10);
                }else {
                   this.P = true;
                   n.b0(this.getActivity(), this.W0, 0);
                }
             }
          }else {
             goto label_008e ;
          }
          this.a1.setLayoutParams(layoutParams);
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void hi(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FloatEditorFragment.class, "28")) {
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
       if (PatchProxy.applyVoid(null, this, FloatEditorFragment.class, "24")) {
          return;
       }
       if (!QCurrentUser.me().isLogined() && this.H != null) {
          this.cancel();
          this.H.run();
          return;
       }else {
          BaseEditorFragment tE = this.E;
          if (tE != null) {
             tE.onClick(this.X0.findViewById(R.id.at_button));
          }
          this.i1 = true;
          Editable text = this.W0.getText();
          i obj = PatchProxy.applyOneRefs(text, this, FloatEditorFragment.class, "32");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(this.M.mAtFriendMaxLimit == -1){
             i = -1;
          }else if(TextUtils.x(text)){
             i = this.M.mAtFriendMaxLimit;
          }else {
             int i2 = this.M.mAtFriendMaxLimit - this.mi(text);
             i = (i2 < 0)? 0: i2;
          }
          SelectUsersBundle selectUsersB = new SelectUsersBundle().setBizId(this.M.mSelectUserBizId).setLimitNum(i).setLimitToast(this.M.mAtFriendMaxLimitToastResId);
          obj = new i(this);
          BaseEditorFragment tF = this.F;
          if (tF != null) {
             tF.T0(this.getActivity(), selectUsersB, obj);
          }else {
             int i1 = -1592401538;
             if (b.a(i1) != null) {
                b.a(i1).T0(this.getActivity(), selectUsersB, obj);
             }
          }
          this.getActivity().overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f0100f1);
          return;
       }
    }
    public final void ji(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(FloatEditorFragment.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, FloatEditorFragment.class, "14")) {
          return;
       }
       if (this.p1 != null) {
          this.p1 = false;
          return;
       }else {
          String str = "";
          String str1 = (p0 != null)? p0.toString(): str;
          if (str1.length() > 0 && p3 == 1) {
             str = str1.substring(p1, (p1 + 1));
          }
          if (("@").equals(str) || ("£À").equals(str)) {
             this.o1 = true;
             this.ii();
          }
          return;
       }
    }
    public void ki(boolean p0){
       BaseEditorFragment$g$a og$a1;
       if (PatchProxy.isSupport(FloatEditorFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FloatEditorFragment.class, "21")) {
          return;
       }
       if (!this.Z0.isEnabled()) {
          return;
       }
       if (this.Rh()) {
          return;
       }
       String str = TextUtils.G(this.W0).toString();
       boolean b = true;
       if (TextUtils.isEmpty(str.trim())) {
          i$b uob = i.m();
          uob.x(R.string.arg_RES_7f104252);
          uob.l(b);
          i.c(R.style.arg_RES_7f11066a, uob);
          return;
       }else if(!TextUtils.isEmpty(str)){
          if (this.Lh() != null) {
             BaseEditorFragment$g$a og$a = new BaseEditorFragment$g$a();
             og$a.l(str);
             og$a.i(this.W0.j());
             og$a.f(p0);
             this.Lh().a(og$a.a());
          }
       }else if(this.M.mEnableEmpty != null){
          if (this.Lh() != null) {
             og$a1 = new BaseEditorFragment$g$a();
             og$a1.l("");
             this.Lh().a(og$a1.a());
          }
       }else if(this.Lh() != null){
          og$a1 = new BaseEditorFragment$g$a();
          og$a1.d(b);
          og$a1.l("");
          this.Lh().a(og$a1.a());
       }
       if (this.M.mDismissAfterEntryComplete != null) {
          this.dismiss();
       }else {
          this.W0.setText("");
       }
       return;
    }
    public void li(){
       if (PatchProxy.applyVoid(null, this, FloatEditorFragment.class, "26")) {
          return;
       }
       boolean b = true;
       this.W0.setFocusable(b);
       this.W0.setFocusableInTouchMode(b);
       FloatEditorFragment tW0 = this.W0;
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
    public final int mi(CharSequence p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, FloatEditorFragment.class, "33");
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
    public int ni(){
       FloatEditorFragment obj = PatchProxy.apply(null, this, FloatEditorFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d1;
       int height = (obj != null)? obj.getHeight(): 0;
       return (((this.g1.getHeight() + this.Y0.getHeight()) + this.c1.getHeight()) + height);
    }
    public int oi(){
       Object obj = PatchProxy.apply(null, this, FloatEditorFragment.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       float y = (this.qi())? this.g1.getY(): this.b1.getY();
       return (int)y;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FloatEditorFragment.class, "7")) {
          return;
       }
       super.onActivityCreated(p0);
       if (!PatchProxy.applyVoid(null, this, FloatEditorFragment.class, "6")) {
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
       View view1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, FloatEditorFragment.class, "1");
       if (p2 != patchProxyRe) {
          return p2;
       }
       Context context = p0.getContext();
       BaseEditorFragment$Arguments forceDayNigh = this.M.forceDayNightMode;
       if (forceDayNigh == 32 || forceDayNigh == 16) {
          p0 = p0.cloneInContext(this.Ih(context, forceDayNigh));
       }
       View view = PatchProxy.applyTwoRefs(p0, p1, this, FloatEditorFragment.class, "2");
       if (view != patchProxyRe) {
       }else {
          BaseEditorFragment tM1 = this.M;
          view1 = (tM1 != null && tM1.mEnableEditorOpt != null)? a.g(p0, R.layout.arg_RES_7f0d0451, p1, 0): a.g(p0, R.layout.arg_RES_7f0d0450, p1, 0);
          view = view1;
       }
       this.X0 = view;
       Object[] objArray = null;
       boolean b = true;
       if (!PatchProxy.applyVoid(objArray, this, FloatEditorFragment.class, "17")) {
          this.b1 = this.X0.findViewById(0x7f0a0953);
          c uoc = 2;
          this.m1 = ViewConfiguration.get(this.getContext()).getScaledTouchSlop() * 2;
          BaseEditorFragment$Arguments mTheme = this.M.mTheme;
          this = 0x7f0a0eb0;
          int i = 0x7f0a0eb1;
          if (mTheme == 0x7f11013c || mTheme == 0x7f110144) {
             view1 = this.X0.findViewById(i);
             this.Z0 = view1;
             view1.setVisibility(0);
             this.X0.findViewById(this).setVisibility(8);
          }else {
             this.Z0 = this.X0.findViewById(this);
             this.X0.findViewById(i).setVisibility(8);
          }
          this.Z0.setOnClickListener(this.u1);
          this.Z0.setEnabled(this.M.mEnableEmpty);
          if (!TextUtils.isEmpty(this.M.mFinishButtonText)) {
             this.Z0.setText(this.M.mFinishButtonText);
          }
          mTheme = this.M.mFinishButtonBackgroundResId;
          if (mTheme > null) {
             this.Z0.setBackgroundResource(mTheme);
          }
          int i1 = 0x7f0a0eb2;
          if (this.M.mFinishButtonLayoutGravityOnBottom != null) {
             view1 = this.X0.findViewById(i1);
             if (view1 != null && view1.getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
                view1.height = (a1.d(0x7f07023a) + (a1.e(10.00f) * 2)) + a1.e(7.00f);
             }
          }
          mTheme = this.M.mFinishButtonTextColorResId;
          if (mTheme > null) {
             this.Z0.setTextColor(a1.a(mTheme));
          }
          EmojiEditText uEmojiEditTe = this.X0.findViewById(R.id.editor);
          this.W0 = uEmojiEditTe;
          BaseEditorFragment$Arguments mInputBackgr = this.M.mInputBackgroundResId;
          if (mInputBackgr > -1) {
             uEmojiEditTe.setBackgroundResource(mInputBackgr);
          }
          mTheme = this.M.mImeOptions;
          if (mTheme >= null) {
             this.W0.setImeOptions((mTheme | 0x10000000));
          }
          this.W0.setOnEditorActionListener(new a(this));
          this.b1.getViewTreeObserver().addOnPreDrawListener(new b(this, this.b1.findViewById(R.id.editor_animation_frame)));
          KSTextDisplayHandler kSTextDispla = this.W0.getKSTextDisplayHandler();
          this = (this.M.mEnableAtFriends != null)? 2: 0;
          kSTextDispla.o((this | b));
          kSTextDispla = this.W0.getKSTextDisplayHandler();
          BaseEditorFragment tM = this.M;
          this = (tM != null && tM.mShowUserAlias != null)? true: false;
          kSTextDispla.p(this);
          this.W0.addTextChangedListener(this);
          this.W0.setOnClickListener(super(this));
          if (this.M.mTextLimit > null) {
             InputFilter[] inputFilterA = Arrays.copyOf(this.W0.getFilters(), (this.W0.getFilters().length + b));
             inputFilterA[(inputFilterA.length - b)] = new InputFilter$LengthFilter(this.M.mTextLimit);
             this.W0.setFilters(inputFilterA);
          }
          this.W0.setSingleLine(this.M.mSingleLine);
          this.W0.setInputType(this.M.mKeyboardType);
          if (this.M.mSingleLine == null) {
             this.W0.setMaxLines(6);
             this.W0.setScroller(new Scroller(this.getActivity()));
             this.W0.setVerticalScrollBarEnabled(0);
          }
          mTheme = this.M.mInputBackgroundResId;
          if (mTheme > null) {
             this.W0.setBackgroundResource(mTheme);
          }
          this.f1 = this.X0.findViewById(0x7f0a0d0b);
          this.Y0 = this.X0.findViewById(0x7f0a0be0);
          view1 = this.X0.findViewById(R.id.operation_layout);
          this.c1 = view1;
          mInputBackgr = this.M.mInputContentBackResId;
          if (mInputBackgr > null) {
             view1.setBackgroundResource(mInputBackgr);
          }
          RecyclerView recyclerView = this.X0.findViewById(R.id.hot_words);
          this.g1 = recyclerView;
          recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, 0));
          if (!q.f(this.M.mHotWords)) {
             if (!PatchProxy.applyVoid(objArray, this, FloatEditorFragment.class, "19") && (a1.i(this.getActivity()) && this.getActivity().getResources().getConfiguration().orientation == uoc)) {
                if (this.g1.getParent() instanceof LinearLayout) {
                   LinearLayout parent = this.g1.getParent();
                   parent.setGravity(80);
                   parent.setClipToPadding(0);
                }
                g og = new g(this);
                this.h1 = og;
                this.g1.addOnLayoutChangeListener(og);
             }
          label_02b1 :
             f uof = new f();
             uof.r1(new c(this));
             uof.W0(this.M.mHotWords);
             this.g1.setAdapter(uof);
             this.g1.setVisibility(0);
             this.Y0.setVisibility(0);
          }else {
             this.g1.setVisibility(8);
             this.Y0.setVisibility(8);
          }
          view1 = this.X0.findViewById(R.id.placeholder);
          this.a1 = view1;
          view1.setOnTouchListener(new d(this));
          int i2 = 0x7f0a0cf0;
          if (this.M.mEnableEmotion != null) {
             this.X0.findViewById(i2).setOnClickListener(new l(this));
          }else {
             this.X0.findViewById(i2).setVisibility(8);
             this.X0.findViewById(i1).setPadding(c.b(this.getResources(), R.dimen.arg_RES_7f070a7f), 0, c.b(this.getResources(), R.dimen.arg_RES_7f070a7f), 0);
          }
          i2 = 0x7f0a026f;
          if (this.M.mEnableAtFriends != null) {
             this.X0.findViewById(i2).setOnClickListener(new e(this));
          }else {
             this.X0.findViewById(i2).setVisibility(8);
             FloatEditorFragment tW0 = this.W0;
             tW0.setPadding((tW0.getPaddingLeft() + n.c(a.a().a(), 16.00f)), this.W0.getPaddingTop(), this.W0.getPaddingRight(), this.W0.getPaddingBottom());
          }
          i2 = 0x7f0a171b;
          if (this.M.mShowLeftBtn != null) {
             ImageButton imageButton = this.X0.findViewById(i2);
             this.J = imageButton;
             imageButton.setVisibility(0);
             this.J.setImageDrawable(this.K);
             this.J.setOnClickListener(new m(this));
          }else {
             this.X0.findViewById(i2).setVisibility(8);
          }
          BaseEditorFragment tN = this.N;
          if (tN != null) {
             this.p1 = ("@").equals(tN.toString());
             this.W0.setText(this.N);
             if (this.M.mShowKeyBoardFirst != null) {
                try{
                   this.W0.setSelection(this.N.length());
                }catch(java.lang.IndexOutOfBoundsException e9){
                   e9.printStackTrace();
                }
             }else {
                this.W0.setFocusable(0);
             }
          }
       }
    label_0422 :
       if (this.r1 != null && !PatchProxy.applyVoid(objArray, this, FloatEditorFragment.class, "3")) {
          PresenterV2 presenterV2 = new PresenterV2();
          objArray = PatchProxy.apply(objArray, this, FloatEditorFragment.class, "29");
          if (objArray != patchProxyRe) {
             b = objArray.booleanValue();
          }else {
             FragmentActivity activity = this.getActivity();
             if (b5.a(activity) || n.b(activity)) {
                b = false;
             }
          }
          if (b) {
             presenterV2.U7(new a(this));
          }
          presenterV2.f(this.X0);
          objArray = new Object[0];
          presenterV2.i(objArray);
       }
       this.s1 = RxBus.f.f(l.class).observeOn(d.a).subscribe(new j(this));
       return this.X0;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, FloatEditorFragment.class, "11")) {
          return;
       }
       super.onDestroyView();
       FloatEditorFragment th1 = this.h1;
       if (th1 != null) {
          this.g1.removeOnLayoutChangeListener(th1);
       }
       th1 = this.s1;
       if (th1 != null) {
          th1.dispose();
          this.s1 = null;
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, FloatEditorFragment.class, "9")) {
          return;
       }
       super.onResume();
       if (this.i1 != null) {
          this.i1 = false;
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, FloatEditorFragment.class, "8")) {
          return;
       }
       super.onStart();
       if (this.f1.getVisibility()) {
          BaseEditorFragment tM = this.M;
          if (tM.mShowKeyBoardFirst != null) {
             this.W0.requestFocus();
             this.P = true;
             n.b0(this.getActivity(), this.W0, true);
          }else if(tM.mShowEmojiFirst != null && tM.mEnableEmotion != null){
             if (this.f1.getAdapter() == null) {
                this.f1.setAdapter(new i$a());
                this.f1.setOnItemClickListener(new h(this));
             }
             this.f1.setVisibility(0);
          }
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(FloatEditorFragment.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, FloatEditorFragment.class, "12")) {
          return;
       }
       try{
          super.onTextChanged(p0, p1, p2, p3);
          String str = "";
          if (this.W0.getText() != null) {
             str = this.W0.getText().toString();
          label_0038 :
             boolean i = (str.trim()).length();
             if (this.M.mEnableFinishShowWithSpace != null) {
                i = str.length();
             }
             if (this.M.mEnableEmpty == null) {
                FloatEditorFragment tZ0 = this.Z0;
                i = (i > 0)? true: false;
                tZ0.setEnabled(i);
             }
             if (this.M.mSingleLine == null && !PatchProxy.applyVoid(null, this, FloatEditorFragment.class, "13")) {
                int lineCount = this.W0.getLineCount();
                this.j1 = lineCount;
                if (lineCount > 6) {
                   this.W0.setVerticalScrollBarEnabled(true);
                }else {
                   this.W0.setVerticalScrollBarEnabled(false);
                }
             }
             if (this.M.mEnableInputAt != null) {
                this.ji(p0, p1, p2, p3);
             }
          }else {
             goto label_0038 ;
          }
       }catch(java.lang.Exception e9){
          e9.printStackTrace();
       }
       return;
    }
    public boolean pi(){
       return this.q1;
    }
    public boolean qi(){
       Object obj = PatchProxy.apply(null, this, FloatEditorFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!q.f(this.M.mHotWords) && !this.g1.getVisibility())? true: false;
       return b;
    }
    public void ri(boolean p0){
       this.q1 = p0;
    }
}

package com.yxcorp.gifshow.magic.ui.magicemoji.wish.WishInputFragment;
import ml8.d;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.widget.EmojiEditText;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.WishMagicInfo;
import java.util.List;
import com.yxcorp.gifshow.model.WishMagicInfo$WishMagicDetailInfo;
import com.yxcorp.gifshow.magic.ui.magicemoji.wish.WishInputFragment$b;
import android.view.View;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.feature.post.api.widget.PostRadioGroupWithIndicator;
import android.widget.EditText;
import n5b.h;
import android.view.View$OnClickListener;
import n5b.f;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.ViewGroup;
import com.yxcorp.gifshow.magic.ui.widget.a;
import java.util.Collection;
import ekd.q;
import android.text.InputFilter;
import n5b.n;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import android.view.LayoutInflater;
import android.os.Bundle;
import i2b.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import androidx.fragment.app.Fragment;
import com.yxcorp.utility.n;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.magic.ui.magicemoji.wish.WishInputFragment$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import androidx.fragment.app.FragmentActivity;
import android.widget.FrameLayout;
import n5b.j;
import java.lang.Runnable;
import com.yxcorp.gifshow.magic.ui.magicemoji.wish.b;
import n5b.g;
import n5b.k;
import android.text.TextWatcher;
import android.view.ViewTreeObserver;
import n5b.l;
import android.view.ViewTreeObserver$OnPreDrawListener;
import s5b.b;
import q87.c;
import android.content.DialogInterface;
import androidx.fragment.app.KwaiDialogFragment;

public class WishInputFragment extends BaseEditorFragment implements d	// class@001c45
{
    public View V0;
    public RecyclerView W0;
    public WishInputFragment$a X0;
    public PostRadioGroupWithIndicator Y0;
    public View Z0;
    public EditText a1;
    public View b1;
    public MagicEmoji$MagicFace c1;
    public WishMagicInfo d1;
    public WishInputFragment$b e1;
    public Handler f1;
    public int g1;
    public int h1;
    public static final int i1;

    public void WishInputFragment(){
       super();
       this.f1 = new Handler(Looper.getMainLooper());
    }
    public int Dh(){
       return 0x7f1103a5;
    }
    public EmojiEditText Kh(){
       return null;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, WishInputFragment.class, "3")) {
          return;
       }
       if (this.e1 != null) {
          WishMagicInfo$WishMagicDetailInfo wishMagicDet = this.d1.mWishMagicDetailInfos.get(this.g1);
          this.e1.b(wishMagicDet.mIndex, wishMagicDet.mContent);
       }
       this.dismiss();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WishInputFragment.class, "1")) {
          return;
       }
       this.W0 = m1.f(p0, 0x7f0a064f);
       this.Y0 = m1.f(p0, 0x7f0a45b0);
       this.Z0 = m1.f(p0, 0x7f0a45ae);
       this.a1 = m1.f(p0, 0x7f0a45ad);
       this.b1 = m1.f(p0, 0x7f0a45ac);
       m1.a(p0, new h(this), R.id.magic_emoji_wish_finish_btn);
       m1.a(p0, new f(this), R.id.magic_emoji_wish_touch_view);
       return;
    }
    public void hi(CharSequence p0){
    }
    public int ii(){
       Object obj = PatchProxy.apply(null, this, WishInputFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.Z0.getBottom() - this.W0.getTop());
    }
    public int ji(){
       Object obj = PatchProxy.apply(null, this, WishInputFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       float y = (!q.f(this.X0.f))? this.W0.getY(): this.Z0.getY();
       return (int)y;
    }
    public final void ki(WishMagicInfo$WishMagicDetailInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WishInputFragment.class, "9")) {
          return;
       }
       this.X0.L0(p0.mCandidateWords);
       int i = 0;
       this.W0.smoothScrollToPosition(i);
       InputFilter[] inputFilterA = new InputFilter[]{new n((p0.mMaxInputLength * 2))};
       this.a1.setFilters(inputFilterA);
       this.a1.setHint(p0.mInputHint);
       this.a1.setText(p0.mContent);
       if (!TextUtils.x(p0.mContent)) {
          this.a1.setSelection((p0.mContent).length());
       }
       WishInputFragment tb1 = this.b1;
       if (TextUtils.x(p0.mContent)) {
          i = 8;
       }
       tb1.setVisibility(i);
       return;
    }
    public void li(MagicEmoji$MagicFace p0){
       this.c1 = p0;
    }
    public void mi(WishMagicInfo$WishMagicDetailInfo p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WishInputFragment.class, "10")) {
          return;
       }
       p0.mContent = p1;
       WishInputFragment te1 = this.e1;
       if (te1 != null) {
          te1.a(p0.mIndex, p1);
       }
       return;
    }
    public void ni(WishInputFragment$b p0){
       this.e1 = p0;
    }
    public void oi(WishMagicInfo p0){
       this.d1 = p0;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, WishInputFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       boolean b = false;
       View view = a.g(p0, R.layout.arg_RES_7f0d0ed1, p1, b);
       this.V0 = view;
       this.doBindView(view);
       if (!PatchProxy.applyVoid(null, this, WishInputFragment.class, "8") && this.d1 != null) {
          LinearLayoutManager linearLayout = new LinearLayoutManager(this.W0.getContext());
          linearLayout.setOrientation(b);
          this.W0.setLayoutManager(linearLayout);
          this.W0.addItemDecoration(new b(b, n.c(this.getContext(), 19.00f), n.c(this.getContext(), 19.00f), n.c(this.getContext(), 12.00f)));
          WishInputFragment$a uoa = new WishInputFragment$a(this, this.getContext());
          this.X0 = uoa;
          this.W0.setAdapter(uoa);
          boolean b1 = true;
          if (this.M.mShowKeyBoardFirst != null) {
             this.a1.requestFocus();
             this.P = b1;
             n.b0(this.getActivity(), this.a1, b1);
          }
          this.a1.setSaveEnabled(b);
          this.g1 = b;
          if (this.d1.mWishMagicDetailInfos.size() == b1) {
             this.Y0.setVisibility(8);
             this.Y0.postDelayed(new j(this), 100);
          }else {
             this.Y0.postDelayed(new b(this), 100);
          }
          this.b1.setOnClickListener(new g(this));
          this.a1.addTextChangedListener(new k(this));
          this.Z0.getViewTreeObserver().addOnPreDrawListener(new l(this));
       }
       Object[] objArray = new Object[b];
       b.D().w("WishInputFragment", "onCreateView", objArray);
       return this.V0;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WishInputFragment.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("WishInputFragment", "onDismiss", objArray);
       super.onDismiss(p0);
       int i = 0;
       while (i < this.d1.mWishMagicDetailInfos.size()) {
          WishMagicInfo$WishMagicDetailInfo wishMagicDet = this.d1.mWishMagicDetailInfos.get(i);
          if (wishMagicDet != null && (TextUtils.x(wishMagicDet.mContent) && !q.f(wishMagicDet.mCandidateWords))) {
             this.mi(wishMagicDet, wishMagicDet.generateContent());
             wishMagicDet.mIsManual = false;
          }
       label_004c :
          i++;
       }
       WishInputFragment te1 = this.e1;
       if (te1 != null) {
          te1.onDismiss();
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, WishInputFragment.class, "4")) {
          return;
       }
       super.onStart();
       Object[] objArray = new Object[0];
       b.D().w("WishInputFragment", "onStart", objArray);
       n.Y(this.Z0, 0, 0);
       this.a1.requestFocus();
       this.P = true;
       n.b0(this.getActivity(), this.a1, true);
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, WishInputFragment.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("WishInputFragment", "onStop", objArray);
       n.Y(this.V0, 4, 0);
       super.onStop();
       return;
    }
}

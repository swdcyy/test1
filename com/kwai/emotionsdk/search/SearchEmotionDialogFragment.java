package com.kwai.emotionsdk.search.SearchEmotionDialogFragment;
import im8.g;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.WeakHashMap;
import io.reactivex.subjects.PublishSubject;
import com.kwai.emotionsdk.search.constant.SearchState;
import java.lang.Object;
import mrd.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fl5.h;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import android.view.View;
import androidx.fragment.app.Fragment;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewParent;
import lnc.a1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.Integer;
import xk5.d;
import android.app.Dialog;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import jl5.l;
import hl5.d0;
import hl5.i;
import hl5.b0;
import hl5.g0;

public class SearchEmotionDialogFragment extends BottomSheetDialogFragment implements g	// class@000db3
{
    public String b;
    public int c;
    public int d;
    public d e;
    public c f;
    public c g;
    public PresenterV2 h;
    public static final WeakHashMap i;

    static {
       SearchEmotionDialogFragment.i = new WeakHashMap();
    }
    public void SearchEmotionDialogFragment(){
       super();
       this.b = "";
       this.c = 8;
       this.d = 0;
       this.f = PublishSubject.g();
       this.g = a.h(SearchState.IDLE);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchEmotionDialogFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, SearchEmotionDialogFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(SearchEmotionDialogFragment.class, new h());
       }else {
          obj.put(SearchEmotionDialogFragment.class, null);
       }
       return obj;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchEmotionDialogFragment.class, "6")) {
          return;
       }
       super.onActivityCreated(p0);
       View view = this.getView();
       if (view != null) {
          ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
          int i = (int)((double)n.u(this.getContext()) * 0x3feb333333333333);
          if (layoutParams != null && i > 0) {
             layoutParams.height = i;
             view.setLayoutParams(layoutParams);
          }
          view = view.getParent();
          if (view != null) {
             view.setBackgroundColor(a1.a(R.color.arg_RES_7f060a2c));
             BottomSheetBehavior uBottomSheet = BottomSheetBehavior.from(view);
             if (uBottomSheet != null) {
                uBottomSheet.setPeekHeight(i);
             }
          }
       }
    label_004d :
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchEmotionDialogFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          this.d = p0.getInt("SEARCH_BIZ_TYPE", 0);
          this.b = p0.getString("KEYWORD", "");
          this.c = p0.getInt("KEYWORD_LIMIT", 8);
          int intx = p0.getInt("SEARCH_CALLBACK", 0);
          if (intx) {
             this.e = SearchEmotionDialogFragment.i.get(Integer.valueOf(intx));
          }
       }
       if (this.e == null) {
          this.dismissAllowingStateLoss();
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, SearchEmotionDialogFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       obj = uDialog.getWindow();
       int i = (int)((double)n.u(this.getContext()) * 0x3feb333333333333);
       if (!i) {
          i = -1;
       }
       obj.setLayout(-1, i);
       obj.setWindowAnimations(R.style.arg_RES_7f11036d);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, SearchEmotionDialogFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.c(p0, 0x7f0d03e1, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, SearchEmotionDialogFragment.class, "8")) {
          return;
       }
       super.onDestroyView();
       this.h.unbind();
       this.h.destroy();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, SearchEmotionDialogFragment.class, "7")) {
          return;
       }
       super.onPause();
       Dialog dialog = this.getDialog();
       if (dialog != null && dialog.isShowing()) {
          dialog.getWindow().setWindowAnimations(R.style.arg_RES_7f11036e);
       }
       View view = this.getView();
       if (view != null) {
          l.a(this.getContext(), view.findViewById(R.id.edit_text));
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SearchEmotionDialogFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       PresenterV2 presenterV2 = new PresenterV2();
       this.h = presenterV2;
       presenterV2.U7(new d0());
       this.h.U7(new i());
       this.h.U7(new b0());
       this.h.U7(new g0());
       this.h.f(p0);
       Object[] objArray = new Object[]{this};
       this.h.i(objArray);
       return;
    }
}

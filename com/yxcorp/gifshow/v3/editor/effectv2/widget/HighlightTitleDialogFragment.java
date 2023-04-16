package com.yxcorp.gifshow.v3.editor.effectv2.widget.HighlightTitleDialogFragment;
import com.yxcorp.gifshow.v3.widget.TextBasePanelFragment;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.effectv2.action.HighlightTextPanelCloseAction;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnc.a1;
import e17.i;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.effectv2.action.HighlightTimeTextChangeAction;
import tvc.e;
import kqc.c;
import kqc.g;
import hqc.c;
import java.util.HashMap;
import android.widget.EditText;
import lqc.g;
import kqc.f;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import lqc.b;
import lqc.d;
import hqc.a;
import com.yxcorp.gifshow.widget.adv.ITimelineView$IRangeView$a;
import android.text.TextUtils;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;

public final class HighlightTitleDialogFragment extends TextBasePanelFragment	// class@000f71
{
    public d C;
    public TextView D;
    public RelativeLayout E;
    public EditReduxViewModel F;
    public HashMap G;

    public void HighlightTitleDialogFragment(EditorDelegate p0){
       a.p(p0, "editorDelegate");
       super(p0);
    }
    public void Bh(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HighlightTitleDialogFragment.class, "8")) {
          return;
       }
       a.p(p0, "s");
       HighlightTitleDialogFragment tC = this.C;
       if (tC == null) {
          a.S("effectViewModel");
       }
       tC.t0(new HighlightTextPanelCloseAction());
       return;
    }
    public void Ch(){
    }
    public void Dh(){
       if (PatchProxy.applyVoid(null, this, HighlightTitleDialogFragment.class, "9")) {
          return;
       }
       i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f1014f2));
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, HighlightTitleDialogFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "inflater");
       super.onCreateView(p0, p1, p2);
       View view = this.wh().findViewById(R.id.opening_title_top_bar_description);
       a.o(view, "rootView.findViewById\(R.¡­itle_top_bar_description\)");
       this.D = view;
       view = this.wh().findViewById(R.id.opening_title_reco_list);
       a.o(view, "rootView.findViewById\(R.¡­.opening_title_reco_list\)");
       this.E = view;
       this.wh().setBackground(a1.f(R.drawable.arg_RES_7f080d97));
       HighlightTitleDialogFragment tD = this.D;
       if (tD == null) {
          a.S("description");
       }
       int i = 8;
       tD.setVisibility(i);
       tD = this.E;
       if (tD == null) {
          a.S("recoList");
       }
       tD.setVisibility(i);
       TextBasePanelFragment textBasePane = PatchProxy.apply(null, this, TextBasePanelFragment.class, "8");
       if (textBasePane != PatchProxyResult.class) {
       }else {
          textBasePane = this.y;
          if (textBasePane == null) {
             a.S("confirmBtn");
          }
       }
       textBasePane.setAlpha(0x3f800000);
       return this.wh();
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, HighlightTitleDialogFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       HighlightTitleDialogFragment tC = this.C;
       if (tC == null) {
          a.S("effectViewModel");
       }
       tC.t0(new HighlightTextPanelCloseAction());
       this.sh();
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       String str2;
       if (PatchProxy.isSupport(HighlightTitleDialogFragment.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, HighlightTitleDialogFragment.class, "7")) {
          return;
       }
       HighlightTitleDialogFragment tC = this.C;
       String str = "effectViewModel";
       if (tC == null) {
          a.S(str);
       }
       String str1 = "";
       if (p0 == null) {
          str2 = str1;
       }
       str2 = p0.toString();
       HighlightTitleDialogFragment tC1 = this.C;
       if (tC1 == null) {
          a.S(str);
       }
       c uoc = tC1.o0().j().f();
       if (uoc != null) {
          str = uoc.H();
          if (str != null) {
             str1 = str;
          }
       }
       tC.t0(new HighlightTimeTextChangeAction(str2, str1));
       return;
    }
    public void sh(){
       if (PatchProxy.applyVoid(null, this, HighlightTitleDialogFragment.class, "11")) {
          return;
       }
       HighlightTitleDialogFragment tG = this.G;
       if (tG != null) {
          tG.clear();
       }
       return;
    }
    public int xh(){
       return 8;
    }
    public void zh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HighlightTitleDialogFragment.class, "4")) {
          return;
       }
       this.vh().setSingleLine();
       HighlightTitleDialogFragment tC = this.C;
       if (tC == null) {
          a.S("effectViewModel");
       }
       c uoc = tC.o0();
       c uoc1 = PatchProxy.applyOneRefs(uoc, objArray, g.class, "9");
       if (uoc1 != PatchProxyResult.class) {
       }else {
          a.p(uoc, "state");
          double d = uoc.i().b();
          Iterator iterator = uoc.j().d().iterator();
          while (true) {
             if (iterator.hasNext()) {
                Object obj = iterator.next();
                if (b.a.a(d.a.d(uoc), d, obj.h(), obj.g(), uoc.b())) {
                   uoc1 = obj.u;
                }
             }else {
                uoc1 = "";
             }
          }
       }
       this.vh().setText(uoc1);
       this.vh().setSelection(uoc1.length());
       if (TextUtils.isEmpty(uoc1)) {
          this.uh().setVisibility(8);
       }else {
          this.uh().setVisibility(0);
       }
       return;
    }
}

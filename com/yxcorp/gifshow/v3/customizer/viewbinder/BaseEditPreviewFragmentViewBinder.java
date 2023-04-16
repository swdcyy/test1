package com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import com.kuaishou.viewbinder.BaseViewBinder;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import com.yxcorp.gifshow.widget.FlexScreenStatusData;
import android.app.Activity;
import lnc.u6;
import nsd.u;
import uwc.b;
import lwc.h;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import android.widget.TextView;
import android.widget.FrameLayout;
import android.view.View;
import com.kwai.library.widget.textview.SizeAdjustableTextView;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import t36.f;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder$a;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder$b;
import nwc.m;
import com.yxcorp.gifshow.v3.EditorManager;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import roc.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public abstract class BaseEditPreviewFragmentViewBinder extends BaseViewBinder	// class@000d62
{
    public View e;
    public SizeAdjustableTextView f;
    public SizeAdjustableTextView g;
    public FrameLayout h;
    public TextView i;
    public TextView j;
    public EditDecorationContainerViewV2 k;
    public c l;
    public FlexScreenStatusData m;
    public h n;
    public b o;

    public void BaseEditPreviewFragmentViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
       this.l = p0;
    }
    public final BaseEditorFragment A(){
       BaseEditPreviewFragmentViewBinder obj = PatchProxy.apply(null, this, BaseEditPreviewFragmentViewBinder.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       Objects.requireNonNull(obj, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.editor.BaseEditorFragment");
       return obj;
    }
    public final FlexScreenStatusData B(){
       Activity obj = PatchProxy.apply(null, this, BaseEditPreviewFragmentViewBinder.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.z() != null) {
          obj = this.z();
          a.m(obj);
          this.m = u6.a(obj, 0);
       }
       BaseEditPreviewFragmentViewBinder tm = this.m;
       if (tm == null) {
          FlexScreenStatusData uFlexScreenS = new FlexScreenStatusData(false, false, false, false, false, 0, 0, 0, 0, 0, 0, 2047, null);
       }
       return tm;
    }
    public final b C(){
       return this.o;
    }
    public final h D(){
       BaseEditPreviewFragmentViewBinder obj = PatchProxy.apply(null, this, BaseEditPreviewFragmentViewBinder.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.n;
       if (obj == null) {
          a.S("mEditorPreviewViewModel");
       }
       return obj;
    }
    public final EditDecorationContainerViewV2 E(){
       return this.k;
    }
    public final c G(){
       return this.l;
    }
    public final TextView H(){
       return this.j;
    }
    public final FrameLayout I(){
       BaseEditPreviewFragmentViewBinder obj = PatchProxy.apply(null, this, BaseEditPreviewFragmentViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj == null) {
          a.S("nextStepButton");
       }
       return obj;
    }
    public final TextView J(){
       BaseEditPreviewFragmentViewBinder obj = PatchProxy.apply(null, this, BaseEditPreviewFragmentViewBinder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj == null) {
          a.S("nextStepButtonTip");
       }
       return obj;
    }
    public final View K(){
       return this.e;
    }
    public final SizeAdjustableTextView L(){
       return this.f;
    }
    public final SizeAdjustableTextView M(){
       return this.g;
    }
    public final c N(){
       BaseEditPreviewFragmentViewBinder obj = PatchProxy.apply(null, this, BaseEditPreviewFragmentViewBinder.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.n;
       if (obj == null) {
          a.S("mEditorPreviewViewModel");
       }
       return obj.G0();
    }
    public final void O(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditPreviewFragmentViewBinder.class, "9")) {
          return;
       }
       a.p(p0, "listeners");
       p0.d(new BaseEditPreviewFragmentViewBinder$a(this));
       return;
    }
    public final void P(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditPreviewFragmentViewBinder.class, "8")) {
          return;
       }
       a.p(p0, "listeners");
       p0.d(new BaseEditPreviewFragmentViewBinder$b(this));
       return;
    }
    public void Q(){
    }
    public abstract void R();
    public abstract void S();
    public abstract void T(m p0);
    public void U(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditPreviewFragmentViewBinder.class, "10")) {
          return;
       }
       a.p(p0, "editPicturesViewModel");
       this.o = p0;
       return;
    }
    public final void V(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditPreviewFragmentViewBinder.class, "7")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.n = p0;
       return;
    }
    public final void W(EditDecorationContainerViewV2 p0){
       this.k = p0;
    }
    public final void X(TextView p0){
       this.j = p0;
    }
    public final void Y(FrameLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditPreviewFragmentViewBinder.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.h = p0;
       return;
    }
    public final void Z(TextView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditPreviewFragmentViewBinder.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.i = p0;
       return;
    }
    public final void a0(View p0){
       this.e = p0;
    }
    public final void b0(SizeAdjustableTextView p0){
       this.f = p0;
    }
    public final void c0(SizeAdjustableTextView p0){
       this.g = p0;
    }
    public abstract e y(EditorManager p0,Workspace$Type p1,Workspace$Source p2,EditorDelegate p3);
    public final Activity z(){
       BaseEditPreviewFragmentViewBinder obj = PatchProxy.apply(null, this, BaseEditPreviewFragmentViewBinder.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
       return obj.getActivity();
    }
}

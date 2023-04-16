package com.yxcorp.gifshow.v3.editor.segment.x;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import java.util.Collection;
import ekd.q;
import java.util.List;
import java.lang.Boolean;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.segment.model.SingleSegmentInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;
import android.net.Uri;
import ekd.w0;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import uc.d;
import com.facebook.imagepipeline.request.ImageRequest;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import ac.a;
import com.facebook.drawee.view.DraweeView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.StringBuilder;
import java.lang.Double;
import n16.a;
import android.widget.TextView;
import android.view.View;
import voc.c0;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yxcorp.gifshow.v3.editor.segment.x$a;
import android.view.View$OnClickListener;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.Asset$PositionType;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Integer;
import com.yxcorp.gifshow.v3.editor.segment.l$a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;

public class x extends PresenterV2	// class@0011f8
{
    public c0 A;
    public int B;
    public KwaiImageView p;
    public FrameLayout q;
    public TextView r;
    public FrameLayout s;
    public ImageView t;
    public TextView u;
    public TextView v;
    public SingleSegmentInfo w;
    public l$a x;
    public EditorSdk2V2$VideoEditorProject y;
    public List z;
    public static final int C;

    static {
       x.C = a1.e(50.00f);
    }
    public void x(){
       super();
       this.B = -1;
    }
    public void E8(){
       Object[] objArray;
       if (PatchProxy.applyVoid(null, this, x.class, "3")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       int i = 0;
       if (!q.f(this.z) && (this.z.get(i) instanceof Boolean && this.z.get(i).booleanValue())) {
          this.P8();
          this.R8();
          objArray = new Object[i];
          a.D().s("SegmentItemPresenter", "onBind: only update select", objArray);
          return;
       }else {
          String assetPath = this.w.getAssetPath();
          if (!TextUtils.x(assetPath)) {
             Uri uri = w0.c(new File(assetPath));
             if (uri != null) {
                ImageRequestBuilder imageRequest = ImageRequestBuilder.k(uri);
                imageRequest.v(new d(x.C, x.C));
                d uod = Fresco.newDraweeControllerBuilder();
                uod.y(this.p.getController());
                uod.w(imageRequest.a());
                AbstractDraweeController uAbstractDra = uod.e();
                this.p.setController(uAbstractDra);
             }
          }
          double clipDuration = this.w.getClipDuration();
          Object[] objArray1 = new Object[]{Double.valueOf(clipDuration)};
          this.r.setText(String.format("%.1f", objArray1)+a.d);
          this.P8();
          this.R8();
          this.A.g(this.s);
          StringBuilder str = "onBind assetPath:"+this.w.getAssetPath()+",clipDuration:"+clipDuration;
          objArray = new Object[i];
          a.D().w("SegmentItemPresenter", str+",mIvSelectionAlpha:"+this.q.getAlpha()+",selection:"+this.w.isSelected(), objArray);
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, x.class, "6")) {
          return;
       }
       this.q.setAlpha(0);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, x.class, "5")) {
          return;
       }
       int i = 0;
       if (this.w.isSelected()) {
          if (this.w.isEditable()) {
             this.t.setVisibility(i);
             this.u.setVisibility(i);
             this.r.setVisibility(8);
          }else {
             this.t.setVisibility(8);
             this.u.setVisibility(8);
             this.r.setVisibility(i);
          }
          this.A.b(this.q);
       }else {
          this.t.setVisibility(8);
          this.r.setVisibility(i);
          this.A.a(this.q);
       }
       this.s.setOnClickListener(new x$a(this));
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, x.class, "4")) {
          return;
       }
       if (this.w.getAsset().getPositionType() == Asset$PositionType.OPENING) {
          this.v.setText(R.string.arg_RES_7f103db4);
          this.v.setVisibility(0);
          this.r.setVisibility(8);
       }else if(this.w.getAsset().getPositionType() == Asset$PositionType.ENDING){
          this.v.setText(R.string.arg_RES_7f103d75);
          this.v.setVisibility(0);
          this.r.setVisibility(8);
       }else {
          this.v.setVisibility(8);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, x.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a0ee8);
       this.r = m1.f(p0, 0x7f0a416c);
       this.u = m1.f(p0, 0x7f0a4170);
       this.q = m1.f(p0, 0x7f0a157e);
       this.t = m1.f(p0, 0x7f0a1555);
       this.p = m1.f(p0, 0x7f0a1592);
       this.v = m1.f(p0, 0x7f0a1729);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, x.class, "1")) {
          return;
       }
       this.B = this.r8("item_pos").intValue();
       this.w = this.r8("item_data");
       this.x = this.r8("item_select_listener");
       this.y = this.r8("ITEM_VIDEO_EDITOR_PROJECT");
       this.z = this.t8("PAYLOADS");
       this.A = this.r8("ANIMATION_HELPER");
       return;
    }
}

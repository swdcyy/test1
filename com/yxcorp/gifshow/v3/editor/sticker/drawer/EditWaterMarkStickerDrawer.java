package com.yxcorp.gifshow.v3.editor.sticker.drawer.EditWaterMarkStickerDrawer;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditWaterMarkStickerDrawerData;
import com.yxcorp.gifshow.v3.editor.sticker.model.EditStickerBaseDrawerData;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.lang.String;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.util.List;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import faa.a;
import q87.c;
import itc.k3;
import java.lang.Float;
import com.yxcorp.gifshow.v3.editor.sticker.widget.EditStickerBaseView;
import android.graphics.Bitmap;
import java.lang.StringBuilder;
import java.lang.System;
import java.io.File;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.view.View;
import android.content.Context;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout$LayoutParams;
import java.util.Collection;
import ekd.q;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;

public class EditWaterMarkStickerDrawer extends EditStickerBaseDrawer	// class@00122b
{
    public EditStickerBaseView c;
    public static final float WATER_MARK_DRAW_SIZE;

    static {
       EditWaterMarkStickerDrawer.WATER_MARK_DRAW_SIZE = (float)a1.e(195.00f);
    }
    public void EditWaterMarkStickerDrawer(){
       super(new EditWaterMarkStickerDrawerData());
    }
    public void EditWaterMarkStickerDrawer(StickerDetailInfo p0,double p1,double p2,int p3,float p4){
       this.g(p0);
       super(new EditWaterMarkStickerDrawerData(), 1, p0.mStickerId, p1, p2, p3).mBaseDrawerData.b0(((p4 / 2.00f) / EditWaterMarkStickerDrawer.WATER_MARK_DRAW_SIZE));
    }
    public void EditWaterMarkStickerDrawer(String p0,double p1,double p2,int p3,float p4,List p5,String p6,String p7){
       BaseDrawer uBaseDrawer = this;
       List list = p5;
       super(new EditWaterMarkStickerDrawerData(), 1, p0, p1, p2, p3);
       if (list) {
          uBaseDrawer.mBaseDrawerData.J0(list);
       }
       if (!TextUtils.x(p6)) {
          uBaseDrawer.mBaseDrawerData.H0(p6);
       }
       uBaseDrawer.mBaseDrawerData.I0(p7);
       float wATER_MARK_D = EditWaterMarkStickerDrawer.WATER_MARK_DRAW_SIZE;
       uBaseDrawer.mBaseDrawerData.M(wATER_MARK_D);
       uBaseDrawer.mBaseDrawerData.P(wATER_MARK_D);
       uBaseDrawer.mBaseDrawerData.b0(((p4 / 2.00f) / wATER_MARK_D));
       return;
    }
    public boolean canReplace(StickerDetailInfo p0){
       boolean b = true;
       if (p0.mStickerType == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean canRestore(EditStickerBaseDrawer p0){
       Object[] obj = PatchProxy.applyOneRefs(p0, this, EditWaterMarkStickerDrawer.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!super.canRestore(p0)) {
          return false;
       }
       if (p0.mBaseDrawerData.G0() != this.mBaseDrawerData.G0() || (p0.mBaseDrawerData.E0() == this.mBaseDrawerData.E0() && p0.mBaseDrawerData.F0() == this.mBaseDrawerData.F0())) {
          return true;
       }
       obj = new Object[false];
       a.D().w("EditWaterMarkStickerDrawer", "canRestore mResourceUrls or mRelatedClientId or mResourceFilePath not the same", obj);
       return false;
    }
    public final void g(StickerDetailInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditWaterMarkStickerDrawer.class, "1")) {
          return;
       }
       StickerDetailInfo mResourceUrl = p0.mResourceUrls;
       if (mResourceUrl != null) {
          this.mBaseDrawerData.J0(mResourceUrl);
       }
       if (!TextUtils.x(p0.mRelatedClientId)) {
          this.mBaseDrawerData.H0(p0.mRelatedClientId);
       }
       this.mBaseDrawerData.I0(k3.s(p0));
       float wATER_MARK_D = EditWaterMarkStickerDrawer.WATER_MARK_DRAW_SIZE;
       this.mBaseDrawerData.M(wATER_MARK_D);
       this.mBaseDrawerData.P(wATER_MARK_D);
       return;
    }
    public void generateDecorationBitmap(float p0,float p1,boolean p2){
       if (PatchProxy.isSupport(EditWaterMarkStickerDrawer.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, EditWaterMarkStickerDrawer.class, "2")) {
          return;
       }
       this.mDecorationBitmap = (p2)? k3.d(this.mDecorationShowingView, p1): k3.d(this.mDecorationShowingView, p0);
       return;
    }
    public String generateDecorationOutputFilePath(){
       Object obj = PatchProxy.apply(null, this, EditWaterMarkStickerDrawer.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(this.getOutputFileDir(), this.hashCode()+"_"+this.mBaseDrawerData.B()+"_"+System.currentTimeMillis()+"_"+"EditWaterMarkStickerDrawer"+".png").getAbsolutePath();
    }
    public View initView(DecorationContainerView p0){
       AbsoluteLayout$LayoutParams obj = PatchProxy.applyOneRefs(p0, this, EditWaterMarkStickerDrawer.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.mBaseDrawerData.E0())) {
          return new View(p0.getContext());
       }
       obj = new AbsoluteLayout$LayoutParams((int)this.mBaseDrawerData.i(), (int)this.mBaseDrawerData.f(), 0, 0);
       this.c = EditStickerBaseView.e(this.mBaseDrawerData.E0(), p0);
       if (!q.f(this.mBaseDrawerData.G0())) {
          this.c.setResourceFilePath(this.mBaseDrawerData.F0());
       }
       this.c.setAlpha(this.mBaseDrawerData.e());
       this.c.setLayoutParams(obj);
       return this.c;
    }
    public boolean isNeedReGenerateFile(){
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, EditWaterMarkStickerDrawer.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!super.isNeedReGenerateFile()) {
          obj = this.mBaseDrawerData.E0();
          Object obj1 = PatchProxy.applyOneRefs(obj, objArray, EditStickerBaseView.class, "10");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             Objects.requireNonNull(obj);
             b1 = -1;
             switch (obj.hashCode()){
                 case '4':
                   if (obj.equals("4")) {
                      b1 = 0;
                   }
                   break;
                 case '7':
                   if (obj.equals("7")) {
                      b1 = 1;
                   }
                   break;
                 case 1568:
                   if (obj.equals("11")) {
                      b1 = 2;
                   }
                   break;
                 default:
             }
             switch (b1){
                 case 0:
                 case 2:
                 case 1:
                   break;
                 default:
                   b1 = false;
             }
             b1 = true;
          }
          if (!b1) {
          label_006a :
             return b;
          }
       }
       b = true;
       goto label_006a ;
    }
    public void replace(DecorationContainerView p0,StickerDetailInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditWaterMarkStickerDrawer.class, "3")) {
          return;
       }
       super.replace(p0, p1);
       this.mIsNeedReGenerateFile = true;
       this.g(p1);
       this.mBaseDrawerData.B0(true);
       this.mBaseDrawerData.S(p1.mStickerId);
       p0.removeView(this.mDecorationShowingView);
       View view = this.initView(p0);
       this.mDecorationShowingView = view;
       p0.addView(view);
       this.update();
       return;
    }
}

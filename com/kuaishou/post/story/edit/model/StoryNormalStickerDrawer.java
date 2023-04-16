package com.kuaishou.post.story.edit.model.StoryNormalStickerDrawer;
import com.kuaishou.post.story.edit.model.StoryStickerDrawer;
import com.kuaishou.post.story.edit.model.StoryNormalStickerDrawer$a;
import android.os.Parcel;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;
import com.kuaishou.post.story.edit.data.StoryNormalStickerDrawerData;
import com.kuaishou.post.story.edit.data.StoryStickerDrawerData;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import java.lang.String;
import nsd.u;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import rp4.a;
import q87.c;
import java.lang.Integer;
import java.io.File;
import qkd.b;
import java.lang.Runnable;
import java.lang.Throwable;
import lnc.i1;
import android.view.View;
import android.widget.AbsoluteLayout$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;

public class StoryNormalStickerDrawer extends StoryStickerDrawer	// class@000b21
{
    public KwaiImageView mStickerView;
    public static final Parcelable$Creator CREATOR;

    static {
       StoryNormalStickerDrawer.CREATOR = new StoryNormalStickerDrawer$a();
    }
    public void StoryNormalStickerDrawer(Parcel p0){
       super(p0.readParcelable(BaseDrawerData.class.getClassLoader()));
       boolean b = (p0.readByte())? true: false;
       this.mEnableAddingAnimation = b;
       return;
    }
    public void StoryNormalStickerDrawer(String p0,String p1,float p2){
       super(new StoryNormalStickerDrawerData(null, 1, null), 0);
       this.mBaseDrawerData.Z(p2);
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       if (TextUtils.x(p0)) {
          p0 = "";
       }
       Objects.requireNonNull(tmBaseDrawer);
       if (!PatchProxy.applyVoidOneRefs(p0, tmBaseDrawer, StoryNormalStickerDrawerData.class, "2")) {
          a.p(p0, "<set-?>");
          tmBaseDrawer.x = p0;
       }
       BaseDrawer tmBaseDrawer1 = this.mBaseDrawerData;
       if (TextUtils.x(p1)) {
          p1 = "";
       }
       tmBaseDrawer1.S(p1);
       return;
    }
    public static StoryNormalStickerDrawer generateNormalStickerDrawer(String p0,String p1,float p2){
       if (PatchProxy.isSupport(StoryNormalStickerDrawer.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Float.valueOf(p2), null, StoryNormalStickerDrawer.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new StoryNormalStickerDrawer(p0, p1, p2);
    }
    public int describeContents(){
       return 0;
    }
    public void generateDecorationBitmap(DecorationContainerView p0,VideoSDKPlayerView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, StoryNormalStickerDrawer.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("StoryNormalStickerDrawer", "generateDecorationBitmap do not need to generate decoration bitmap origin file exist", objArray);
       return;
    }
    public void generateFile(String p0,int p1){
       if (PatchProxy.isSupport(StoryNormalStickerDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, StoryNormalStickerDrawer.class, "5")) {
          return;
       }
       if (!this.mBaseDrawerData.e0() && !TextUtils.x(this.mBaseDrawerData.f0())) {
          try{
             b.g(new File(this.mBaseDrawerData.f0()), new File(p0));
             BaseDrawer tmAfterFileG = this.mAfterFileGeneratedRunnable;
             if (tmAfterFileG != null) {
                tmAfterFileG.run();
                this.mAfterFileGeneratedRunnable = null;
             }
          }catch(java.io.IOException e4){
             i1.c(e4);
          }
       }else if(this.mDecorationBitmap != null){
          super.generateFile(p0, p1);
       }
    }
    public View initView(DecorationContainerView p0){
       AbsoluteLayout$LayoutParams obj = PatchProxy.applyOneRefs(p0, this, StoryNormalStickerDrawer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new AbsoluteLayout$LayoutParams((int)this.mBaseDrawerData.i(), (int)this.mBaseDrawerData.f(), 0, 0);
       this.mStickerView = new KwaiImageView(p0.getContext());
       if (!(this.mBaseDrawerData.f0()).isEmpty()) {
          this.mStickerView.v(new File(this.mBaseDrawerData.f0()), (int)this.mBaseDrawerData.i(), (int)this.mBaseDrawerData.f());
       }
       this.mStickerView.setLayoutParams(obj);
       return this.mStickerView;
    }
    public boolean isGenerateFileNeedScaleToVideo(){
       return true;
    }
    public void onDoubleFingerScaleAndRotateStart(){
    }
    public void onSingleFingerMoveStart(){
    }
    public void onSingleFingerScaleAndRotateStart(float p0,float p1){
       if (PatchProxy.isSupport(StoryNormalStickerDrawer.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, StoryNormalStickerDrawer.class, "3")) {
          return;
       }
       this.onDecorationScaleAndRotate();
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(StoryNormalStickerDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, StoryNormalStickerDrawer.class, "6")) {
          return;
       }
       p0.writeByte(this.mEnableAddingAnimation);
       p0.writeParcelable(this.mBaseDrawerData, 0);
       return;
    }
}

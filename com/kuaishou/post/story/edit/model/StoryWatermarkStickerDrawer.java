package com.kuaishou.post.story.edit.model.StoryWatermarkStickerDrawer;
import com.kuaishou.post.story.edit.model.StoryStickerDrawer;
import lnc.a1;
import com.kuaishou.post.story.edit.model.StoryWatermarkStickerDrawer$a;
import android.os.Parcel;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;
import com.kuaishou.post.story.edit.data.StoryWatermarkStickerDrawerData;
import com.kuaishou.post.story.edit.data.StoryStickerDrawerData;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import java.util.List;
import java.lang.String;
import nsd.u;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Collection;
import ekd.q;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditWaterMarkStickerDrawer;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.view.View;
import android.content.Context;
import android.widget.AbsoluteLayout;
import android.widget.AbsoluteLayout$LayoutParams;
import com.yxcorp.gifshow.v3.editor.sticker.widget.EditStickerBaseView;
import android.view.ViewGroup$LayoutParams;
import java.lang.Integer;

public class StoryWatermarkStickerDrawer extends StoryStickerDrawer	// class@000b2a
{
    public EditStickerBaseView mStickerView;
    public static final Parcelable$Creator CREATOR;
    public static final float WATER_MARK_DRAW_SIZE;

    static {
       StoryWatermarkStickerDrawer.WATER_MARK_DRAW_SIZE = (float)a1.e(195.00f);
       StoryWatermarkStickerDrawer.CREATOR = new StoryWatermarkStickerDrawer$a();
    }
    public void StoryWatermarkStickerDrawer(Parcel p0){
       super(p0.readParcelable(BaseDrawerData.class.getClassLoader()));
       boolean b = (p0.readByte())? true: false;
       this.mEnableAddingAnimation = b;
       return;
    }
    public void StoryWatermarkStickerDrawer(List p0,String p1,String p2,float p3,float p4){
       StoryWatermarkStickerDrawerData storyWaterma = new StoryWatermarkStickerDrawerData(null, null, null, 7, null);
       super(v6, 4);
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       Objects.requireNonNull(tmBaseDrawer);
       if (PatchProxy.applyVoidOneRefs(p1, tmBaseDrawer, StoryWatermarkStickerDrawerData.class, "3")) {
       }else {
          a.p(p1, "<set-?>");
          tmBaseDrawer.y = p1;
       }
       if (!q.f(p0)) {
          BaseDrawer tmBaseDrawer1 = this.mBaseDrawerData;
          Objects.requireNonNull(tmBaseDrawer1);
          if (!PatchProxy.applyVoidOneRefs(p0, tmBaseDrawer1, StoryWatermarkStickerDrawerData.class, "2")) {
             a.p(p0, "<set-?>");
             tmBaseDrawer1.x = p0;
          }
       }
       if (!TextUtils.x(p2)) {
          BaseDrawer tmBaseDrawer2 = this.mBaseDrawerData;
          Objects.requireNonNull(tmBaseDrawer2);
          if (!PatchProxy.applyVoidOneRefs(p2, tmBaseDrawer2, StoryWatermarkStickerDrawerData.class, "4")) {
             a.p(p2, "<set-?>");
             tmBaseDrawer2.z = p2;
          }
       }
       this.mBaseDrawerData.Z(p3);
       float wATER_MARK_D = StoryWatermarkStickerDrawer.WATER_MARK_DRAW_SIZE;
       this.mBaseDrawerData.M(wATER_MARK_D);
       this.mBaseDrawerData.P(wATER_MARK_D);
       this.mBaseDrawerData.b0(((p4 / 2.00f) / EditWaterMarkStickerDrawer.WATER_MARK_DRAW_SIZE));
       return;
    }
    public static StoryWatermarkStickerDrawer generateWatermarkStickerDrawer(List p0,String p1,String p2,float p3,float p4){
       Object obj;
       if (PatchProxy.isSupport(StoryWatermarkStickerDrawer.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,Float.valueOf(p3),Float.valueOf(p4)};
          obj = PatchProxy.apply(objArray, null, StoryWatermarkStickerDrawer.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       StoryWatermarkStickerDrawer storyWaterma = new StoryWatermarkStickerDrawer(p0, p1, p2, p3, p4);
       return obj;
    }
    public int describeContents(){
       return 0;
    }
    public View initView(DecorationContainerView p0){
       AbsoluteLayout$LayoutParams obj = PatchProxy.applyOneRefs(p0, this, StoryWatermarkStickerDrawer.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(this.mBaseDrawerData.f0())) {
          return new View(p0.getContext());
       }
       obj = new AbsoluteLayout$LayoutParams((int)this.mBaseDrawerData.i(), (int)this.mBaseDrawerData.f(), 0, 0);
       this.mStickerView = EditStickerBaseView.e(this.mBaseDrawerData.f0(), p0);
       if (!q.f(this.mBaseDrawerData.x)) {
          this.mStickerView.setResourceFilePath(this.mBaseDrawerData.z);
       }
       this.mStickerView.setAlpha(this.mBaseDrawerData.e());
       this.mStickerView.setLayoutParams(obj);
       return this.mStickerView;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(StoryWatermarkStickerDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, StoryWatermarkStickerDrawer.class, "3")) {
          return;
       }
       p0.writeByte(this.mEnableAddingAnimation);
       p0.writeParcelable(this.mBaseDrawerData, 0);
       return;
    }
}

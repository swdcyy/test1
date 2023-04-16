package com.kuaishou.post.story.edit.model.StoryTemplateDataStickerDrawer;
import com.kuaishou.post.story.edit.model.StoryStickerDrawer;
import com.kuaishou.post.story.edit.model.StoryTemplateDataStickerDrawer$c;
import android.os.Parcel;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;
import com.kuaishou.post.story.edit.data.StoryTemplateDataDrawerData;
import com.kuaishou.post.story.edit.data.StoryStickerDrawerData;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import com.kuaishou.post.story.entrance.data.MoodTemplateUiData;
import java.lang.String;
import nsd.u;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Calendar;
import java.lang.System;
import itc.k3;
import java.lang.StringBuilder;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$PostTaskState;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.view.View;
import android.content.Context;
import android.widget.AbsoluteLayout;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.graphics.Color;
import java.lang.CharSequence;
import android.view.ViewTreeObserver;
import com.kuaishou.post.story.edit.model.StoryTemplateDataStickerDrawer$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.kuaishou.post.story.edit.model.StoryTemplateDataStickerDrawer$b;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.lang.Integer;

public class StoryTemplateDataStickerDrawer extends StoryStickerDrawer	// class@000b26
{
    public TextView mDateView;
    public static final Parcelable$Creator CREATOR;

    static {
       StoryTemplateDataStickerDrawer.CREATOR = new StoryTemplateDataStickerDrawer$c();
    }
    public void StoryTemplateDataStickerDrawer(Parcel p0){
       super(p0.readParcelable(BaseDrawerData.class.getClassLoader()));
       boolean b = (p0.readByte())? true: false;
       this.mEnableAddingAnimation = b;
       return;
    }
    public void StoryTemplateDataStickerDrawer(MoodTemplateUiData p0){
       object oobject;
       super(new StoryTemplateDataDrawerData(null, null, 3, null), 3);
       this.setMoodTemplateUiData(p0);
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       String str = PatchProxy.apply(null, null, StoryTemplateDataStickerDrawer.class, "2");
       if (str != PatchProxyResult.class) {
       }else {
          Calendar instance = Calendar.getInstance();
          instance.setTimeInMillis(System.currentTimeMillis());
          int i = instance.get(2);
          if (i >= 0) {
             String[] c = k3.c;
             if (i < c.length) {
                oobject = c[i];
             label_0040 :
                str = oobject+" "+instance.get(5)+", "+instance.get(1);
             }
          }
          oobject = k3.c[0];
          goto label_0040 ;
       }
       Objects.requireNonNull(tmBaseDrawer);
       if (!PatchProxy.applyVoidOneRefs(str, tmBaseDrawer, StoryTemplateDataDrawerData.class, "2")) {
          a.p(str, "<set-?>");
          tmBaseDrawer.x = str;
       }
       this.mBaseDrawerData.S("TEMPLATE_DATE_STICKER");
       this.mBaseDrawerData.b(0x101111);
       return;
    }
    public static StoryTemplateDataStickerDrawer generateTemplateDateStickerDrawer(MoodTemplateUiData p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, StoryTemplateDataStickerDrawer.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new StoryTemplateDataStickerDrawer(p0);
    }
    public StoryTemplateDataStickerDrawer clone(){
       Object obj = this;
       MoodTemplateUiData obj1 = PatchProxy.apply(null, obj, StoryTemplateDataStickerDrawer.class, "7");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       MoodTemplateData moodTemplate = v2;
       MoodTemplateData moodTemplate1 = new MoodTemplateData(null, null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, 0, 0, 0, 0, false, 0xfffff, null);
       obj1 = new MoodTemplateUiData(moodTemplate);
       obj1.z(obj.mBaseDrawerData.h0());
       StoryTemplateDataStickerDrawer storyTemplat = StoryTemplateDataStickerDrawer.generateTemplateDateStickerDrawer(obj1);
       obj.cloneBaseParam(storyTemplat);
       storyTemplat.mEditRect = obj.mEditRect;
       storyTemplat.mIsSelected = obj.mIsSelected;
       storyTemplat.mIsNeedReGenerateFile = obj.mIsNeedReGenerateFile;
       return storyTemplat;
    }
    public Object clone(){
       return this.clone();
    }
    public int describeContents(){
       return 0;
    }
    public double getNormalizedScale(){
       return 100.00f;
    }
    public String getUploadText(){
       Object obj = PatchProxy.apply(null, this, StoryTemplateDataStickerDrawer.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.mBaseDrawerData.f0();
    }
    public View initView(DecorationContainerView p0){
       RelativeLayout obj = PatchProxy.applyOneRefs(p0, this, StoryTemplateDataStickerDrawer.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.f(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d15b9, null);
       TextView textView = obj.findViewById(R.id.date_text_view);
       this.mDateView = textView;
       textView.setTextColor(Color.parseColor(this.mBaseDrawerData.h0()));
       this.mDateView.setText(this.mBaseDrawerData.f0());
       p0.getViewTreeObserver().addOnGlobalLayoutListener(new StoryTemplateDataStickerDrawer$a(this, p0));
       this.mDateView.getViewTreeObserver().addOnPreDrawListener(new StoryTemplateDataStickerDrawer$b(this, p0));
       return obj;
    }
    public boolean isEnableSelectBox(){
       return false;
    }
    public void setMoodTemplateUiData(MoodTemplateUiData p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StoryTemplateDataStickerDrawer.class, "6")) {
          return;
       }
       BaseDrawer tmBaseDrawer = this.mBaseDrawerData;
       String str = p0.e();
       Objects.requireNonNull(tmBaseDrawer);
       if (!PatchProxy.applyVoidOneRefs(str, tmBaseDrawer, StoryTemplateDataDrawerData.class, "3")) {
          a.p(str, "<set-?>");
          tmBaseDrawer.y = str;
       }
       this.mBaseDrawerData.Y((float)p0.g());
       this.mBaseDrawerData.Z((float)p0.h());
       return;
    }
    public void update(){
       if (PatchProxy.applyVoid(null, this, StoryTemplateDataStickerDrawer.class, "4")) {
          return;
       }
       super.update();
       this.mDateView.setTextColor(Color.parseColor(this.mBaseDrawerData.h0()));
       this.mDateView.setText(this.mBaseDrawerData.f0());
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(StoryTemplateDataStickerDrawer.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, StoryTemplateDataStickerDrawer.class, "8")) {
          return;
       }
       p0.writeByte(this.mEnableAddingAnimation);
       p0.writeParcelable(this.mBaseDrawerData, 0);
       return;
    }
}

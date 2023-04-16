package com.yxcorp.gifshow.record.interactive.RecordInteractiveStickerData;
import com.yxcorp.gifshow.record.interactive.RecordStickerBaseData;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public final class RecordInteractiveStickerData extends RecordStickerBaseData	// class@00178d
{
    public float containerWidth;
    public double duration;
    public String fromPhotoId;
    public final ArrayList fromPhotoUserInfoList;
    public boolean isPicture;
    public boolean isTitleEditable;
    public final ArrayList optionList;
    public long relatedPostCount;
    public String title;
    public int type;
    public final ArrayList userInfoList;

    public void RecordInteractiveStickerData(int p0,String p1,ArrayList p2,long p3,ArrayList p4,float p5,float p6){
       a.p(p1, "title");
       a.p(p2, "optionList");
       a.p(p4, "userInfoList");
       super(p5, p6, 0, 4, null);
       this.type = p0;
       this.title = p1;
       this.optionList = p2;
       this.relatedPostCount = p3;
       this.userInfoList = p4;
       this.fromPhotoId = "";
       this.fromPhotoUserInfoList = new ArrayList();
       this.isTitleEditable = true;
    }
    public void RecordInteractiveStickerData(int p0,String p1,ArrayList p2,long p3,ArrayList p4,float p5,float p6,int p7,u p8){
       String str = (p7 & 0x02)? "": p1;
       ArrayList uArrayList = (p7 & 0x04)? new ArrayList(): p2;
       int i = (p7 & 0x08)? 0: p3;
       ArrayList uArrayList1 = (p7 & 0x10)? new ArrayList(): p4;
       int i1 = 0;
       int i2 = (p7 & 0x20)? 0: p5;
       if (!(p7 & 0x40)) {
          i1 = p6;
       }
       super(p0, str, uArrayList, i, uArrayList1, i2, i1);
       return;
    }
    public final float getContainerWidth(){
       return this.containerWidth;
    }
    public final double getDuration(){
       return this.duration;
    }
    public final String getFromPhotoId(){
       return this.fromPhotoId;
    }
    public final ArrayList getFromPhotoUserInfoList(){
       return this.fromPhotoUserInfoList;
    }
    public final ArrayList getOptionList(){
       return this.optionList;
    }
    public final long getRelatedPostCount(){
       return this.relatedPostCount;
    }
    public final String getTitle(){
       return this.title;
    }
    public final int getType(){
       return this.type;
    }
    public final ArrayList getUserInfoList(){
       return this.userInfoList;
    }
    public final boolean isPicture(){
       return this.isPicture;
    }
    public final boolean isTitleEditable(){
       return this.isTitleEditable;
    }
    public final void setContainerWidth(float p0){
       this.containerWidth = p0;
    }
    public final void setDuration(double p0){
       this.duration = p0;
    }
    public final void setFromPhotoId(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordInteractiveStickerData.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.fromPhotoId = p0;
       return;
    }
    public final void setPicture(boolean p0){
       this.isPicture = p0;
    }
    public final void setRelatedPostCount(long p0){
       this.relatedPostCount = p0;
    }
    public final void setTitle(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecordInteractiveStickerData.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.title = p0;
       return;
    }
    public final void setTitleEditable(boolean p0){
       this.isTitleEditable = p0;
    }
    public final void setType(int p0){
       this.type = p0;
    }
}

package com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import java.io.Serializable;
import android.os.Parcelable;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$a;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b$d;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.Parcel;
import java.lang.Integer;

public class PicTemplate implements Serializable, Parcelable	// class@001329
{
    public PicTemplate$b b;
    public String filePath;
    public final PicTemplateGroupInfo picTemplateGroupInfo;
    public final PicTemplateInfo picTemplateInfo;
    public static final Parcelable$Creator CREATOR;

    static {
       PicTemplate.CREATOR = new PicTemplate$a();
    }
    public void PicTemplate(PicTemplateInfo p0,PicTemplateGroupInfo p1,String p2){
       a.p(p0, "picTemplateInfo");
       a.p(p1, "picTemplateGroupInfo");
       a.p(p2, "filePath");
       super();
       this.picTemplateInfo = p0;
       this.picTemplateGroupInfo = p1;
       this.filePath = p2;
       this.b = PicTemplate$b$d.a;
    }
    public void PicTemplate(PicTemplateInfo p0,PicTemplateGroupInfo p1,String p2,int p3,u p4){
       if (p3 & 0x04) {
          p2 = "";
       }
       super(p0, p1, p2);
       return;
    }
    public int describeContents(){
       return 0;
    }
    public final String getFilePath(){
       return this.filePath;
    }
    public final PicTemplateGroupInfo getPicTemplateGroupInfo(){
       return this.picTemplateGroupInfo;
    }
    public final PicTemplateInfo getPicTemplateInfo(){
       return this.picTemplateInfo;
    }
    public final PicTemplate$b getResourceState(){
       return this.b;
    }
    public final void setFilePath(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplate.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.filePath = p0;
       return;
    }
    public final void setResourceState(PicTemplate$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicTemplate.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.b = p0;
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(PicTemplate.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, PicTemplate.class, "3")) {
          return;
       }
       a.p(p0, "parcel");
       this.picTemplateInfo.writeToParcel(p0, 0);
       this.picTemplateGroupInfo.writeToParcel(p0, 0);
       p0.writeString(this.filePath);
       return;
    }
}

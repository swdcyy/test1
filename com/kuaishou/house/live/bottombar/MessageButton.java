package com.kuaishou.house.live.bottombar.MessageButton;
import java.io.Serializable;
import android.os.Parcelable;
import com.kuaishou.house.live.bottombar.MessageButton$a;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.os.Parcel;
import java.lang.Integer;

public final class MessageButton implements Serializable, Parcelable	// class@000766
{
    public int buttonType;
    public String desc;
    public CDNUrl[] icon;
    public CDNUrl[] iconV2;
    public String link;
    public String name;
    public static final Parcelable$Creator CREATOR;

    static {
       MessageButton.CREATOR = new MessageButton$a();
    }
    public void MessageButton(){
       super();
       this.name = "";
       this.desc = "";
       this.link = "";
    }
    public static void getButtonType$annotations(){
    }
    public int describeContents(){
       return 0;
    }
    public final int getButtonType(){
       return this.buttonType;
    }
    public final String getDesc(){
       return this.desc;
    }
    public final CDNUrl[] getIcon(){
       return this.icon;
    }
    public final CDNUrl[] getIconV2(){
       return this.iconV2;
    }
    public final String getLink(){
       return this.link;
    }
    public final String getName(){
       return this.name;
    }
    public final void setButtonType(int p0){
       this.buttonType = p0;
    }
    public final void setDesc(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MessageButton.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.desc = p0;
       return;
    }
    public final void setIcon(CDNUrl[] p0){
       this.icon = p0;
    }
    public final void setIconV2(CDNUrl[] p0){
       this.iconV2 = p0;
    }
    public final void setLink(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MessageButton.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.link = p0;
       return;
    }
    public final void setName(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MessageButton.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.name = p0;
       return;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(MessageButton.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, MessageButton.class, "4")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeInt(1);
       return;
    }
}

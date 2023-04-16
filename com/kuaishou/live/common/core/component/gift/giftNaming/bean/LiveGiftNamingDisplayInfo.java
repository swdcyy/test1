package com.kuaishou.live.common.core.component.gift.giftNaming.bean.LiveGiftNamingDisplayInfo;
import java.lang.String;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.live.common.core.component.gift.giftNaming.bean.LiveGiftNamingRichTextMessage;
import com.kuaishou.live.common.core.component.gift.data.giftbox.UIMarkLabel;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Arrays;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveGiftNamingDisplayInfo	// class@0012c1
{
    public final String actionUrl;
    public final String buttonText;
    public final UserInfos$PicUrl[] icon;
    public final UIMarkLabel markLabel;
    public final LiveGiftNamingRichTextMessage text;

    public void LiveGiftNamingDisplayInfo(){
       super("", null, null, "", null);
    }
    public void LiveGiftNamingDisplayInfo(String p0,UserInfos$PicUrl[] p1,LiveGiftNamingRichTextMessage p2,String p3,UIMarkLabel p4){
       a.p(p0, "actionUrl");
       a.p(p3, "buttonText");
       super();
       this.actionUrl = p0;
       this.icon = p1;
       this.text = p2;
       this.buttonText = p3;
       this.markLabel = p4;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftNamingDisplayInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof LiveGiftNamingDisplayInfo) {
          return false;
       }
       if (a.g(this.actionUrl, p0.actionUrl) ^ true) {
          return false;
       }
       LiveGiftNamingDisplayInfo ticon = this.icon;
       if (ticon != null) {
          LiveGiftNamingDisplayInfo icon = p0.icon;
          if (icon == null) {
             return false;
          }else if(!Arrays.equals(ticon, icon)){
             return false;
          }
       }else if(p0.icon != null){
          return false;
       }
       if (a.g(this.text, p0.text) ^ true) {
          return false;
       }else if(a.g(this.buttonText, p0.buttonText) ^ true){
          return false;
       }else if(a.g(this.markLabel, p0.markLabel) ^ true){
          return false;
       }else {
          return true;
       }
    }
    public int hashCode(){
       Object obj = PatchProxy.apply(null, this, LiveGiftNamingDisplayInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.actionUrl).hashCode() * 31;
       LiveGiftNamingDisplayInfo ticon = this.icon;
       int i1 = 0;
       int i2 = (ticon != null)? Arrays.hashCode(ticon): 0;
       i = (i + i2) * 31;
       ticon = this.text;
       i2 = (ticon != null)? ticon.hashCode(): 0;
       i = (((i + i2) * 31) + (this.buttonText).hashCode()) * 31;
       ticon = this.markLabel;
       if (ticon != null) {
          i1 = ticon.hashCode();
       }
       return (i + i1);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveGiftNamingDisplayInfo.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftNamingDisplayInfo\(actionUrl="+this.actionUrl+", icon="+Arrays.toString(this.icon)+", text="+this.text+", buttonText="+this.buttonText+", markLabel="+this.markLabel+"\)";
    }
}

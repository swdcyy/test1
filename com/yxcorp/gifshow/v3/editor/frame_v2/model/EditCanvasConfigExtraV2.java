package com.yxcorp.gifshow.v3.editor.frame_v2.model.EditCanvasConfigExtraV2;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class EditCanvasConfigExtraV2 implements Serializable	// class@000f98
{
    public String color;
    public String iconUrl;
    public List iconUrls;
    public String picUrl;
    public List picUrls;
    public int type;

    public void EditCanvasConfigExtraV2(){
       super();
       this.type = -1;
       this.iconUrl = "";
       this.color = "#FFFFFFFF";
       this.picUrl = "";
       this.picUrls = new ArrayList();
    }
    public final String getColor(){
       return this.color;
    }
    public final String getIconUrl(){
       return this.iconUrl;
    }
    public final List getIconUrls(){
       return this.iconUrls;
    }
    public final String getPicUrl(){
       return this.picUrl;
    }
    public final List getPicUrls(){
       return this.picUrls;
    }
    public final int getType(){
       return this.type;
    }
    public final void setColor(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditCanvasConfigExtraV2.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.color = p0;
       return;
    }
    public final void setIconUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditCanvasConfigExtraV2.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.iconUrl = p0;
       return;
    }
    public final void setIconUrls(List p0){
       this.iconUrls = p0;
    }
    public final void setPicUrl(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditCanvasConfigExtraV2.class, "3")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.picUrl = p0;
       return;
    }
    public final void setPicUrls(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditCanvasConfigExtraV2.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.picUrls = p0;
       return;
    }
    public final void setType(int p0){
       this.type = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, EditCanvasConfigExtraV2.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MoodTemplateConfigExtra\(type="+this.type+", iconUrl="+this.iconUrl+", iconUrls="+this.iconUrls+", "+"color="+this.color+",  picUrl="+this.picUrl+", picUrls="+this.picUrls+')';
    }
}

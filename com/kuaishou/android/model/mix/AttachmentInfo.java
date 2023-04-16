package com.kuaishou.android.model.mix.AttachmentInfo;
import java.io.Serializable;
import com.kuaishou.android.model.mix.AttachmentInfo$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.android.model.mix.ImageContent;
import java.lang.String;
import com.kuaishou.android.model.mix.ImageLayoutInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class AttachmentInfo implements Serializable	// class@000bca
{
    public ImageContent content;
    public String id;
    public ImageLayoutInfo layout;
    public String previewURL;
    public String type;
    public static final AttachmentInfo$a Companion;

    static {
       AttachmentInfo.Companion = new AttachmentInfo$a(null);
    }
    public void AttachmentInfo(){
       super();
       this.type = "";
    }
    public final ImageContent getContent(){
       return this.content;
    }
    public final String getId(){
       return this.id;
    }
    public final ImageLayoutInfo getLayout(){
       return this.layout;
    }
    public final String getPreviewURL(){
       return this.previewURL;
    }
    public final String getType(){
       return this.type;
    }
    public final void setContent(ImageContent p0){
       this.content = p0;
    }
    public final void setId(String p0){
       this.id = p0;
    }
    public final void setLayout(ImageLayoutInfo p0){
       this.layout = p0;
    }
    public final void setPreviewURL(String p0){
       this.previewURL = p0;
    }
    public final void setType(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AttachmentInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.type = p0;
       return;
    }
}

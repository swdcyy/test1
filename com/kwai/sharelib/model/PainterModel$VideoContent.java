package com.kwai.sharelib.model.PainterModel$VideoContent;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class PainterModel$VideoContent implements Serializable	// class@0016e6
{
    public boolean autoPlay;
    public JsonElement mQPhotoJsonElement;
    public static final long serialVersionUID = 0xee683434e8f07f8;

    public void PainterModel$VideoContent(){
       super();
       this.autoPlay = false;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PainterModel$VideoContent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "VideoContent{mQPhotoJsonElement="+this.mQPhotoJsonElement+", autoPlay="+this.autoPlay+'}';
    }
}

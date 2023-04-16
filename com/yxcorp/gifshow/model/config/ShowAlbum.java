package com.yxcorp.gifshow.model.config.ShowAlbum;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ShowAlbum implements Serializable	// class@001ee0
{
    public boolean mAutoShowAlbumTool;
    public boolean mEnableAlbumShowNewPhoto;
    public boolean mEnableAlbumTool;
    public boolean mUseAlbumLabelFilter;
    public static final long serialVersionUID = 0x9861783424eae5b8;

    public void ShowAlbum(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ShowAlbum.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ShowAlbum{mEnableAlbumTool="+this.mEnableAlbumTool+", mAutoShowAlbumTool="+this.mAutoShowAlbumTool+", mUseAlbumLabelFilter="+this.mUseAlbumLabelFilter+", mEnableAlbumShowNewPhoto="+this.mEnableAlbumShowNewPhoto+'}';
    }
}

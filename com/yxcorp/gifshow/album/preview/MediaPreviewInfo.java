package com.yxcorp.gifshow.album.preview.MediaPreviewInfo;
import java.io.Serializable;
import com.yxcorp.gifshow.album.preview.MediaPreviewInfo$a;
import nsd.u;
import r79.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class MediaPreviewInfo implements Serializable	// class@001a33
{
    public final c media;
    public int selectIndex;
    public static final MediaPreviewInfo$a Companion;
    public static final long serialVersionUID;

    static {
       MediaPreviewInfo.Companion = new MediaPreviewInfo$a(null);
    }
    public void MediaPreviewInfo(c p0,int p1){
       a.q(p0, "media");
       super();
       this.media = p0;
       this.selectIndex = p1;
    }
    public final void decreaseSelectIndex(){
       this.selectIndex = this.selectIndex - 1;
    }
    public final c getMedia(){
       return this.media;
    }
    public final int getSelectIndex(){
       return this.selectIndex;
    }
    public final boolean isRemove(){
       boolean b = (this.selectIndex < null)? true: false;
       return b;
    }
    public final boolean isSelected(){
       boolean b = (this.selectIndex >= null)? true: false;
       return b;
    }
    public final void select(int p0){
       p0--;
       this.selectIndex = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MediaPreviewInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "MediaPreviewInfo\(media="+this.media+", selectIndex="+this.selectIndex+')';
    }
    public final void unSelect(){
       this.selectIndex = -1;
    }
}

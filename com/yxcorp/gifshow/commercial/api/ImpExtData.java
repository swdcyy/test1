package com.yxcorp.gifshow.commercial.api.ImpExtData;
import java.io.Serializable;
import com.yxcorp.gifshow.commercial.api.ImpExtData$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;

public final class ImpExtData implements Serializable	// class@001120
{
    public String adBaseId;
    public String bookId;
    public int openH5AdCount;
    public String pAuthorId;
    public String photoId;
    public static final ImpExtData$a Companion;
    public static final long serialVersionUID;

    static {
       ImpExtData.Companion = new ImpExtData$a(null);
    }
    public void ImpExtData(){
       super();
    }
    public final String getAdBaseId(){
       return this.adBaseId;
    }
    public final String getBookId(){
       return this.bookId;
    }
    public final int getOpenH5AdCount(){
       return this.openH5AdCount;
    }
    public final String getPAuthorId(){
       return this.pAuthorId;
    }
    public final String getPhotoId(){
       return this.photoId;
    }
    public final void setAdBaseId(String p0){
       this.adBaseId = p0;
    }
    public final void setBookId(String p0){
       this.bookId = p0;
    }
    public final void setOpenH5AdCount(int p0){
       this.openH5AdCount = p0;
    }
    public final void setPAuthorId(String p0){
       this.pAuthorId = p0;
    }
    public final void setPhotoId(String p0){
       this.photoId = p0;
    }
}

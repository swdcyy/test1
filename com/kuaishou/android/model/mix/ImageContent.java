package com.kuaishou.android.model.mix.ImageContent;
import java.io.Serializable;
import java.lang.Object;
import java.util.List;

public final class ImageContent implements Serializable	// class@000cb7
{
    public List bigUrl;
    public List smallUrl;

    public void ImageContent(){
       super();
    }
    public final List getBigUrl(){
       return this.bigUrl;
    }
    public final List getSmallUrl(){
       return this.smallUrl;
    }
    public final void setBigUrl(List p0){
       this.bigUrl = p0;
    }
    public final void setSmallUrl(List p0){
       this.smallUrl = p0;
    }
}

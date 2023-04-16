package com.kwai.framework.model.user.WatchItem;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public class WatchItem implements Serializable	// class@00177e
{
    public String mIconUrl;
    public String mId;
    public static final long serialVersionUID = 0x6765064d0b5a6a6e;

    public void WatchItem(){
       super();
    }
    public void WatchItem(String p0,String p1){
       super();
       this.mId = p0;
       this.mIconUrl = p1;
    }
}

package com.kuaishou.live.basic.liveslide.datasource.LiveSlideResponse;
import c51.c;
import java.io.Serializable;
import mkd.a;
import la6.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.robust.PatchProxyResult;
import d61.g;
import java.lang.Boolean;
import la6.a;

public class LiveSlideResponse implements c, Serializable, a, b	// class@000ccf
{
    public String mCursor;
    public List mFeedItems;
    public String mLlsid;
    public List mQPhotoList;
    public static final long serialVersionUID = 0xa81fe30d4bae4c47;

    public void LiveSlideResponse(){
       super();
       this.mQPhotoList = new ArrayList();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, LiveSlideResponse.class, "4")) {
          return;
       }
       if (!q.f(this.getQPhotoList())) {
          Iterator iterator = this.getQPhotoList().iterator();
          while (iterator.hasNext()) {
             iterator.next().setListLoadSequenceID(this.mLlsid);
          }
       }
       return;
    }
    public String getCursor(){
       return this.mCursor;
    }
    public List getItems(){
       Object obj = PatchProxy.apply(null, this, LiveSlideResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getSlideDataList();
    }
    public List getQPhotoList(){
       List obj = PatchProxy.apply(null, this, LiveSlideResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.mFeedItems)) {
          return this.mQPhotoList;
       }
       obj = g.k(this.mFeedItems);
       this.mQPhotoList = obj;
       return obj;
    }
    public List getSlideDataList(){
       return this.mFeedItems;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveSlideResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.mCursor);
    }
}

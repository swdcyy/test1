package com.yxcorp.gifshow.ad.response.LiveFansTopAwardFeedResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.response.LiveFansTopAwardFeedResponse$a;
import nsd.u;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Boolean;
import la6.a;
import java.util.Collection;

public final class LiveFansTopAwardFeedResponse implements CursorResponse, Serializable	// class@0017de
{
    public final List _feeds;
    public boolean isAttach;
    public final String llsid;
    public final String pcursor;
    public static final LiveFansTopAwardFeedResponse$a Companion;
    public static final long serialVersionUID;

    static {
       LiveFansTopAwardFeedResponse.Companion = new LiveFansTopAwardFeedResponse$a(null);
    }
    public void LiveFansTopAwardFeedResponse(String p0,String p1,List p2){
       super();
       this.pcursor = p0;
       this.llsid = p1;
       this._feeds = p2;
    }
    public void LiveFansTopAwardFeedResponse(String p0,String p1,List p2,int p3,u p4){
       if (p3 & 0x01) {
          p0 = "";
       }
       if (p3 & 0x02) {
          p1 = "";
       }
       super(p0, p1, p2);
       return;
    }
    public void LiveFansTopAwardFeedResponse(String p0,List p1){
       super(p0, null, p1, 2, null);
    }
    public void LiveFansTopAwardFeedResponse(List p0){
       super(null, null, p0, 3, null);
    }
    public String getCursor(){
       return this.pcursor;
    }
    public final List getFeeds(){
       Object[] objArray = null;
       LiveFansTopAwardFeedResponse obj = PatchProxy.apply(objArray, this, LiveFansTopAwardFeedResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this._feeds;
       if (obj != null) {
          if (this.isAttach == null) {
             Iterator iterator = obj.iterator();
             LiveFansTopAwardFeedResponse liveFansTopA = 1;
             while (iterator.hasNext()) {
                QPhoto qPhoto = iterator.next();
                String listLoadSequ = qPhoto.getListLoadSequenceID();
                if (listLoadSequ != null && listLoadSequ.length()) {
                   liveFansTopA = null;
                }
                if (!liveFansTopA) {
                   qPhoto = objArray;
                }
                if (qPhoto != null) {
                   qPhoto.setListLoadSequenceID(this.llsid);
                }
             }
             this.isAttach = liveFansTopA;
          }
          objArray = obj;
       }
       return objArray;
    }
    public List getItems(){
       List obj = PatchProxy.apply(null, this, LiveFansTopAwardFeedResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getFeeds();
       if (obj == null) {
          obj = CollectionsKt__CollectionsKt.E();
       }
       return obj;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, LiveFansTopAwardFeedResponse.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.pcursor);
    }
    public final boolean isAvailable(){
       List obj = PatchProxy.apply(null, this, LiveFansTopAwardFeedResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.getFeeds();
       int i = (obj == null || obj.isEmpty())? 1: 0;
       return (i ^ 1);
    }
}

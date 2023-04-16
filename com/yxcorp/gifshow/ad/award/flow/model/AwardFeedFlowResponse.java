package com.yxcorp.gifshow.ad.award.flow.model.AwardFeedFlowResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import com.yxcorp.gifshow.ad.award.flow.model.AwardFeedFlowResponse$a;
import nsd.u;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.award.flow.model.AwardFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import java.lang.Iterable;
import trd.u;
import xx8.a;
import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Boolean;
import la6.a;

public final class AwardFeedFlowResponse implements CursorResponse, Serializable	// class@0014f9
{
    public final ArrayList _feeds;
    public boolean isAttach;
    public String llsid;
    public final String pcursor;
    public static final AwardFeedFlowResponse$a Companion;
    public static final long serialVersionUID;

    static {
       AwardFeedFlowResponse.Companion = new AwardFeedFlowResponse$a(null);
    }
    public void AwardFeedFlowResponse(String p0,String p1,ArrayList p2){
       super();
       this.pcursor = p0;
       this.llsid = p1;
       this._feeds = p2;
    }
    public String getCursor(){
       return this.pcursor;
    }
    public final List getFeeds(){
       Object[] objArray = null;
       AwardFeedFlowResponse obj = PatchProxy.apply(objArray, this, AwardFeedFlowResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this._feeds;
       if (obj != null) {
          if (this.isAttach == null) {
             Iterator iterator = obj.iterator();
             a.o(iterator, "iterator\(\)");
             AwardFeedFlowResponse uAwardFeedFl = 1;
             while (iterator.hasNext()) {
                AwardFeed obj1 = iterator.next();
                a.o(obj1, "iterator.next\(\)");
                obj1 = obj1.photo;
                if (obj1 != null) {
                   String listLoadSequ = obj1.getListLoadSequenceID();
                   if (listLoadSequ != null && listLoadSequ.length()) {
                      uAwardFeedFl = null;
                   }
                   if (!uAwardFeedFl) {
                      Object[] objArray1 = objArray;
                   }
                   if (obj1 != null) {
                      obj1.setListLoadSequenceID(this.llsid);
                   }
                }
             }
             this.isAttach = uAwardFeedFl;
          }
          objArray = obj;
       }
       return objArray;
    }
    public List getItems(){
       ArrayList uArrayList;
       List obj = PatchProxy.apply(null, this, AwardFeedFlowResponse.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getFeeds();
       if (obj != null) {
          uArrayList = new ArrayList(u.Y(obj, 10));
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             AwardFeed uAwardFeed = iterator.next();
             uArrayList.add(new a(uAwardFeed.type, uAwardFeed));
          }
       }else {
          uArrayList = CollectionsKt__CollectionsKt.E();
       }
       return uArrayList;
    }
    public final String getLlsid(){
       return this.llsid;
    }
    public final String getPcursor(){
       return this.pcursor;
    }
    public boolean hasMore(){
       Object obj = PatchProxy.apply(null, this, AwardFeedFlowResponse.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a(this.pcursor);
    }
    public final void setLlsid(String p0){
       this.llsid = p0;
    }
}

package com.yxcorp.gifshow.relation.intimate.model.IntimateRelationListResponse;
import com.kwai.framework.model.response.CursorResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import com.yxcorp.gifshow.relation.intimate.model.IntimateRelationListResponse$IntimateRelation;
import java.util.Collection;

public class IntimateRelationListResponse implements CursorResponse, Serializable	// class@001915
{
    public List mIntimateRelationList;
    public String mIntimateRelationTitle;
    public User mOwner;
    public static final long serialVersionUID = 0xd634c13dfacdae15;

    public void IntimateRelationListResponse(){
       super();
    }
    public String getCursor(){
       return null;
    }
    public List getItems(){
       ArrayList obj = PatchProxy.apply(null, this, IntimateRelationListResponse.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       IntimateRelationListResponse tmIntimateRe = this.mIntimateRelationList;
       if (tmIntimateRe != null) {
          Iterator iterator = tmIntimateRe.iterator();
          while (iterator.hasNext()) {
             IntimateRelationListResponse$IntimateRelation mIntimateFri = iterator.next().mIntimateFriends;
             if (mIntimateFri != null) {
                obj.addAll(mIntimateFri);
             }
          }
       }
       return obj;
    }
    public boolean hasMore(){
       return false;
    }
}

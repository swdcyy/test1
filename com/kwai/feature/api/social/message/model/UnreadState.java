package com.kwai.feature.api.social.message.model.UnreadState;
import java.io.Serializable;
import java.lang.Cloneable;
import java.lang.Object;
import lq6.a;
import ew5.b;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Math;
import java.lang.StringBuilder;

public class UnreadState implements Serializable, Cloneable	// class@001179
{
    public Map mCategoryAggUnreadMap;
    public Integer mConsumedCount;
    public boolean mNeedConsumeUnread;
    public Map mNormalConvUnreadMap;
    public Map mSubBizAggUnreadMap;
    public int mUnreadCount;
    public String mUserId;
    public static final long serialVersionUID = 0x4c110a86f37e529f;

    public void UnreadState(){
       super();
       this.mUnreadCount = -1;
       this.mUserId = "";
    }
    public void UnreadState(int p0){
       super();
       this.mUnreadCount = -1;
       this.mUserId = "";
       this.mUnreadCount = p0;
    }
    public void UnreadState(a p0){
       super();
       this.mUnreadCount = -1;
       this.mUserId = "";
       this.mUnreadCount = 0;
       if (p0 == null) {
          return;
       }
       this.mUnreadCount = b.a(p0);
       this.mNormalConvUnreadMap = p0.b();
       this.mCategoryAggUnreadMap = p0.a();
       this.mSubBizAggUnreadMap = p0.c();
       return;
    }
    public UnreadState clone(){
       UnreadState unreadState;
       UnreadState tmConsumedCo;
       int i1;
       Object obj = PatchProxy.apply(null, this, UnreadState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = 0;
       try{
          unreadState = super.clone();
          tmConsumedCo = this.mConsumedCount;
          i1 = (tmConsumedCo == null)? 0: tmConsumedCo.intValue();
          unreadState.mConsumedCount = Integer.valueOf(i1);
          unreadState.mUnreadCount = Math.max(this.mUnreadCount, i);
          return unreadState;
       }catch(java.lang.Exception e0){
          unreadState = new UnreadState();
          tmConsumedCo = this.mConsumedCount;
          i1 = (tmConsumedCo == null)? 0: tmConsumedCo.intValue();
          unreadState.mConsumedCount = Integer.valueOf(i1);
          unreadState.mUnreadCount = Math.max(this.mUnreadCount, e0);
          return unreadState;
       }
    }
    public Object clone(){
       return this.clone();
    }
    public void reset(){
       this.mUnreadCount = -1;
       this.mConsumedCount = null;
       this.mUserId = "";
       this.mNeedConsumeUnread = false;
       this.mNormalConvUnreadMap = null;
       this.mCategoryAggUnreadMap = null;
       this.mSubBizAggUnreadMap = null;
    }
    public String toString(){
       StringBuilder obj = PatchProxy.apply(null, this, UnreadState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "UnreadState{mUnreadCount="+this.mUnreadCount+", mConsumedCount=";
       UnreadState tmConsumedCo = this.mConsumedCount;
       int i = (tmConsumedCo != null)? tmConsumedCo.intValue(): 0;
       return obj+i+", mUserId=\'"+this.mUserId+'''+", mNeedConsumeUnread="+this.mNeedConsumeUnread+", mNormalConvUnreadMap="+this.mNormalConvUnreadMap+", mCategoryAggUnreadMap="+this.mCategoryAggUnreadMap+", mSubBizAggUnreadMap="+this.mSubBizAggUnreadMap+'}';
    }
}

package com.kwai.framework.model.user.RecoUser;
import mkd.a;
import im8.g;
import com.smile.gifmaker.mvps.utils.SyncableProvider;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import tl8.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pa6.i;
import java.util.Map;
import java.util.HashMap;
import java.lang.Number;
import java.io.ObjectInputStream;

public class RecoUser extends SyncableProvider implements a, g	// class@001720
{
    public boolean hasFilterFeed;
    public ContactCard mContactCard;
    public List mFeedList;
    public String mFeedString;
    public int mItemIndex;
    public PymkGuideCard mPymkGuideCard;
    public boolean mShowed;
    public int mType;
    public User mUser;
    public int mViewType;
    public static final long serialVersionUID = 0x754626d4dc209e87;

    public void RecoUser(){
       super();
    }
    public void afterDeserialize(){
       if (PatchProxy.applyVoid(null, this, RecoUser.class, "4")) {
          return;
       }
       if (this.mFeedList == null) {
          this.mFeedList = new ArrayList();
       }
       Iterator iterator = this.mFeedList.iterator();
       while (iterator.hasNext()) {
          iterator.next().e(User.class, this.mUser);
       }
       return;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecoUser.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || this.getClass() != p0.getClass()) {
          return false;
       }
       RecoUser tmViewType = this.mViewType;
       RecoUser recoUser = (tmViewType != null && p0.mViewType != null)? 1: null;
       if (!recoUser || tmViewType == p0.mViewType) {
          tmViewType = this.mUser;
          p0 = p0.mUser;
          if (tmViewType != p0) {
             if (tmViewType != null) {
                recoUser = (tmViewType.mId != null && (tmViewType.mName != null && tmViewType.mSex != null))? 1: 0;
                if (recoUser && tmViewType.equals(p0)) {
                label_0059 :
                   return b;
                }
             }
          }else {
             goto label_0059 ;
          }
       }
       b = false;
       goto label_0059 ;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RecoUser.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, RecoUser.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(RecoUser.class, new i());
       }else {
          obj.put(RecoUser.class, null);
       }
       return obj;
    }
    public int hashCode(){
       RecoUser obj = PatchProxy.apply(null, this, RecoUser.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mUser;
       int i = (obj == null)? super.hashCode(): obj.hashCode();
       return i;
    }
    public final void readObject(ObjectInputStream p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecoUser.class, "1")) {
          return;
       }
       p0.defaultReadObject();
       this.setupAccessors();
       return;
    }
}

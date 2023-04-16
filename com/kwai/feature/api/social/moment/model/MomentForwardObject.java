package com.kwai.feature.api.social.moment.model.MomentForwardObject;
import java.io.Serializable;
import im8.g;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.social.moment.model.MomentFeed;
import com.kwai.feature.api.social.moment.model.MomentModel;
import com.yxcorp.gifshow.entity.QPhoto;
import pw5.a;
import pw5.k;
import java.util.Map;
import java.util.HashMap;
import com.kwai.framework.model.feed.BaseFeed;

public class MomentForwardObject implements Serializable, g	// class@001186
{
    public QPhoto b;
    public a c;
    public MomentForwardObject$ForwardFilterReason mFilterReason;
    public BaseFeed mRootObject;
    public String mRootObjectId;
    public int mType;
    public static final long serialVersionUID = 0x8662c1db53154bbc;

    public void MomentForwardObject(){
       super();
       this.mType = 0;
    }
    public User getAuthor(){
       Object[] objArray = null;
       MomentForwardObject obj = PatchProxy.apply(objArray, this, MomentForwardObject.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mRootObject;
       if (obj != null) {
          objArray = (obj instanceof MomentFeed)? obj.mMomentModel.mMomentUser: this.getRootPhoto().getUser();
       }
    label_0028 :
       return objArray;
    }
    public String getContent(){
       Object[] objArray = null;
       MomentForwardObject obj = PatchProxy.apply(objArray, this, MomentForwardObject.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mRootObject;
       if (obj != null) {
          objArray = (obj instanceof MomentFeed)? obj.mMomentModel.mContent: this.getRootPhoto().getCaption();
       }
    label_0028 :
       return objArray;
    }
    public a getContentHolder(){
       a uoa;
       MomentForwardObject obj = PatchProxy.apply(null, this, MomentForwardObject.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          uoa = new a();
          this.c = uoa;
       }
       return uoa;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MomentForwardObject.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new k();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, MomentForwardObject.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(MomentForwardObject.class, new k());
       }else {
          obj.put(MomentForwardObject.class, null);
       }
       return obj;
    }
    public QPhoto getRootPhoto(){
       Object obj = PatchProxy.apply(null, this, MomentForwardObject.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          this.b = new QPhoto(this.mRootObject);
       }
       return this.b;
    }
}

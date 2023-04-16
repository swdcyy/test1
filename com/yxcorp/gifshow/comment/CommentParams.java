package com.yxcorp.gifshow.comment.CommentParams;
import im8.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ek9.j1;
import java.util.Map;
import java.util.HashMap;

public class CommentParams implements g	// class@001094
{
    public String mADCallback;
    public QComment mComment;
    public String mCommentLoggerSource;
    public String mLogWatchId;
    public int mPhotoIndex;
    public QPreInfo mPreInfo;
    public QPhoto mQPhoto;

    public void CommentParams(){
       super();
       this.mCommentLoggerSource = "FEATURED";
    }
    public CommentParams copy(){
       CommentParams obj = PatchProxy.apply(null, this, CommentParams.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CommentParams();
       obj.mComment = this.mComment;
       obj.mQPhoto = this.mQPhoto;
       obj.mLogWatchId = this.mLogWatchId;
       obj.mPreInfo = this.mPreInfo;
       obj.mPhotoIndex = this.mPhotoIndex;
       obj.mCommentLoggerSource = this.mCommentLoggerSource;
       obj.mADCallback = this.mADCallback;
       return obj;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CommentParams.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j1();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, CommentParams.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(CommentParams.class, new j1());
       }else {
          obj.put(CommentParams.class, null);
       }
       return obj;
    }
}

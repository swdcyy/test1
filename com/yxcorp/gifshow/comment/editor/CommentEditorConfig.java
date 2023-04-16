package com.yxcorp.gifshow.comment.editor.CommentEditorConfig;
import java.lang.Object;
import uid.a;
import uh5.e;
import com.yxcorp.gifshow.comment.utils.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class CommentEditorConfig	// class@0010bf
{
    public int mAtFriendMaxLimit;
    public int mAtFriendMaxLimitToastResId;
    public String mBottomEditorHint;
    public int mEditorMode;
    public int mEditorTextLimit;
    public boolean mEnableAtLimit;
    public boolean mEnableEmotion;
    public boolean mEnablePicture;
    public int mFloatEditorTheme;
    public int mForceDayNightMode;
    public int mSelectUserBizId;

    public void CommentEditorConfig(){
       super();
       this.mEnableEmotion = true;
       this.mEnablePicture = a.a();
       this.mEditorMode = e.f();
       this.mSelectUserBizId = 1003;
       this.mEnableAtLimit = true;
       this.mAtFriendMaxLimit = d.a;
       this.mAtFriendMaxLimitToastResId = 0x7f100240;
       this.mEditorTextLimit = 255;
       this.mForceDayNightMode = 0;
    }
    public CommentEditorConfig copy(){
       CommentEditorConfig obj = PatchProxy.apply(null, this, CommentEditorConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new CommentEditorConfig();
       obj.mEnableEmotion = this.mEnableEmotion;
       obj.mEditorMode = this.mEditorMode;
       obj.mSelectUserBizId = this.mSelectUserBizId;
       obj.mEnableAtLimit = this.mEnableAtLimit;
       obj.mAtFriendMaxLimit = this.mAtFriendMaxLimit;
       obj.mAtFriendMaxLimitToastResId = this.mAtFriendMaxLimitToastResId;
       obj.mEnablePicture = this.mEnablePicture;
       obj.mEditorTextLimit = this.mEditorTextLimit;
       obj.mForceDayNightMode = this.mForceDayNightMode;
       return obj;
    }
}

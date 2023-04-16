package com.yxcorp.gifshow.comment.config.b;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.yxcorp.gifshow.comment.config.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.comment.config.CommentStartupCommonPojo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ek9.l1;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;

public class b extends ConfigAutoParseJsonConsumer	// class@0010b3
{

    public void b(){
       super(a.b);
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
       }else {
          SharedPreferences$Editor uEditor = l1.a.edit();
          uEditor.putBoolean(b.d("user")+"enable_comment_show_upload", p0.mEnableCommentShowUpload);
          uEditor.putBoolean("enableShowGodComment", p0.mEnableShowGodComment);
          uEditor.putInt("foldupCommentThreshold", p0.mFoldupCommentThreshold);
          uEditor.putInt("godCommentShowType", p0.mGodCommentShowType);
          uEditor.putString("OneClickRecommendGodComment", b.e(p0.mOneClickRecommendGodComment));
          g.a(uEditor);
       }
       return;
    }
}

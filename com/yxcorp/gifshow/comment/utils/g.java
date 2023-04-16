package com.yxcorp.gifshow.comment.utils.g;
import tg5.c;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.comment.utils.VideoCommentEggUtils;
import com.yxcorp.gifshow.comment.utils.VideoCommentEggUtils$VideoCommentEggModel;

public class g implements c	// class@001114
{

    public void g(){
       super();
    }
    public boolean a(){
       return true;
    }
    public List get(){
       Object obj = PatchProxy.apply(null, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (VideoCommentEggUtils.a == null) {
          VideoCommentEggUtils.b();
       }
       return VideoCommentEggUtils.a.mStargateEggConfig;
    }
}

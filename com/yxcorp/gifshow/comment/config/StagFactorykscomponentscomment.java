package com.yxcorp.gifshow.comment.config.StagFactorykscomponentscomment;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.comment.config.CommentStartupCommonPojo;
import com.yxcorp.gifshow.comment.config.CommentStartupCommonPojo$TypeAdapter;

public final class StagFactorykscomponentscomment implements j	// class@0010b1
{

    public void StagFactorykscomponentscomment(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactorykscomponentscomment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == CommentStartupCommonPojo.class) {
          return new CommentStartupCommonPojo$TypeAdapter(p0);
       }
       return null;
    }
}

package com.kwai.feature.post.log.PostCommonBiz;
import oa9.b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PostCommonBiz extends Enum implements b	// class@0014a6
{
    public final String mBiz;
    public static final PostCommonBiz[] $VALUES;
    public static final PostCommonBiz ALBUM;
    public static final PostCommonBiz ANNUAL;
    public static final PostCommonBiz COMMON;
    public static final PostCommonBiz EDIT;
    public static final PostCommonBiz KUAISHAN;
    public static final PostCommonBiz PUBLISH;
    public static final PostCommonBiz RECORD;

    static {
       PostCommonBiz postCommonBi1;
       PostCommonBiz[] postCommonBi = new PostCommonBiz[]{postCommonBi1,postCommonBi1,postCommonBi1,postCommonBi1,postCommonBi1,postCommonBi1,postCommonBi1};
       postCommonBi1 = new PostCommonBiz("RECORD", 0, "record");
       PostCommonBiz.RECORD = postCommonBi1;
       postCommonBi1 = new PostCommonBiz("EDIT", 1, "edit");
       PostCommonBiz.EDIT = postCommonBi1;
       postCommonBi1 = new PostCommonBiz("KUAISHAN", 2, "kuaishan");
       PostCommonBiz.KUAISHAN = postCommonBi1;
       postCommonBi1 = new PostCommonBiz("PUBLISH", 3, "post");
       PostCommonBiz.PUBLISH = postCommonBi1;
       postCommonBi1 = new PostCommonBiz("ALBUM", 4, "album");
       PostCommonBiz.ALBUM = postCommonBi1;
       postCommonBi1 = new PostCommonBiz("ANNUAL", 5, "annual");
       PostCommonBiz.ANNUAL = postCommonBi1;
       postCommonBi1 = new PostCommonBiz("COMMON", 6, "common");
       PostCommonBiz.COMMON = postCommonBi1;
       PostCommonBiz.$VALUES = postCommonBi;
    }
    public void PostCommonBiz(String p0,int p1,String p2){
       super(p0, p1);
       this.mBiz = p2;
    }
    public static PostCommonBiz valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostCommonBiz.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PostCommonBiz.class, p0);
    }
    public static PostCommonBiz[] values(){
       Object obj = PatchProxy.apply(null, null, PostCommonBiz.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostCommonBiz.$VALUES.clone();
    }
    public String getBiz(){
       return this.mBiz;
    }
}

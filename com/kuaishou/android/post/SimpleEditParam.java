package com.kuaishou.android.post.SimpleEditParam;
import java.io.Serializable;
import com.kuaishou.android.post.SimpleEditParam$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class SimpleEditParam implements Serializable	// class@000eaa
{
    public final SimpleEditParam$SocialParam mSocialParam;
    public final String mSourcePage;
    public final String mSubBiz;
    public static final SimpleEditParam DEFAULT;
    public static final long serialVersionUID;

    static {
       SimpleEditParam.DEFAULT = new SimpleEditParam(new SimpleEditParam$a());
    }
    public void SimpleEditParam(SimpleEditParam$a p0){
       super();
       this.mSubBiz = p0.a;
       this.mSourcePage = p0.b;
       this.mSocialParam = p0.c;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SimpleEditParam.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SimpleEditParam{mSubBiz=\'"+this.mSubBiz+'''+", mSourcePage=\'"+this.mSourcePage+'''+", mSocialParam="+this.mSocialParam+'}';
    }
}

package com.kwai.feature.post.api.feature.story.model.PostStoryParams$a;
import java.lang.Object;
import com.kwai.feature.post.api.feature.story.model.PostStoryParams$StoryCameraCallSource;
import com.kwai.feature.post.api.feature.story.model.PostStoryParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class PostStoryParams$a	// class@0013c9
{
    public String a;
    public String b;
    public boolean c;
    public boolean d;
    public String e;
    public int f;
    public long g;
    public long h;
    public int i;
    public int j;
    public String k;
    public String l;
    public String m;
    public boolean n;
    public int o;
    public int p;
    public PostStoryParams$StoryCameraCallSource q;
    public String r;

    public void PostStoryParams$a(){
       super();
       this.q = PostStoryParams$StoryCameraCallSource.SOURCE_NORMAL;
    }
    public PostStoryParams a(){
       Object obj = PatchProxy.apply(null, this, PostStoryParams$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PostStoryParams(this);
    }
}

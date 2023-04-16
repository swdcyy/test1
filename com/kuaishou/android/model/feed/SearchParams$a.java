package com.kuaishou.android.model.feed.SearchParams$a;
import java.lang.Object;
import com.kuaishou.android.model.feed.SearchParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.log.model.FeedLogCtx;

public class SearchParams$a	// class@000b6c
{
    public String a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public FeedLogCtx h;
    public FeedLogCtx i;

    public void SearchParams$a(){
       super();
    }
    public SearchParams a(){
       Object obj = PatchProxy.apply(null, this, SearchParams$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SearchParams(this);
    }
    public SearchParams$a b(FeedLogCtx p0){
       this.h = p0;
       return this;
    }
    public SearchParams$a c(String p0){
       this.f = p0;
       return this;
    }
    public SearchParams$a d(FeedLogCtx p0){
       this.i = p0;
       return this;
    }
    public SearchParams$a e(int p0){
       this.b = p0;
       return this;
    }
    public SearchParams$a f(String p0){
       this.c = p0;
       return this;
    }
    public SearchParams$a g(String p0){
       this.a = p0;
       return this;
    }
}

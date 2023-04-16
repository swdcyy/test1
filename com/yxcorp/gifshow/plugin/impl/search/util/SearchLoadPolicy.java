package com.yxcorp.gifshow.plugin.impl.search.util.SearchLoadPolicy;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class SearchLoadPolicy extends Enum	// class@000fd8
{
    public static final SearchLoadPolicy[] $VALUES;
    public static final SearchLoadPolicy DIALOG;
    public static final SearchLoadPolicy SILENT;

    static {
       SearchLoadPolicy searchLoadPo = new SearchLoadPolicy("SILENT", 0);
       SearchLoadPolicy.SILENT = searchLoadPo;
       SearchLoadPolicy searchLoadPo1 = new SearchLoadPolicy("DIALOG", 1);
       SearchLoadPolicy.DIALOG = searchLoadPo1;
       SearchLoadPolicy[] searchLoadPo2 = new SearchLoadPolicy[]{searchLoadPo,searchLoadPo1};
       SearchLoadPolicy.$VALUES = searchLoadPo2;
    }
    public void SearchLoadPolicy(String p0,int p1){
       super(p0, p1);
    }
    public static SearchLoadPolicy valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, SearchLoadPolicy.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(SearchLoadPolicy.class, p0);
    }
    public static SearchLoadPolicy[] values(){
       Object obj = PatchProxy.apply(null, null, SearchLoadPolicy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SearchLoadPolicy.$VALUES.clone();
    }
}

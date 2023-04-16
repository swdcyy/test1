package com.yxcorp.gifshow.detail.model.comment.CommentGuessSearch;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.mix.PhotoMeta;
import fa6.e;
import fa6.b;

public class CommentGuessSearch implements Serializable	// class@001590
{
    public String mDisplayPrefix;
    public String mIconUrl;
    public String mQueryId;
    public String mQueryListId;
    public String mQueryName;
    public String mSearchWordUrl;
    public static final long serialVersionUID = 0xc8bc835664571ccc;

    public void CommentGuessSearch(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, CommentGuessSearch.class, "1")) {
          return;
       }
       e uoe = new e(CommentGuessSearch.class, "commentGuessSearch", "commentGuessSearch");
       uoe.a(null);
       c.a.e(PhotoMeta.class, uoe);
       return;
    }
}

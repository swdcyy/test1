package com.yxcorp.gifshow.comment.model.CommentGuide;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import fa6.c;
import com.kuaishou.android.model.mix.PhotoMeta;
import fa6.e;
import fa6.b;

public class CommentGuide implements Serializable	// class@0010e7
{
    public String mDefaultText;
    public List mEmojiResources;
    public static final String PART_FIELD = "commentGuide";
    public static final long serialVersionUID = 0x115b3e70b1974315;

    public void CommentGuide(){
       super();
    }
    public static void register(){
       if (PatchProxy.applyVoid(null, null, CommentGuide.class, "1")) {
          return;
       }
       e uoe = new e(CommentGuide.class, "commentGuide", "commentGuide");
       uoe.a(null);
       c.a.e(PhotoMeta.class, uoe);
       return;
    }
}

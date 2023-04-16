package com.kuaishou.live.lite.bottombar.comments.CommentEditorMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class CommentEditorMode extends Enum	// class@001eb8
{
    public static final CommentEditorMode[] $VALUES;
    public static final CommentEditorMode CommentIcon;
    public static final CommentEditorMode FullTextWith3EmojiIcon;
    public static final CommentEditorMode FullTextWithStaticIcon;
    public static final CommentEditorMode SimpleText;
    public static final CommentEditorMode SimpleTextWith1EmojiIcon;
    public static final CommentEditorMode SimpleTextWith2EmojiIcon;
    public static final CommentEditorMode SimpleTextWith3EmojiIcon;
    public static final CommentEditorMode SimpleTextWithStaticIcon;

    static {
       CommentEditorMode uCommentEdit1;
       CommentEditorMode[] uCommentEdit = new CommentEditorMode[]{uCommentEdit1,uCommentEdit1,uCommentEdit1,uCommentEdit1,uCommentEdit1,uCommentEdit1,uCommentEdit1,uCommentEdit1};
       uCommentEdit1 = new CommentEditorMode("FullTextWith3EmojiIcon", 0);
       CommentEditorMode.FullTextWith3EmojiIcon = uCommentEdit1;
       uCommentEdit1 = new CommentEditorMode("SimpleTextWith3EmojiIcon", 1);
       CommentEditorMode.SimpleTextWith3EmojiIcon = uCommentEdit1;
       uCommentEdit1 = new CommentEditorMode("SimpleTextWith2EmojiIcon", 2);
       CommentEditorMode.SimpleTextWith2EmojiIcon = uCommentEdit1;
       uCommentEdit1 = new CommentEditorMode("SimpleTextWith1EmojiIcon", 3);
       CommentEditorMode.SimpleTextWith1EmojiIcon = uCommentEdit1;
       uCommentEdit1 = new CommentEditorMode("FullTextWithStaticIcon", 4);
       CommentEditorMode.FullTextWithStaticIcon = uCommentEdit1;
       uCommentEdit1 = new CommentEditorMode("SimpleTextWithStaticIcon", 5);
       CommentEditorMode.SimpleTextWithStaticIcon = uCommentEdit1;
       uCommentEdit1 = new CommentEditorMode("SimpleText", 6);
       CommentEditorMode.SimpleText = uCommentEdit1;
       uCommentEdit1 = new CommentEditorMode("CommentIcon", 7);
       CommentEditorMode.CommentIcon = uCommentEdit1;
       CommentEditorMode.$VALUES = uCommentEdit;
    }
    public void CommentEditorMode(String p0,int p1){
       super(p0, p1);
    }
    public static CommentEditorMode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CommentEditorMode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(CommentEditorMode.class, p0);
    }
    public static CommentEditorMode[] values(){
       Object obj = PatchProxy.apply(null, null, CommentEditorMode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CommentEditorMode.$VALUES.clone();
    }
}

package com.kuaishou.live.core.basic.model.LiteCommentAreaShowEmojiConfig;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiteCommentAreaShowEmojiConfig	// class@000848
{
    public final List liteCommentAreaShowEmojiList;

    public void LiteCommentAreaShowEmojiConfig(List p0){
       super();
       this.liteCommentAreaShowEmojiList = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiteCommentAreaShowEmojiConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof LiteCommentAreaShowEmojiConfig && a.g(this.liteCommentAreaShowEmojiList, p0.liteCommentAreaShowEmojiList))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       LiteCommentAreaShowEmojiConfig obj = PatchProxy.apply(null, this, LiteCommentAreaShowEmojiConfig.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.liteCommentAreaShowEmojiList;
       int i = (obj != null)? obj.hashCode(): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiteCommentAreaShowEmojiConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiteCommentAreaShowEmojiConfig\(liteCommentAreaShowEmojiList="+this.liteCommentAreaShowEmojiList+"\)";
    }
}

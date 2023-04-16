package com.kuaishou.live.common.core.component.gift.giftNaming.bean.LiveGiftNamingRichTextMessage;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichTextMessage$CommentRichTextSegment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Arrays;
import java.lang.Number;
import java.lang.StringBuilder;

public final class LiveGiftNamingRichTextMessage	// class@0012c2
{
    public LiveCommentRichTextMessage$CommentRichTextSegment[] a;

    public void LiveGiftNamingRichTextMessage(){
       super(null);
    }
    public void LiveGiftNamingRichTextMessage(LiveCommentRichTextMessage$CommentRichTextSegment[] p0){
       super();
       this.a = p0;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftNamingRichTextMessage.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof LiveGiftNamingRichTextMessage) {
          return false;
       }
       LiveGiftNamingRichTextMessage ta = this.a;
       if (ta != null) {
          p0 = p0.a;
          if (p0 == null) {
             return false;
          }else if(!Arrays.equals(ta, p0)){
             return false;
          }
       }else if(p0.a != null){
          return false;
       }
       return true;
    }
    public int hashCode(){
       LiveGiftNamingRichTextMessage obj = PatchProxy.apply(null, this, LiveGiftNamingRichTextMessage.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = (obj != null)? Arrays.hashCode(obj): 0;
       return i;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveGiftNamingRichTextMessage.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveGiftNamingRichTextMessage\(segments="+Arrays.toString(this.a)+"\)";
    }
}

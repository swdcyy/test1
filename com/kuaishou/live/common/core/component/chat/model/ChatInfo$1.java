package com.kuaishou.live.common.core.component.chat.model.ChatInfo$1;
import java.util.LinkedHashMap;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.AbstractMap;

public class ChatInfo$1 extends LinkedHashMap	// class@001040
{
    public final ChatInfo this$0;
    public static final long serialVersionUID = 0x9e14f7aeb237163c;

    public void ChatInfo$1(ChatInfo p0){
       this.this$0 = p0;
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ChatInfo$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "size = "+this.size()+" "+super.toString();
    }
}

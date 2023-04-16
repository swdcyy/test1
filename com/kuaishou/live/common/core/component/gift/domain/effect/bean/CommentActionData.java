package com.kuaishou.live.common.core.component.gift.domain.effect.bean.CommentActionData;
import com.kuaishou.live.common.core.component.gift.domain.effect.bean.ActionData;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import nsd.u;

public final class CommentActionData extends ActionData	// class@00119d
{
    public final String content;

    public void CommentActionData(String p0){
       a.p(p0, "content");
       super(2, 0, 2, null);
       this.content = p0;
    }
    public final String getContent(){
       return this.content;
    }
}

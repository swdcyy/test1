package com.kuaishou.live.common.core.component.comments.item.LiveRichTextViewHolderFactory$ViewHolder$onBindData$4;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.common.core.component.comments.model.RichTextMessage;
import com.kuaishou.live.comments.widget.LiveDraweeItemView;
import java.lang.Object;
import java.lang.CharSequence;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.comments.util.LiveMsgFormatter;

public final class LiveRichTextViewHolderFactory$ViewHolder$onBindData$4 extends Lambda implements l	// class@001095
{
    public final RichTextMessage $message;
    public final LiveDraweeItemView $view;

    public void LiveRichTextViewHolderFactory$ViewHolder$onBindData$4(RichTextMessage p0,LiveDraweeItemView p1){
       this.$message = p0;
       this.$view = p1;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichTextViewHolderFactory$ViewHolder$onBindData$4.class, "1")) {
          return;
       }
       LiveMsgFormatter.a(p0);
       this.$message.setContent(p0);
       this.$view.setText(p0);
       return;
    }
}

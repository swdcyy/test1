package com.kuaishou.live.common.core.component.comments.item.LiveRichTextViewHolderFactory$a;
import k81.h;
import com.kuaishou.live.common.core.component.comments.item.LiveRichTextViewHolderFactory;
import com.kuaishou.live.comments.widget.LiveDraweeItemView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.View;
import r81.c;
import o81.g;
import android.graphics.drawable.Drawable;
import com.kuaishou.live.basic.model.QLiveMessage;
import com.kuaishou.live.common.core.component.comments.model.RichTextMessage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.protobuf.livestream.nano.LiveFeedBackground;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.richtext.tools.LiveCommentBackgroundParser;
import qrd.p;
import com.kuaishou.live.comments.widget.LiveCommentsNormalItemView;
import java.lang.CharSequence;
import android.text.TextUtils;
import crd.b;
import lnc.b9;
import com.kuaishou.live.common.core.component.comments.item.LiveRichTextViewHolderFactory$ViewHolder$onBindData$3;
import com.kuaishou.live.common.core.component.comments.item.LiveRichTextViewHolderFactory$ViewHolder$onBindData$4;
import k51.a;
import msd.a;
import msd.l;
import k51.b;

public final class LiveRichTextViewHolderFactory$a extends h	// class@001096
{
    public final Drawable f;
    public b g;
    public final LiveRichTextViewHolderFactory h;

    public void LiveRichTextViewHolderFactory$a(LiveRichTextViewHolderFactory p0,LiveDraweeItemView p1){
       a.p(p1, "view");
       this.h = p0;
       super(p1);
       this.f = p0.c.d().a();
    }
    public void a(View p0,QLiveMessage p1,int p2){
       Object[] objArray;
       if (!PatchProxy.isSupport(LiveRichTextViewHolderFactory$a.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, LiveRichTextViewHolderFactory$a.class, "1")) {
          a.p(p0, "view");
          a.p(p1, "message");
          LiveFeedBackground background = p1.getBackground();
          if (background != null) {
             LiveRichTextViewHolderFactory$a th = this.h;
             Objects.requireNonNull(th);
             objArray = null;
             Object obj = PatchProxy.apply(objArray, th, LiveRichTextViewHolderFactory.class, "1");
             if (obj != PatchProxyResult.class) {
             }else {
                obj = th.b.getValue();
             }
             LiveFeedBackground resPackId = background.resPackId;
             a.o(resPackId, "resPackId");
             background = background.iconPath;
             a.o(background, "iconPath");
             LiveRichTextViewHolderFactory c = this.h.c;
             Drawable uDrawable = obj.b(resPackId, background, c.f, c.j);
             if (uDrawable != null) {
                p0.p(true);
                objArray = uDrawable;
             }
             if (objArray != null) {
             label_0077 :
                p0.setBackground(objArray);
                if (!TextUtils.isEmpty(p1.getContent())) {
                   p0.setText(p1.getContent());
                }else {
                   b9.a(this.g);
                   this.g = b.e(new LiveRichTextViewHolderFactory$ViewHolder$onBindData$3(this, p1), new LiveRichTextViewHolderFactory$ViewHolder$onBindData$4(p1, p0), a.d());
                }
             }
          }
          p0.p(false);
          objArray = this.f;
          goto label_0077 ;
       }
       return;
    }
    public void b(View p0,QLiveMessage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRichTextViewHolderFactory$a.class, "2")) {
       }else {
          a.p(p0, "view");
          a.p(p1, "message");
          p0.setText(null);
          p0.setBackground(null);
          p1.setContent(null);
          b9.a(this.g);
       }
       return;
    }
}

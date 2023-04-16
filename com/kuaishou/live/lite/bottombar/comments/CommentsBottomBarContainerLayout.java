package com.kuaishou.live.lite.bottombar.comments.CommentsBottomBarContainerLayout;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.bottombar.comments.CommentEditorMode;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.graphics.Paint;
import java.lang.StringBuilder;
import k93.l;
import k93.m;
import java.lang.Integer;
import android.view.View$MeasureSpec;
import com.kwai.robust.PatchProxyResult;
import k93.k;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import k93.m$a;
import android.view.View;
import java.lang.Number;
import android.view.ViewGroup$LayoutParams;
import l93.a;
import android.widget.FrameLayout$LayoutParams;

public final class CommentsBottomBarContainerLayout extends FrameLayout	// class@001eb9
{
    public m b;
    public l c;
    public List d;
    public List e;
    public Paint f;

    public void CommentsBottomBarContainerLayout(Context p0){
       a.p(p0, "context");
       super(p0);
       CommentEditorMode[] uCommentEdit = new CommentEditorMode[]{CommentEditorMode.SimpleText};
       this.d = CollectionsKt__CollectionsKt.P(uCommentEdit);
       this.e = CollectionsKt__CollectionsKt.E();
    }
    public void CommentsBottomBarContainerLayout(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       CommentEditorMode[] uCommentEdit = new CommentEditorMode[]{CommentEditorMode.SimpleText};
       this.d = CollectionsKt__CollectionsKt.P(uCommentEdit);
       this.e = CollectionsKt__CollectionsKt.E();
    }
    public void CommentsBottomBarContainerLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       CommentEditorMode[] uCommentEdit = new CommentEditorMode[]{CommentEditorMode.SimpleText};
       this.d = CollectionsKt__CollectionsKt.P(uCommentEdit);
       this.e = CollectionsKt__CollectionsKt.E();
    }
    public final void a(List p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CommentsBottomBarContainerLayout.class, "1")) {
          return;
       }
       a.p(p0, "validModes");
       a.p(p1, "emojiList");
       this.d = p0;
       this.e = p1;
       this.forceLayout();
       this.requestLayout();
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentsBottomBarContainerLayout.class, "3")) {
          return;
       }
       super.dispatchDraw(p0);
       CommentsBottomBarContainerLayout tf = this.f;
       if (tf != null) {
          if (p0 != null) {
             p0.drawRect(0, 0, (float)this.getWidth(), (float)this.getHeight(), tf);
          }
          if (p0 != null) {
             p0.drawText(":-"+this.getWidth(), 10.00f, 40.00f, tf);
          }
       }
       return;
    }
    public final l getCommentViewDelegate(){
       return this.c;
    }
    public final m getEmojiModeSelector(){
       return this.b;
    }
    public void onMeasure(int p0,int p1){
       int i;
       k ok;
       int i2;
       CommentsBottomBarContainerLayout obj = this;
       String str = "2";
       if (PatchProxy.isSupport(CommentsBottomBarContainerLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), obj, CommentsBottomBarContainerLayout.class, str)) {
          return;
       }
       CommentsBottomBarContainerLayout b = obj.b;
       CommentsBottomBarContainerLayout c = obj.c;
       if (b != null && (c == null || obj.d.isEmpty())) {
          super.onMeasure(p0, p1);
          return;
       }else {
          int size = View$MeasureSpec.getSize(p0);
          if (size <= 0) {
             super.onMeasure(p0, p1);
             return;
          }else {
             this.removeAllViewsInLayout();
             Context context = this.getContext();
             a.o(context, "context");
             CommentsBottomBarContainerLayout d = obj.d;
             if (PatchProxy.isSupport(m.class)) {
                i = -2;
                ok = PatchProxy.applyThreeRefs(Integer.valueOf(size), context, d, b, m.class, "1");
                if (ok != PatchProxyResult.class) {
                }else {
                label_006a :
                   a.p(context, "context");
                   a.p(d, "testModes");
                   Iterator iterator = CollectionsKt___CollectionsKt.b5(d).iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         k ok1 = b.b.a(iterator.next());
                         View view1 = ok1.c(context);
                         ViewGroup$LayoutParams obj1 = PatchProxy.applyOneRefs(view1, b, m.class, str);
                         if (obj1 != PatchProxyResult.class) {
                            i2 = obj1.intValue();
                         }else if(view1.getLayoutParams() == null){
                            view1.setLayoutParams(new ViewGroup$LayoutParams(i, i));
                         }
                         obj1 = view1.getLayoutParams();
                         if (obj1 != null) {
                            obj1.width = i;
                         }
                         view1.forceLayout();
                         view1.measure(b.a, b.a);
                         obj1 = view1.getLayoutParams();
                         if (obj1 != null) {
                            obj1.width = -1;
                         }
                         i2 = view1.getMeasuredWidth();
                         if (i2 <= size) {
                            ok = ok1;
                         }
                      }else {
                         ok = b.b.a(CommentEditorMode.CommentIcon);
                         ok.c(context);
                      }
                   }
                }
             }else {
                i = -2;
                goto label_006a ;
             }
             ok.d(c);
             int i1 = -2;
             obj = this;
             ok.a(obj.e);
             Context context1 = this.getContext();
             a.o(context1, "context");
             View view = ok.c(context1);
             if (!ok instanceof a) {
                ok = null;
             }
             if (ok == null) {
                view.getLayoutParams().width = size;
             }
             ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
             if (layoutParams == null) {
                layoutParams = new FrameLayout$LayoutParams(i1, i1);
             }
             obj.addViewInLayout(view, 0, layoutParams, true);
             super.onMeasure(p0, p1);
             return;
          }
       }
    }
    public final void setCommentViewDelegate(l p0){
       this.c = p0;
    }
    public final void setEmojiModeSelector(m p0){
       this.b = p0;
    }
}

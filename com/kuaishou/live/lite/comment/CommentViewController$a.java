package com.kuaishou.live.lite.comment.CommentViewController$a;
import w93.a$a;
import com.kuaishou.live.lite.comment.CommentViewController;
import java.lang.Object;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.comment.view.LiveLiteCommentRecyclerView;
import com.kuaishou.live.lite.comment.view.CommentLinearLayoutManager;
import java.util.Objects;
import java.lang.Number;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kuaishou.live.viewcontroller.adapter.ViewControllerAdapter;
import com.kuaishou.live.lite.comment.model.CommentConfigProvider;
import com.kuaishou.live.lite.comment.view.CommentMessageListAdapter;
import androidx.recyclerview.widget.h$b;
import s93.g;
import u2.f;
import java.util.Collection;
import android.view.ViewGroup;
import aa3.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class CommentViewController$a implements a$a	// class@0007d6
{
    public final CommentViewController a;

    public void CommentViewController$a(CommentViewController p0){
       this.a = p0;
       super();
    }
    public void a(List p0,int p1){
       CommentViewController$a ta2;
       CommentViewController d;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CommentViewController uCommentView = CommentViewController.class;
       CommentViewController$a uoa = CommentViewController$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.p(p0, "commentMessageList");
       if (CommentViewController.X2(this.a).x()) {
          return;
       }
       CommentLinearLayoutManager uCommentLine = CommentViewController.W2(this.a);
       CommentViewController$a ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.isSupport(uCommentView)) {
          CommentViewController obj = PatchProxy.applyOneRefs(Integer.valueOf(p1), ta, uCommentView, "11");
          if (obj != patchProxyRe) {
             p1 = obj.intValue();
          }else {
          label_004f :
             obj = ta.y;
             if (obj == null) {
                a.S("layoutManager");
             }
             int i = obj.E();
             CommentViewController x = ta.x;
             if (x == null) {
                a.S("adapter");
             }
             if (i < (x.L0().size() - 1)) {
                d = ta.D;
             }else if(p1 > ta.m.a()){
                d = ta.E;
             }else {
                d = ta.F;
             }
          }
       }else {
          goto label_004f ;
       }
       uCommentLine.s = p1;
       CommentMessageListAdapter uCommentMess = CommentViewController.V2(this.a);
       CommentViewController$a ta1 = this.a;
       List list = CommentViewController.V2(ta1).L0();
       Objects.requireNonNull(ta1);
       g og = PatchProxy.applyTwoRefs(list, p0, ta1, uCommentView, "12");
       if (og != patchProxyRe) {
       }else {
          og = new g(list, p0);
       }
       ViewControllerAdapter.J0(uCommentMess, p0, og, null, false, 12, null);
       if (this.a.k != null && (p0.isEmpty() ^ 0x01)) {
          CommentViewController.W2(this.a).scrollToPositionWithOffset(0, 0);
          if (CommentViewController.X2(this.a).getHeight() > 0) {
             ta2 = this.a;
             ta2.A.f(CommentViewController.X2(ta2).getHeight());
             b.Z(LiveLogTag.LIVE_LITE_COMMENT, this.a.j+" onUpdate updateFirstItemTopSpace "+CommentViewController.X2(this.a).getHeight());
          }
          ta2.k = false;
       }
       return;
    }
}

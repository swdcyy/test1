package nmd.e;
import ekd.f$j;
import nmd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.MultiVoteOptionFeedData;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.MultiVoteStickerFeedUIData;
import nmd.a$b;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteTextView;
import com.yxcorp.gifshow.kuaishan.widget.KSProgressBar;

public final class e extends f$j	// class@001e53
{
    public final a a;
    public final MultiVoteOptionFeedData b;
    public final int c;
    public final int d;
    public final MultiVoteOptionFeedData e;
    public final int f;
    public final int g;
    public final MultiVoteOptionFeedData h;
    public final int i;
    public final int j;
    public final int k;

    public void e(a p0,MultiVoteOptionFeedData p1,int p2,int p3,MultiVoteOptionFeedData p4,int p5,int p6,MultiVoteOptionFeedData p7,int p8,int p9,int p10){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       this.k = p10;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "3")) {
          return;
       }
       e ta = this.a;
       a a = ta.a;
       if (a != null) {
          ta.d(a);
          a b = this.a.b;
          if (b != null) {
             b.b(this.k);
          }
       }
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       e ta = this.a;
       a a = ta.a;
       if (a != null) {
          ta.d(a);
          a b = this.a.b;
          if (b != null) {
             b.b(this.k);
          }
       }
       return;
    }
    public void onAnimationStart(Animator p0){
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, e.class, "1")) {
          return;
       }
       e a = obj.a;
       obj.a.c(obj.b.getSelectedByMe(), obj.c, a.g, a.f, obj.d, a.h, 0, true);
       a = obj.a;
       obj.a.c(obj.e.getSelectedByMe(), obj.f, a.j, a.i, obj.g, a.k, 0, true);
       e a1 = obj.a;
       obj.a.c(obj.h.getSelectedByMe(), obj.i, a1.m, a1.l, obj.j, a1.n, 0, true);
       return;
    }
}

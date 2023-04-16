package nmd.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import nmd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.MultiVoteOptionFeedData;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Float;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.editor.sticker.vote.VoteTextView;
import com.yxcorp.gifshow.kuaishan.widget.KSProgressBar;

public final class d implements ValueAnimator$AnimatorUpdateListener	// class@001e51
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

    public void d(a p0,MultiVoteOptionFeedData p1,int p2,int p3,MultiVoteOptionFeedData p4,int p5,int p6,MultiVoteOptionFeedData p7,int p8,int p9){
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
       super();
    }
    public final void onAnimationUpdate(ValueAnimator p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, d.class, "1")) {
          return;
       }
       d a = obj.a;
       a.o(obj1, "it");
       Object animatedValu = p0.getAnimatedValue();
       Objects.requireNonNull(animatedValu, "null cannot be cast to non-null type kotlin.Float");
       obj.a.c(obj.b.getSelectedByMe(), obj.c, a.g, a.f, obj.d, a.h, animatedValu.floatValue(), false);
       a = obj.a;
       Object animatedValu1 = p0.getAnimatedValue();
       Objects.requireNonNull(animatedValu1, "null cannot be cast to non-null type kotlin.Float");
       obj.a.c(obj.e.getSelectedByMe(), obj.f, a.j, a.i, obj.g, a.k, animatedValu1.floatValue(), false);
       d a1 = obj.a;
       obj1 = p0.getAnimatedValue();
       Objects.requireNonNull(obj1, "null cannot be cast to non-null type kotlin.Float");
       obj.a.c(obj.h.getSelectedByMe(), obj.i, a1.m, a1.l, obj.j, a1.n, obj1.floatValue(), false);
       return;
    }
}

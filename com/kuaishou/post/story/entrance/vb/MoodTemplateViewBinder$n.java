package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$n;
import androidx.lifecycle.Observer;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rp4.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.post.story.entrance.data.MoodTemplateUiData;
import mq4.f;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Boolean;
import jq4.a;
import com.kuaishou.post.story.widget.PureTextBackgroundView;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import android.view.View;
import java.util.List;
import android.widget.ImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.Objects;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kuaishou.post.story.entrance.vb.b;
import java.lang.Runnable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import kotlin.jvm.internal.a;
import com.yxcorp.utility.n;
import java.io.File;
import qkd.b;
import android.graphics.Bitmap;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$PostTaskState;
import com.kuaishou.post.story.entrance.repo.MoodTemplateRepo;

public final class MoodTemplateViewBinder$n implements Observer	// class@000b68
{
    public final MoodTemplateViewBinder b;

    public void MoodTemplateViewBinder$n(MoodTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateViewBinder$n.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("MoodTemplateViewBinder", "mCurrentRemoteTemplate it:"+p0, objArray);
          MoodTemplateUiData first = (p0 != null)? p0.getFirst(): null;
          int i = this.b.D.X0();
          int i1 = this.b.S.r0(first);
          this.b.D.Y0(i1);
          if (i >= 0) {
             this.b.D.l0(i);
          }
          int i2 = 8;
          if (i1 >= 0 && first != null) {
             this.b.D.l0(i1);
             this.b.H(i1, p0.getSecond().booleanValue());
             this.b.z.setBackgroundColorData(first.F());
             if (!first.w()) {
                this.b.z.invalidate();
                this.b.z.setVisibility(0);
             }else {
                this.b.z.setVisibility(i2);
             }
             if (first.m().isEmpty()) {
                this.b.p.y(first.l(), this.b.p.getWidth(), this.b.p.getHeight());
             }else {
                this.b.p.P(first.m());
             }
          }
          if (this.b.S.z0()) {
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoidOneRefs(first, p0, MoodTemplateViewBinder.class, "7")) {
                String str = "null cannot be cast to non-null type android.widget.TextView";
                if (first != null) {
                   p0 = p0.y;
                   Objects.requireNonNull(p0, str);
                   p0.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.arg_RES_7f081b7c, 0, 0);
                }else {
                   p0 = p0.y;
                   Objects.requireNonNull(p0, str);
                   p0.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.arg_RES_7f081b7d, 0, 0);
                }
             }
             p0 = this.b.f;
             if (p0 != null) {
                p0.setVisibility(i2);
             }
          }
          if (first != null) {
             p0 = this.b;
             if (p0.G != null) {
                p0.z.postDelayed(new b(this, first), 400);
                p0.G = false;
             }else {
                p0.N(first);
             }
             this.b.L(first);
             this.b.M(first);
             if (!first.w()) {
                if (this.b.E().getActivity() instanceof Activity) {
                   p0 = this.b;
                   FragmentActivity activity = p0.E().getActivity();
                   a.m(activity);
                   p0.I = n.k(activity);
                   p0 = this.b;
                   activity = p0.E().getActivity();
                   a.m(activity);
                   p0.J = n.j(activity);
                }
                if (b.S(new File(first.q()))) {
                   this.b.K(first);
                   this.b.S.A0(first, 0);
                }else {
                   p0 = this.b;
                   MoodTemplateViewBinder s = p0.S;
                   p0 = p0.z.a(p0.I, p0.J);
                   Objects.requireNonNull(s);
                   if (!PatchProxy.applyVoidTwoRefs(first, p0, s, MoodTemplateViewModel.class, "10")) {
                      a.p(first, "moodTemplateUiData");
                      Object[] objArray2 = new Object[0];
                      a.D().w("MoodTemplateViewModel", "runPureRemoteTemplateTask moodTemplateUiData:"+first, objArray2);
                      if (p0 != null) {
                         s.m.p(first, 1, p0);
                      }
                   }
                }
             }
          }
       label_01cc :
          Object[] objArray1 = new Object[0];
          a.D().w("MoodTemplateViewBinder", "mCurrentRemoteTemplate oldPosition:"+i+", newPosition:"+i1, objArray1);
       }
       return;
    }
}

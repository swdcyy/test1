package com.yxcorp.gifshow.v3.editor.music_v2.item.MusicIcon;
import com.yxcorp.gifshow.v3.editor.item.EditIcon;
import com.yxcorp.gifshow.v3.editor.music_v2.item.MusicIcon$a;
import nsd.u;
import lnc.a1;
import ooc.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.music.Music;
import soc.j$b;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.kuaishou.edit.draft.Workspace$Source;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import android.widget.ImageView;
import hq.a;
import android.app.Activity;
import k2b.e0;
import lsc.b0;
import android.widget.RelativeLayout;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import th0.e;
import android.animation.TimeInterpolator;
import th0.a;
import rrc.b;
import android.animation.Animator$AnimatorListener;
import android.widget.TextView;
import com.yxcorp.gifshow.v3.widget.MarqueeTextView;
import com.yxcorp.gifshow.v3.widget.FadingEdgeContainer;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.v3.editor.item.PostBaseIcon;
import android.content.res.Resources;
import yvc.a;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.CharSequence;
import android.view.ViewGroup;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import rrc.a;
import aw9.c0;
import java.util.Objects;
import pwc.c;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import com.kwai.video.editorsdk2.PreviewEventListenerV2;
import java.lang.Float;
import android.widget.ProgressBar;
import com.kwai.robust.PatchProxyResult;

public final class MusicIcon extends EditIcon	// class@001097
{
    public float currentPercent;
    public int currentState;
    public int iconPosition;
    public Music selectedMusic;
    public static final MusicIcon$a Companion;
    public static final int b;
    public static final int c;
    public static final int d;

    static {
       MusicIcon.Companion = new MusicIcon$a(null);
       MusicIcon.b = a1.e(22.00f);
       MusicIcon.c = a1.e(20.00f);
       MusicIcon.d = a1.e(5.00f);
    }
    public void MusicIcon(g p0,int p1,int p2){
       a.p(p0, "model");
       super(p0, p1, p2);
       this.currentState = 1;
    }
    public final void a(Music p0,boolean p1,j$b p2,Context p3){
       j$b f;
       int i;
       KwaiImageView kwaiImageVie;
       KwaiImageView kwaiImageVie2;
       boolean b1;
       String id;
       a a;
       e0 this;
       EditIcon uEditIcon = this;
       Music music = p0;
       j$b uob = p2;
       if (PatchProxy.isSupport(MusicIcon.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, p3, this, MusicIcon.class, "6")) {
          return;
       }
       String str = "viewHolder.iconView";
       String str1 = "viewHolder.musicRotateIconView";
       String str2 = "viewHolder.musicCoverLayout";
       if (music) {
          EditIcon mEditorDeleg = uEditIcon.mEditorDelegate;
          a.o(mEditorDeleg, "mEditorDelegate");
          c uoc = mEditorDeleg.N();
          a.o(uoc, "mEditorDelegate.workspaceDraft");
          if (uoc.T0() == Workspace$Source.REEDIT) {
          label_020d :
             if (!PatchProxy.isSupport(MusicIcon.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p1), p2, p3, this, MusicIcon.class, "9")) {
                f = uob.f;
                a.o(f, str2);
                f.setVisibility(8);
                f = uob.h;
                a.o(f, str1);
                f.setVisibility(8);
                f = uob.i;
                a.o(f, "viewHolder.musicNameContainerView");
                f.setVisibility(8);
                f = uob.a;
                a.o(f, "viewHolder.textView");
                i = 0;
                f.setVisibility(i);
                f = uob.b;
                a.o(f, str);
                f.setVisibility(i);
                f = uob.b;
                Drawable successIconD = (p1)? uEditIcon.getSuccessIconDrawable(p3): uEditIcon.getOriginIconDrawable(p3.getResources());
                f.setImageDrawable(successIconD);
             }
          }else if(PatchProxy.isSupport(MusicIcon.class) && (PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, MusicIcon.class, "8") || p2.getAdapterPosition() != uEditIcon.iconPosition)){
             boolean b = PostExperimentUtils.t();
             if (b) {
                kwaiImageVie = uob.h.findViewById(R.id.music_wheel_cover);
                if (kwaiImageVie == null) {
                   PostUtils.D("MusicIcon", "showMusicCover\(\) no wheelCoverView", new IllegalArgumentException());
                }
             }else {
                kwaiImageVie = uob.g;
             }
             KwaiImageView kwaiImageVie1 = kwaiImageVie;
             a.o(kwaiImageVie1, "coverView");
             if (PatchProxy.isSupport(MusicIcon.class)) {
                kwaiImageVie2 = kwaiImageVie1;
                b1 = b;
                if (!PatchProxy.applyVoidThreeRefs(kwaiImageVie1, p0, Boolean.valueOf(b), this, MusicIcon.class, "7")) {
                label_00c5 :
                   id = p0.getId();
                   if (id == null || id.equals(kwaiImageVie2.getTag()) != true) {
                      int c = (b1)? MusicIcon.c: MusicIcon.b;
                      a = a.a;
                      EditIcon mEditorDeleg1 = uEditIcon.mEditorDelegate;
                      this = null;
                      Activity context = (mEditorDeleg1 != null)? mEditorDeleg1.getContext(): this;
                      if (context instanceof e0) {
                         this = context;
                      }
                      a.a(this, music);
                      KwaiImageView kwaiImageVie3 = kwaiImageVie2;
                      kwaiImageVie3.setTag(p0.getId());
                      b0.a(kwaiImageVie3, music, c);
                   }
                }
             }else {
                kwaiImageVie2 = kwaiImageVie1;
                b1 = b;
                int i2 = 1;
                goto label_00c5 ;
             }
             f = uob.b;
             a.o(f, str);
             i = 3;
             if (!f.getVisibility()) {
                f = uob.f;
                a.o(f, str2);
                if (!f.getVisibility()) {
                   f = uob.h;
                   a.o(f, str1);
                   if (!f.getVisibility()) {
                   label_01ab :
                      if (p1) {
                         f = uob.a;
                         a.o(f, "viewHolder.textView");
                         f.setVisibility(8);
                         f = uob.i;
                         a.o(f, "viewHolder.musicNameContainerView");
                         f.setVisibility(0);
                         f = uob.j;
                         String str3 = "viewHolder.musicNameTextView";
                         a.o(f, str3);
                         f.setGravity(17);
                         uob.j.setText(p0.getDisplayName());
                         uob.j.r();
                         f = uob.j;
                         a.o(f, str3);
                         if (f.h != null) {
                            uob.i.a(i, MusicIcon.d);
                         }else {
                            uob.i.a(0, 0);
                         }
                      }else {
                         f = uob.a;
                         a.o(f, "viewHolder.textView");
                         f.setVisibility(0);
                         f = uob.i;
                         a.o(f, "viewHolder.musicNameContainerView");
                         f.setVisibility(8);
                         uob.j.s();
                      }
                   }
                }
                int i1 = 2;
                AnimatorSet uAnimatorSet = new AnimatorSet();
                Animator[] uAnimatorArr = new Animator[i];
                uAnimatorArr[0] = ObjectAnimator.ofFloat(uob.b, "scaleX", new float[i1]{0x3f800000,0x3f99999a});
                uAnimatorArr[1] = ObjectAnimator.ofFloat(uob.b, "scaleY", new float[i1]{0x3f800000,0x3f99999a});
                uAnimatorArr[i1] = ObjectAnimator.ofFloat(uob.b, "alpha", new float[i1]{0x3f800000,0});
                uAnimatorSet.playTogether(uAnimatorArr);
                uAnimatorSet.setInterpolator(new e());
                ObjectAnimator objectAnimat = (b1)? ObjectAnimator.ofFloat(uob.h, "alpha", new float[i1]{0,0x3f800000}): ObjectAnimator.ofFloat(uob.f, "alpha", new float[i1]{0,0x3f800000});
                a.o(objectAnimat, "fadeIn");
                objectAnimat.setInterpolator(new a(2.00f));
                AnimatorSet uAnimatorSet1 = new AnimatorSet();
                Animator[] uAnimatorArr1 = new Animator[i1];
                uAnimatorArr1[0] = uAnimatorSet;
                uAnimatorArr1[1] = objectAnimat;
                uAnimatorSet1.playTogether(uAnimatorArr1);
                uAnimatorSet1.setDuration(300);
                uAnimatorSet1.addListener(new b(b1, uob));
                uAnimatorSet1.start();
                goto label_01ab ;
             }else {
                goto label_01ab ;
             }
          }
       }else {
          goto label_020d ;
       }
       return;
    }
    public void bindIconView(a p0,EditorItemFunc p1,j$b p2,EditorDelegate p3,Context p4){
       j$b a;
       if (PatchProxy.isSupport(MusicIcon.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, MusicIcon.class, "2")) {
             return;
          }
       }
       a.p(p1, "model");
       a.p(p2, "holder");
       a.p(p3, "editorDelegate");
       a.p(p4, "context");
       this.iconPosition = p2.getAdapterPosition();
       RecyclerView$ViewHolder itemView = p2.itemView;
       a.o(itemView, "holder.itemView");
       itemView.setActivated(1);
       a = p2.a;
       a.o(a, "holder.textView");
       a.setActivated(1);
       a = p2.b;
       a.o(a, "holder.iconView");
       a.setActivated(1);
       a = p2.a;
       a.o(a, "holder.textView");
       a.setText(p4.getText(this.getOriginTextId()));
       p2.b.setImageDrawable(this.getOriginIconDrawable(p4.getResources()));
       a = p2.c;
       a.o(a, "holder.newIndicator");
       int i = 8;
       a.setVisibility(i);
       MusicIcon tcurrentStat = this.currentState;
       String str = "viewHolder.progressLayout";
       if (tcurrentStat != 1) {
          if (tcurrentStat != 2) {
             if (tcurrentStat != 3) {
                if (tcurrentStat == 4) {
                label_013b :
                   if (!PatchProxy.applyVoidTwoRefs(p2, p4, this, MusicIcon.class, "3")) {
                      a = p2.d;
                      a.o(a, str);
                      a.setVisibility(i);
                      a = p2.i;
                      a.o(a, "viewHolder.musicNameContainerView");
                      a.setVisibility(i);
                      this.a(null, 0, p2, p4);
                   }
                }
             }else if(PatchProxy.applyVoidTwoRefs(p2, p4, this, MusicIcon.class, "4")){
                a = p2.d;
                a.o(a, str);
                a.setVisibility(i);
                this.a(this.selectedMusic, 1, p2, p4);
                if (!PatchProxy.applyVoidOneRefs(p2, this, MusicIcon.class, "10") && PostExperimentUtils.t()) {
                   EditIcon tmEditorDele = this.mEditorDelegate;
                   String str1 = "mEditorDelegate";
                   a.o(tmEditorDele, str1);
                   if (!f.E(tmEditorDele.getType()) && p2.getAdapterPosition() == this.iconPosition) {
                      EditIcon tmEditorDele1 = this.mEditorDelegate;
                      a.o(tmEditorDele1, str1);
                      c0 uoc0 = tmEditorDele1.O();
                      Objects.requireNonNull(uoc0, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.previewer.player.EditorVideoPlayer");
                      VideoSDKPlayerView videoSDKPlay = uoc0.a();
                      a.o(videoSDKPlay, "\(mEditorDelegate.editorP¡­orVideoPlayer\).playerView");
                      videoSDKPlay.setPreviewEventListener("MusicIcon", new a(p2));
                   }
                }
             }
          }else {
             tcurrentStat = this.currentPercent;
             if (!PatchProxy.isSupport(MusicIcon.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(tcurrentStat), p2, this, MusicIcon.class, "5")) {
                j$b d = p2.d;
                a.o(d, str);
                d.setVisibility(0);
                d = p2.e;
                a.o(d, "viewHolder.progressView");
                p2 = p2.e;
                a.o(p2, "viewHolder.progressView");
                d.setProgress((int)((float)p2.getMax() * tcurrentStat));
             }
          }
       }else {
          goto label_013b ;
       }
       return;
    }
    public final void clearMusicAnimController(){
       if (PatchProxy.applyVoid(null, this, MusicIcon.class, "11")) {
          return;
       }
       if (!PostExperimentUtils.t()) {
          return;
       }
       EditIcon tmEditorDele = this.mEditorDelegate;
       String str = "mEditorDelegate";
       a.o(tmEditorDele, str);
       if (f.E(tmEditorDele.getType())) {
          return;
       }
       tmEditorDele = this.mEditorDelegate;
       a.o(tmEditorDele, str);
       c0 uoc0 = tmEditorDele.O();
       Objects.requireNonNull(uoc0, "null cannot be cast to non-null type com.yxcorp.gifshow.v3.previewer.player.EditorVideoPlayer");
       VideoSDKPlayerView videoSDKPlay = uoc0.a();
       a.o(videoSDKPlay, "\(mEditorDelegate.editorP¡­orVideoPlayer\).playerView");
       videoSDKPlay.setPreviewEventListener("MusicIcon", null);
       return;
    }
    public final float getCurrentPercent(){
       return this.currentPercent;
    }
    public final int getCurrentState(){
       return this.currentState;
    }
    public final Music getSelectedMusic(){
       return this.selectedMusic;
    }
    public final void setCurrentPercent(float p0){
       this.currentPercent = p0;
    }
    public final void setCurrentState(int p0){
       this.currentState = p0;
    }
    public PostBaseIcon setEditorDelegate(EditorDelegate p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MusicIcon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "editorDelegate");
       PostBaseIcon postBaseIcon = super.setEditorDelegate(p0);
       a.o(postBaseIcon, "super.setEditorDelegate\(editorDelegate\)");
       return postBaseIcon;
    }
    public final void setSelectedMusic(Music p0){
       this.selectedMusic = p0;
    }
}

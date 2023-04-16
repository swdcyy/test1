package dnd.a;
import and.a;
import wvc.a;
import androidx.fragment.app.Fragment;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import hnd.f;
import gnd.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import dnd.a$a;
import dnd.a$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.c;
import androidx.fragment.app.c$b;
import zmd.a;
import faa.a;
import java.lang.StringBuilder;
import uvc.a;
import xld.a;
import q87.c;
import android.widget.ImageView;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView$d;
import vvc.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import mod.a;

public final class a extends a implements a	// class@000ce3
{
    public final EditDecorationContainerViewV2 f;
    public final a$a g;
    public final a$b h;
    public final EditorDelegate i;

    public void a(Fragment p0,View p1,EditorDelegate p2){
       a.p(p0, "fragment");
       a.p(p1, "rootView");
       a.p(p2, "delegate");
       VideoSDKPlayerView videoSDKPlay = p0.Rh();
       a.o(videoSDKPlay, "\(fragment as VideoEditPr¡­agment\).previewPlayerView");
       super(p1, p0, videoSDKPlay, b.a(p0));
       this.i = p2;
       View view = p1.findViewById(R.id.new_text_decoration_editor_view);
       a.o(view, "rootView.findViewById\(R.¡­t_decoration_editor_view\)");
       this.f = view;
       this.g = new a$a(this);
       this.h = new a$b(this);
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       super.B();
       c fragmentMana = this.D().getFragmentManager();
       if (fragmentMana != null) {
          fragmentMana.registerFragmentLifecycleCallbacks(this.g, true);
       }
       return;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       super.C();
       c fragmentMana = this.D().getFragmentManager();
       if (fragmentMana != null) {
          fragmentMana.unregisterFragmentLifecycleCallbacks(this.g);
       }
       return;
    }
    public void O7(a p0,a p1){
       ImageView playerStatus;
       ImageView playerStatus1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       a.p(p0, "newState");
       a.p(p1, "lastState");
       Object[] objArray = new Object[0];
       String str = "SubtitleVideoPlayerViewBinder";
       a.D().s(str, "state: lastPlayerTime:"+p1.a().c()+", "+"newPlayerTime:"+p0.a().c()+", "+"lastPlaying:"+p1.a().e()+", newPlaying="+p0.a().e()+", "+"videoIsPlaying="+this.E().isPlaying(), objArray);
       if (p0.E() != p1.E() || p0.s() != p1.s()) {
          Object[] objArray1 = new Object[0];
          a.D().w(str, "onStateChange, setEnablePlayerStatusChanged "+p0.E(), objArray1);
          boolean b = true;
          String str1 = "view";
          if (p0.E() && !p0.s()) {
             playerStatus = this.E().getPlayerStatusView();
             a.o(playerStatus, str1);
             float f = 0x3fc00000;
             playerStatus.setScaleX(f);
             playerStatus.setScaleY(f);
             this.E().setEnablePlayerStatusChanged(b);
             this.E().updatePlayerStatusView(0);
             this.E().addSimpleGestureListener(str, this.h);
          }else {
             playerStatus = this.E().getPlayerStatusView();
             a.o(playerStatus, str1);
             playerStatus.setScaleX(0x3f800000);
             playerStatus.setScaleY(0x3f800000);
             this.E().updatePlayerStatusView(b);
             this.E().setEnablePlayerStatusChanged(0);
             this.E().addSimpleGestureListener(str, null);
          }
       }
       a uoa = p0.a();
       if (!a.a(a.a, uoa.c(), p1.a().c(), 0, 4, null)) {
          this.f.e0();
       }
       this.E().updatePlayerStatusView(uoa.e());
       if (p0.C().f() && !p1.C().f()) {
          playerStatus1 = this.E().getPlayerStatusView();
          a.o(playerStatus1, "sdkPlayerView.playerStatusView");
          playerStatus1.setAlpha(0);
       }else if(!p0.C().f() && p1.C().f()){
          playerStatus1 = this.E().getPlayerStatusView();
          a.o(playerStatus1, "sdkPlayerView.playerStatusView");
          playerStatus1.setAlpha(0x3f800000);
       }
       return;
    }
}

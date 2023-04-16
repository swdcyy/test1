package lmd.c$b;
import smd.d;
import lmd.c;
import xvc.f;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import xvc.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.relay.RelayStickerTitleUpdateAction;
import itc.a;
import java.util.Iterator;
import java.lang.Iterable;
import t8c.a;
import xvc.c;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.relay.RelayStickerInvitedFriendsUpdateAction;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.AddStickerAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.StickerScaleAndRotateEndAction;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import mod.a;
import lmd.b;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.KeyboardPanelFoldButtonClickedAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextEditStartAction;
import com.yxcrop.gifshow.v3.editor.text_v2_share.action.TextEditEndAction;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.relay.RelayStickerFriendsDialogAction;
import mmd.b;
import xld.a;
import mmd.a;
import nsd.u;
import nmd.q;

public final class c$b extends d	// class@001c57
{
    public final c l;

    public void c$b(c p0,boolean p1,f p2,VideoSDKPlayerView p3){
       this.l = p0;
       super(p1, p2, null);
    }
    public void t0(b p0){
       a s;
       Iterator iterator;
       c a;
       Iterator iterator1;
       Object obj = this;
       a obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, c$b.class, "1")) {
          return;
       }
       a.p(obj1, "action");
       String str = "handleAction: ";
       Object[] objArray = new Object[0];
       a.D().w("RecordRelayStickerPresenter", str+obj1, objArray);
       String str1 = "mStickerListeners";
       if (obj1 instanceof RelayStickerTitleUpdateAction) {
          s = obj.l.s;
          a.o(s, str1);
          iterator = s.iterator();
          while (iterator.hasNext()) {
             iterator.next().V0(obj1.getNewTitle());
          }
          a = obj.l.A;
          if (a != null) {
             obj1.performAction(a, this.s0());
          }
       }else if(obj1 instanceof RelayStickerInvitedFriendsUpdateAction){
          s = obj.l.s;
          a.o(s, str1);
          iterator = s.iterator();
          while (iterator.hasNext()) {
             Object obj2 = obj1;
             List newFriends = obj2.getNewFriends();
             boolean b = obj2.isReplaceAll();
             iterator.next().M1(newFriends, b, obj2.isInvited());
          }
          a = obj.l.A;
          if (a != null) {
             obj1.performAction(a, this.s0());
          }
       }else if(obj1 instanceof AddStickerAction){
          a = obj.l.A;
          if (a != null) {
             obj1.performAction(a, this.s0());
          }
       }else if(obj1 instanceof StickerScaleAndRotateEndAction){
          a = obj.l.A;
          if (a != null) {
             obj1.performAction(a, this.s0());
          }
       }
       a = obj.l.y;
       if (a == null) {
          a.D().z("RecordRelayStickerPresenter", str, new IllegalArgumentException("viewBinder is null"));
          return;
       }else {
          a uoa = a.m0();
          if (obj1 instanceof KeyboardPanelFoldButtonClickedAction) {
             a.n0(a.a(a.m0(), false, false, false, 0, null, obj1.isPanelOpen(), null, null, 223, null));
          }else if(obj1 instanceof TextEditStartAction){
             a.n0(a.a(a.m0(), true, false, false, obj1.getKeyboardOffset(), null, false, null, null, 246, null));
             obj1 = obj.l.s;
             a.o(obj1, str1);
             iterator1 = obj1.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().o();
             }
          }else if(obj1 instanceof TextEditEndAction){
             a.n0(a.a(a.m0(), false, false, false, 0, null, false, null, null, 254, null));
             obj1 = obj.l.s;
             a.o(obj1, str1);
             iterator1 = obj1.iterator();
             while (iterator1.hasNext()) {
                iterator1.next().j();
             }
          }else if(obj1 instanceof RelayStickerFriendsDialogAction){
             a s1 = obj.l.s;
             a.o(s1, str1);
             Iterator iterator2 = s1.iterator();
             while (iterator2.hasNext()) {
                iterator2.next().U0(obj1.isShow());
             }
          }
          b uob = new b(null, null, false, false, a.m0(), false, false, null, false, 495, null);
          b uob1 = new b(null, null, false, false, uoa, false, false, null, false, 495, null);
          a.i0(obj1, str1);
          return;
       }
    }
}

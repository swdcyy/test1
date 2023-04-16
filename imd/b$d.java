package imd.b$d;
import qmd.i$a;
import imd.b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.interact.detail.InteractStickerWrapperView;
import mn6.a;
import com.yxcorp.gifshow.v3.editor.sticker.RelayStickerUIData;
import com.kwai.gifshow.post.api.feature.stick.model.ChallengeStickerInfo;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import imd.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import lnc.k1;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import tkd.b;
import tkd.d;
import om6.r;
import qm6.b$a;
import qm6.b;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import qmd.i$a$a;

public final class b$d implements i$a	// class@001023
{
    public final b b;
    public final InteractStickerWrapperView c;
    public final a d;
    public final RelayStickerUIData e;
    public final ChallengeStickerInfo f;
    public final Context g;

    public void b$d(b p0,InteractStickerWrapperView p1,a p2,RelayStickerUIData p3,ChallengeStickerInfo p4,Context p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public void onCloseIconClicked(){
       a a;
       if (PatchProxy.applyVoid(null, this, b$d.class, "4")) {
          return;
       }
       if (this.d != null) {
          Object[] objArray = new Object[0];
          a.D().w("ChallengeInteractStickerViewHelperAdapter", "onCloseIconClicked: ", objArray);
          a = a.a;
          String title = this.e.getTitle();
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(title, a, a.class, "3")) {
             a.p(title, "text");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "COLLAPSE_SOLITAIRE_CHALLENGE_DIALOG";
             i3 oi3 = i3.f();
             oi3.d("text", title);
             uElementPack.params = oi3.e();
             u1.L("", null, 1, uElementPack, null);
          }
          this.d.c();
       }
       return;
    }
    public void onRenderComplete(){
       if (PatchProxy.applyVoid(null, this, b$d.class, "1")) {
          return;
       }
       this.c.setRenderComplete(Boolean.TRUE);
       return;
    }
    public void onStickerActionAreaClicked(){
       a a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b$d.class, "3")) {
          return;
       }
       if (this.d != null) {
          int i = 0;
          Object[] objArray1 = new Object[i];
          String str = "ChallengeInteractStickerViewHelperAdapter";
          a.D().w(str, "onStickerActionAreaClicked: ", objArray1);
          a = a.a;
          String title = this.e.getTitle();
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(title, a, a.class, "2")) {
             a.p(title, "text");
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "JOIN_SOLITAIRE_CHALLENGE";
             i3 oi3 = i3.f();
             oi3.d("text", title);
             uElementPack.params = oi3.e();
             u1.L("", objArray, 1, uElementPack, objArray);
          }
          b$d tf = this.f;
          b b = this.b.b;
          if (b != null) {
             objArray = b.getId();
          }
          k1.a(objArray, str, "onStickerActionAreaClicked: photoId is null");
          if (objArray != null) {
             tf.photoId = objArray;
             ActivityContext uActivityCon = ActivityContext.g();
             a.o(uActivityCon, "ActivityContext.getInstance\(\)");
             Activity uActivity = uActivityCon.e();
             d.a(-831446984).Um(uActivity, new b$a(this.g, i).C(3).n(this.f).f());
             uActivity.overridePendingTransition(R.anim.arg_RES_7f010033, 0x7f0100f2);
          }
       }
       return;
    }
    public void onStickerInfoAreaClicked(){
       if (PatchProxy.applyVoid(null, this, b$d.class, "2")) {
          return;
       }
       if (this.d != null) {
          Object[] objArray = new Object[0];
          a.D().w("ChallengeInteractStickerViewHelperAdapter", "onStickerInfoAreaClicked: ", objArray);
          b$d tb = this.b;
          if (tb.b != null) {
             tb.e(null);
          }
       }
       return;
    }
    public void onTitleTextChanged(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "5")) {
          return;
       }
       a.p(p0, "newText");
       i$a$a.a(this, p0);
       return;
    }
}

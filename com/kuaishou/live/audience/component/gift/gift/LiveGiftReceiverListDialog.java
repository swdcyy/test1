package com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog;
import ml8.d;
import com.kuaishou.live.dialog.base.LiveRecyclerDialogFragment;
import com.kuaishou.live.audience.component.gift.gift.c;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.io.Serializable;
import androidx.fragment.app.KwaiDialogFragment;
import y8c.t;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$a;
import gy2.e;
import gy2.i;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$f;
import android.view.View;
import ekd.m1;
import com.kwai.library.widget.specific.misc.LoadingView;
import az0.l;
import android.view.View$OnClickListener;
import java.util.Map;
import g9c.d;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerDialogFragment;
import y8c.g;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$c;
import qvb.i;
import com.kuaishou.live.audience.component.gift.gift.LiveGiftReceiverListDialog$d;

public class LiveGiftReceiverListDialog extends LiveRecyclerDialogFragment implements d	// class@000ae9
{
    public c B;
    public LoadingView C;
    public View D;
    public LiveGiftReceiverListDialog$f E;
    public LiveGiftReceiverListDialog$b F;
    public boolean G;
    public boolean H;
    public static final int I;

    public void LiveGiftReceiverListDialog(){
       super();
       this.B = c.b;
    }
    public static LiveGiftReceiverListDialog Eh(String p0,String p1,boolean p2,boolean p3){
       LiveGiftReceiverListDialog obj;
       if (PatchProxy.isSupport(LiveGiftReceiverListDialog.class)) {
          obj = PatchProxy.applyFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), null, LiveGiftReceiverListDialog.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveGiftReceiverListDialog();
       obj.lh("liveStreamId", p0);
       obj.lh("liveBizMap", p1);
       obj.G = p2;
       obj.H = p3;
       return obj;
    }
    public t Ah(){
       Object obj = PatchProxy.apply(null, this, LiveGiftReceiverListDialog.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGiftReceiverListDialog$a(this);
    }
    public e Dh(){
       Object obj = PatchProxy.apply(null, this, LiveGiftReceiverListDialog.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new i(0);
    }
    public void Fh(LiveGiftReceiverListDialog$f p0){
       this.E = p0;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftReceiverListDialog.class, "1")) {
          return;
       }
       this.C = m1.f(p0, 0x7f0a1d62);
       this.D = m1.f(p0, 0x7f0a1d61);
       m1.a(p0, new l(this), R.id.live_gift_receiver_dialog_close_button);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0b3d;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftReceiverListDialog.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveGiftReceiverListDialog.class, null);
       return objectsByTag;
    }
    public d ia(){
       return null;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGiftReceiverListDialog.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setCancelable(true);
       this.setStyle(true, 0x1030010);
       return super.onCreateDialog(p0);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftReceiverListDialog.class, "3")) {
          return;
       }
       this.doBindView(p0);
       super.onViewCreated(p0, p1);
       return;
    }
    public int uh(){
       return 0x7f0a1d64;
    }
    public g xh(){
       Object obj = PatchProxy.apply(null, this, LiveGiftReceiverListDialog.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGiftReceiverListDialog$c(this);
    }
    public i zh(){
       Object obj = PatchProxy.apply(null, this, LiveGiftReceiverListDialog.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGiftReceiverListDialog$d(this, this.ah("liveBizMap", "{}"), this.ah("liveStreamId", ""));
    }
}

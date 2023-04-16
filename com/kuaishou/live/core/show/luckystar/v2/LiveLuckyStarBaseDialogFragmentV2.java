package com.kuaishou.live.core.show.luckystar.v2.LiveLuckyStarBaseDialogFragmentV2;
import com.kuaishou.live.dialog.base.LiveBottomSheetFragment;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import android.os.Bundle;
import android.app.Dialog;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.content.DialogInterface;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import androidx.fragment.app.KwaiDialogFragment;

public abstract class LiveLuckyStarBaseDialogFragmentV2 extends LiveBottomSheetFragment	// class@000cfb
{

    public void LiveLuckyStarBaseDialogFragmentV2(){
       super();
       this.vh(false);
       this.xh(this.Lh());
       this.zh(false);
    }
    public abstract int Lh();
    public abstract int Mh();
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveLuckyStarBaseDialogFragmentV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.setCanceledOnTouchOutside(true);
       return uDialog;
    }
    public final View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveLuckyStarBaseDialogFragmentV2.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, this.Mh(), p1, false);
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLuckyStarBaseDialogFragmentV2.class, "4")) {
          return;
       }
       super.onDismiss(p0);
       b.Z(LiveLogTag.LUCKY_STAR, "dismiss "+this.getClass().getSimpleName());
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLuckyStarBaseDialogFragmentV2.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       b.Z(LiveLogTag.LUCKY_STAR, "show "+this.getClass().getSimpleName());
       return;
    }
}

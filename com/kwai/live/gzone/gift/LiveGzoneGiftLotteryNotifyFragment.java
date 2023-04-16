package com.kwai.live.gzone.gift.LiveGzoneGiftLotteryNotifyFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.protobuf.gamezone.nano.SCGzoneGiftLotteryNotify;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import lp3.i;
import fq5.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import y8c.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gka.h;
import java.util.Map;
import crd.b;
import lnc.b9;
import java.util.HashMap;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.kwai.live.gzone.gift.LiveGzoneGiftLotteryNotifyFragment$c;
import android.view.View$OnClickListener;
import android.widget.TextView;
import java.lang.CharSequence;
import android.widget.Button;
import com.kwai.live.gzone.gift.LiveGzoneGiftLotteryNotifyFragment$b;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import y8c.g;
import j57.h;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import qvb.i;
import com.kwai.live.gzone.gift.LiveGzoneGiftLotteryNotifyFragment$a;

public final class LiveGzoneGiftLotteryNotifyFragment extends RecyclerFragment	// class@000d06
{
    public final SCGzoneGiftLotteryNotify F;
    public final DialogContainerFragment G;
    public i H;
    public b I;
    public b J;
    public HashMap K;

    public void LiveGzoneGiftLotteryNotifyFragment(SCGzoneGiftLotteryNotify p0,DialogContainerFragment p1,i p2,b p3){
       a.p(p0, "scGzoneGiftLotteryNotify");
       a.p(p1, "popup");
       a.p(p2, "serviceManager");
       a.p(p3, "liveBasicContext");
       super();
       this.F = p0;
       this.G = p1;
       this.H = p2;
       this.I = p3;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneGiftLotteryNotifyFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h();
    }
    public boolean S1(){
       return false;
    }
    public int getLayoutResId(){
       return 0x7f0d0bbf;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneGiftLotteryNotifyFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveGzoneGiftLotteryNotifyFragment.class, null);
       return objectsByTag;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneGiftLotteryNotifyFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.J);
       if (!PatchProxy.applyVoid(null, this, LiveGzoneGiftLotteryNotifyFragment.class, "8")) {
          LiveGzoneGiftLotteryNotifyFragment tK = this.K;
          if (tK != null) {
             tK.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneGiftLotteryNotifyFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       p0.findViewById(R.id.close).setOnClickListener(new LiveGzoneGiftLotteryNotifyFragment$c(this));
       TextView textView = p0.findViewById(R.id.lottery_record_tv);
       a.o(textView, "this");
       textView.setText(this.F.prizePackageTxt);
       Button uButton = p0.findViewById(R.id.get_more_reward_tv);
       a.o(uButton, "this");
       uButton.setText(this.F.buttonTxt);
       uButton.setOnClickListener(new LiveGzoneGiftLotteryNotifyFragment$b(this));
       KwaiImageView kwaiImageVie = p0.findViewById(R.id.background_iv);
       SCGzoneGiftLotteryNotify backgroundUr = this.F.backgroundUrl;
       if (backgroundUr != null) {
          a.o(backgroundUr, "mSCGzoneGiftLotteryNotify.backgroundUrl");
          int i = (!backgroundUr.length)? 1: 0;
          if (i ^ 1) {
             kwaiImageVie.U(e0.i(this.F.backgroundUrl));
          }
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneGiftLotteryNotifyFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h();
    }
    public RecyclerView$LayoutManager xh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneGiftLotteryNotifyFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LinearLayoutManager(this.getActivity(), 0, 0);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneGiftLotteryNotifyFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveGzoneGiftLotteryNotifyFragment$a(this);
    }
}

package com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment$g;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialEpisodePanelFragment;
import com.yxcorp.gifshow.tube.SerialInfo;
import android.view.View;
import java.lang.Object;
import rl5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y8a.c;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.SerialCollectEventForKrn;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.Gson;
import java.util.Map;
import js6.a;
import y8a.b;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.library.widget.popup.bubble.BubbleInterface$Position;
import com.yxcorp.gifshow.detail.slidev2.serial.selection_panel.a;
import java.lang.Boolean;
import com.yxcorp.gifshow.util.rx.RxBus;
import cda.k;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.widget.popup.a;
import com.yxcorp.gifshow.widget.popup.KwaiBubbleOption;
import com.kwai.library.widget.popup.bubble.a$c;
import lnc.a1;
import com.kwai.library.widget.popup.common.c$b;
import android.graphics.drawable.Drawable;
import y8a.a;
import y8a.f;
import android.view.View$OnClickListener;
import com.kwai.library.widget.popup.bubble.a;
import k07.p;
import e17.i;

public final class SerialEpisodePanelFragment$g implements g	// class@0019f2
{
    public final SerialEpisodePanelFragment b;
    public final SerialInfo c;
    public final View d;

    public void SerialEpisodePanelFragment$g(SerialEpisodePanelFragment p0,SerialInfo p1,View p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       c a;
       a uoa1;
       a uoa2;
       int i3;
       Object obj = this;
       a obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, SerialEpisodePanelFragment$g.class, "1")) {
       }else {
          obj.b.ii(obj.c.mSerialId, obj1.mIsCollected);
          SerialInfo mSerialId = obj.c.mSerialId;
          if (mSerialId != null) {
             a = c.a;
             String str = "corona_serialList_collect";
             a.o(mSerialId, "it");
             SerialCollectEventForKrn serialCollec = new SerialCollectEventForKrn(mSerialId, obj1.mIsCollected);
             Objects.requireNonNull(a);
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             c uoc = c.class;
             if (!PatchProxy.applyVoidTwoRefs(str, serialCollec, a, uoc, "21")) {
                a.p(str, "key");
                String str1 = PatchProxy.applyOneRefs(serialCollec, a, uoc, "23");
                if (str1 != patchProxyRe) {
                }else {
                   str1 = new Gson().q(serialCollec);
                }
                Map map = Map.class;
                Map map1 = PatchProxy.applyTwoRefs(str1, map, a, uoc, "22");
                if (map1 == patchProxyRe) {
                   map1 = new Gson().h(str1, map);
                }
                a.b.GO(str, map1);
             }
          }
          b a1 = b.a;
          obj1 = obj1.mIsCollected;
          FragmentActivity activity = obj.b.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
          FragmentActivity uFragmentAct = activity;
          SerialEpisodePanelFragment x1 = obj.b.x1;
          SerialEpisodePanelFragment$g d = obj.d;
          a.m(d);
          BubbleInterface$Position tOP = BubbleInterface$Position.TOP;
          a uoa = new a(obj);
          Objects.requireNonNull(a1);
          int i = 3;
          int i1 = 0;
          int i2 = 6;
          if (PatchProxy.isSupport2(b.class, "1")) {
             Object[] objArray = new Object[]{Boolean.valueOf(obj1),uFragmentAct,x1,d,tOP,Boolean.FALSE,uoa};
             if (!PatchProxy.applyVoid(objArray, a1, b.class, "1")) {
             }
          }else {
          }
       }
       return;
    }
}

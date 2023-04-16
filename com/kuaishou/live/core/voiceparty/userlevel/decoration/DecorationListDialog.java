package com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationListDialog;
import com.kuaishou.live.viewcontroller.dialog.DialogViewController;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.model.MicSeatLevelInterest;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger;
import java.lang.Object;
import kotlin.jvm.internal.a;
import sx2.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.GridSpacingItemDecoration$Builder;
import android.view.View;
import com.kuaishou.live.viewcontroller.ViewController;
import android.widget.TextView;
import java.lang.CharSequence;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import lnc.a1;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.GridSpacingItemDecoration$Builder$spacing$2;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.playway.shared.widget.GridSpacingItemDecoration;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.core.voiceparty.userlevel.decoration.DecorationListDialog$DecorationAdapter;
import android.app.Activity;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.live.core.voiceparty.userlevel.logger.UserMicSeatLevelLogger$logPrivilegeDressDetailCardShow$1;
import msd.p;
import yx2.d;
import android.app.Dialog;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

public final class DecorationListDialog extends DialogViewController	// class@001a7c
{
    public final f l;
    public final String m;
    public final MicSeatLevelInterest n;
    public final UserMicSeatLevelLogger o;

    public void DecorationListDialog(String p0,MicSeatLevelInterest p1,UserMicSeatLevelLogger p2){
       a.p(p0, "voicePartyId");
       a.p(p1, "interest");
       a.p(p2, "logger");
       super();
       this.m = p0;
       this.n = p1;
       this.o = p2;
       this.l = new f(p0, p1, p2);
    }
    public void F2(){
       List list;
       DecorationListDialog uDecorationL = DecorationListDialog.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uDecorationL, "1")) {
          return;
       }
       super.F2();
       this.Q2(R.layout.arg_RES_7f0d16a7);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       GridSpacingItemDecoration$Builder uBuilder = GridSpacingItemDecoration$Builder.class;
       String str = "4";
       if (!PatchProxy.applyVoid(objArray, this, uDecorationL, str)) {
          this.A2(R.id.title_view).setText(this.n.name);
          RecyclerView recyclerView = this.A2(R.id.decoration_list);
          recyclerView.setLayoutManager(new GridLayoutManager(this.D2(), 3, 1, false));
          GridSpacingItemDecoration$Builder uBuilder1 = new GridSpacingItemDecoration$Builder();
          int i = a1.e(4.00f);
          if (PatchProxy.isSupport(uBuilder)) {
             Activity obj = PatchProxy.applyOneRefs(Integer.valueOf(i), uBuilder1, uBuilder, str);
             if (obj != patchProxyRe) {
                uBuilder1 = obj;
             label_0071 :
                Objects.requireNonNull(uBuilder1);
                GridSpacingItemDecoration gridSpacingI = PatchProxy.apply(objArray, uBuilder1, uBuilder, "12");
                if (gridSpacingI != patchProxyRe) {
                }else {
                   gridSpacingI = new GridSpacingItemDecoration(uBuilder1);
                }
                recyclerView.addItemDecoration(gridSpacingI);
                obj = this.B2();
                DecorationListDialog tn = this.n;
                MicSeatLevelInterest type = tn.type;
                MicSeatLevelInterest interestList = tn.interestListItems;
                if (interestList != null) {
                   list = ArraysKt___ArraysKt.uy(interestList);
                   if (list != null) {
                   label_00a0 :
                      DecorationListDialog$DecorationAdapter uDecorationA = new DecorationListDialog$DecorationAdapter(this, obj, type, list, this.l);
                      recyclerView.setAdapter(gridSpacingI);
                   }
                }
                list = CollectionsKt__CollectionsKt.E();
                goto label_00a0 ;
             }
          }
          uBuilder1.b = new GridSpacingItemDecoration$Builder$spacing$2(i);
          goto label_0071 ;
       }
       return;
    }
    public void M2(){
       if (PatchProxy.applyVoid(null, this, DecorationListDialog.class, "2")) {
          return;
       }
       super.M2();
       DecorationListDialog to = this.o;
       MicSeatLevelInterest type = this.n.type;
       Objects.requireNonNull(to);
       UserMicSeatLevelLogger userMicSeatL = UserMicSeatLevelLogger.class;
       if (!PatchProxy.isSupport(userMicSeatL) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(type), to, userMicSeatL, "10")) {
          UserMicSeatLevelLogger.b(to, "MIC_PRIVILEGE_DRESS_DETEAIL_CARD", null, new UserMicSeatLevelLogger$logPrivilegeDressDetailCardShow$1(type), 2, null).g();
       }
       return;
    }
    public void X2(Dialog p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DecorationListDialog.class, "3")) {
          return;
       }
       a.p(p0, "dialog");
       p0.setCanceledOnTouchOutside(true);
       Window window = p0.getWindow();
       if (window != null) {
          window.setLayout(-1, -2);
          window.setGravity(80);
          window.setDimAmount(0);
          window.setBackgroundDrawable(new ColorDrawable(0));
          window.setWindowAnimations(R.style.arg_RES_7f1103bf);
       }
       return;
    }
}
